package br.com.pnp.model.instruction

import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.expression.Expression

class ProcedureInstruction(val procedure: Procedure, val parameters: List<Variable>): Instruction, Expression {
    override val type = procedure.type
}
