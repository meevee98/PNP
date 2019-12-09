package br.com.pnp.model.construct.type

import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression

abstract class Type {
    protected open val isPrimitiveType = false

    fun isPrimitive(): Boolean {
        return isPrimitiveType
    }

    abstract fun isTypeOf(value: Any): Boolean

    override fun toString(): String {
        return javaClass.simpleName
    }

    companion object {
        fun typeOf(obj: Any): Type {
            return when {
                obj is Expression -> {
                    obj.type
                }
                obj is AbstractType -> {
                    obj
                }
                PrimitiveType.integer.isTypeOf(obj) -> {
                    PrimitiveType.integer
                }
                PrimitiveType.rational.isTypeOf(obj) -> {
                    PrimitiveType.rational
                }
                PrimitiveType.boolean.isTypeOf(obj) -> {
                    PrimitiveType.boolean
                }
                PrimitiveType.character.isTypeOf(obj) -> {
                    PrimitiveType.character
                }
                PrimitiveType.string.isTypeOf(obj) -> {
                    PrimitiveType.string
                }
                else -> {
                    PrimitiveType.none
                }
            }
        }
    }
}
