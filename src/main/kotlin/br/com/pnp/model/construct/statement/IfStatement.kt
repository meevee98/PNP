package br.com.pnp.model.construct.statement

import br.com.pnp.model.construct.Block
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression

class IfStatement(condition: Expression): Statement {
    val ifBlock: Block = StatementBlock()
    val elseBlock: Block? get() = elseStatement?.ifBlock
    val hasElseBranch: Boolean get() = elseStatement != null

    private var elseStatement: IfStatement? = null
    val elseBranch: IfStatement? get() = elseStatement

    var condition: Expression = Variable.literalBoolean(true)
        set(value) {
            if (!PrimitiveType.boolean.isTypeOf(value.type)) {
                throw IllegalArgumentException(
                        """
                        Type mismatch in ${this.javaClass.simpleName} constructor:
                        Required: ${PrimitiveType.boolean}
                        Found: ${value.type}
                    """.trimIndent())
            }
            field = value
        }

    init {
        this.condition = condition
    }

    private constructor(): this(Variable.literalBoolean(true))

    fun startElseStatement(): Block {
        val newStatement = IfStatement()
        val ifStatement = lastElseStatement()

        ifStatement.elseStatement = newStatement
        return newStatement.ifBlock
    }

    fun startElseStatement(condition: Expression): Block {
        val newStatement = IfStatement(condition)
        val ifStatement = lastElseStatement()

        ifStatement.elseStatement = newStatement
        return newStatement.ifBlock
    }

    private fun lastElseStatement(): IfStatement {
        var ifStatement = this
        while (ifStatement.hasElseBranch) {
            if (ifStatement.elseStatement == null) {
                break // just to avoid infinity loop
            }

            ifStatement.elseStatement?.let {
                ifStatement = it
            }
        }
        return ifStatement
    }
}
