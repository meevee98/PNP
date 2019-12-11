package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest
import org.junit.Test

class BooleanTest : AppTest() {
    override val subject = Boolean()

    @Test
    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf(true)
        assertEquals(true, result)
    }

    @Test
    fun testIsTypeOfFail() {
        val result = subject.isTypeOf(1)
        assertEquals(false, result)
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("Boolean", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}
