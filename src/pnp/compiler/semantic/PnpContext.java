package pnp.compiler.semantic;

import org.antlr.v4.runtime.tree.TerminalNode;
import pnp.compiler.model.Construct;
import pnp.compiler.model.Expression;
import pnp.compiler.model.Operator;
import pnp.compiler.model.Variable;
import pnp.compiler.model.operation.BinaryOperation;
import pnp.compiler.model.operation.UnaryOperation;
import pnp.compiler.model.type.primitives.PrimitiveType;
import pnp.compiler.syntax.grammar.antlr.PnpBaseListener;
import pnp.compiler.syntax.grammar.antlr.PnpParser;

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
        //TODO
    }
    
    @Override public void exitProcedure(PnpParser.ProcedureContext ctx) {
        //TODO
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
    
    @Override public void enterProcedureInput(PnpParser.ProcedureInputContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureInput(PnpParser.ProcedureInputContext ctx) {
        //TODO
    }
    
    @Override public void enterProcedureOutput(PnpParser.ProcedureOutputContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureOutput(PnpParser.ProcedureOutputContext ctx) {
        //TODO
    }
    
    @Override public void enterProcedureBlock(PnpParser.ProcedureBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitProcedureBlock(PnpParser.ProcedureBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterMainProcedure(PnpParser.MainProcedureContext ctx) {
        //TODO
    }
    
    @Override public void exitMainProcedure(PnpParser.MainProcedureContext ctx) {
        //TODO
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
        //TODO
    }
    
    @Override public void exitBlock(PnpParser.BlockContext ctx) {
        //TODO
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
        //TODO
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
        TerminalNode operator;

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (ctx.operator.equalityOperator() != null) {
                operator = ctx.operator.equalityOperator().getTokens(ctx.operator.start.getType()).get(0);

                if (operator.equals(ctx.operator.equalityOperator().IGUALDADE())) {
                    operation = new BinaryOperation(Operator.EQUALITY, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                } else if (operator.equals(ctx.operator.equalityOperator().DESIGUALDADE())) {
                    operation = new BinaryOperation(Operator.INEQUALITY, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                } else if (operator.equals(ctx.operator.equalityOperator().MAIOR_IGUAL())) {
                    operation = new BinaryOperation(Operator.GREATER_THAN_EQUAL, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                } else {
                    operation = new BinaryOperation(Operator.LESS_THAN_EQUAL, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                }

                analyser.tryPush(operation);
            }
            else {
                operator = ctx.operator.comparisonOperator().getTokens(ctx.operator.start.getType()).get(0);

                if (operator.equals(ctx.operator.comparisonOperator().MAIOR())) {
                    operation = new BinaryOperation(Operator.GREATER_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                } else {
                    operation = new BinaryOperation(Operator.LESS_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Inteiro);
                }

                analyser.tryPush(operation);
            }
        }
    }
    
    @Override public void exitRationalRelationalOperation(PnpParser.RationalRelationalOperationContext ctx) {
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.MAIOR())) {
                operation = new BinaryOperation(Operator.GREATER_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Racional);
            } else {
                operation = new BinaryOperation(Operator.LESS_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Racional);
            }

            analyser.tryPush(operation);
        }
    }
    
    @Override public void exitCharacterRelationalOperation(PnpParser.CharacterRelationalOperationContext ctx) {
        TerminalNode operator;

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (ctx.operator.equalityOperator() != null) {
                operator = ctx.operator.equalityOperator().getTokens(ctx.operator.start.getType()).get(0);

                if (operator.equals(ctx.operator.equalityOperator().IGUALDADE())) {
                    operation = new BinaryOperation(Operator.EQUALITY, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                } else if (operator.equals(ctx.operator.equalityOperator().DESIGUALDADE())) {
                    operation = new BinaryOperation(Operator.INEQUALITY, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                } else if (operator.equals(ctx.operator.equalityOperator().MAIOR_IGUAL())) {
                    operation = new BinaryOperation(Operator.GREATER_THAN_EQUAL, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                } else {
                    operation = new BinaryOperation(Operator.LESS_THAN_EQUAL, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                }

                analyser.tryPush(operation);
            }
            else {
                operator = ctx.operator.comparisonOperator().getTokens(ctx.operator.start.getType()).get(0);

                if (operator.equals(ctx.operator.comparisonOperator().MAIOR())) {
                    operation = new BinaryOperation(Operator.GREATER_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                } else {
                    operation = new BinaryOperation(Operator.LESS_THAN, op1, op2, PrimitiveType.Booleano, PrimitiveType.Caractere);
                }

                analyser.tryPush(operation);
            }
        }
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
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.AND())) {
                operation = new BinaryOperation(Operator.AND, op1, op2, PrimitiveType.Booleano);
            } else if (operator.equals(ctx.operator.OR())) {
                operation = new BinaryOperation(Operator.OR, op1, op2, PrimitiveType.Booleano);
            } else {
                operation = new BinaryOperation(Operator.XOR, op1, op2, PrimitiveType.Booleano);
            }

            analyser.tryPush(operation);
        }
    }
    
    @Override public void enterRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx) {
        //TODO
    }
    
    @Override public void exitUnaryLogicalOperation(PnpParser.UnaryLogicalOperationContext ctx) {
        Expression op = analyser.tryPop();

        if (op != null) {
            UnaryOperation operation = new UnaryOperation(Operator.NOT, op, PrimitiveType.Booleano);
            analyser.tryPush(operation);
        }
    }
    
    @Override public void exitIntegerMultiplicativeOperation(PnpParser.IntegerMultiplicativeOperationContext ctx) {
        TerminalNode operator;
        if (ctx.operator.getTokens(ctx.operator.start.getType()).isEmpty()) {
            operator = ctx.operator.rationalMultiplicativeOperator().getTokens(ctx.operator.start.getType()).get(0);
        }
        else {
            operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);
        }

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.DIVISAO_INT())) {
                operation = new BinaryOperation(Operator.DIVISION, op1, op2, PrimitiveType.Inteiro);
            } else if (operator.equals(ctx.operator.MODULO())) {
                operation = new BinaryOperation(Operator.MODULO, op1, op2, PrimitiveType.Inteiro);
            } else if (operator.equals(ctx.operator.rationalMultiplicativeOperator().MULTIPLICACAO())) {
                operation = new BinaryOperation(Operator.MULTIPLICATION, op1, op2, PrimitiveType.Inteiro);
            } else {
                operation = new BinaryOperation(Operator.DIVISION, op1, op2, PrimitiveType.Racional);
            }

            analyser.tryPush(operation);
        }
    }
    
    @Override public void exitIntegerAdditiveOperation(PnpParser.IntegerAdditiveOperationContext ctx) {
        TerminalNode operator = ctx.operator.getTokens(ctx.operator.start.getType()).get(0);

        Expression op2 = analyser.tryPop();
        Expression op1 = analyser.tryPop();

        if (op1 != null && op2 != null) {
            BinaryOperation operation;

            if (operator.equals(ctx.operator.ADICAO())) {
                operation = new BinaryOperation(Operator.ADDITION, op1, op2, PrimitiveType.Inteiro);
            } else {
                operation = new BinaryOperation(Operator.SUBTRACTION, op1, op2, PrimitiveType.Inteiro);
            }

            analyser.tryPush(operation);
        }
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
        if (getVariable instanceof Variable) {
            Variable variable = (Variable)getVariable;
            analyser.tryPush(variable);
        }
        else {
            // TODO throw exception in compilation time
            System.out.println("Só pq o compilador tava dando warning aqui de bloco vazio");
        }
    }
    
    @Override public void enterVariableDeclaration(PnpParser.VariableDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void exitVariableDeclaration(PnpParser.VariableDeclarationContext ctx) {
        //TODO
    }
    
    @Override public void enterVariableAssignment(PnpParser.VariableAssignmentContext ctx) {
        //TODO
    }
    
    @Override public void exitVariableAssignment(PnpParser.VariableAssignmentContext ctx) {
        //TODO
    }
    
    @Override public void enterExpression(PnpParser.ExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitExpression(PnpParser.ExpressionContext ctx) {
        //TODO
    }
    
    @Override public void exitBooleanExpression(PnpParser.BooleanExpressionContext ctx) {
        String expression = ctx.getText();

        try {
            boolean op = Boolean.parseBoolean(expression);
            Variable variable = new Variable(PrimitiveType.Booleano, op);
            analyser.tryPush(variable);
        }
        catch (NumberFormatException e) {
            // exitVariable
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

        try {
            int op = Integer.parseInt(expression);
            Variable variable = new Variable(PrimitiveType.Inteiro, op);
            analyser.tryPush(variable);
        }
        catch (NumberFormatException e) {
            // exitVariable
        }
    }
    
    @Override public void exitRationalExpression(PnpParser.RationalExpressionContext ctx) {
        String expression = ctx.getText();

        try {
            float op = Float.parseFloat(expression);
            Variable variable = new Variable(PrimitiveType.Racional, op);
            analyser.tryPush(variable);
        }
        catch (NumberFormatException e) {
            // exitVariable
        }
    }
    
    @Override public void exitCharacterExpression(PnpParser.CharacterExpressionContext ctx) {
        String expression = ctx.getText();

        try {
            char op;
            if (expression.charAt(1) == '\\') {
                op = getEscapedChar(expression.charAt(2));
            }
            else {
                op = expression.charAt(1);
            }
            Variable variable = new Variable(PrimitiveType.Caractere, op);
            analyser.tryPush(variable);
        }
        catch (NumberFormatException e) {
            // exitVariable
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
    
    @Override public void enterFunction(PnpParser.FunctionContext ctx) {
        //TODO
    }
    
    @Override public void exitFunction(PnpParser.FunctionContext ctx) {
        //TODO
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
    
    @Override public void enterIfStart(PnpParser.IfStartContext ctx) {
        //TODO
    }
    
    @Override public void exitIfStart(PnpParser.IfStartContext ctx) {
        //TODO
    }
    
    @Override public void enterIfThen(PnpParser.IfThenContext ctx) {
        //TODO
    }
    
    @Override public void exitIfThen(PnpParser.IfThenContext ctx) {
        //TODO
    }
    
    @Override public void enterIfElse(PnpParser.IfElseContext ctx) {
        //TODO
    }
    
    @Override public void exitIfElse(PnpParser.IfElseContext ctx) {
        //TODO
    }
    
    @Override public void enterIfElseIf(PnpParser.IfElseIfContext ctx) {
        //TODO
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
    
    @Override public void enterWhileStart(PnpParser.WhileStartContext ctx) {
        //TODO
    }
    
    @Override public void exitWhileStart(PnpParser.WhileStartContext ctx) {
        //TODO
    }
    
    @Override public void enterWhileBlock(PnpParser.WhileBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitWhileBlock(PnpParser.WhileBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterDoWhileStatement(PnpParser.DoWhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void exitDoWhileStatement(PnpParser.DoWhileStatementContext ctx) {
        //TODO
    }
    
    @Override public void enterDoWhileBlock(PnpParser.DoWhileBlockContext ctx) {
        //TODO
    }
    
    @Override public void exitDoWhileBlock(PnpParser.DoWhileBlockContext ctx) {
        //TODO
    }
    
    @Override public void enterDoWhileEnd(PnpParser.DoWhileEndContext ctx) {
        //TODO
    }
    
    @Override public void exitDoWhileEnd(PnpParser.DoWhileEndContext ctx) {
        //TODO
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
