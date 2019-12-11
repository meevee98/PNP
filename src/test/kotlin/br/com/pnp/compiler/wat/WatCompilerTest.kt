package br.com.pnp.compiler.wat

import br.com.pnp.AppTest
import java.io.File
import org.junit.Test

class WatCompilerTest : AppTest() {
    override val subject = WatCompiler()

    @Test
    fun testAnalyseSourceFile() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/smallestTest.pnp"
        val sourceFile = File(relativePath)
        subject.analyse(sourceFile)
    }

    @Test
    fun testAnalyseSourceCode() {
        val source = """
            procedimento principal
            inicio
            fim
        """.trimIndent()

        subject.analyse(source)
    }

    @Test
    fun testConvertSmallestCode() {
        val source = """
            procedimento principal
            inicio
            fim
        """.trimIndent()

        val expectedResult = """
            (module
            (func (export "main")
            ))
        """.trimIndent()

        subject.analyse(source)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testConvertSmallestCodeFromFile() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/smallestTest.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main")
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }
}
