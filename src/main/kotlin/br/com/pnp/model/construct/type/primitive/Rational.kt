package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type

class Rational: Type() {
    override val isPrimitiveType = true

    override fun isTypeOf(value: Any): kotlin.Boolean {
        if (value is Double) {
            return true
        }
        if (value is Rational) {
            return true
        }
//        return if (value is Expression) {
//            (value as Expression).getType() is Float
//        }
        return false
    }
}