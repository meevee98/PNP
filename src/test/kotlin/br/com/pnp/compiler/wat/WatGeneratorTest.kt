package br.com.pnp.compiler.wat

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.model.expression.operation.UnaryOperation
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

    fun testConvertOperatorNotBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.NOT
        val type = PrimitiveType.boolean

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.eqz", result)
    }

    @Test
    fun testConvertOperatorNotNonBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.NOT
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.eqz", result)
    }

    @Test
    fun testConvertOperatorAndBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.AND
        val type = PrimitiveType.boolean

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.and", result)
    }

    @Test
    fun testConvertOperatorAndNonBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.AND
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.and", result)
    }

    @Test
    fun testConvertOperatorOrBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.OR
        val type = PrimitiveType.boolean

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.or", result)
    }

    @Test
    fun testConvertOperatorORNonBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.OR
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.or", result)
    }

    @Test
    fun testConvertOperatorXorBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.XOR
        val type = PrimitiveType.boolean

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.xor", result)
    }

    @Test
    fun testConvertOperatorXorNonBooleanOperand() {
        val convertOperatorMethod = getPrivateMethod("convertOperator", Operator::class.java, Type::class.java)
        val operator = Operator.XOR
        val type = PrimitiveType.rational

        val result = convertOperatorMethod?.invoke(subject, operator, type) as String?
        assertEquals("i32.xor", result)
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

    @Test
    fun testConvertBinaryOperationBoolean() {
        val convertBinaryOperationMethod = getPrivateMethod("convertBinaryOperation", BinaryOperation::class.java)

        val expectedResult = """
            i32.const 1
            i32.const 0
            i32.and
        """.trimIndent()

        val op1 = Variable.literalBoolean(true)
        val op2 = Variable.literalBoolean(false)
        val operator = Operator.AND
        val type = PrimitiveType.boolean
        val operation = BinaryOperation(operator, op1, op2, type)

        val result = convertBinaryOperationMethod?.invoke(subject, operation) as String
        assertEquals(expectedResult, result)
    }

    fun testConvertUnaryOperationBoolean() {
        val convertUnaryOperationMethod = getPrivateMethod("convertUnaryOperation", UnaryOperation::class.java)

        val expectedResult = """
            i32.const 1
            i32.eqz
        """.trimIndent()

        val op = Variable.literalBoolean(true)
        val operator = Operator.NOT
        val type = PrimitiveType.boolean
        val operation = UnaryOperation(operator, op, type)

        val result = convertUnaryOperationMethod?.invoke(subject, operation) as String?
        assertEquals(expectedResult, result)
    }
}
