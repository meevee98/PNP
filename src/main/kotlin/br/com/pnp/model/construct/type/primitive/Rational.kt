package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class Rational : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is Double) {
            return true
        }
        if (value is Rational) {
            return true
        }
        if (value is Expression) {
            return value.type is Rational
        }
        return false
    }
}
