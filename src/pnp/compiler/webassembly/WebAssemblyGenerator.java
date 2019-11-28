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

        wat.append(tryToAppendExpression(expression));

        return wat.toString();
    }

    private String tryToAppendExpression(Expression expression) {
        String exp = expressionToWat(expression);
        if (exp != null) {
            return exp;
        }
        return "";
    }

    private String expressionToWat(Expression expression) {
        if (expression instanceof BinaryOperation) {
            return binaryOperationToWat((BinaryOperation) expression);
        }
        if (expression instanceof Variable) {
            return variableToWat((Variable)expression);
        }
        return null;
    }

    private String binaryOperationToWat(BinaryOperation op) {
        String op1 = expressionToWat(op.op1);
        String op2 = expressionToWat(op.op2);
        String operator = operatorToWat(op.resultType, op.operator, op.operandType);

        // TODO check if needs to cast i32 to f32 or f32 to i32
        if (op1 == null || op2 == null || operator == null) {
            return null;
        }
        return op1 + '\n' + op2 + '\n' + operator;
    }

    private String variableToWat(Variable variable) {
        String type = primitiveTypeToWat(variable.getType());
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (variable.isLiteral()) {
            return type + ".const " + variable.getValue();
        }
        else {
            return "get_local $" + variable.getName();
        }
    }

    private String operatorToWat(Type resultType, Operator operator, Type operandType) {
        String type = primitiveTypeToWat(resultType);
        String operand = primitiveTypeToWat(operandType);
        String operatorStr = "";

        if (type == null || operand == null || type.isEmpty() || operand.isEmpty()) {
            return null;
        }

        switch (operator) {
            case ADDITION: operatorStr = "add"; break;
            case SUBTRACTION: operatorStr = "sub"; break;
            case MULTIPLICATION: operatorStr = "mul"; break;
            case DIVISION:
                operatorStr = "div";
                if (resultType.isTypeOf(PrimitiveType.Inteiro)) {
                    operatorStr += "_s";
                }
                break;
            case MODULO: operatorStr = "rem_s"; break;
            case GREATER_THAN:
                operatorStr = "gt";
                if (resultType.isTypeOf(PrimitiveType.Inteiro)) {
                    operatorStr += "_s";
                }
                break;
            case GREATER_THAN_EQUAL: operatorStr = "ge_s"; break;
            case LESS_THAN:
                operatorStr = "lt";
                if (resultType.isTypeOf(PrimitiveType.Inteiro)) {
                    operatorStr += "_s";
                }
                break;
            case LESS_THAN_EQUAL: operatorStr = "le_s"; break;
            case EQUALITY: operatorStr = "eq"; break;
            case INEQUALITY: operatorStr = "ne"; break;
        }
        return operand + "." + operatorStr;
    }

    private String primitiveTypeToWat(Type type) {
        if (type == PrimitiveType.Inteiro ||
            type == PrimitiveType.Booleano) {
            return "i32";
        }
        if (type == PrimitiveType.Racional) {
            return "f32";
        }
        return null;
    }
}
