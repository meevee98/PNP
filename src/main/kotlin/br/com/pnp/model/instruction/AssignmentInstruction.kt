package br.com.pnp.model.instruction

import br.com.pnp.model.construct.Variable
import br.com.pnp.model.expression.Expression

class AssignmentInstruction(val variable: Variable, val expression: Expression) : Instruction
