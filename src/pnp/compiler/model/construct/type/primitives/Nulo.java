package pnp.compiler.model.construct.type.primitives;

import pnp.compiler.model.construct.type.Type;

public class Nulo extends Type {
    @Override
    public boolean isTypeOf(Object value) {
        return false;
    }
}
