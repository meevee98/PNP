package br.com.pnp.semantic

import br.com.pnp.AppTest
import br.com.pnp.exception.CompilationException
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.statement.WhileStatement
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.model.expression.operation.UnaryOperation
import br.com.pnp.model.instruction.AssignmentInstruction
import kotlin.test.assertFailsWith
import org.junit.Test

class AnalyserTest : AppTest() {
    override val subject = Analyser()

    @Test
    fun testTryPeekEmpty() {
        val result = subject.tryPeek()

        assertNull(result)
    }

    @Test
    fun testTryPopEmpty() {
        val result = subject.tryPop()

        assertNull(result)
    }

    @Test
    fun testTryPushSuccess() {
        val expression = Variable.literalInteger(1)
        val result = subject.tryPush(expression)

        assertEquals(true, result)
    }

    @Test
    fun testTryPeekNotEmpty() {
        val expression = Variable.literalInteger(2)
        subject.tryPush(expression)
        val result = subject.tryPeek()

        assertNotNull(result)
        assertEquals(expression, result)
    }

    @Test
    fun testTryPopNotEmpty() {
        val expression = Variable.literalInteger(3)
        subject.tryPush(expression)
        val result = subject.tryPop()

        assertNotNull(result)
        assertEquals(expression, result)
    }

    @Test
    fun testTryGetSuccess() {
        val construct = Variable(PrimitiveType.integer, "tryGetSuccess", 10)
        subject.tryPut(construct)

        val result = subject.tryGet("tryGetSuccess")

        assertNotNull(result)
        assertEquals(construct, result)
    }

    @Test
    fun testTryGetFail() {
        val result = subject.tryGet("fail")

        assertNull(result)
    }

    @Test
    fun testTryPutSuccess() {
        val construct = Variable(PrimitiveType.integer, "tryPutSuccess", 10)
        val result = subject.tryPut(construct)

        assertEquals(true, result)
    }

    @Test
    fun testTryPutFail() {
        val construct = Variable(PrimitiveType.integer, "tryPutFail", 10)
        subject.tryPut(construct)
        val result = subject.tryPut(construct)

        assertEquals(false, result)
    }

    @Test
    fun testExistsInScopeSuccess() {
        val construct = Procedure("existsInScope")
        subject.tryPut(construct)
        val result = subject.existsInScope("existsInScope")

        assertEquals(true, result)
    }

    @Test
    fun testExistsInScopeFail() {
        val construct = Procedure("existsInScope")
        subject.tryPut(construct)
        subject.newScope()
        val result = subject.existsInScope("existsInScope")

        assertEquals(false, result)
    }

    @Test
    fun testExistsLocalSuccess() {
        val construct = Procedure("existsLocal")
        subject.tryPut(construct)
        val result = subject.exists("existsLocal")

        assertEquals(true, result)
    }

    @Test
    fun testExistsParentSuccess() {
        val construct = Procedure("existsParent")
        subject.tryPut(construct)
        subject.newScope()
        val result = subject.exists("existsParent")

        assertEquals(true, result)
    }

    @Test
    fun testExistsFail() {
        getPrivateMethod("reset")?.invoke(subject)
        val result = subject.exists("existsFail")

        assertEquals(false, result)
    }

    @Test
    fun testNewScopeWithoutBlock() {
        val parentTable = getPrivateAttribute("currentSymbolTable")
        assert(parentTable is SymbolTable)

        subject.newScope()
        val currentTable = getPrivateAttribute("currentSymbolTable")
        assert(currentTable is SymbolTable)

        val resultBlock = subject.currentBlock
        val resultTable = currentTable as SymbolTable

        assertNotNull(resultBlock)
        assertEquals(parentTable, resultTable.lastScope())
    }

    @Test
    fun testNewScopeWithBlock() {
        val parentTable = getPrivateAttribute("currentSymbolTable")
        assert(parentTable is SymbolTable)

        val block = Procedure("test")
        subject.newScope(block)
        val currentTable = getPrivateAttribute("currentSymbolTable")
        assert(currentTable is SymbolTable)

        val resultBlock = subject.currentBlock
        val resultTable = currentTable as SymbolTable

        assertNotNull(resultBlock)
        assertEquals(block, resultBlock)
        assertEquals(parentTable, resultTable.lastScope())
    }

    @Test
    fun testEndScope() {
        val firstBlock = subject.currentBlock

        subject.newScope()
        val closedTable = getPrivateAttribute("currentSymbolTable")
        assert(closedTable is SymbolTable)
        val childTable = closedTable as SymbolTable

        subject.endScope()
        val resultTable = getPrivateAttribute("currentSymbolTable")
        val resultBlock = subject.currentBlock

        assertEquals(firstBlock, resultBlock)
        assert(resultTable is SymbolTable)
        assertEquals(childTable.lastScope(), resultTable)
    }

    @Test
    fun testEndScopeBackToMain() {
        getPrivateMethod("reset")?.invoke(subject)
        subject.newScope()

        subject.endScope()
        val resultTable = getPrivateAttribute("currentSymbolTable")
        val resultBlock = subject.currentBlock

        assertNull(resultBlock)
        assertEquals(subject.mainSymbolTable, resultTable)
    }

    @Test
    fun testNewAssignmentSuccess() {
        val variable = Variable(PrimitiveType.rational, "assignmentSuccess")
        val expression = Variable.literalRational(20.0)

        subject.newScope()
        subject.tryPut(variable)
        val result = subject.newAssignment(variable, expression)

        assertEquals(true, result)
    }

    @Test
    fun testNewAssignmentFailUndeclaredVariable() {
        val variable = Variable(PrimitiveType.rational, "assignmentFail")
        val expression = Variable.literalRational(20.0)

        subject.newScope()
        val result = subject.newAssignment(variable, expression)

        assertEquals(false, result)
    }

    @Test
    fun testNewAssignmentGlobalScope() {
        val variable = Variable(PrimitiveType.rational, "assignmentGlobal")
        val expression = Variable.literalRational(20.0)

        subject.tryPut(variable)
        val result = subject.newAssignment(variable, expression)

        assertEquals(false, result)
    }

    @Test
    fun testNewInstructionSuccess() {
        val instruction = WhileStatement(Variable.literalBoolean(false))

        subject.newScope()
        val result = subject.newInstruction(instruction)

        assertEquals(true, result)
    }

    @Test
    fun testNewInstructionGlobalScope() {
        val instruction = WhileStatement(Variable.literalBoolean(false))

        val result = subject.newInstruction(instruction)

        assertEquals(false, result)
    }

    // region integer operations

    @Test
    fun testAnalyseIntegerEqualityOperation() {
        val operationText = "4 = 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.EQUALITY, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    @Test
    fun testAnalyseIntegerInequalityOperation() {
        val operationText = "4 != 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.INEQUALITY, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    @Test
    fun testAnalyseIntegerGreaterThanOperation() {
        val operationText = "4 > 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.GREATER_THAN, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    @Test
    fun testAnalyseIntegerGreaterThanOrEqualOperation() {
        val operationText = "4 >= 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.GREATER_THAN_EQUAL, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    @Test
    fun testAnalyseIntegerLessThanOperation() {
        val operationText = "4 < 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.LESS_THAN, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    @Test
    fun testAnalyseIntegerLessThanOrEqualOperation() {
        val operationText = "4 <= 2"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.LESS_THAN_EQUAL, andOperation.operator)
        assertEquals(4, op1.value)
        assertEquals(2, op2.value)
    }

    // endregion

    // region rational operations

    @Test
    fun testAnalyseRationalEqualityOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "4.0 = 2.0"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseRationalInequalityOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "4.0 != 2.0"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseRationalGreaterThanOperation() {
        val operationText = "4.0 > 2.0"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.GREATER_THAN, andOperation.operator)
        assertEquals(4.0, op1.value)
        assertEquals(2.0, op2.value)
    }

    @Test
    fun testAnalyseRationalGreaterThanOrEqualOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "4.0 >= 2.0"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseRationalLessThanOperation() {
        val operationText = "4.0 < 2.0"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.LESS_THAN, andOperation.operator)
        assertEquals(4.0, op1.value)
        assertEquals(2.0, op2.value)
    }

    @Test
    fun testAnalyseRationalLessThanOrEqualOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "4.0 <= 2.0"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    // endregion

    // region character operations

    @Test
    fun testAnalyseCharacterEqualityOperation() {
        val operationText = "'4' = '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.EQUALITY, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    @Test
    fun testAnalyseCharacterInequalityOperation() {
        val operationText = "'4' != '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.INEQUALITY, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    @Test
    fun testAnalyseCharacterGreaterThanOperation() {
        val operationText = "'4' > '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.GREATER_THAN, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    @Test
    fun testAnalyseCharacterGreaterThanOrEqualOperation() {
        val operationText = "'4' >= '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.GREATER_THAN_EQUAL, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    @Test
    fun testAnalyseCharacterLessThanOperation() {
        val operationText = "'4' < '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.LESS_THAN, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    @Test
    fun testAnalyseCharacterLessThanOrEqualOperation() {
        val operationText = "'4' <= '2'"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.LESS_THAN_EQUAL, andOperation.operator)
        assertEquals('4', op1.value)
        assertEquals('2', op2.value)
    }

    // endregion

    // region boolean operations

    @Test
    fun testAnalyseLogicalAndOperation() {
        val operationText = "true e false"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.AND, andOperation.operator)
        assertEquals(true, op1.value)
        assertEquals(false, op2.value)
    }

    @Test
    fun testAnalyseLogicalOrOperation() {
        val operationText = "true ou false"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.OR, andOperation.operator)
        assertEquals(true, op1.value)
        assertEquals(false, op2.value)
    }

    @Test
    fun testAnalyseLogicalXorOperation() {
        val operationText = "true oux false"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.XOR, andOperation.operator)
        assertEquals(true, op1.value)
        assertEquals(false, op2.value)
    }

    @Test
    fun testAnalyseLogicalNotOperation() {
        val operationText = "nao true"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is UnaryOperation)
        val andOperation = assignments[0].expression as UnaryOperation

        assertTrue(andOperation.operand is Variable)
        val operand = andOperation.operand as Variable

        assertEquals(Operator.NOT, andOperation.operator)
        assertEquals(true, operand.value)
    }

    @Test
    fun testAnalyseBooleanEqualityOperation() {
        val operationText = "true = false"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.EQUALITY, andOperation.operator)
        assertEquals(true, op1.value)
        assertEquals(false, op2.value)
    }

    @Test
    fun testAnalyseBooleanInequalityOperation() {
        val operationText = "true != false"
        val testCode = """
            procedimento principal
            inicio
                test: booleano;
                test <- $operationText;
            fim
        """.trimIndent()
        subject.analyse(testCode)

        val mainBlock = subject.tryGet("principal") as Procedure
        val assignments = mainBlock.instructions.filterIsInstance<AssignmentInstruction>()

        assertEquals(1, assignments.size)
        assertTrue(assignments[0].expression is BinaryOperation)
        val andOperation = assignments[0].expression as BinaryOperation

        assertTrue(andOperation.op1 is Variable)
        assertTrue(andOperation.op2 is Variable)
        val op1 = andOperation.op1 as Variable
        val op2 = andOperation.op2 as Variable

        assertEquals(Operator.INEQUALITY, andOperation.operator)
        assertEquals(true, op1.value)
        assertEquals(false, op2.value)
    }

    @Test
    fun testAnalyseBooleanGreaterThanOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "true > false"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseBooleanGreaterThanOrEqualOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "true >= false"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseBooleanLessThanOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "true < false"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    @Test
    fun testAnalyseBooleanLessThanOrEqualOperation() {
        assertFailsWith<CompilationException> {
            val operationText = "true <= false"
            val testCode = """
                procedimento principal
                inicio
                    test: booleano;
                    test <- $operationText;
                fim
            """.trimIndent()
            subject.analyse(testCode)
        }
    }

    // endregion

    // region statements

    @Test
    fun testAnalyseWhileStatementSuccess() {
        val testCode = """
                procedimento principal
                inicio
                    test: inteiro;
                    test <- 1;
                    
                    enquanto (test < 10) faca
                        test <- test + 1;
                    fim
                fim
            """.trimIndent()
        subject.analyse(testCode)
    }

    @Test
    fun testAnalyseWhileStatementFailConditionNotBoolean() {
        assertFailsWith<CompilationException> {
            val testCode = """
                    procedimento principal
                    inicio
                        test: inteiro;
                        test <- 1;
                        
                        enquanto (test) faca
                            test <- test + 1;
                        fim
                    fim
                """.trimIndent()
            subject.analyse(testCode)
        }
    }

    // endregion
}
