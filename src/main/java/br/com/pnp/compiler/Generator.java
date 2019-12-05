package br.com.pnp.compiler;

import br.com.pnp.compiler.semantic.SymbolTable;

public interface Generator {
    public String convert(SymbolTable symbols);
}
