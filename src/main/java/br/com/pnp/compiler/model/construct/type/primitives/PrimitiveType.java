package br.com.pnp.compiler.model.construct.type.primitives;

import br.com.pnp.compiler.model.construct.type.Type;

final public class PrimitiveType {
    static public Type Inteiro = new Inteiro();
    static public Type Racional = new Racional();
    static public Type Caractere = new Caractere();
    static public Type String = new String();
    static public Type Booleano = new Booleano();
    static public Type Nulo = new Nulo();
}
