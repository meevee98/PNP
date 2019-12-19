package br.com.pnp.semantic

import br.com.pnp.exception.ConflictDeclarationException
import br.com.pnp.exception.IncompatibleTypeException
import br.com.pnp.exception.MismatchedInputException
import br.com.pnp.exception.MissingOutputAssignmentException
import br.com.pnp.exception.OperatorNotApplicableException
import br.com.pnp.exception.UnknownSemanticException
import br.com.pnp.exception.UnresolvedReferenceException
import br.com.pnp.grammar.antlr.PnpBaseListener
import br.com.pnp.grammar.antlr.PnpParser
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.statement.WhileStatement
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType
import br.com.pnp.model.expression.Expression
import br.com.pnp.model.expression.operation.BinaryOperation
import br.com.pnp.model.expression.operation.Operation
import br.com.pnp.model.expression.operation.Operator
import br.com.pnp.model.expression.operation.UnaryOperation
import org.antlr.v4.runtime.Token

class PnpContext(val analyser: Analyser) : PnpBaseListener() {
    // region main

    override fun enterMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val procedure = Procedure(identifier)
        analyser.tryPut(procedure)
        analyser.newScope(procedure)
    }

    override fun exitMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val procedure = analyser.tryGet(identifier) as? Procedure
            ?: throw UnknownSemanticException(ctx.start)
        if (!procedure.isOutputAssigned()) {
            throw MissingOutputAssignmentException(ctx.procedureBody().procedureOutput().start)
        }
        analyser.endScope()
    }

    // endregion

    // region expression

    override fun exitIntegerExpression(ctx: PnpParser.IntegerExpressionContext) {
        val expression = ctx.text

        if (ctx.start.type == PnpParser.INTEIRO_LITERAL ||
            ctx.start.type == PnpParser.NATURAL_LITERAL) {
            expression.toIntOrNull()?.let { value ->
                val variable = Variable.literalInteger(value)
                analyser.tryPush(variable)
            }
        }
    }

    override fun exitRationalExpression(ctx: PnpParser.RationalExpressionContext) {
        val expression = ctx.text

        if (ctx.start.type == PnpParser.RACIONAL_LITERAL) {
            expression.toDoubleOrNull()?.let { value ->
                val variable = Variable.literalRational(value)
                analyser.tryPush(variable)
            }
        }
    }

    override fun exitBooleanExpression(ctx: PnpParser.BooleanExpressionContext) {
        val expression = ctx.text

        if (ctx.start.type == PnpParser.BOOLEANO_LITERAL) {
            expression?.toBoolean()?.let { value ->
                val variable = Variable.literalBoolean(value)
                analyser.tryPush(variable)
            }
        }
    }

    override fun exitCharacterExpression(ctx: PnpParser.CharacterExpressionContext) {
        val expression = ctx.text

        if (ctx.start.type == PnpParser.CARACTERE_LITERAL) {
            expression?.let {
                val value = if (it[1] == '\\') {
                    escapedChar(it[2])
                } else {
                    it[1]
                }

                val variable = Variable.literalCharacter(value)
                analyser.tryPush(variable)
            }
        }
    }

    private fun escapedChar(escape: Char): Char {
        return when (escape) {
            'b' -> '\b'
            't' -> '\t'
            'n' -> '\n'
            'r' -> '\r'
            'v' -> 12.toChar() // check ascii table
            'f' -> 13.toChar()
            else -> escape
        }
    }

    override fun exitVariable(ctx: PnpParser.VariableContext) {
        val identifier = ctx.id.text

        analyser.tryGet(identifier)?.also {
            if (it !is Variable) {
                throw UnresolvedReferenceException(ctx.id, ctx.id)
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
                ?: throw UnknownSemanticException(ctx.start)
            val identifier = variableCtx.id.text

            analyser.tryGet(identifier)?.let {
            // exp?.let {
                if (it !is Variable) {
                    throw UnknownSemanticException(variableCtx.start)
                }

                if (!assignment.type.isTypeOf(it)) {
                    throw IncompatibleTypeException(variableCtx.start, it.type, assignment.type)
                }

                analyser.newAssignment(it, assignment)
            }
        }
    }

    override fun exitVariableDeclaration(ctx: PnpParser.VariableDeclarationContext) {
        val identifier = ctx.identifier.text
        val typeToken = ctx.t.start.type

        if (analyser.existsInScope(identifier)) {
            throw ConflictDeclarationException(ctx.identifier, ctx.identifier)
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
                    throw UnresolvedReferenceException(ctx.t.start, ctx.t)
                }
                abstractType
            }
        }
        val variable = Variable(type, identifier)
        analyser.tryPut(variable)
    }

    // endregion

    // region operation

    override fun exitIntegerAdditiveOperation(ctx: PnpParser.IntegerAdditiveOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushAdditiveOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitRationalAdditiveOperation(ctx: PnpParser.RationalAdditiveOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushAdditiveOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    private fun pushAdditiveOperation(token: Token, symbol: String, op1: Expression, op2: Expression) {
        if (!isNumber(op1) || !isNumber(op2)) {
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }

        var resultType: Type = PrimitiveType.integer
        if (isRational(op1) || isRational(op2)) {
            resultType = PrimitiveType.rational
        }

        val operation = when (token.type) {
            PnpParser.ADICAO -> BinaryOperation(Operator.ADDITION, op1, op2, resultType)
            PnpParser.SUBTRACAO -> BinaryOperation(Operator.SUBTRACTION, op1, op2, resultType)
            else -> {
                throw MismatchedInputException(token, symbol, literalNames(
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
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitRationalMultiplicativeOperation(ctx: PnpParser.RationalMultiplicativeOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushMultiplicativeOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    private fun pushMultiplicativeOperation(token: Token, symbol: String, op1: Expression, op2: Expression) {
        if (!isNumber(op1) || !isNumber(op2)) {
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
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
                    throw MismatchedInputException(token, symbol, literalNames(
                            PnpParser.MULTIPLICACAO,
                            PnpParser.DIVISAO_RAC
                        ))
                }
                BinaryOperation(Operator.MODULO, op1, op2, resultType)
            }
            PnpParser.DIVISAO_INT -> {
                // integer division, as the name says, is a integer operation only
                if (!isInteger(resultType)) {
                    throw MismatchedInputException(token, symbol, literalNames(
                        PnpParser.MULTIPLICACAO,
                        PnpParser.DIVISAO_RAC
                    ))
                }
                BinaryOperation(Operator.INTEGER_DIVISION, op1, op2, resultType)
            }
            else -> {
                throw MismatchedInputException(token, symbol, literalNames(
                        PnpParser.MULTIPLICACAO,
                        PnpParser.DIVISAO_RAC,
                        PnpParser.DIVISAO_INT,
                        PnpParser.MODULO
                    ))
            }
        }

        analyser.tryPush(operation)
    }

    override fun exitUnaryLogicalOperation(ctx: PnpParser.UnaryLogicalOperationContext) {
        analyser.tryPop()?.let { op1 ->
            pushLogicalOperation(ctx.operator.start, ctx.operator.text, op1)
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitBinaryLogicalOperation(ctx: PnpParser.BinaryLogicalOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushLogicalOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    private fun pushLogicalOperation(token: Token, symbol: String, op1: Expression, op2: Expression? = null) {
        val resultType: Type = PrimitiveType.boolean

        if (!isBoolean(op1) || !isBoolean(op2 ?: resultType)) {
            op2?.let {
                throw OperatorNotApplicableException(token, symbol, op1.type, it.type)
            } ?: throw OperatorNotApplicableException(token, symbol, op1.type)
        }

        val operation = op2?.let {
            // binary logical operations
            when (token.type) {
                PnpParser.AND -> {
                    BinaryOperation(Operator.AND, op1, it, resultType)
                }
                PnpParser.OR -> {
                    BinaryOperation(Operator.OR, op1, it, resultType)
                }
                PnpParser.XOR -> {
                    BinaryOperation(Operator.XOR, op1, it, resultType)
                }
                else -> {
                    throw MismatchedInputException(token, symbol, literalNames(
                        PnpParser.AND,
                        PnpParser.OR,
                        PnpParser.XOR
                    ))
                }
            }
        } ?: when (token.type) {
            // unary logical operations
            PnpParser.NOT -> {
                UnaryOperation(Operator.NOT, op1, resultType)
            }
            else -> {
                throw MismatchedInputException(token, symbol, literalNames(
                    PnpParser.NOT
                ))
            }
        }

        analyser.tryPush(operation)
    }

    override fun exitIntegerRelationalOperation(ctx: PnpParser.IntegerRelationalOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushRelationalOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitRationalRelationalOperation(ctx: PnpParser.RationalRelationalOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushRelationalOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitBooleanRelationalOperation(ctx: PnpParser.BooleanRelationalOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushRelationalOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    override fun exitCharacterRelationalOperation(ctx: PnpParser.CharacterRelationalOperationContext) {
        analyser.tryPop()?.let { op2 ->
            analyser.tryPop()?.let { op1 ->
                pushRelationalOperation(ctx.operator.start, ctx.operator.text, op1, op2)
            }
        } ?: throw UnknownSemanticException(ctx.start)
    }

    private fun pushRelationalOperation(token: Token, symbol: String, op1: Expression, op2: Expression) {
        if (op1.type != op2.type || !op1.type.isPrimitive()) {
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }
        if (isString(op1)) {
            // TODO: check relational operations allowed to String type
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }

        val resultType: Type = PrimitiveType.boolean
        val operation = when {
            isRational(op1) -> checkAndGetRationalRelationalOperation(token, symbol, op1, op2)
            isBoolean(op1) -> checkAndGetBooleanOperation(token, symbol, op1, op2)
            isInteger(op1) || isCharacter(op1) -> {
                when (token.type) {
                    PnpParser.IGUALDADE -> BinaryOperation(Operator.EQUALITY, op1, op2, resultType, op1.type)
                    PnpParser.DESIGUALDADE -> BinaryOperation(Operator.INEQUALITY, op1, op2, resultType, op1.type)
                    PnpParser.MAIOR_IGUAL -> BinaryOperation(Operator.GREATER_THAN_EQUAL, op1, op2, resultType, op1.type)
                    PnpParser.MAIOR -> BinaryOperation(Operator.GREATER_THAN, op1, op2, resultType, op1.type)
                    PnpParser.MENOR_IGUAL -> BinaryOperation(Operator.LESS_THAN_EQUAL, op1, op2, resultType, op1.type)
                    PnpParser.MENOR -> BinaryOperation(Operator.LESS_THAN, op1, op2, resultType, op1.type)
                    else -> {
                        throw MismatchedInputException(token, symbol, literalNames(
                            PnpParser.IGUALDADE,
                            PnpParser.DESIGUALDADE,
                            PnpParser.MAIOR_IGUAL,
                            PnpParser.MAIOR,
                            PnpParser.MENOR_IGUAL,
                            PnpParser.MENOR
                        ))
                    }
                }
            }
            else -> throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }

        analyser.tryPush(operation)
    }

    private fun checkAndGetRationalRelationalOperation(token: Token, symbol: String, op1: Expression, op2: Expression): Operation {
        if (!isRational(op1) || !isRational(op2)) {
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }
        val resultType: Type = PrimitiveType.boolean
        return when (token.type) {
            PnpParser.MAIOR -> BinaryOperation(Operator.GREATER_THAN, op1, op2, resultType, op1.type)
            PnpParser.MENOR -> BinaryOperation(Operator.LESS_THAN, op1, op2, resultType, op1.type)
            else -> {
                throw MismatchedInputException(token, symbol, literalNames(
                    PnpParser.MAIOR,
                    PnpParser.MENOR
                ))
            }
        }
    }

    private fun checkAndGetBooleanOperation(token: Token, symbol: String, op1: Expression, op2: Expression): Operation {
        if (!isBoolean(op1) || !isBoolean(op2)) {
            throw OperatorNotApplicableException(token, symbol, op1.type, op2.type)
        }
        val resultType: Type = PrimitiveType.boolean
        return when (token.type) {
            PnpParser.IGUALDADE -> BinaryOperation(Operator.EQUALITY, op1, op2, resultType, op1.type)
            PnpParser.DESIGUALDADE -> BinaryOperation(Operator.INEQUALITY, op1, op2, resultType, op1.type)
            else -> {
                throw MismatchedInputException(token, symbol, literalNames(
                    PnpParser.IGUALDADE,
                    PnpParser.DESIGUALDADE
                ))
            }
        }
    }

    // endregion

    // region statement

    override fun exitWhileStart(ctx: PnpParser.WhileStartContext) {
        analyser.tryPop()?.let { condition ->
            if (!isBoolean(condition)) {
                throw IncompatibleTypeException(ctx.start, condition.type, PrimitiveType.boolean)
            }

            val statement = WhileStatement(condition)
            analyser.newInstruction(statement)
            analyser.newScope(statement.block)
        } ?: throw UnknownSemanticException(ctx.start)
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

    private fun literalNames(vararg tokenId: Int): List<String> {
        return tokenId.map { it -> PnpParser.VOCABULARY?.getLiteralName(it) ?: "" }
    }

    // endregion
}
