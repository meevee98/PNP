package pnp.compiler.model.operation;

import pnp.compiler.model.Expression;
import pnp.compiler.model.Operator;
import pnp.compiler.model.type.Type;

public class UnaryOperation implements Operation {
    public Expression operand;
    public final Operator operator;
    public Type resultType;
    public Type operandType;

    public UnaryOperation(Operator operator, Expression operand, Type resultType) {
        this.operator = operator;
        this.operand = operand;
        this.resultType = resultType;
        this.operandType = resultType;
    }

    public UnaryOperation(Operator operator, Expression operand, Type resultType, Type operandType) {
        this.operator = operator;
        this.operand = operand;
        this.resultType = resultType;
        this.operandType = operandType;
    }

    @Override
    public Type getType() {
        return resultType;
    }
}
