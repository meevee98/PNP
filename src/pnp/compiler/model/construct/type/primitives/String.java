package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.Variable;

class String implements Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof java.lang.String) {
            return true;
        }
        if (value instanceof String) {
            return true;
        }
        if (value instanceof Variable) {
            return ((Variable) value).getType() instanceof String;
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "string";
    }
}
