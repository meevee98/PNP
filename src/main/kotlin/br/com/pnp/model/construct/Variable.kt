package br.com.pnp.model.construct

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression

class Variable(
    override val type: Type,
    override val name: String,
    value: Any? = null
) : Construct, Expression {
    var value: Any? private set

    init {
        value?.let {
            if (!type.isTypeOf(it)) {
                throw IllegalArgumentException(
                        """
                        Type mismatch in ${this.javaClass.simpleName} constructor:
                        Required: $type
                        Found: ${Type.typeOf(it)}
                    """.trimIndent())
            }
        }
        this.value = value
    }

    companion object {
        fun literalInteger(value: Any? = null): Variable {
            return Variable(PrimitiveType.integer, "", value)
        }

        fun literalRational(value: Any? = null): Variable {
            return Variable(PrimitiveType.rational, "", value)
        }

        fun literalBoolean(value: Any? = null): Variable {
            return Variable(PrimitiveType.boolean, "", value)
        }

        fun literalCharacter(value: Any? = null): Variable {
            return Variable(PrimitiveType.character, "", value)
        }

        fun literalString(value: Any? = null): Variable {
            return Variable(PrimitiveType.string, "", value)
        }

        fun literal(type: Type, value: Any? = null): Variable {
            return Variable(type, "", value)
        }
    }

    fun isLiteral(): Boolean {
        return name.isBlank()
    }

    override fun equals(other: Any?): Boolean {
        if (other is Variable) {
            return other.name == this.name && this.type.isTypeOf(other.type)
        }
        return super.equals(other)
    }
}
