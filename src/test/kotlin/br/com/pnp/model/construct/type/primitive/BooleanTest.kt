package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest

class BooleanTest: AppTest() {
    override val subject = Boolean()

    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf(true)
        assertEquals(true, result)
    }

    fun testIsTypeOfFail() {
        val result = subject.isTypeOf(1)
        assertEquals(false, result)
    }

    fun testToString() {
        val result = subject.toString()
        assertEquals("Boolean", result)
    }

    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}