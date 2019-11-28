package pnp.compiler.model;

import pnp.compiler.model.type.Type;

public interface Expression extends Construct {
    public Type getType();
}
