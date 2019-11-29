package pnp.compiler.model.construct;

import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.model.expression.Expression;
import pnp.compiler.model.instruction.DeclarationInstruction;

import java.util.ArrayList;
import java.util.List;

public class Procedure extends Block implements Expression {
    private List<DeclarationInstruction> declarations = new ArrayList<>();
    private Type returnType;
    private List<Variable> input;
    private Variable output;
    final private String name;

    public Procedure(String name) {
        this.input = new ArrayList<>();
        this.output = null;
        this.returnType = PrimitiveType.Nulo;
        this.name = name;
    }

    public void setInput(List<Variable> input) {
        if (this.input.isEmpty()) {
            this.input = input;
        }
    }

    public void setOutput(Variable output) {
        if (this.output == null) {
            this.output = output;
            this.returnType = output.getType();
        }
    }

    @Override
    public Type getType() {
        return returnType;
    }

    public List<DeclarationInstruction> getDeclarations() {
        return declarations;
    }

    @Override
    public void addDeclarationCommand(Variable variable) {
        DeclarationInstruction declaration = new DeclarationInstruction(variable);
        if (!isInputOrOutput(variable)) {
            declarations.add(declaration);
        }
    }

    private boolean isInputOrOutput(Variable variable) {
        String name = variable.getName();

        if (output != null && name.equals(output.getName())) {
            return true;
        }
        for (Variable value : input) {
            if (name.equals(value.getName())) {
                return true;
            }
        }
        return false;
    }

    public List<Variable> getInput() {
        return input;
    }

    public Variable getOutput() {
        return output;
    }

    public String getName() {
        return name;
    }
}
