package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest
import org.junit.Test

class IntegerTest : AppTest() {
    override val subject = Integer()

    @Test
    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf(10)
        assertEquals(true, result)
    }

    @Test
    fun testIsTypeOfFail() {
        val result = subject.isTypeOf(10.0)
        assertEquals(false, result)
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("Integer", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}
