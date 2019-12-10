package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class Integer : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is Int) {
            return true
        }
        if (value is Integer) {
            return true
        }
        if (value is Expression) {
            return value.type is Integer
        }
        return false
    }
}
