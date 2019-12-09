package br.com.pnp.compiler.model.instruction;

import br.com.pnp.compiler.model.construct.Procedure;
import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.expression.Expression;

import java.util.List;

public class ProcedureInstruction extends Instruction implements Expression {
    private Procedure procedure;
    private List<Expression> params;

    public ProcedureInstruction(Procedure procedure, List<Expression> params) {
        this.procedure = procedure;
        this.params = params;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public List<Expression> getParams() {
        return params;
    }

    @Override
    public Type getType() {
        return procedure.getType();
    }
}
