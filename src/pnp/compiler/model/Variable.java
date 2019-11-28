package pnp.compiler.model;

import pnp.compiler.model.type.Type;

public class Variable implements Expression {
    final private Type type;
    private Object value;
    final private String name;

    public Variable(Type type) {
        this.type = type;
        this.name = null;
    }

    public Variable(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Variable(Type type, Object value) {
        this.type = type;
        this.name = null;
        setValue(value);
    }

    public Variable(Type type, String name, Object value) {
        this.type = type;
        this.name = name;
//        setValue(value);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        if (type.isTypeOf(value)) {
            this.value = value;
        }
    }

    @Override
    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isLiteral() {
        return name == null;
    }
}
