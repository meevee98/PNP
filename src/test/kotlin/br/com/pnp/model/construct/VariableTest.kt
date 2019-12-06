package br.com.pnp.model.construct

import br.com.pnp.AppTest
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import org.junit.Test

class VariableTest: AppTest() {
    override val subject = Variable(PrimitiveType.integer, "x", 10)

    @Test
    fun testIsLiteralSuccess() {
        val literal = Variable.literalInteger(10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    @Test
    fun testIsLiteralSuccessEmpty() {
        val literal = Variable(PrimitiveType.integer, "", 10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    @Test
    fun testIsLiteralSuccessBlank() {
        val literal = Variable(PrimitiveType.integer, "  ", 10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    @Test
    fun testIsLiteralFail() {
        val result = subject.isLiteral()

        assertEquals(false, result)
    }
}
