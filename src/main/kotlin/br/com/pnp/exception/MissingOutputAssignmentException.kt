package br.com.pnp.exception

import org.antlr.v4.runtime.Token

class MissingOutputAssignmentException(token: Token) :
    SemanticException(token, "Missing output variable assignment")
