package br.com.pnp.compiler.wat

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Procedure
import br.com.pnp.semantic.SymbolTable
import org.junit.Test

class WatGeneratorTest : AppTest() {
    override val subject = WatGenerator()

    @Test
    fun testConvert() {
        val expectedResult = """
            (module
            (func (export "main")
            ))
        """.trimIndent()

        val symbols = SymbolTable().apply {
            tryPutValue("principal", Procedure("principal"))
        }

        val result = subject.convert(symbols)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertProcedure() {
        val convertProcedureMethod = getPrivateMethod("convertProcedure", Procedure::class.java)

        val expectedResult = """
            (func (export "main")
            )
        """.trimIndent()
        val procedure = Procedure("principal")

        val result = convertProcedureMethod?.invoke(subject, procedure) as String
        assertEquals(expectedResult, result)
    }
}
