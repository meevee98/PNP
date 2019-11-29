package pnp.compiler.model.instruction;

import pnp.compiler.model.construct.Variable;
import pnp.compiler.model.expression.Expression;

public class AssignmentInstruction extends Instruction {
    private Variable variable;
    private Expression expression;

    public AssignmentInstruction(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public Variable getVariable() {
        return variable;
    }

    public Expression getExpression() {
        return expression;
    }
}
