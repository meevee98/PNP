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

class WatGenerator : Generator() {
    private val INTEGER_PREFIX = "i32"
    private val FLOAT_PREFIX = "f32"
    private val INTEGER_OPERATOR_SUFFIX = "_s"

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
            locals += " (local \$${it.name} ${convertType(it.type)})"
            body = convertVariable(it)
        }

        // Procedure inputs
        for (param in procedure.input) {
            params += " (param ${param.name} ${convertType(param.type)})"
        }

        // Procedure local variables
        for (local in procedure.declarations) {
            locals += " (local \$${local.variable.name} ${convertType(local.variable.type)})"
        }

        // Procedure instructions
        body = convertBody(procedure.instructions) + body

        return "(func $name$params$result$locals$body)"
    }

    override fun convertUnaryOperation(operation: UnaryOperation): String {
        return convertOperator(operation.operator, operation.operandType)?.let { operator ->
            convertExpression(operation.operand)?.let { operand ->
                var op = operand

                if (!operation.operandType.isTypeOf(operation.operand)) {
                    op += "\n${cast(operation.operand.type, operation.operandType)}"
                }

                "$op\n$operator"
            }
        } ?: ""
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
        TODO("not implemented")
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
        return convertExpression(assignment.expression) ?: ""
        // TODO ("not implemented")
    }

    override fun convertWhile(statement: WhileStatement): String {
        TODO("not implemented")
    }

    override fun convertDoWhile(statement: DoWhileStatement): String {
        TODO("not implemented")
    }

    override fun convertIf(statement: IfStatement): String {
        TODO("not implemented")
    }

    override fun convertOperator(operator: Operator): String {
        return when (operator) {
            Operator.ADDITION -> "add"
            Operator.SUBTRACTION -> "sub"
            Operator.MULTIPLICATION -> "mul"
            Operator.RATIONAL_DIVISION -> "div"
            Operator.INTEGER_DIVISION -> "div$INTEGER_OPERATOR_SUFFIX"
            Operator.MODULO -> "rem$INTEGER_OPERATOR_SUFFIX"
            Operator.NOT -> "eqz"
            Operator.AND -> "and"
            Operator.OR -> "or"
            Operator.XOR -> "xor"
            Operator.EQUALITY -> "eq"
            Operator.INEQUALITY -> "ne"
            Operator.GREATER_THAN -> "gt$INTEGER_OPERATOR_SUFFIX"
            Operator.GREATER_THAN_EQUAL -> "ge$INTEGER_OPERATOR_SUFFIX"
            Operator.LESS_THAN -> "lt$INTEGER_OPERATOR_SUFFIX"
            Operator.LESS_THAN_EQUAL -> "le$INTEGER_OPERATOR_SUFFIX"
            else -> TODO("not implemented")
        }
    }

    private fun convertOperator(operator: Operator, operand: Type): String? {
        val operatorType = operator.getType(operand)
        val type = convertType(operatorType)
        var op = convertOperator(operator)

        if (op.isEmpty()) {
            return null
        }

        if (type.startsWith(FLOAT_PREFIX)) {
            op = op.removeSuffix(INTEGER_OPERATOR_SUFFIX)
        }

        return "$type.$op"
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
            PrimitiveType.integer -> INTEGER_PREFIX
            PrimitiveType.rational -> FLOAT_PREFIX
            PrimitiveType.boolean -> INTEGER_PREFIX
            PrimitiveType.character -> INTEGER_PREFIX
            else -> TODO("not implemented")
        }
    }

    override fun convertAbstractType(type: Type): String {
        TODO("not implemented")
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
            PrimitiveType.boolean.isTypeOf(to) -> {
                // operations with boolean result don't need to change the operands
                ""
            }
            else -> TODO("not implemented")
        }
    }
}
