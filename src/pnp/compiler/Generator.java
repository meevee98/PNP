package pnp.compiler;

import pnp.compiler.semantic.SymbolTable;

public interface Generator {
    public String convert(SymbolTable symbols);
}
