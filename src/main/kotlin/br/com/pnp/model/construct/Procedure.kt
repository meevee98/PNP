package br.com.pnp.model.construct

import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.instruction.AssignmentInstruction
import br.com.pnp.model.instruction.DeclarationInstruction

class Procedure(val name: String): Block(), Construct, Expression {
    override val type: Type
        get() = output?.type ?: PrimitiveType.none

    private val declarationsList: MutableList<DeclarationInstruction> = ArrayList()
    val declarations get() = declarationsList.toList()

    var input: List<Variable> = ArrayList()
    var output: Variable? = null

    override fun addDeclarationInstruction(variable: Variable) {
        if (!isInputOrOutput(variable)) {
            declarationsList.add(DeclarationInstruction(variable))
        }
    }

    private fun isInputOrOutput(variable: Variable): Boolean {
        if (output == variable) {
            return true
        }
        if (input.find { it == variable } != null) {
            return true
        }
        return false
    }

    fun isOutputAssigned(): Boolean {
        return output?.let { variable ->
            val isAssigned: Boolean
            val assignment = instructions.filterIsInstance<AssignmentInstruction>()
                    .find { it.variable == variable }

            isAssigned = assignment != null
            // TODO: search inside the statements if there is no assignment in the procedure main block
            isAssigned
        } ?: true
    }
}