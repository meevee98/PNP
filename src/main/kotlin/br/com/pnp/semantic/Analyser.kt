package br.com.pnp.semantic

import br.com.pnp.exception.CompilationException
import br.com.pnp.exception.SemanticException
import br.com.pnp.grammar.antlr.PnpLexer
import br.com.pnp.grammar.antlr.PnpParser
import br.com.pnp.model.construct.Block
import br.com.pnp.model.construct.Construct
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.statement.StatementBlock
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.instruction.Instruction
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import java.io.IOException
import java.util.EmptyStackException
import java.util.Stack

class Analyser {
    val mainSymbolTable = SymbolTable()
    private var currentSymbolTable = mainSymbolTable
    private val executionStack = Stack<Expression>()
    private val blocks = Stack<Block>()

    val currentBlock: Block?
        get() {
            return try {
                blocks.peek()
            } catch (e: EmptyStackException) {
                null
            }
        }
    val lastInstruction: Instruction?
        get() = currentBlock?.lastInstruction

    fun analyse(file: File) {
        try {
            analyse(CharStreams.fromFileName(file.absolutePath))
        } catch (ex: IOException) {
            println(ex.message)
        }
    }

    fun analyse(sourceCode: String) {
        analyse(CharStreams.fromString(sourceCode))
    }

    private fun reset() {
        mainSymbolTable.resetTable()
        currentSymbolTable = mainSymbolTable
        executionStack.clear()
        blocks.clear()
    }

    private fun analyse(source: CharStream) {
        try {
            val lexical = PnpLexer(source)
            val tokens = CommonTokenStream(lexical)
            val syntax = PnpParser(tokens)

            val tree = syntax.file()
            val rules = PnpContext(this)

            reset()
            ParseTreeWalker().walk(rules, tree)
        } catch (ex: RecognitionException) {
            throw CompilationException(ex.message)
        } catch (ex: SemanticException) {
            throw CompilationException(ex.message)
        }
    }

    fun tryPush(item: Expression): Boolean {
        return try {
            executionStack.push(item)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun tryPop(): Expression? {
        return try {
            executionStack.pop()
        } catch (ex: EmptyStackException) {
            null
        }
    }

    fun tryPeek(): Expression? {
        return try {
            executionStack.peek()
        } catch (ex: EmptyStackException) {
            null
        }
    }

    fun tryGet(key: String): Construct? {
        return currentSymbolTable.tryGetValue(key)
    }

    fun tryPut(value: Construct): Boolean {
        return currentSymbolTable.tryPutValue(value.name, value)
    }

    fun exists(key: String): Boolean {
        return currentSymbolTable.exists(key)
    }

    fun existsInScope(key: String): Boolean {
        return currentSymbolTable.existsInThisScope(key)
    }

    fun newAssignment(variable: Variable, expression: Expression): Boolean {
        return currentBlock?.run {
            if (exists(variable.name)) {
                addAssignmentInstruction(variable, expression)
                true
            } else {
                false
            }
        } ?: false
    }

    fun newInstruction(instruction: Instruction): Boolean {
        return currentBlock?.apply {
            addInstruction(instruction)
        } != null
    }

    fun newScope(newScope: Block? = null) {
        blocks.push(newScope ?: StatementBlock())
        currentSymbolTable = currentSymbolTable.startNewScope()
    }

    fun endScope() {
        for (variable in currentSymbolTable.variables) {
            currentBlock?.addDeclarationInstruction(variable)
        }

        currentSymbolTable.lastScope()?.let {
            currentSymbolTable = it
        }

        if (!blocks.empty()) {
            blocks.pop()
        }
    }
}
