package pnp.compiler.model.type.primitives;

import pnp.compiler.model.type.Type;

public abstract class PrimitiveType {
    static public Type Inteiro = new Inteiro();
    static public Type Racional = new Racional();
    static public Type Caractere = new Caractere();
    static public Type String = new String();
    static public Type Booleano = new Booleano();
}
