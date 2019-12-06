package br.com.pnp.compiler.generator

import br.com.pnp.semantic.SymbolTable

interface Generator {
    fun convert(symbols: SymbolTable): String
}
