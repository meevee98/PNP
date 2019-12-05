package br.com.pnp.compiler.model.construct.type.primitives;

import br.com.pnp.compiler.model.construct.type.Type;

public class Nulo extends Type {
    @Override
    public boolean isTypeOf(Object value) {
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "void";
    }
}
