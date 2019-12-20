package br.com.pnp.exception

import br.com.pnp.model.construct.type.Type
import org.antlr.v4.runtime.Token

class IncompatibleTypeException(token: Token, type1: Type, type2: Type) :
    SemanticException(token, "Incompatible types between $type1 and $type2")
