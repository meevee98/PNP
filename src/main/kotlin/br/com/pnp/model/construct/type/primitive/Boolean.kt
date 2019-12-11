package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type

class Boolean : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is kotlin.Boolean) {
            return true
        }
        if (value is Boolean) {
            return true
        }
//        return if (value is Expression) {
//            (value as Expression).getType() is Boolean
//        }
        return false
    }
}
