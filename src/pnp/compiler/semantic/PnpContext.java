package pnp.compiler.semantic;

import org.antlr.v4.runtime.tree.TerminalNode;
import pnp.compiler.exception.SemanticException;
import pnp.compiler.model.construct.Block;
import pnp.compiler.model.construct.Construct;
import pnp.compiler.model.construct.Procedure;
import pnp.compiler.model.construct.statement.DoWhileStatement;
import pnp.compiler.model.construct.statement.IfStatement;
import pnp.compiler.model.construct.statement.WhileStatement;
import pnp.compiler.model.expression.Expression;
import pnp.compiler.model.expression.operation.Operator;
import pnp.compiler.model.construct.Variable;
import pnp.compiler.model.expression.operation.BinaryOperation;
import pnp.compiler.model.expression.operation.UnaryOperation;
import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.model.instruction.Instruction;
import pnp.compiler.model.instruction.ProcedureInstruction;
import pnp.compiler.syntax.grammar.antlr.PnpBaseListener;
import pnp.compiler.syntax.grammar.antlr.PnpParser;

import java.util.ArrayList;
import java.util.List;

public class PnpContext extends PnpBaseListener {
    PnpContext(Analyser analyser) {
        this.analyser = analyser;
    }
    private Analyser analyser;

    @Override public void enterFile(PnpParser.FileContext ctx) {
        //TODO
    }

    @Override public void exitFile(PnpParser.FileContext ctx) {
        //TODO
    }
    
    @Override public void enterProcedureDeclarationBlock(PnpParser.ProcedureDeclarationBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureDeclarationBlock(PnpParser.ProcedureDeclarationBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterProcedure(PnpParser.ProcedureContext ctx) {
        String identifier = ctx.procedureDeclaration().identifier.getText();

        Procedure procedure = new Procedure(identifier);
        analyser.tryPutConstruct(identifier, procedure);
        analyser.newScope(procedure);
    }
    
    @Override public void exitProcedure(PnpParser.ProcedureContext ctx) {
        String identifier = ctx.procedureDeclaration().identifier.getText();

        Construct cons = analyser.tryGetConstruct(identifier);
        if (!(cons instanceof Procedure)) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        if (!((Procedure) cons).isOutputAssigned()) {
            throw new SemanticException(ctx.start, "Missing return assignment");
        }
    }
    
    @Override public void enterProcedureBody(PnpParser.ProcedureBodyContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureBody(PnpParser.ProcedureBodyContext ctx) {
        //TODO
    }
    
    @Override public void enterProcedureDeclaration(PnpParser.ProcedureDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureDeclaration(PnpParser.ProcedureDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureInput(PnpParser.ProcedureInputContext ctx) {
        String identifier;
        List<PnpParser.VariableDeclarationContext> inputs = ctx.variableDeclaration();

        if (inputs.size() > 0) {
            Block block = analyser.getCurrentBlock();
            if (block instanceof Procedure) {
                Procedure proc = (Procedure) block;
                ArrayList<Variable> variables = new ArrayList<>();

                for (int i = 0; i < inputs.size(); i++) {
                    identifier = inputs.get(i).identifier.getText();
                    Construct cons = analyser.tryGetConstruct(identifier);
                    if (!(cons instanceof Variable)) {
                        throw new SemanticException(ctx.start, "something went wrong");
                    }

                    variables.add((Variable) cons);
                }

                proc.setInput(variables);
            }
        }
    }
    
    @Override public void enterProcedureOutput(PnpParser.ProcedureOutputContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureOutput(PnpParser.ProcedureOutputContext ctx) {
        String identifier = ctx.variableDeclaration().identifier.getText();
        Block block = analyser.getCurrentBlock();
        if (block instanceof Procedure) {
            Procedure proc = (Procedure) block;
            Construct cons = analyser.tryGetConstruct(identifier);

            if (!(cons instanceof Variable)) {
                throw new SemanticException(ctx.start, "something went wrong");
            }

            proc.setOutput((Variable) cons);
        }
    }
    
    @Override public void enterProcedureBlock(PnpParser.ProcedureBlockContext ctx) {
    }
    
    @Override public void exitProcedureBlock(PnpParser.ProcedureBlockContext ctx) {
        analyser.endScope();
    }
    
    @Override public void enterMainProcedure(PnpParser.MainProcedureContext ctx) {
        String identifier = ctx.identifier.getText();

        Procedure procedure = new Procedure(identifier);
        analyser.tryPutConstruct(identifier, procedure);
        analyser.newScope(procedure);
    }
    
    @Override public void exitMainProcedure(PnpParser.MainProcedureContext ctx) {
        String identifier = ctx.identifier.getText();

        Construct cons = analyser.tryGetConstruct(identifier);
        if (!(cons instanceof Procedure)) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        if (!((Procedure) cons).isOutputAssigned()) {
            throw new SemanticException(ctx.stop, "Missing return assignment");
        }
        analyser.endScope();
    }
    
    @Override public void enterTypeDeclaration(PnpParser.TypeDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void exitTypeDeclaration(PnpParser.TypeDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void enterTypeVariableDeclarationBlock(PnpParser.TypeVariableDeclarationBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitTypeVariableDeclarationBlock(PnpParser.TypeVariableDeclarationBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterBlock(PnpParser.BlockContext ctx) {
//        analyser.newScope();
    }
    
    @Override public void exitBlock(PnpParser.BlockContext ctx) {
    }
    
    @Override public void enterVariableDeclarationAndAssignmentBlock(PnpParser.VariableDeclarationAndAssignmentBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitVariableDeclarationAndAssignmentBlock(PnpParser.VariableDeclarationAndAssignmentBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterVariableDeclarationAndAssignment(PnpParser.VariableDeclarationAndAssignmentContext ctx) {
        //TODO
    }
    
    @Override public void exitVariableDeclarationAndAssignment(PnpParser.VariableDeclarationAndAssignmentContext ctx) {
        //TODO
    }
    
    @Override public void enterCommand(PnpParser.CommandContext ctx) {
        //TODO
    }
    
    @Override public void exitCommand(PnpParser.CommandContext ctx) {
        Expression popped = analyser.tryPop();
        if (popped instanceof ProcedureInstruction) {
            analyser.newInstruction((Instruction) popped);
        }
    }
    
    @Override public void enterStatement(PnpParser.StatementContext ctx) {
        //TODO
    }
    
    @Override public void exitStatement(PnpParser.StatementContext ctx) {
        //TODO
    }
    
    @Override public void enterStatementCondition(PnpParser.StatementConditionContext ctx) {
        //TODO
    }
    
    @Override public void exitStatementCondition(PnpParser.StatementConditionContext ctx) {
        //TODO
    }

    @Override public void exitIntegerRelationalOperation(PnpParser.IntegerRelationalOperationContext ctx) {
        Type expectedType = PrimitiveType.Inteiro;
        Type resultType = PrimitiveType.Booleano;
        int operator = ctx.start.getType();

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op1.getType() == PrimitiveType.Racional && op2.getType() == PrimitiveType.Racional) {
            // Relational equality operations with Racional values are not allowed
            if (ctx.operator.equalityOperator() != null) {
                throw new SemanticException(ctx.start, "mismatched input '!=' expecting {'+', '-', '*', '/', ';'}");
            }
            expectedType = PrimitiveType.Racional;
        }
        if (op1.getType() != expectedType || op2.getType() != expectedType) {
            throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
        }

        BinaryOperation operation = createBinaryRelationalOperation(expectedType, resultType, op2, op1, ctx.operator, operator);
        analyser.tryPush(operation);
    }

    private BinaryOperation createBinaryRelationalOperation(Type expectedType, Type resultType, Expression op2, Expression op1, PnpParser.RelationalOperatorContext ctx, int token) {
        TerminalNode operator;
        BinaryOperation operation;

        if (ctx.equalityOperator() != null) {
            operator = ctx.equalityOperator().getTokens(token).get(0);

            if (operator.equals(ctx.equalityOperator().IGUALDADE())) {
                operation = new BinaryOperation(Operator.EQUALITY, op1, op2, resultType, expectedType);
            } else if (operator.equals(ctx.equalityOperator().DESIGUALDADE())) {
                operation = new BinaryOperation(Operator.INEQUALITY, op1, op2, resultType, expectedType);
            } else if (operator.equals(ctx.equalityOperator().MAIOR_IGUAL())) {
                operation = new BinaryOperation(Operator.GREATER_THAN_EQUAL, op1, op2, resultType, expectedType);
            } else {
                operation = new BinaryOperation(Operator.LESS_THAN_EQUAL, op1, op2, resultType, expectedType);
            }
        }
        else {
            operator = ctx.comparisonOperator().getTokens(ctx.start.getType()).get(0);

            if (operator.equals(ctx.comparisonOperator().MAIOR())) {
                operation = new BinaryOperation(Operator.GREATER_THAN, op1, op2, resultType, expectedType);
            } else {
                operation = new BinaryOperation(Operator.LESS_THAN, op1, op2, resultType, expectedType);
            }
        }

        return operation;
    }

    @Override public void exitCharacterRelationalOperation(PnpParser.CharacterRelationalOperationContext ctx) {
        Type expectedType = PrimitiveType.Caractere;
        Type resultType = PrimitiveType.Caractere;
        int operator = ctx.start.getType();

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op1.getType() != expectedType || op2.getType() != expectedType) {
            throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
        }

        BinaryOperation operation = createBinaryRelationalOperation(expectedType, resultType, op2, op1, ctx.operator, operator);
        analyser.tryPush(operation);
    }

    @Override public void exitRationalRelationalOperation(PnpParser.RationalRelationalOperationContext ctx) {
        Type expectedType = PrimitiveType.Racional;
        Type resultType = PrimitiveType.Booleano;
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op1.getType() != expectedType || op2.getType() != expectedType) {
            throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
        }
        BinaryOperation operation;

        if (operator.equals(ctx.operator.MAIOR())) {
            operation = new BinaryOperation(Operator.GREATER_THAN, op1, op2, resultType, expectedType);
        } else {
            operation = new BinaryOperation(Operator.LESS_THAN, op1, op2, resultType, expectedType);
        }

        analyser.tryPush(operation);
    }
    
    @Override public void enterExpressionRelationalOperation(PnpParser.ExpressionRelationalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitExpressionRelationalOperation(PnpParser.ExpressionRelationalOperationContext ctx) {
        //TODO
    }
    
    @Override public void enterPriorityLogicalOperation(PnpParser.PriorityLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitPriorityLogicalOperation(PnpParser.PriorityLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void enterExpressionLogicalOperation(PnpParser.ExpressionLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitExpressionLogicalOperation(PnpParser.ExpressionLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitBinaryLogicalOperation(PnpParser.BinaryLogicalOperationContext ctx) {
        Type expectedType = PrimitiveType.Booleano;
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op1.getType() != expectedType || op2.getType() != expectedType) {
            throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
        }
        BinaryOperation operation;

        if (operator.equals(ctx.operator.AND())) {
            operation = new BinaryOperation(Operator.AND, op1, op2, expectedType);
        } else if (operator.equals(ctx.operator.OR())) {
            operation = new BinaryOperation(Operator.OR, op1, op2, expectedType);
        } else {
            operation = new BinaryOperation(Operator.XOR, op1, op2, expectedType);
        }

        analyser.tryPush(operation);
    }
    
    @Override public void enterRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitUnaryLogicalOperation(PnpParser.UnaryLogicalOperationContext ctx) {
        Type expectedType = PrimitiveType.Booleano;
        Expression op = analyser.tryPop();

        if (op == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op.getType() != expectedType) {
            throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op.getType() + "'");
        }

        UnaryOperation operation = new UnaryOperation(Operator.NOT, op, PrimitiveType.Booleano);
        analyser.tryPush(operation);
    }
    
    @Override public void exitIntegerMultiplicativeOperation(PnpParser.IntegerMultiplicativeOperationContext ctx) {
        Type racional = PrimitiveType.Racional;
        Type result = PrimitiveType.Inteiro;
        TerminalNode operator;
        if (ctx.operator.getTokens(ctx.operator.start.getType()).isEmpty()) {
            operator = ctx.operator.rationalMultiplicativeOperator().getTokens(ctx.operator.start.getType()).get(0);
        }
        else {
            operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);
        }

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }
        if (op1.getType() != result || op2.getType() != result) {
            if (op1.getType() != result && op1.getType() != racional) {
                throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
            }
            if (op2.getType() != result && op2.getType() != racional) {
                throw new SemanticException(ctx.start, "Operator '" + ctx.start.getText() + "' cannot be applied to '" + op1.getType() + "', '" + op2.getType() + "'");
            }

            result = racional;
        }
        BinaryOperation operation;

        if (operator.equals(ctx.operator.DIVISAO_INT()) && result != racional) {
            operation = new BinaryOperation(Operator.DIVISION, op1, op2, result);
        } else if (operator.equals(ctx.operator.MODULO()) && result != racional) {
            operation = new BinaryOperation(Operator.MODULO, op1, op2, result);
        } else if (operator.equals(ctx.operator.rationalMultiplicativeOperator().MULTIPLICACAO())) {
            operation = new BinaryOperation(Operator.MULTIPLICATION, op1, op2, result);
        } else {
            operation = new BinaryOperation(Operator.DIVISION, op1, op2, PrimitiveType.Racional);
        }

        analyser.tryPush(operation);
    }
    
    @Override public void exitIntegerAdditiveOperation(PnpParser.IntegerAdditiveOperationContext ctx) {
        Type result = PrimitiveType.Inteiro;
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 == null || op2 == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        BinaryOperation operation;
        if (op1.getType() == PrimitiveType.Racional || op2.getType() == PrimitiveType.Racional) {
            result = PrimitiveType.Racional;
        }

        if (operator.equals(ctx.operator.ADICAO())) {
            operation = new BinaryOperation(Operator.ADDITION, op1, op2, result);
        } else {
            operation = new BinaryOperation(Operator.SUBTRACTION, op1, op2, result);
        }

        analyser.tryPush(operation);
    }
    
    @Override public void exitRationalAdditiveOperation(PnpParser.RationalAdditiveOperationContext ctx) {
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.ADICAO())) {
                operation = new BinaryOperation(Operator.ADDITION, op1, op2, PrimitiveType.Racional);
            } else {
                operation = new BinaryOperation(Operator.SUBTRACTION, op1, op2, PrimitiveType.Racional);
            }

            analyser.tryPush(operation);
        }
    }
    
    @Override public void enterIntegerExpressionRationalArithmeticOperation(PnpParser.IntegerExpressionRationalArithmeticOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitIntegerExpressionRationalArithmeticOperation(PnpParser.IntegerExpressionRationalArithmeticOperationContext ctx) {
        //TODO
    }
    
    @Override public void enterRationalExpressionRationalArithmeticOperation(PnpParser.RationalExpressionRationalArithmeticOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitRationalExpressionRationalArithmeticOperation(PnpParser.RationalExpressionRationalArithmeticOperationContext ctx) {
        //TODO
    }
    
    @Override public void enterPriorityRationalArithmeticOperation(PnpParser.PriorityRationalArithmeticOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitPriorityRationalArithmeticOperation(PnpParser.PriorityRationalArithmeticOperationContext ctx) {
        //TODO
    }

    @Override public void exitRationalMultiplicativeOperation(PnpParser.RationalMultiplicativeOperationContext ctx) {
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.MULTIPLICACAO())) {
                operation = new BinaryOperation(Operator.MULTIPLICATION, op1, op2, PrimitiveType.Racional);
            } else {
                operation = new BinaryOperation(Operator.DIVISION, op1, op2, PrimitiveType.Racional);
            }

            analyser.tryPush(operation);
        }
    }
    
    @Override public void exitRecursiveConcatenationOperation(PnpParser.RecursiveConcatenationOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitCharacterExpressionConcatenationOperation(PnpParser.CharacterExpressionConcatenationOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitPriorityConcatenationOperation(PnpParser.PriorityConcatenationOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitNumericalExpressionConcatenationOperation(PnpParser.NumericalExpressionConcatenationOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitOperation(PnpParser.OperationContext ctx) {
        //TODO
    }
    
    @Override public void enterVariable(PnpParser.VariableContext ctx) {
        //TODO
    }
    
    @Override public void exitVariable(PnpParser.VariableContext ctx) {
        String identifier = ctx.id.getText();

        Construct getVariable = analyser.tryGetConstruct(identifier);
        if (!(getVariable instanceof Variable)) {
            throw new SemanticException(ctx.start, "Cannot resolve symbol '" + identifier + "'");
            // TODO throw exception in compilation time
        }
        else {
            Variable variable = (Variable)getVariable;
            analyser.tryPush(variable);
        }
    }
    
    @Override public void exitVariableDeclaration(PnpParser.VariableDeclarationContext ctx) {
        String identifier = ctx.identifier.getText();
        String typeToken = ctx.t.getText();
        Type type;

        if (analyser.existsInThisScope(identifier)) {
            throw new SemanticException(ctx.start, "variable '" + identifier + "' is already defined in the scope");
        }

        switch (typeToken) {
            case "inteiro": type = PrimitiveType.Inteiro; break;
            case "racional": type = PrimitiveType.Racional; break;
            case "booleano": type = PrimitiveType.Booleano; break;
            case "caractere": type = PrimitiveType.Caractere; break;
            case "string": type = PrimitiveType.String; break;
            default: {
                Construct fromAnalyser = analyser.tryGetConstruct(typeToken);
                if (!(fromAnalyser instanceof Type)) {
                    throw new SemanticException(ctx.start, "Cannot resolve symbol '" + typeToken + "'");
                }
                type = (Type)fromAnalyser;
            }
        }
        Variable variable = new Variable(type, identifier);

        analyser.tryPutConstruct(identifier, variable);
    }
    
    @Override public void exitVariableAssignment(PnpParser.VariableAssignmentContext ctx) {
        Expression assignment = analyser.tryPop();
        Expression exp = analyser.tryPop();

        if (!(exp instanceof Variable)) {
            analyser.tryPush(exp);
        }

        String identifier = ctx.variable().id.getText();
        Construct cons = analyser.tryGetConstruct(identifier);
        if (!(cons instanceof Variable)) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        Variable variable = (Variable)cons;
        if (!assignment.getType().isTypeOf(variable)) {
            throw new SemanticException(ctx.start, "Incompatible types between '" + variable.getType() + "' and '" + assignment.getType() + "'");
        }

        analyser.newAssignment(variable, assignment);
//        analyser.tryPutConstruct(variable.getName(), variable);
    }
    
    @Override public void enterExpression(PnpParser.ExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitExpression(PnpParser.ExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitBooleanExpression(PnpParser.BooleanExpressionContext ctx) {
        String expression = ctx.getText();


        if (ctx.function() == null && (expression.equals("true") || expression.equals("false"))) {
            try {
                boolean op = Boolean.parseBoolean(expression);
                Variable variable = new Variable(PrimitiveType.Booleano, op);
                analyser.tryPush(variable);
            } catch (NumberFormatException e) {
                // exitVariable
            }
        }
    }
    
    @Override public void enterNumericalExpression(PnpParser.NumericalExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitNumericalExpression(PnpParser.NumericalExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitIntegerExpression(PnpParser.IntegerExpressionContext ctx) {
        String expression = ctx.getText();

        if (ctx.function() == null) {
            try {
                int op = Integer.parseInt(expression);
                Variable variable = new Variable(PrimitiveType.Inteiro, op);
                analyser.tryPush(variable);
            } catch (NumberFormatException e) {
                // exitVariable
            }
        }
    }
    
    @Override public void exitRationalExpression(PnpParser.RationalExpressionContext ctx) {
        String expression = ctx.getText();

        if (ctx.function() == null) {
            try {
                float op = Float.parseFloat(expression);
                Variable variable = new Variable(PrimitiveType.Racional, op);
                analyser.tryPush(variable);
            } catch (NumberFormatException e) {
                // exitVariable
            }
        }
    }
    
    @Override public void exitCharacterExpression(PnpParser.CharacterExpressionContext ctx) {
        String expression = ctx.getText();

        if (ctx.function() == null) {
            try {
                char op;
                if (expression.charAt(1) == '\\') {
                    op = getEscapedChar(expression.charAt(2));
                } else {
                    op = expression.charAt(1);
                }
                Variable variable = new Variable(PrimitiveType.Caractere, op);
                analyser.tryPush(variable);
            } catch (StringIndexOutOfBoundsException e) {
                // exitVariable
            }
        }
    }

    private char getEscapedChar(char escape) {
        switch (escape) {
            case 'b': return '\b';
            case 't': return '\t';
            case 'n': return '\n';
            case 'f': return '\f';
            case 'r': return '\r';
        }
        return escape;
    }
    
    @Override public void exitFunction(PnpParser.FunctionContext ctx) {
        String identifier = ctx.identifier.getText();
        List<PnpParser.ExpressionContext> params;
        if (ctx.params() != null) {
            params = ctx.params().expression();
        }
        else {
            params = new ArrayList<>();
        }

        Construct cons = analyser.tryGetConstruct(identifier);
        if (!(cons instanceof Procedure)) {
            throw new SemanticException(ctx.start, "Cannot resolve procedure '" + identifier + "'");
        }

        Procedure proc = (Procedure)cons;
        if (params.size() != proc.getInput().size()) {
            throw new SemanticException(ctx.start, proc.getName() + " cannot be applied to assigned parametes");
        }

        List<Variable> input = proc.getInput();
        List<Expression> inputParams = new ArrayList<>();
        for(int i = params.size(); i > 0; i--) {
            int index = i - 1;
            Expression popped = analyser.tryPop();
            if (!(popped instanceof Variable) && !(popped instanceof Procedure)) {
                throw new SemanticException(ctx.start, "something went wrong");
            }
            if (input.get(index).getType() != popped.getType()) {
                throw new SemanticException(ctx.start, "Incompatible types between '" + input.get(index).getType() + "' and '" + popped.getType() + "'");
            }
            inputParams.add(0, popped);
        }
        ProcedureInstruction instruction = new ProcedureInstruction(proc, inputParams);
        analyser.tryPush(instruction);
    }
    
    @Override public void enterParams(PnpParser.ParamsContext ctx) {
        //TODO
    }
    
    @Override public void exitParams(PnpParser.ParamsContext ctx) {
        //TODO
    }
    
    @Override public void enterReadFunction(PnpParser.ReadFunctionContext ctx) {
        //TODO
    }
    
    @Override public void exitReadFunction(PnpParser.ReadFunctionContext ctx) {
        //TODO
    }
    
    @Override public void enterWriteFunction(PnpParser.WriteFunctionContext ctx) {
        //TODO
    }
    
    @Override public void exitWriteFunction(PnpParser.WriteFunctionContext ctx) {
        //TODO
    }
    
    @Override public void enterIfStatement(PnpParser.IfStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitIfStatement(PnpParser.IfStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitIfStart(PnpParser.IfStartContext ctx) {
        Expression condition = analyser.tryPop();

        if (condition.getType() != PrimitiveType.Booleano) {
            throw new SemanticException(ctx.start, "Incompatible types between '" + condition.getType() + "' and '" + PrimitiveType.Booleano + "'");
        }

        IfStatement statement = new IfStatement(condition);
        analyser.newInstruction(statement);
        analyser.newScope(statement.getIfBlock());
    }
    
    @Override public void enterIfThen(PnpParser.IfThenContext ctx) {
        //TODO
    }
    
    @Override public void exitIfThen(PnpParser.IfThenContext ctx) {
        analyser.endScope();
    }
    
    @Override public void enterIfElse(PnpParser.IfElseContext ctx) {
        Instruction lastInstruction = analyser.lastInstruction();
        if (lastInstruction == null) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        if (!(lastInstruction instanceof IfStatement)) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        Block block = ((IfStatement) lastInstruction).startElseBranch();
        analyser.newScope(block);
    }

    @Override public void exitIfElse(PnpParser.IfElseContext ctx) {
        analyser.endScope();
    }
    
    @Override public void enterIfElseIf(PnpParser.IfElseIfContext ctx) {
        if (ctx.elseIf() != null) {
            throw new SemanticException(ctx.start, "does not support else if");
        }
    }
    
    @Override public void exitIfElseIf(PnpParser.IfElseIfContext ctx) {
        //TODO
    }
    
    @Override public void enterElseIf(PnpParser.ElseIfContext ctx) {
        //TODO
    }
    
    @Override public void exitElseIf(PnpParser.ElseIfContext ctx) {
        //TODO
    }
    
    @Override public void enterSwitchStatement(PnpParser.SwitchStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitSwitchStatement(PnpParser.SwitchStatementContext ctx) {
        //TODO
    }
    
    @Override public void enterSwitchStart(PnpParser.SwitchStartContext ctx) {
        //TODO
    }
    
    @Override public void exitSwitchStart(PnpParser.SwitchStartContext ctx) {
        //TODO
    }
    
    @Override public void enterSwitchCases(PnpParser.SwitchCasesContext ctx) {
        //TODO
    }
    
    @Override public void exitSwitchCases(PnpParser.SwitchCasesContext ctx) {
        //TODO
    }
    
    @Override public void enterSwitchDefault(PnpParser.SwitchDefaultContext ctx) {
        //TODO
    }
    
    @Override public void exitSwitchDefault(PnpParser.SwitchDefaultContext ctx) {
        //TODO
    }
    
    @Override public void enterForStatement(PnpParser.ForStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitForStatement(PnpParser.ForStatementContext ctx) {
        //TODO
    }
    
    @Override public void enterForStart(PnpParser.ForStartContext ctx) {
        //TODO
    }
    
    @Override public void exitForStart(PnpParser.ForStartContext ctx) {
        //TODO
    }
    
    @Override public void enterForInterval(PnpParser.ForIntervalContext ctx) {
        //TODO
    }
    
    @Override public void exitForInterval(PnpParser.ForIntervalContext ctx) {
        //TODO
    }
    
    @Override public void enterForStep(PnpParser.ForStepContext ctx) {
        //TODO
    }
    
    @Override public void exitForStep(PnpParser.ForStepContext ctx) {
        //TODO
    }
    
    @Override public void enterForBlock(PnpParser.ForBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitForBlock(PnpParser.ForBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterWhileStatement(PnpParser.WhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitWhileStatement(PnpParser.WhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitWhileStart(PnpParser.WhileStartContext ctx) {
        Expression condition = analyser.tryPop();

        if (condition.getType() != PrimitiveType.Booleano) {
            throw new SemanticException(ctx.start, "Incompatible types between '" + condition.getType() + "' and '" + PrimitiveType.Booleano + "'");
        }

        WhileStatement statement = new WhileStatement(condition);
        analyser.newInstruction(statement);
        analyser.newScope(statement.getWhileBlock());
    }
    
    @Override public void enterWhileBlock(PnpParser.WhileBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitWhileBlock(PnpParser.WhileBlockContext ctx) {
        analyser.endScope();
    }
    
    @Override public void enterDoWhileStatement(PnpParser.DoWhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitDoWhileStatement(PnpParser.DoWhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void enterDoWhileBlock(PnpParser.DoWhileBlockContext ctx) {
        DoWhileStatement statement = new DoWhileStatement();
        analyser.newInstruction(statement);
        analyser.newScope(statement.getDoWhileBlock());
    }
    
    @Override public void exitDoWhileBlock(PnpParser.DoWhileBlockContext ctx) {
        analyser.endScope();
    }
    
    @Override public void enterDoWhileEnd(PnpParser.DoWhileEndContext ctx) {
        //TODO
    }
    
    @Override public void exitDoWhileEnd(PnpParser.DoWhileEndContext ctx) {
        Instruction instruction = analyser.lastInstruction();

        if (instruction == null || !(instruction instanceof DoWhileStatement)) {
            throw new SemanticException(ctx.start, "Something went wrong");
        }

        Expression condition = analyser.tryPop();

        if (condition.getType() != PrimitiveType.Booleano) {
            throw new SemanticException(ctx.start, "Incompatible types between '" + condition.getType() + "' and '" + PrimitiveType.Booleano + "'");
        }

        DoWhileStatement statement = (DoWhileStatement) instruction;
        statement.setCondition(condition);
    }
    
    @Override public void enterTypeDefinitionType(PnpParser.TypeDefinitionTypeContext ctx) {
        //TODO
    }
    
    @Override public void exitTypeDefinitionType(PnpParser.TypeDefinitionTypeContext ctx) {
        //TODO
    }
    
    @Override public void enterType(PnpParser.TypeContext ctx) {
        //TODO
    }
    
    @Override public void exitType(PnpParser.TypeContext ctx) {
        //TODO
    }
    
    @Override public void enterPrimitiveType(PnpParser.PrimitiveTypeContext ctx) {
        //TODO
    }
    
    @Override public void exitPrimitiveType(PnpParser.PrimitiveTypeContext ctx) {
        //TODO
    }
    
    @Override public void enterVariableArrayDimention(PnpParser.VariableArrayDimentionContext ctx) {
        //TODO
    }
    
    @Override public void exitVariableArrayDimention(PnpParser.VariableArrayDimentionContext ctx) {
        //TODO
    }
    
    @Override public void enterLiteralArrayDimention(PnpParser.LiteralArrayDimentionContext ctx) {
        //TODO
    }
    
    @Override public void exitLiteralArrayDimention(PnpParser.LiteralArrayDimentionContext ctx) {
        //TODO
    }
    
    @Override public void enterArrayDimentionLiteral(PnpParser.ArrayDimentionLiteralContext ctx) {
        //TODO
    }
    
    @Override public void exitArrayDimentionLiteral(PnpParser.ArrayDimentionLiteralContext ctx) {
        //TODO
    }
    
    @Override public void enterBinaryOperator(PnpParser.BinaryOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitBinaryOperator(PnpParser.BinaryOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterRelationalOperator(PnpParser.RelationalOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitRelationalOperator(PnpParser.RelationalOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterEqualityOperator(PnpParser.EqualityOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitEqualityOperator(PnpParser.EqualityOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterComparisonOperator(PnpParser.ComparisonOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitComparisonOperator(PnpParser.ComparisonOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterArithmeticOperator(PnpParser.ArithmeticOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitArithmeticOperator(PnpParser.ArithmeticOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterAdditiveOperator(PnpParser.AdditiveOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitAdditiveOperator(PnpParser.AdditiveOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterMultiplicativeOperator(PnpParser.MultiplicativeOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitMultiplicativeOperator(PnpParser.MultiplicativeOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterRationalMultiplicativeOperator(PnpParser.RationalMultiplicativeOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitRationalMultiplicativeOperator(PnpParser.RationalMultiplicativeOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterUnaryLogicalOperator(PnpParser.UnaryLogicalOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitUnaryLogicalOperator(PnpParser.UnaryLogicalOperatorContext ctx) {
        //TODO
    }
    
    @Override public void enterBinaryLogicalOperator(PnpParser.BinaryLogicalOperatorContext ctx) {
        //TODO
    }
    
    @Override public void exitBinaryLogicalOperator(PnpParser.BinaryLogicalOperatorContext ctx) {
        //TODO
    }
}
