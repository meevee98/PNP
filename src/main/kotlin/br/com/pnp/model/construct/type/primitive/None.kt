package br.com.pnp.model.construct.type.primitive

import br.com.pnp.model.construct.type.Type

class None: Type() {
    override fun isTypeOf(value: Any): kotlin.Boolean = false
}