package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest

class RationalTest: AppTest() {
    override val subject = Rational()

    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf(10.0)
        assertEquals(true, result)
    }

    fun testIsTypeOfFail() {
        val result = subject.isTypeOf(10)
        assertEquals(false, result)
    }

    fun testToString() {
        val result = subject.toString()
        assertEquals("Rational", result)
    }

    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}