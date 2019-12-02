package pnp.compiler.model.expression.operation;

import pnp.compiler.model.expression.Expression;
import pnp.compiler.model.construct.type.Type;

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
