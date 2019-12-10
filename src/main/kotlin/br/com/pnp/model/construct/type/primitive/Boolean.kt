package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class Boolean : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is kotlin.Boolean) {
            return true
        }
        if (value is Boolean) {
            return true
        }
        if (value is Expression) {
            return value.type is Boolean
        }
        return false
    }
}
