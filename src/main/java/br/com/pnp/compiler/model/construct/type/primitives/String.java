package br.com.pnp.compiler.model.construct.type.primitives;

import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.expression.Expression;

class String extends Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof java.lang.String) {
            return true;
        }
        if (value instanceof String) {
            return true;
        }
        if (value instanceof Expression) {
            return ((Expression) value).getType() instanceof String;
        }
        return false;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "string";
    }
}
