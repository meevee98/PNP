package br.com.pnp.exception

import org.antlr.v4.runtime.Token

class MismatchedInput(token: Token, symbol: String, expected: List<String>) :
    SemanticException(token, "mismatched input '$symbol' expecting {${expected.joinToString("', '", "'", "'")}}")
