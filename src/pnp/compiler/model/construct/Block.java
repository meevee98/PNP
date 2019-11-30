package pnp.compiler.model.construct;

import pnp.compiler.model.construct.statement.Statement;
import pnp.compiler.model.instruction.AssignmentInstruction;
import pnp.compiler.model.instruction.Instruction;
import pnp.compiler.model.instruction.DeclarationInstruction;
import pnp.compiler.model.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public abstract class Block implements Construct {
    protected List<Instruction> instructions = new ArrayList<>();

    public void addDeclarationCommand(Variable variable) {
        DeclarationInstruction declaration = new DeclarationInstruction(variable);
        instructions.add(declaration);
    }

    public void addAssignmentCommand(Variable variable, Expression expression) {
        Instruction assignment = new AssignmentInstruction(variable, expression);
        instructions.add(assignment);
    }

    public void addSInstruction(Instruction statement) {
        instructions.add(statement);
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Instruction getLastInstruction() {
        int lastIndex = instructions.size() - 1;
        if (instructions.isEmpty()) {
            return null;
        }
        return instructions.get(lastIndex);
    }
}
