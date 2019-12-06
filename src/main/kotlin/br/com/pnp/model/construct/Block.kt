package br.com.pnp.model.construct

import br.com.pnp.model.expression.Expression
import br.com.pnp.model.instruction.AssignmentInstruction
import br.com.pnp.model.instruction.DeclarationInstruction
import br.com.pnp.model.instruction.Instruction

abstract class Block {
    protected val blockInstructions = ArrayList<Instruction>()
    val instructions: List<Instruction>
        get() = blockInstructions.toList()
    val lastInstruction: Instruction?
        get() {
            try {
                return blockInstructions.last()
            }
            catch (e: NoSuchElementException) {
                return null
            }
        }

    open fun addDeclarationInstruction(variable: Variable) {
        blockInstructions.add(DeclarationInstruction(variable))
    }

    fun addAssignmentInstruction(variable: Variable, expression: Expression) {
        blockInstructions.add(AssignmentInstruction(variable, expression))
    }

    fun addInstruction(instruction: Instruction) {
        blockInstructions.add(instruction)
    }
}