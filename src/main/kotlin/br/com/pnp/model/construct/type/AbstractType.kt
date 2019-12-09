package br.com.pnp.model.construct.type

import br.com.pnp.model.construct.Construct
import br.com.pnp.model.construct.Variable

class AbstractType(private val name: String, private val attributes: List<Variable>): Type(), Construct {
    override fun isTypeOf(value: Any): Boolean {
        TODO ("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        return name
    }
}