package br.com.pnp.model.construct

import br.com.pnp.AppTest
import br.com.pnp.model.construct.type.primitive.PrimitiveType

class VariableTest: AppTest() {
    private val subject = Variable(PrimitiveType.integer, "x", 10)

    fun testIsLiteralSuccess() {
        val literal = Variable.literal(PrimitiveType.integer, 10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    fun testIsLiteralSuccessEmpty() {
        val literal = Variable(PrimitiveType.integer, "", 10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    fun testIsLiteralSuccessBlank() {
        val literal = Variable(PrimitiveType.integer, "  ", 10)
        val result = literal.isLiteral()

        assertEquals(true, result)
    }

    fun testIsLiteralFail() {
        val result = subject.isLiteral()

        assertEquals(false, result)
    }
}