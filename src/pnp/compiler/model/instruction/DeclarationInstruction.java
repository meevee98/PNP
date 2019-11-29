package pnp.compiler.model.instruction;

import pnp.compiler.model.construct.Variable;

public class DeclarationInstruction implements Instruction {
    private Variable variable;

    public DeclarationInstruction(Variable variable) {
        this.variable = variable;
    }

    public Variable getVariable() {
        return variable;
    }
}
