package br.com.pnp.exception

import org.antlr.v4.runtime.Token

class ConflictDeclarationException(token: Token, identifier: Token) :
    SemanticException(token, "The identifier '${identifier.text}' is already defined in the scope")
