package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest

class StringTest: AppTest() {
    override val subject = String()

    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf("a")
        assertEquals(true, result)
    }

    fun testIsTypeOfFail() {
        val result = subject.isTypeOf('a')
        assertEquals(false, result)
    }

    fun testToString() {
        val result = subject.toString()
        assertEquals("String", result)
    }

    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}