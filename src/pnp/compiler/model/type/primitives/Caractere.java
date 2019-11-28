package pnp.compiler.model.type.primitives;

import pnp.compiler.model.type.Type;
import pnp.compiler.model.Variable;

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
}
