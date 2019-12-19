package br.com.pnp.exception

import br.com.pnp.model.construct.type.Type
import org.antlr.v4.runtime.Token

class OperatorNotApplicableException(token: Token, operator: String, vararg types: Type) :
    SemanticException(token, "Operator '$operator' cannot be applied to ${types.joinToString("', '", "'", "'")}")
