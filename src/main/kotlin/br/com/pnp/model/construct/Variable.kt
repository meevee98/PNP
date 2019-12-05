package br.com.pnp.model.construct

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class Variable (
        override val type: Type,
        private val name: String,
        value: Any? = null
): Construct, Expression {
    var value: Any? private set

    init {
        value?.let {
            if (!type.isTypeOf(it)) {
                TODO ("not implemented")
            }
        }
        this.value = value
    }

    companion object {
        fun literal(type: Type, value: Any? = null): Variable {
            return Variable(type, "", value)
        }
    }

    fun isLiteral(): Boolean {
        return name.isBlank()
    }
}