package br.com.pnp.compiler

import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.statement.DoWhileStatement
import br.com.pnp.model.construct.statement.IfStatement
import br.com.pnp.model.construct.statement.WhileStatement
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.model.expression.operation.UnaryOperation
import br.com.pnp.model.instruction.AssignmentInstruction
import br.com.pnp.model.instruction.Instruction
import br.com.pnp.model.instruction.ProcedureInstruction
import br.com.pnp.semantic.SymbolTable

abstract class Generator {
    abstract fun convert(symbols: SymbolTable): String

    protected fun convertExpression(expression: Expression): String? {
        return when (expression) {
            is Procedure -> {
                convertProcedure(expression)
            }
            is UnaryOperation -> {
                convertUnaryOperation(expression)
            }
            is BinaryOperation -> {
                convertBinaryOperation(expression)
            }
            is ProcedureInstruction -> {
                convertProcedureCall(expression)
            }
            else -> null
        }
    }
    protected abstract fun convertProcedure(procedure: Procedure): String
    protected abstract fun convertUnaryOperation(operation: UnaryOperation): String
    protected abstract fun convertBinaryOperation(operation: BinaryOperation): String
    protected abstract fun convertProcedureCall(call: ProcedureInstruction): String

    protected abstract fun convertBody(instructions: List<Instruction>): String

    protected fun convertInstruction(instruction: Instruction): String? {
        return when (instruction) {
            is AssignmentInstruction -> {
                convertAssignment(instruction)
            }
            is ProcedureInstruction -> {
                convertProcedureCall(instruction)
            }
            is WhileStatement -> {
                convertWhile(instruction)
            }
            is DoWhileStatement -> {
                convertDoWhile(instruction)
            }
            is IfStatement -> {
                convertIf(instruction)
            }
            else -> null
        }
    }
    protected abstract fun convertAssignment(assignment: AssignmentInstruction): String
    protected abstract fun convertWhile(statement: WhileStatement): String
    protected abstract fun convertDoWhile(statement: DoWhileStatement): String
    protected abstract fun convertIf(statement: IfStatement): String

    protected abstract fun convertOperator(operator: Operator): String
    protected abstract fun convertVariable(variable: Variable, get: Boolean = true): String

    protected fun convertType(type: Type): String {
        return if (type.isPrimitive()) {
            convertPrimitiveType(type)
        } else {
            convertAbstractType(type)
        }
    }
    protected abstract fun convertPrimitiveType(type: Type): String
    protected abstract fun convertAbstractType(type: Type): String
}
