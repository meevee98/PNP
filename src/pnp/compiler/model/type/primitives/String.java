package pnp.compiler.model.type.primitives;

import pnp.compiler.model.type.Type;
import pnp.compiler.model.Variable;

public class String implements Type {
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
}
