package br.com.pnp.compiler

import br.com.pnp.compiler.generator.Generator
import br.com.pnp.semantic.Analyser
import java.io.File

abstract class AbstractCompiler {
    protected abstract val generator: Generator
    private val analyser = Analyser()

    fun analyse(file: File) {
        analyser.analyse(file)
    }

    fun analyse(sourceCode: String) {
        analyser.analyse(sourceCode)
    }

    fun generateCode(): String {
        return generator.convert(analyser.mainSymbolTable)
    }
}
