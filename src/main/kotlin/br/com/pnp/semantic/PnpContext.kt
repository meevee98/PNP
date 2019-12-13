package br.com.pnp.semantic

import br.com.pnp.exception.SemanticException
import br.com.pnp.grammar.antlr.PnpBaseListener
import br.com.pnp.grammar.antlr.PnpParser
import br.com.pnp.model.construct.Procedure
import br.com.pnp.model.construct.Variable
import br.com.pnp.model.construct.type.Type
import br.com.pnp.model.construct.type.primitive.PrimitiveType

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
                ?: throw SemanticException(ctx.start, "Something went wrong on ${getMethodName()}")
        if (!procedure.isOutputAssigned()) {
            throw SemanticException(ctx.procedureBody().procedureOutput().start, "Missing return assignment")
        }
        analyser.endScope()
    }

    // endregion

    // region expression

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

            exp?.let {
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
        analyser.tryPut(variable)
    }

    // endregion

    // region exception

    private fun getMethodName(): String? {
        // get[2] because get[0] = getStackTrace() and get[1] = getMethodName()
        return Thread.currentThread().stackTrace.getOrNull(2)?.methodName
    }
}
