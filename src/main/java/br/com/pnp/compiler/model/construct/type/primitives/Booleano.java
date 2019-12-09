package br.com.pnp.compiler.model.construct.type.primitives;

import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.expression.Expression;

class Booleano extends Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Boolean) {
            return true;
        }
        if (value instanceof Booleano) {
            return true;
        }
        if (value instanceof Expression) {
            return ((Expression) value).getType() instanceof Booleano;
        }
        return false;
    }

    @Override
    public boolean isPrimitive() {
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "booleano";
    }
}
