package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest
import org.junit.Test

class RationalTest: AppTest() {
    override val subject = Rational()

    @Test
    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf(10.0)
        assertEquals(true, result)
    }

    @Test
    fun testIsTypeOfFail() {
        val result = subject.isTypeOf(10)
        assertEquals(false, result)
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("Rational", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}
