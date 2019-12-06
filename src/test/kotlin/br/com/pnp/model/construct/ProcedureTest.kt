package br.com.pnp.model.construct

import br.com.pnp.AppTest
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.instruction.AssignmentInstruction

class ProcedureTest: AppTest() {
    private val outputVariable = Variable(PrimitiveType.boolean, "output")
    override val subject = Procedure("test").apply {
        input = listOf(
                Variable(PrimitiveType.integer, "integer"),
                Variable(PrimitiveType.rational, "rational"),
                Variable(PrimitiveType.character, "character")
        )
        this.output = outputVariable
    }

    fun testGetTypeWithOutput() {
        val procedureType = subject.type
        assertEquals(outputVariable.type, procedureType)
    }

    fun testGetTypeWithoutOutput() {
        val procedure = Procedure("getTypeTest")
        val procedureType = procedure.type
        assertEquals(PrimitiveType.none, procedureType)
    }

    fun testAddDeclarationInstructionSuccess() {
        val numInstructions = subject.instructions.size
        val numDeclarations = subject.declarations.size
        val variable = Variable(PrimitiveType.integer, "number")
        subject.addDeclarationInstruction(variable)

        assertEquals(numDeclarations + 1, subject.declarations.size)
        assertEquals(numInstructions, subject.instructions.size)
    }

    fun testAddDeclarationInstructionFail() {
        val numInstructions = subject.instructions.size
        val numDeclarations = subject.declarations.size
        val variable = subject.output ?: outputVariable
        subject.addDeclarationInstruction(variable)

        assertNotNull(subject.output)
        assertEquals(numDeclarations, subject.declarations.size)
        assertEquals(numInstructions, subject.instructions.size)
    }

    fun testAddAssignmentInstruction() {
        val type = PrimitiveType.integer
        val numInstructions = subject.instructions.size
        val numDeclarations = subject.declarations.size

        val variable = Variable(type, "number")
        val expression = Variable.literal(type, 10)
        subject.addAssignmentInstruction(variable, expression)

        assertEquals(numDeclarations, subject.declarations.size)
        assertEquals(numInstructions + 1, subject.instructions.size)
    }

    fun testLastInstructionSuccess() {
        val type = PrimitiveType.integer
        val procedure = Procedure("getLastInstructionTest")

        val variable = Variable(type, "number")
        val expression = Variable.literal(type, 10)
        procedure.addAssignmentInstruction(variable, expression)

        val result = procedure.lastInstruction
        assertNotNull(result)
        assert(result is AssignmentInstruction)

        val instruction = result as AssignmentInstruction
        assertEquals(variable, instruction.variable)
        assertEquals(expression, instruction.expression)
    }

    fun testLastInstructionFail() {
        val procedure = Procedure("getLastInstructionTest")

        val result = procedure.lastInstruction
        assertNull(result)
    }

    fun testIsOutputAssignedSuccessHasOutput() {
        val variable = subject.output ?: outputVariable
        val type = variable.type
        val expression = Variable.literal(type, true)
        subject.addAssignmentInstruction(variable, expression)

        val result = subject.isOutputAssigned()
        assertNotNull(subject.output)
        assertEquals(true, result)
    }

    fun testIsOutputAssignedSuccessNoOutput() {
        val procedure = Procedure("testIsOutputAssigned")

        val result = procedure.isOutputAssigned()
        assertNull(procedure.output)
        assertEquals(true, result)
    }

    fun testIsOutputAssignedFail() {
        val procedure = Procedure("testIsOutputAssigned").apply {
            output = outputVariable
        }

        val result = procedure.isOutputAssigned()
        assertNotNull(procedure.output)
        assertEquals(false, result)
    }

    fun testIsInputOrOutputSuccess() {
        val privateMethod = getPrivateMethod("isInputOrOutput", Variable::class.java)

        val variable = subject.output ?: outputVariable
        val result = privateMethod?.invoke(subject, variable)

        assertNotNull(privateMethod)
        assertEquals(true, result)
    }

    fun testIsInputOrOutputFail() {
        val privateMethod = getPrivateMethod("isInputOrOutput", Variable::class.java)

        val variable = Variable(PrimitiveType.integer, "number")
        val result = privateMethod?.invoke(subject, variable)

        assertNotNull(privateMethod)
        assertEquals(false, result)
    }
}