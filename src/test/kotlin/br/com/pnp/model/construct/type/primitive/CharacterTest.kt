package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest
import org.junit.Test

class CharacterTest: AppTest() {
    override val subject = Character()

    @Test
    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf('a')
        assertEquals(true, result)
    }

    @Test
    fun testIsTypeOfFail() {
        val result = subject.isTypeOf("a")
        assertEquals(false, result)
    }

    @Test
    fun testToString() {
        val result = subject.toString()
        assertEquals("Character", result)
    }

    @Test
    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}
