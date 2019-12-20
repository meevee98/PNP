package br.com.pnp.exception

import org.antlr.v4.runtime.Token

class MissingOutputAssignment(token: Token) :
    SemanticException(token, "Missing output variable assignment")
