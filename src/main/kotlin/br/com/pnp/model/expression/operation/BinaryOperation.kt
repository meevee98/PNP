package br.com.pnp.model.expression.operation

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class BinaryOperation (
        val operator: Operator,
        var op1: Expression,
        var op2: Expression,
        resultType: Type,
        var operandType: Type = resultType
): Operation {
    override val type: Type = resultType

}