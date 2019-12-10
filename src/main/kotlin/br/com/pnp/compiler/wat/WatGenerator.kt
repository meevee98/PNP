package br.com.pnp.compiler.wat

import br.com.pnp.compiler.Generator
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.statement.DoWhileStatement
import br.com.pnp.model.construct.statement.IfStatement
import br.com.pnp.model.construct.statement.WhileStatement
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.model.expression.operation.UnaryOperation
import br.com.pnp.model.instruction.AssignmentInstruction
import br.com.pnp.model.instruction.Instruction
import br.com.pnp.model.instruction.ProcedureInstruction
import br.com.pnp.semantic.SymbolTable
import java.lang.StringBuilder

class WatGenerator : Generator() {
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
        } else {
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
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun convertBinaryOperation(operation: BinaryOperation): String {
        return convertOperator(operation.operator, operation.operandType)?.let { operator ->
            convertExpression(operation.op1)?.let { operand1 ->
                convertExpression(operation.op2)?.let { operand2 ->
                    var op1 = operand1
                    var op2 = operand2

                    if (!operation.operandType.isTypeOf(operation.op1)) {
                        op1 += "\n${cast(operation.op1.type, operation.operandType)}"
                    }
                    if (!operation.operandType.isTypeOf(operation.op2)) {
                        op2 += "\n${cast(operation.op2.type, operation.operandType)}"
                    }

                    "$op1\n$op2\n$operator"
                }
            }
        } ?: ""
    }

    override fun convertProcedureCall(call: ProcedureInstruction): String {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
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
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun convertWhile(statement: WhileStatement): String {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun convertDoWhile(statement: DoWhileStatement): String {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun convertIf(statement: IfStatement): String {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun convertOperator(operator: Operator): String {
        return when (operator) {
            Operator.ADDITION -> "add"
            Operator.SUBTRACTION -> "sub"
            Operator.MULTIPLICATION -> "mul"
            Operator.RATIONAL_DIVISION -> "div"
            Operator.INTEGER_DIVISION -> "div_s"
            Operator.MODULO -> "rem_s"
            else -> TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
        }
    }

    private fun convertOperator(operator: Operator, operand: Type): String? {
        val operatorType = operator.getType(operand)
        val op = convertOperator(operator)

        if (op.isEmpty()) {
            return null
        }

        return "${convertType(operatorType)}.$op"
    }

    override fun convertVariable(variable: Variable, get: Boolean): String {
        return when {
            variable.isLiteral() -> "${convertType(variable.type)}.const ${convertValue(variable)}"
            get -> "get_local \$${variable.name}"
            else -> "set_local \$${variable.name}"
        }
    }

    private fun convertValue(variable: Variable): String {
        return when {
            PrimitiveType.boolean.isTypeOf(variable.type) -> {
                if (variable.value == false) {
                    "0"
                } else {
                    "1"
                }
            }
            PrimitiveType.character.isTypeOf(variable.type) -> {
                "${variable.value as Char}"
            }
            else -> variable.value.toString()
        }
    }

    override fun convertPrimitiveType(type: Type): String {
        return when (type) {
            PrimitiveType.integer -> "i32"
            PrimitiveType.rational -> "f32"
            PrimitiveType.boolean -> "i32"
            PrimitiveType.character -> "i32"
            else -> TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
        }
    }

    override fun convertAbstractType(type: Type): String {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    private fun cast(from: Type, to: Type): String {
        if (from.isTypeOf(to)) {
            return ""
        }
        val fromType = convertType(from)
        val toType = convertType(to)

        return when {
            PrimitiveType.integer.isTypeOf(from) && PrimitiveType.rational.isTypeOf(to) -> {
                "$toType.convert_s/$fromType"
            }
            PrimitiveType.rational.isTypeOf(from) && PrimitiveType.integer.isTypeOf(to) -> {
                "$toType.trunc_s/$fromType"
            }
            else -> TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
        }
    }
}
