package br.com.pnp.semantic

import br.com.pnp.exception.CompilationException
import br.com.pnp.exception.SemanticException
import br.com.pnp.grammar.antlr.PnpLexer
import br.com.pnp.grammar.antlr.PnpParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import java.io.IOException

class Analyser {
    val mainSymbolTable = SymbolTable()

    fun analyse(file: File) {
        try {
            analyse(CharStreams.fromFileName(file.absolutePath))
        }
        catch (ex: IOException) {
            println(ex.message)
        }
    }

    fun analyse(sourceCode: String) {
        analyse(CharStreams.fromString(sourceCode))
    }

    private fun analyse(source: CharStream) {
        try {
            val lexical = PnpLexer(source)
            val tokens = CommonTokenStream(lexical)
            val syntax = PnpParser(tokens)

            val tree = syntax.file()
            val rules = PnpContext(this)

            ParseTreeWalker().walk(rules, tree)
        }
        catch (ex: RecognitionException) {
            throw CompilationException(ex.message)
        }
        catch (ex: SemanticException) {
            throw CompilationException(ex.message)
        }
    }
}
