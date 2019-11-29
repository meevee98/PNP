package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.Variable;

class Racional implements Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Float) {
            return true;
        }
        if (value instanceof Racional) {
            return true;
        }
        if (value instanceof Variable) {
            return ((Variable) value).getType() instanceof Racional;
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "racional";
    }
}
