package br.com.pnp.model.expression.operation

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression

class UnaryOperation(
    val operator: Operator,
    var operand: Expression,
    resultType: Type,
    var operandType: Type = resultType
) : Operation {
    override val type: Type = resultType
}
