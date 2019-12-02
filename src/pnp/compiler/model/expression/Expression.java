package pnp.compiler.model.expression;

import pnp.compiler.model.construct.Construct;
import pnp.compiler.model.construct.type.Type;

public interface Expression extends Construct {
    public Type getType();
}
