package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest
import org.junit.Test

class StringTest: AppTest() {
    override val subject = String()

    @Test
    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf("a")
        assertEquals(true, result)
    }

    @Test
    fun testIsTypeOfFail() {
        val result = subject.isTypeOf('a')
        assertEquals(false, result)
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("String", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}
