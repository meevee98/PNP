package br.com.pnp.model.construct.type

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.primitive.PrimitiveType

class AbstractTypeTest: AppTest() {
    private val subject: AbstractType

    init {
        val attributes = listOf (
                Variable(PrimitiveType.integer, "inteiro"),
                Variable(PrimitiveType.rational, "racional")
        )
        subject = AbstractType("teste", attributes)
    }

    fun testIsTypeOf() {
        // TODO
    }

    fun testToString() {
        val result = subject.toString()
        assertEquals("teste", result)
    }

    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(false, result)
    }
}