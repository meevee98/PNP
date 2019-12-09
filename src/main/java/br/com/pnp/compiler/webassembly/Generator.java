package br.com.pnp.compiler.webassembly;

import br.com.pnp.compiler.semantic.SymbolTable;

public interface Generator {
    public String convert(SymbolTable symbols);
}
