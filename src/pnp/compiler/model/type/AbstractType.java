package pnp.compiler.model.type;

import pnp.compiler.model.Variable;

import java.util.List;

public class AbstractType implements Type {
    final private List<Variable> attributes;
    final String name;

    public AbstractType(String name, List<Variable> attributes) {
        this.attributes = attributes;
        this.name = name;
    }

    @Override
    public boolean isTypeOf(Object value) {
        if (value instanceof Variable) {
            return ((Variable) value).getType().equals(this);
        }
        return false;
    }
}
