package br.com.pnp.exception

import org.antlr.v4.runtime.Token

open class SemanticException(token: Token, message: String) :
    RuntimeException("line ${token.line}:${token.charPositionInLine} $message")
