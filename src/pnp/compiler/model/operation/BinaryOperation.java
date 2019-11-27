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

    public BinaryOperation(Operator operator, Expression op1, Expression op2, Type resultType) {
        this.operator = operator;
        this.op1 = op1;
        this.op2 = op2;
        this.resultType = resultType;
        checkOperandsTypes();
    }

    public void changeResultType(Type newResultType) {
        this.resultType = newResultType;
        checkOperandsTypes();
    }

    private void checkOperandsTypes() {
        if (op1 instanceof Variable) {
            Variable op = (Variable) op1;
            if (!resultType.isTypeOf(op.getType())) {
                op1 = op.castTo(resultType);
            }
        }
        else if (op1 instanceof BinaryOperation) {
            BinaryOperation op = (BinaryOperation) op1;
            if (!hasSameResultType(op)) {
                op.changeResultType(resultType);
            }
        }

        if (op2 instanceof Variable) {
            Variable op = (Variable) op2;
            if (!resultType.isTypeOf(op.getType())) {
                op2 = op.castTo(resultType);
            }
        }
        else if (op2 instanceof BinaryOperation) {
            BinaryOperation op = (BinaryOperation) op2;
            if (!hasSameResultType(op)) {
                op.changeResultType(resultType);
            }
        }
    }

    private void checkAndUpdateOperand(Expression operand) {

    }

    private boolean hasSameResultType(BinaryOperation operation) {
        return resultType.isTypeOf(operation.resultType);
    }
}
