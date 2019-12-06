package br.com.pnp.model.construct.type.primitive

import br.com.pnp.AppTest

class CharacterTest: AppTest() {
    override val subject = Character()

    fun testIsTypeOfSuccess() {
        val result = subject.isTypeOf('a')
        assertEquals(true, result)
    }

    fun testIsTypeOfFail() {
        val result = subject.isTypeOf("a")
        assertEquals(false, result)
    }

    fun testToString() {
        val result = subject.toString()
        assertEquals("Character", result)
    }

    fun testIsPrimitive() {
        val result = subject.isPrimitive()
        assertEquals(true, result)
    }
}