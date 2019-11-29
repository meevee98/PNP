package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.Variable;

class Inteiro implements Type {
    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Integer) {
            return true;
        }
        if (value instanceof Inteiro) {
            return true;
        }
        if (value instanceof Variable) {
            return ((Variable) value).getType() instanceof Inteiro;
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "inteiro";
    }
}
