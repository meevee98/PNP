package br.com.pnp.model.construct.type

abstract class Type {
    protected open val isPrimitiveType = false

    fun isPrimitive(): Boolean {
        return isPrimitiveType
    }

    abstract fun isTypeOf(value: Any): Boolean

    override fun toString(): String {
        return javaClass.simpleName
    }
}