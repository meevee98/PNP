package br.com.pnp.compiler.wat

import br.com.pnp.AppTest
import java.io.File
import org.junit.Test

class WatCompilerTest : AppTest() {
    override val subject = WatCompiler()
    private val dollar = '$'

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

    @Test
    fun testIntegerArithmeticOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/integerArithmetic.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32) (local ${dollar}test2 i32) (local ${dollar}test3 f32)
            i32.const 50
            i32.const 20
            i32.const 5
            i32.div_s
            i32.add
            i32.const 3
            i32.sub
            i32.const 4
            i32.const 25
            i32.mul
            i32.const 8
            i32.rem_s
            i32.const 30
            f32.convert_s/i32
            i32.const 3
            f32.convert_s/i32
            f32.div
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testRationalArithmeticOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/rationalArithmetic.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 f32) (local ${dollar}test2 f32) (local ${dollar}test3 f32)
            i32.const 50
            f32.convert_s/i32
            i32.const 20
            f32.convert_s/i32
            i32.const 5
            f32.convert_s/i32
            f32.div
            f32.add
            i32.const 3
            f32.convert_s/i32
            f32.sub
            i32.const 4
            i32.const 25
            i32.mul
            i32.const 8
            i32.add
            f32.convert_s/i32
            f32.const 3.0
            f32.mul
            i32.const 30
            f32.convert_s/i32
            f32.const 3.0
            f32.div
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    fun testLogicalOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/logical.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32) (local ${dollar}test2 i32) (local ${dollar}test3 i32) (local ${dollar}test4 i32)
            i32.const 1
            i32.const 0
            i32.and
            i32.const 1
            i32.const 0
            i32.or
            i32.const 1
            i32.const 0
            i32.xor
            i32.const 0
            i32.eqz
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testIntegerRelationalOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/integerRelational.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32) (local ${dollar}test2 i32) (local ${dollar}test3 i32) (local ${dollar}test4 i32) (local ${dollar}test5 i32) (local ${dollar}test6 i32)
            i32.const 42
            i32.const 42
            i32.eq
            i32.const 42
            i32.const 42
            i32.ne
            i32.const 42
            i32.const 42
            i32.gt_s
            i32.const 42
            i32.const 42
            i32.ge_s
            i32.const 42
            i32.const 42
            i32.lt_s
            i32.const 42
            i32.const 42
            i32.le_s
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testRationalRelationalOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/rationalRelational.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32) (local ${dollar}test2 i32)
            f32.const 42.0
            f32.const 42.0
            f32.gt
            f32.const 42.0
            f32.const 42.0
            f32.lt
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testBooleanRelationalOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/booleanRelational.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32) (local ${dollar}test2 i32)
            i32.const 1
            i32.const 1
            i32.eq
            i32.const 1
            i32.const 1
            i32.ne
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }

    @Test
    fun testCharacterRelationalOperation() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/operation/characterRelational.pnp"
        val sourceFile = File(relativePath)

        // TODO: Not implemented the conversion from character yet
        val expectedResult = """
            (module
            (func (export "main") 
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()
    }

    @Test
    fun testWhileStatement() {
        val relativePath = "src/test/kotlin/br/com/pnp/compiler/testCodes/statement/whileStatement.pnp"
        val sourceFile = File(relativePath)

        val expectedResult = """
            (module
            (func (export "main") (local ${dollar}test1 i32)
            i32.const 1
            block ${dollar}B0
            get_local ${dollar}test1
            i32.eqz
            br_if ${dollar}B0
            loop ${dollar}L1
            i32.const 0
            get_local ${dollar}test1
            br_if ${dollar}L1
            end
            end
            ))
        """.trimIndent()

        subject.analyse(sourceFile)
        val result = subject.generateCode()

        assertEquals(expectedResult, result)
    }
}
