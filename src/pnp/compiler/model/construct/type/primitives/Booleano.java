package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.Variable;
import pnp.compiler.model.construct.type.Type;

class Booleano implements Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Boolean) {
            return true;
        }
        if (value instanceof Booleano) {
            return true;
        }
        if (value instanceof Variable) {
            return ((Variable) value).getType() instanceof Booleano;
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "booleano";
    }
}
