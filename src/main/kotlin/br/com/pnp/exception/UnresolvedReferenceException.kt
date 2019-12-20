package br.com.pnp.exception

import org.antlr.v4.runtime.RuleContext
import org.antlr.v4.runtime.Token

class UnresolvedReferenceException private constructor(token: Token, text: String) :
    SemanticException(token, "The identifier '$text' is already defined in the scope") {

    constructor(token: Token, identifier: Token) :
        this(token, identifier.text)

    constructor(token: Token, context: RuleContext) :
        this(token, context.text)
}
