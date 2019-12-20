package br.com.pnp.exception

import org.antlr.v4.runtime.Token

class UnknownSemanticException : SemanticException {
    private constructor(token: Token, method: String?) :
        super(token, "Something went wrong on $method")

    constructor(token: Token) :
        this(token, Thread.currentThread().stackTrace.getOrNull(2)?.methodName)
        // get[2] because
        //     get[0] = getStackTrace()
        //     get[1] = <init>
}
