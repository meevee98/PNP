package br.com.pnp.semantic

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.primitive.PrimitiveType

class SymbolTableTest : AppTest() {
    override val subject = SymbolTable()
    private val testVariable = Variable.literal(PrimitiveType.integer, 10)

    fun testStartNewScope() {
        val result = subject.startNewScope()
        val parent = result.lastScope()

        assert(result.symbols.isEmpty())
        assertEquals(subject, parent)
    }

    fun testLastScope() {
        val result = subject.lastScope()

        assertNull(result)
    }

    fun testTryPutValue() {
        val size = subject.symbols.size
        subject.tryPutValue("x", testVariable)

        assertEquals(size + 1, subject.symbols.size)
    }

    fun testTryGetValueNotExists() {
        val result = subject.tryGetValue("getValueNull")

        assertNull(result)
    }

    fun testTryGetValueExists() {
        subject.tryPutValue("getValueExists", testVariable)
        val result = subject.tryGetValue("getValueExists")

        assertNotNull(result)
        assertEquals(testVariable, result)
    }

    fun testExistsLocalScope() {
        subject.tryPutValue("valueExists", testVariable)
        val result = subject.exists("valueExists")

        assertEquals(true, result)
    }

    fun testExistsParentScope() {
        subject.tryPutValue("valueExistsInParent", testVariable)
        val local = subject.startNewScope()
        val result = local.exists("valueExistsInParent")

        assertEquals(true, result)
    }

    fun testExistsInThisScopeLocal() {
        subject.tryPutValue("valueExistsLocalScope", testVariable)
        val result = subject.existsInThisScope("valueExistsLocalScope")

        assertEquals(true, result)
    }

    fun testExistsInThisScopeParent() {
        subject.tryPutValue("valueExistsParentScope", testVariable)
        val local = subject.startNewScope()
        val result = local.existsInThisScope("valueExistsParentScope")

        assertEquals(false, result)
    }
}
