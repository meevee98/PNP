package br.com.pnp.compiler.wat

import br.com.pnp.compiler.Generator
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
import java.lang.StringBuilder

class WatGenerator: Generator() {
    override fun convert(symbols: SymbolTable): String {
        val wat = StringBuilder()

        wat.append("(module")

        for (value in symbols.values) {
            if (value is Expression) {
                convertExpression(value)?.let {
                    wat.append("\n$it")
                }
            }
        }

        wat.append(")")
        return wat.toString()
    }

    override fun convertProcedure(procedure: Procedure): String {
        var params = ""
        var result = ""
        var locals = ""
        var body = ""

        val name = if (procedure.name == "principal") {
            "(export \"main\")"
        }
        else {
            "\$procedure.name"
        }

        // Procedure output
        procedure.output?.let {
            result = " (result ${convertType(procedure.type)})"
            locals += " (local ${it.name} ${convertType(it.type)})"
            body = convertVariable(it)
        }

        // Procedure inputs
        for (param in procedure.input) {
            params += " (param ${param.name} ${convertType(param.type)})"
        }

        // Procedure local variables
        for (local in procedure.declarations) {
            locals += " local ${local.variable.name} ${convertType(local.variable.type)}"
        }

        // Procedure instructions
        body = convertBody(procedure.instructions) + body

        return "(func $name$params$result$locals$body)"
    }

    override fun convertUnaryOperation(operation: UnaryOperation): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertBinaryOperation(operation: BinaryOperation): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertProcedureCall(call: ProcedureInstruction): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertBody(instructions: List<Instruction>): String {
        var body = "\n"

        for (instruction in instructions) {
            convertInstruction(instruction)?.let {
                body += "$it\n"
            }
        }

        return body
    }

    override fun convertAssignment(assignment: AssignmentInstruction): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertWhile(statement: WhileStatement): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertDoWhile(statement: DoWhileStatement): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertIf(statement: IfStatement): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertOperator(operator: Operator): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertVariable(variable: Variable, get: Boolean): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertPrimitiveType(type: Type): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun convertAbstractType(type: Type): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
