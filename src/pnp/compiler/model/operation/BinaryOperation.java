package pnp.compiler.model.operation;

import pnp.compiler.model.Expression;
import pnp.compiler.model.Operator;
import pnp.compiler.model.Variable;
import pnp.compiler.model.type.Type;

public class BinaryOperation implements Operation {
    public Expression op1;
    public Expression op2;
    public final Operator operator;
    public Type resultType;
    public Type operandType;

    public BinaryOperation(Operator operator, Expression op1, Expression op2, Type resultType) {
        this.operator = operator;
        this.op1 = op1;
        this.op2 = op2;
        this.resultType = resultType;
        this.operandType = resultType;
    }

    public BinaryOperation(Operator operator, Expression op1, Expression op2, Type resultType, Type operandType) {
        this.operator = operator;
        this.op1 = op1;
        this.op2 = op2;
        this.resultType = resultType;
        this.operandType = operandType;
    }
}
