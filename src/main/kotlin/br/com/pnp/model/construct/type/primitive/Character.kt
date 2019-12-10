package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class Character : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is Char) {
            return true
        }
        if (value is Character) {
            return true
        }
        if (value is Expression) {
            return value.type is Character
        }
        return false
    }
}
