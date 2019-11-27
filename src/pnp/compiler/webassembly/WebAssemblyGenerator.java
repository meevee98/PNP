package pnp.compiler.webassembly;

import pnp.compiler.model.Expression;
import pnp.compiler.model.Operator;
import pnp.compiler.model.Variable;
import pnp.compiler.model.operation.BinaryOperation;
import pnp.compiler.model.type.Type;
import pnp.compiler.model.type.primitives.PrimitiveType;

public class WebAssemblyGenerator {
    public String toWAT(Expression expression) {
        StringBuilder wat = new StringBuilder();

        wat.append(expressionToWat(expression));

        return wat.toString();
    }

    private String expressionToWat(Expression expression) {
        if (expression instanceof BinaryOperation) {
            return binaryOperationToWat((BinaryOperation) expression);
        }
        if (expression instanceof Variable) {
            return variableToWat((Variable)expression);
        }
        return "\n";
    }

    private String binaryOperationToWat(BinaryOperation op) {
        String value =
                expressionToWat(op.op1) +
                expressionToWat(op.op2) +
                operatorToWat(op.resultType, op.operator);

        return value;
    }

    private String variableToWat(Variable variable) {
        String type = primitiveTypeToWat(variable.getType());
        if (variable.isLiteral()) {
            return type + ".const " + variable.getValue() + "\n";
        }
        else {
            return "\n";
        }
    }

    private String operatorToWat(Type resultType, Operator operator) {
        String type = primitiveTypeToWat(resultType);
        String operatorStr = "";

        switch (operator) {
            case ADDITION: operatorStr = "add"; break;
            case SUBTRACTION: operatorStr = "sub"; break;
            case MULTIPLICATION: operatorStr = "mul"; break;
            case DIVISION:
                if (resultType.isTypeOf(PrimitiveType.Inteiro)) {
                    operatorStr = "div_s";
                }
                else if (resultType.isTypeOf(PrimitiveType.Racional)) {
                    operatorStr = "div";
                }
                break;
            case MODULO: operatorStr = "rem_s"; break;
        }

        if (!type.isEmpty() && !operatorStr.isEmpty()) {
            return type + "." + operatorStr + "\n";
        }
        return null;
    }

    private String primitiveTypeToWat(Type type) {
        if (type == PrimitiveType.Inteiro) {
            return "i32";
        }
        if (type == PrimitiveType.Racional) {
            return "f32";
        }
        return "";
    }
}
