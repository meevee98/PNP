package br.com.pnp.compiler.model.instruction;

import br.com.pnp.compiler.model.construct.Variable;

public class DeclarationInstruction extends Instruction {
    private Variable variable;

    public DeclarationInstruction(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
