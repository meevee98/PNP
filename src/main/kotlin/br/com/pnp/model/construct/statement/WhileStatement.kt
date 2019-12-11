package br.com.pnp.model.construct.statement

import br.com.pnp.model.construct.Block
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression

class WhileStatement(condition: Expression) : Statement {
    val block: Block = StatementBlock()
    var condition: Expression = Variable.literalBoolean(false)
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
}
