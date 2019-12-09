package br.com.pnp.compiler.model.construct.type.primitives;

import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.expression.Expression;

class Racional extends Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Float) {
            return true;
        }
        if (value instanceof Racional) {
            return true;
        }
        if (value instanceof Expression) {
            return ((Expression) value).getType() instanceof Racional;
        }
        return false;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "racional";
    }
}
