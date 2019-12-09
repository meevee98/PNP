package br.com.pnp.compiler.model.expression;

import br.com.pnp.compiler.model.construct.Construct;
import br.com.pnp.compiler.model.construct.type.Type;

public interface Expression extends Construct {
    public Type getType();
}
