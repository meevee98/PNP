package pnp.compiler.webassembly;

import pnp.compiler.Generator;
import pnp.compiler.model.construct.Construct;
import pnp.compiler.model.construct.Procedure;
import pnp.compiler.model.expression.Expression;
import pnp.compiler.model.expression.operation.Operator;
import pnp.compiler.model.construct.Variable;
import pnp.compiler.model.expression.operation.BinaryOperation;
import pnp.compiler.model.expression.operation.UnaryOperation;
import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.model.instruction.DeclarationInstruction;
import pnp.compiler.semantic.SymbolTable;

public class WebAssemblyGenerator implements Generator {
    @Override
    public String convert(SymbolTable symbols) {
        StringBuilder wat = new StringBuilder();

        for (Construct value : symbols.getValues()) {
            if (value instanceof Expression) {
                wat.append(tryToAppendExpression((Expression) value) + '\n');
            }
        }

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
        if (expression instanceof Procedure) {
            return procedureToWat((Procedure) expression);
        }
        if (expression instanceof BinaryOperation) {
            return binaryOperationToWat((BinaryOperation) expression);
        }
        if (expression instanceof UnaryOperation) {
            return unaryOperationToWat((UnaryOperation) expression);
        }
        if (expression instanceof Variable) {
            return variableToWat((Variable)expression);
        }
        return null;
    }

    private String procedureToWat(Procedure proc) {
        String params = "";
        String result = "";
        String locals = "";
        String body = "";

        // Procedure output
        Variable output = proc.getOutput();
        if (output != null) {
            result = " (result " + typeToWat(proc.getType()) + ")";
            locals += " (local $" + output.getName() + " " + typeToWat(output.getType()) + ")";
            body = "(" + variableToWat(output) + ")";
        }

        // Procedure inputs
        for (Variable param : proc.getInput()) {
            params += " (param $" + param.getName() + " " + typeToWat(param.getType()) + ")";
        }

        // Procedure local variables
        for (DeclarationInstruction local : proc.getDeclarations()) {
            Variable var = local.getVariable();

            locals += " (local $" + var.getName() + " " + typeToWat(var.getType()) + ")";
        }

        if (!body.isEmpty()) {
            body = '\n' + body;
        }
        return "(func $" + proc.getName() + params + result + locals + body + ")";

    }

    private String unaryOperationToWat(UnaryOperation op) {
        String operand = expressionToWat(op.operand);
        String operator = operatorToWat(op.resultType, op.operator, op.operandType);

        if (operand == null || operator == null) {
            return null;
        }
        if (op.operand.getType() != op.operandType) {
            operand = operand + '\n' + cast(op.operand.getType(), op.operandType);
        }
        return operand + '\n' + operator;
    }

    private String binaryOperationToWat(BinaryOperation op) {
        String op1 = expressionToWat(op.op1);
        String op2 = expressionToWat(op.op2);
        String operator = operatorToWat(op.resultType, op.operator, op.operandType);

        if (op1 == null || op2 == null || operator == null) {
            return null;
        }
        if (op.op1.getType() != op.operandType) {
            op1 = op1 + '\n' + cast(op.op1.getType(), op.operandType);
        }
        if (op.op2.getType() != op.operandType) {
            op2 = op2 + '\n' + cast(op.op2.getType(), op.operandType);
        }
        return op1 + '\n' + op2 + '\n' + operator;
    }

    private String variableToWat(Variable variable) {
        String type = typeToWat(variable.getType());
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (variable.isLiteral()) {
            return type + ".const " + valueToWat(variable);
        }
        else {
            return "get_local $" + variable.getName();
        }
    }

    private String operatorToWat(Type resultType, Operator operator, Type operandType) {
        String type = typeToWat(resultType);
        String operand = typeToWat(operandType);
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
            case NOT: operatorStr = "eqz"; break;
            case AND: operatorStr = "and"; break;
            case OR: operatorStr = "or"; break;
            case XOR: operatorStr = "xor"; break;
        }
        return operand + "." + operatorStr;
    }

    private String typeToWat(Type type) {
        if (type.isPrimitive()) {
            return primitiveTypeToWat(type);
        }
        return null; // TODO
    }

    private String primitiveTypeToWat(Type type) {
        if (type == PrimitiveType.Inteiro ||
            type == PrimitiveType.Booleano ||
            type == PrimitiveType.Caractere) {
            return "i32";
        }
        if (type == PrimitiveType.Racional) {
            return "f32";
        }
        return null;
    }

    private String valueToWat(Variable var) {
        if (PrimitiveType.Booleano.isTypeOf(var)) {
            if ((boolean)var.getValue()) {
               return "1";
            }
            else {
                return "0";
            }
        }
        if (PrimitiveType.Caractere.isTypeOf(var)) {
            int value = (char)var.getValue();
            return "" + value;
        }
        return var.getValue().toString();
    }

    private String cast(Type from, Type to) {
        String fromType = typeToWat(from);
        String toType = typeToWat(to);

        if (PrimitiveType.Racional.isTypeOf(to)) {
            return toType + ".convert_s/" + fromType;
        }
        else {
            return toType + ".trunc_s/" + fromType;
        }
    }
}
