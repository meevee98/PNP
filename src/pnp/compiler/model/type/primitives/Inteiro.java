package pnp.compiler.model.type.primitives;

import pnp.compiler.model.type.Type;
import pnp.compiler.model.Variable;

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
}
