package pnp.compiler.model.construct.type;

public abstract class Type {
    public boolean isPrimitive() {
        return false;
    }

    public abstract boolean isTypeOf(Object value);
}
