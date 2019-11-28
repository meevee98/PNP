package pnp.compiler.model.type.primitives;

import pnp.compiler.model.Variable;
import pnp.compiler.model.type.Type;

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
}
