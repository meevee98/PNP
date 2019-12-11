package br.com.pnp.semantic

import br.com.pnp.exception.SemanticException
import br.com.pnp.grammar.antlr.PnpBaseListener
import br.com.pnp.grammar.antlr.PnpParser
import br.com.pnp.model.construct.Procedure

class PnpContext(val analyser: Analyser) : PnpBaseListener() {
    override fun enterMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val procedure = Procedure(identifier)
        analyser.tryPut(identifier, procedure)
        analyser.newScope(procedure)
    }

    override fun exitMainProcedure(ctx: PnpParser.MainProcedureContext) {
        val identifier = ctx.identifier.text

        val proc = analyser.tryGet(identifier)
        if (proc !is Procedure) {
            val method: String = javaClass.enclosingMethod.name
            throw SemanticException(ctx.start, "Something went wrong on $method")
        }
        if (!proc.isOutputAssigned()) {
            throw SemanticException(ctx.procedureBody().procedureOutput().start, "Missing return assignment")
        }
        analyser.endScope()
    }
}
