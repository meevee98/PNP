package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type

class String : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is kotlin.String) {
            return true
        }
        if (value is String) {
            return true
        }
//        return if (value is Expression) {
//            (value as Expression).getType() is String
//        }
        return false
    }
}
