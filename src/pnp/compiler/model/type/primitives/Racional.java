package pnp.compiler.model.type.primitives;

import pnp.compiler.model.type.Type;
import pnp.compiler.model.Variable;

public class Racional implements Type {
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
}
