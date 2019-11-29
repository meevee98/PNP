package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.Variable;

class Caractere implements Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Character) {
            return true;
        }
        if (value instanceof Caractere) {
            return true;
        }
        if (value instanceof Variable) {
            return ((Variable) value).getType() instanceof Caractere;
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "caractere";
    }
}
