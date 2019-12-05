package br.com.pnp.compiler.model.construct;

import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.construct.type.primitives.PrimitiveType;
import br.com.pnp.compiler.model.expression.Expression;
import br.com.pnp.compiler.model.instruction.AssignmentInstruction;
import br.com.pnp.compiler.model.instruction.DeclarationInstruction;
import br.com.pnp.compiler.model.instruction.Instruction;

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

    public List<Variable> getInput() {
        return input;
    }

    public Variable getOutput() {
        return output;
    }

    public String getName() {
        return name;
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

    public boolean isOutputAssigned() {
        if (output == null) {
            return true;
        }
        for (Instruction instruction : instructions) {
            if (instruction instanceof AssignmentInstruction) {
                if ( ((AssignmentInstruction) instruction).getVariable().getName().equals(output.getName()) ) {
                    return true;
                }
            }
        }

        return false;
    }
}
