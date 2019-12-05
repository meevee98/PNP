package br.com.pnp.compiler.model.construct.type;

import br.com.pnp.compiler.model.construct.Construct;
import br.com.pnp.compiler.model.construct.Variable;
import br.com.pnp.compiler.model.expression.Expression;

import java.util.List;

public class AbstractType extends Type implements Construct {
    final private List<Variable> attributes;
    final String name;

    public AbstractType(String name, List<Variable> attributes) {
        this.attributes = attributes;
        this.name = name;
    }

    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Expression) {
            return ((Expression) value).getType().equals(this);
        }
        return false;
    }

    @Override
    public java.lang.String toString() {
        return name;
    }
}
