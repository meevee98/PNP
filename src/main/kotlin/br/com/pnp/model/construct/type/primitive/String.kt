package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class String : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is kotlin.String) {
            return true
        }
        if (value is String) {
            return true
        }
        if (value is Expression) {
            return value.type is String
        }
        return false
    }
}
