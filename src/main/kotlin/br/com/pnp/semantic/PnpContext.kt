package br.com.pnp.semantic

import br.com.pnp.exception.MismatchedInput
import br.com.pnp.exception.OperatorNotApplicable
import br.com.pnp.exception.SemanticException
import br.com.pnp.grammar.antlr.PnpBaseListener
import br.com.pnp.grammar.antlr.PnpParser
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operator
import org.antlr.v4.runtime.Token

class PnpContext(val analyser: Analyser) : PnpBaseListener() {
    // region main

    override fun enterMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val procedure = Procedure(identifier)
        analyser.tryPut(identifier, procedure)
        analyser.newScope(procedure)
    }

    override fun exitMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val procedure = analyser.tryGet(identifier) as? Procedure
            ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
        if (!procedure.isOutputAssigned()) {
            throw SemanticException(ctx.procedureBody().procedureOutput().start, "Missing return assignment")
        }
        analyser.endScope()
    }

    // endregion

    // region expression

    override fun exitIntegerExpression(ctx: PnpParser.IntegerExpressionContext) {
        val expression = ctx.text

        expression.toIntOrNull()?.let { value ->
            val variable = Variable.literalInteger(value)
            analyser.tryPush(variable)
        }
    }

    override fun exitRationalExpression(ctx: PnpParser.RationalExpressionContext) {
        val expression = ctx.text

        expression.toDoubleOrNull()?.let { value ->
            val variable = Variable.literalRational(value)
            analyser.tryPush(variable)
        }
    }

    override fun exitVariable(ctx: PnpParser.VariableContext) {
        val identifier = ctx.id.text

        analyser.tryGet(identifier)?.also {
            if (it !is Variable) {
                throw SemanticException(ctx.id, "Cannot resolve symbol '$identifier'")
            }
            analyser.tryPush(it)
        }
    }

    // endregion

    // region declaration & assignment

    override fun exitVariableAssignment(ctx: PnpParser.VariableAssignmentContext) {
        analyser.tryPop()?.also { assignment ->
            val exp = analyser.tryPeek()

            if (exp is Variable) {
                analyser.tryPop()
            }

            val variableCtx = ctx.variable()
                ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
            val identifier = variableCtx.id.text

            analyser.tryGet(identifier)?.let {
            // exp?.let {
                if (it !is Variable) {
                    throw SemanticException(variableCtx.start, "Something went wrong on ${getMethodName()}")
                }

                if (!assignment.type.isTypeOf(it)) {
                    throw SemanticException(variableCtx.start, "Incompatible types between '${it.type}' and '${assignment.type}'")
                }

                analyser.newAssignment(it, assignment)
            }
        }
    }

    override fun exitVariableDeclaration(ctx: PnpParser.VariableDeclarationContext) {
        val identifier = ctx.identifier.text
        val typeToken = ctx.t.start.type

        if (analyser.existsInScope(identifier)) {
            throw SemanticException(ctx.identifier, "The identifier '$identifier' is already defined in the scope")
        }

        val type = when (typeToken) {
            PnpParser.INTEIRO -> PrimitiveType.integer
            PnpParser.RACIONAL -> PrimitiveType.rational
            PnpParser.BOOLEANO -> PrimitiveType.boolean
            PnpParser.CARACTERE -> PrimitiveType.character
            PnpParser.STRING -> PrimitiveType.string
            else -> {
                val abstractType = analyser.tryGet(ctx.t.text)
                if (abstractType == null || abstractType !is Type) {
                    throw SemanticException(ctx.t.start, "Cannot resolve symbol '${ctx.t.text}'")
                }
                abstractType
            }
        }
        val variable = Variable(type, identifier)
        analyser.tryPut(identifier, variable)
    }

    // endregion

    // region operation

    override fun exitIntegerAdditiveOperation(ctx: PnpParser.IntegerAdditiveOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushAdditiveOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
    }

    override fun exitRationalAdditiveOperation(ctx: PnpParser.RationalAdditiveOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushAdditiveOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
    }

    private fun pushAdditiveOperation(token: Token, symbol: String, op1: Expression, op2: Expression) {
        if (!isNumber(op1) || !isNumber(op2)) {
            throw OperatorNotApplicable(token, symbol, op1.type, op2.type)
        }

        var resultType: Type = PrimitiveType.integer
        if (isRational(op1) || isRational(op2)) {
            resultType = PrimitiveType.rational
        }

        val operation = when (token.type) {
            PnpParser.ADICAO -> BinaryOperation(Operator.ADDITION, op1, op2, resultType)
            PnpParser.SUBTRACAO -> BinaryOperation(Operator.SUBTRACTION, op1, op2, resultType)
            else -> {
                throw MismatchedInput(token, symbol, literalNames(
                        PnpParser.ADICAO,
                        PnpParser.SUBTRACAO
                    ))
            }
        }

        analyser.tryPush(operation)
    }

    override fun exitIntegerMultiplicativeOperation(ctx: PnpParser.IntegerMultiplicativeOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushMultiplicativeOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
    }

    override fun exitRationalMultiplicativeOperation(ctx: PnpParser.RationalMultiplicativeOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushMultiplicativeOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
    }

    private fun pushMultiplicativeOperation(token: Token, symbol: String, op1: Expression, op2: Expression) {
        if (!isNumber(op1) || !isNumber(op2)) {
            throw OperatorNotApplicable(token, symbol, op1.type, op2.type)
        }

        var resultType: Type = PrimitiveType.integer
        if (isRational(op1) || isRational(op2)) {
            resultType = PrimitiveType.rational
        }

        val operation = when (token.type) {
            PnpParser.MULTIPLICACAO -> BinaryOperation(Operator.MULTIPLICATION, op1, op2, resultType)
            PnpParser.DIVISAO_RAC -> BinaryOperation(Operator.RATIONAL_DIVISION, op1, op2, PrimitiveType.rational)
            PnpParser.MODULO -> {
                // modulo is a integer operation only
                if (!isInteger(resultType)) {
                    throw MismatchedInput(token, symbol, literalNames(
                            PnpParser.MULTIPLICACAO,
                            PnpParser.DIVISAO_RAC
                        ))
                }
                BinaryOperation(Operator.MODULO, op1, op2, resultType)
            }
            PnpParser.DIVISAO_INT -> {
                // integer division, as the name says, is a integer operation only
                if (!isInteger(resultType)) {
                    throw MismatchedInput(token, symbol, literalNames(
                        PnpParser.MULTIPLICACAO,
                        PnpParser.DIVISAO_RAC
                    ))
                }
                BinaryOperation(Operator.INTEGER_DIVISION, op1, op2, resultType)
            }
            else -> {
                throw MismatchedInput(token, symbol, literalNames(
                        PnpParser.MULTIPLICACAO,
                        PnpParser.DIVISAO_RAC,
                        PnpParser.DIVISAO_INT,
                        PnpParser.MODULO
                    ))
            }
        }

        analyser.tryPush(operation)
    }

    // endregion

    // region type validation

    private fun isNumber(type: Any): Boolean {
        return isInteger(type) || isRational(type)
    }

    private fun isInteger(type: Any): Boolean {
        return PrimitiveType.integer.isTypeOf(type)
    }

    private fun isRational(type: Any): Boolean {
        return PrimitiveType.rational.isTypeOf(type)
    }

    private fun isBoolean(type: Any): Boolean {
        return PrimitiveType.boolean.isTypeOf(type)
    }

    private fun isCharacter(type: Any): Boolean {
        return PrimitiveType.character.isTypeOf(type)
    }

    private fun isString(type: Any): Boolean {
        return PrimitiveType.string.isTypeOf(type)
    }

    // endregion

    // region exception

    private fun getMethodName(): String? {
        return Thread.currentThread().stackTrace.getOrNull(2)?.methodName
    }

    private fun literalNames(vararg tokenId: Int): List<String> {
        return tokenId.map { it -> PnpParser.VOCABULARY?.getLiteralName(it) ?: "" }
    }
}
