package br.com.pnp.compiler.wat

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.semantic.SymbolTable
import org.junit.Test

class WatGeneratorTest : AppTest() {
    override val subject = WatGenerator()

    @Test
    fun testConvert() {
        val expectedResult = """
            (module
            (func (export "main")
            ))
        """.trimIndent()

        val symbols = SymbolTable().apply {
            tryPutValue("principal", Procedure("principal"))
        }

        val result = subject.convert(symbols)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertProcedure() {
        val convertProcedureMethod = getPrivateMethod("convertProcedure", Procedure::class.java)

        val expectedResult = """
            (func (export "main")
            )
        """.trimIndent()
        val procedure = Procedure("principal")

        val result = convertProcedureMethod?.invoke(subject, procedure) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertOperatorAdditionIntegerOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.ADDITION
        val type = PrimitiveType.integer

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.add", result)
    }

    @Test
    fun testConvertOperatorSubtractionIntegerOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.SUBTRACTION
        val type = PrimitiveType.integer

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.sub", result)
    }

    @Test
    fun testConvertOperatorMultiplicationIntegerOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.MULTIPLICATION
        val type = PrimitiveType.integer

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.mul", result)
    }

    @Test
    fun testConvertOperatorDivisionIntegerOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.INTEGER_DIVISION
        val type = PrimitiveType.integer

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.div_s", result)
    }

    @Test
    fun testConvertOperatorModuloIntegerOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.MODULO
        val type = PrimitiveType.integer

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.rem_s", result)
    }

    @Test
    fun testConvertOperatorAdditionRationalOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.ADDITION
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("f32.add", result)
    }

    @Test
    fun testConvertOperatorSubtractionRationalOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.SUBTRACTION
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("f32.sub", result)
    }

    @Test
    fun testConvertOperatorMultiplicationRationalOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.MULTIPLICATION
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("f32.mul", result)
    }

    @Test
    fun testConvertOperatorDivisionRationalOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.RATIONAL_DIVISION
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("f32.div", result)
    }

    @Test
    fun testConvertOperatorModuloRationalOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.MODULO
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.rem_s", result)
    }

    @Test
    fun testConvertBinaryOperationIntegerWithIntegerOperands() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            i32.const 10
            i32.const 20
            i32.add
        """.trimIndent()

        val op1 = Variable.literalInteger(10)
        val op2 = Variable.literalInteger(20)
        val operator = Operator.ADDITION
        val type = PrimitiveType.integer
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertBinaryOperationIntegerWithOneRationalOperand() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            i32.const 10
            f32.const 20.0
            i32.trunc_s/f32
            i32.add
        """.trimIndent()

        val op1 = Variable.literalInteger(10)
        val op2 = Variable.literalRational(20.0)
        val operator = Operator.ADDITION
        val type = PrimitiveType.integer
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertBinaryOperationIntegerWithBothRationalOperands() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            f32.const 10.0
            i32.trunc_s/f32
            f32.const 20.0
            i32.trunc_s/f32
            i32.add
        """.trimIndent()

        val op1 = Variable.literalRational(10.0)
        val op2 = Variable.literalRational(20.0)
        val operator = Operator.ADDITION
        val type = PrimitiveType.integer
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertBinaryOperationRationalWithRationalOperands() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            f32.const 10.0
            f32.const 20.0
            f32.sub
        """.trimIndent()

        val op1 = Variable.literalRational(10.0)
        val op2 = Variable.literalRational(20.0)
        val operator = Operator.SUBTRACTION
        val type = PrimitiveType.rational
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertBinaryOperationRationalWithOneIntegerOperand() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            i32.const 10
            f32.convert_s/i32
            f32.const 20.0
            f32.sub
        """.trimIndent()

        val op1 = Variable.literalInteger(10)
        val op2 = Variable.literalRational(20.0)
        val operator = Operator.SUBTRACTION
        val type = PrimitiveType.rational
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertBinaryOperationRationalWithBothIntegerOperands() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            i32.const 10
            f32.convert_s/i32
            i32.const 20
            f32.convert_s/i32
            f32.sub
        """.trimIndent()

        val op1 = Variable.literalInteger(10)
        val op2 = Variable.literalInteger(20)
        val operator = Operator.SUBTRACTION
        val type = PrimitiveType.rational
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }
}
