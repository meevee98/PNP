package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type

class Integer : Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is Int) {
            return true
        }
        if (value is Integer) {
            return true
        }
//        return if (value is Expression) {
//            (value as Expression).getType() is Integer
//        }
        return false
    }
}
