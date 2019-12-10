package br.com.pnp.model.expression.operation

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType

enum class Operator {
    ADDITION, SUBTRACTION, MULTIPLICATION, INTEGER_DIVISION, RATIONAL_DIVISION, MODULO,
    EQUALITY, INEQUALITY, LESS_THAN, LESS_THAN_EQUAL, GREATER_THAN, GREATER_THAN_EQUAL,
    NOT, AND, OR, XOR,
    NONE;

    fun getType(operand: Type): Type {
        return when (this) {
            ADDITION -> {
                if (PrimitiveType.integer.isTypeOf(operand) || PrimitiveType.rational.isTypeOf(operand)) {
                    operand
                } else {
                    PrimitiveType.none
                }
            }
            SUBTRACTION -> {
                if (PrimitiveType.integer.isTypeOf(operand) || PrimitiveType.rational.isTypeOf(operand)) {
                    operand
                } else {
                    PrimitiveType.none
                }
            }
            MULTIPLICATION -> {
                if (PrimitiveType.integer.isTypeOf(operand) || PrimitiveType.rational.isTypeOf(operand)) {
                    operand
                } else {
                    PrimitiveType.none
                }
            }
            INTEGER_DIVISION -> {
                PrimitiveType.integer
            }
            RATIONAL_DIVISION -> {
                PrimitiveType.rational
            }
            MODULO -> {
                PrimitiveType.integer
            }
            EQUALITY -> {
                PrimitiveType.boolean
            }
            INEQUALITY -> {
                PrimitiveType.boolean
            }
            LESS_THAN -> {
                PrimitiveType.boolean
            }
            LESS_THAN_EQUAL -> {
                PrimitiveType.boolean
            }
            GREATER_THAN -> {
                PrimitiveType.boolean
            }
            GREATER_THAN_EQUAL -> {
                PrimitiveType.boolean
            }
            NOT -> {
                PrimitiveType.boolean
            }
            AND -> {
                PrimitiveType.boolean
            }
            OR -> {
                PrimitiveType.boolean
            }
            XOR -> {
                PrimitiveType.boolean
            }
            NONE -> {
                PrimitiveType.none
            }
        }
    }
}
