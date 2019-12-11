package br.com.pnp.model.construct.type

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import org.junit.Test

class AbstractTypeTest : AppTest() {
    override val subject: AbstractType

    init {
        val attributes = listOf(
                Variable(PrimitiveType.integer, "inteiro"),
                Variable(PrimitiveType.rational, "racional")
        )
        subject = AbstractType("teste", attributes)
    }

    @Test
    fun testIsTypeOf() {
        // TODO
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("teste", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(false, result)
    }
}
