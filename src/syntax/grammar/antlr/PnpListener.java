// Generated from D:/Workspace/PNP/src/syntax/grammar\Pnp.g4 by ANTLR 4.7.2
package syntax.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PnpParser}.
 */
public interface PnpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PnpParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PnpParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PnpParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclarationBlock(PnpParser.ProcedureDeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclarationBlock(PnpParser.ProcedureDeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(PnpParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(PnpParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBody(PnpParser.ProcedureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureBody}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBody(PnpParser.ProcedureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(PnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(PnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInput(PnpParser.ProcedureInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInput(PnpParser.ProcedureInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOutput(PnpParser.ProcedureOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOutput(PnpParser.ProcedureOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBlock(PnpParser.ProcedureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBlock(PnpParser.ProcedureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#mainProcedure}.
	 * @param ctx the parse tree
	 */
	void enterMainProcedure(PnpParser.MainProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#mainProcedure}.
	 * @param ctx the parse tree
	 */
	void exitMainProcedure(PnpParser.MainProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(PnpParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(PnpParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#typeVariableDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariableDeclarationBlock(PnpParser.TypeVariableDeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#typeVariableDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariableDeclarationBlock(PnpParser.TypeVariableDeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PnpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PnpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#variableDeclarationAndAssignmentBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAndAssignmentBlock(PnpParser.VariableDeclarationAndAssignmentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#variableDeclarationAndAssignmentBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAndAssignmentBlock(PnpParser.VariableDeclarationAndAssignmentBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAndAssignment(PnpParser.VariableDeclarationAndAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAndAssignment(PnpParser.VariableDeclarationAndAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PnpParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PnpParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PnpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PnpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#statementCondition}.
	 * @param ctx the parse tree
	 */
	void enterStatementCondition(PnpParser.StatementConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#statementCondition}.
	 * @param ctx the parse tree
	 */
	void exitStatementCondition(PnpParser.StatementConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterPriorityRelationalOperation(PnpParser.PriorityRelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitPriorityRelationalOperation(PnpParser.PriorityRelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerRelationalOperation(PnpParser.IntegerRelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerRelationalOperation(PnpParser.IntegerRelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterRationalRelationalOperation(PnpParser.RationalRelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitRationalRelationalOperation(PnpParser.RationalRelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterCharacterRelationalOperation(PnpParser.CharacterRelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitCharacterRelationalOperation(PnpParser.CharacterRelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRelationalOperation(PnpParser.ExpressionRelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRelationalOperation(PnpParser.ExpressionRelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterPriorityLogicalOperation(PnpParser.PriorityLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitPriorityLogicalOperation(PnpParser.PriorityLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLogicalOperation(PnpParser.ExpressionLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLogicalOperation(PnpParser.ExpressionLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalOperation(PnpParser.BinaryLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalOperation(PnpParser.BinaryLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicalOperation(PnpParser.UnaryLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicalOperation(PnpParser.UnaryLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerMultiplicativeOperation(PnpParser.IntegerMultiplicativeOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerMultiplicativeOperation(PnpParser.IntegerMultiplicativeOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIntegerArithmeticOperation(PnpParser.ExpressionIntegerArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIntegerArithmeticOperation(PnpParser.ExpressionIntegerArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterPriorityIntegerArithmeticOperation(PnpParser.PriorityIntegerArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitPriorityIntegerArithmeticOperation(PnpParser.PriorityIntegerArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerAdditiveOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAdditiveOperation(PnpParser.IntegerAdditiveOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerAdditiveOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAdditiveOperation(PnpParser.IntegerAdditiveOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalAdditiveOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterRationalAdditiveOperation(PnpParser.RationalAdditiveOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalAdditiveOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitRationalAdditiveOperation(PnpParser.RationalAdditiveOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpressionRationalArithmeticOperation(PnpParser.IntegerExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpressionRationalArithmeticOperation(PnpParser.IntegerExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterRationalExpressionRationalArithmeticOperation(PnpParser.RationalExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitRationalExpressionRationalArithmeticOperation(PnpParser.RationalExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterPriorityRationalArithmeticOperation(PnpParser.PriorityRationalArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitPriorityRationalArithmeticOperation(PnpParser.PriorityRationalArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rationalMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterRationalMultiplicativeOperation(PnpParser.RationalMultiplicativeOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rationalMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitRationalMultiplicativeOperation(PnpParser.RationalMultiplicativeOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recursiveConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void enterRecursiveConcatenationOperation(PnpParser.RecursiveConcatenationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recursiveConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void exitRecursiveConcatenationOperation(PnpParser.RecursiveConcatenationOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpressionConcatenationOperation(PnpParser.CharacterExpressionConcatenationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpressionConcatenationOperation(PnpParser.CharacterExpressionConcatenationOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorityConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void enterPriorityConcatenationOperation(PnpParser.PriorityConcatenationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorityConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void exitPriorityConcatenationOperation(PnpParser.PriorityConcatenationOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericalExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpressionConcatenationOperation(PnpParser.NumericalExpressionConcatenationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericalExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpressionConcatenationOperation(PnpParser.NumericalExpressionConcatenationOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(PnpParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(PnpParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PnpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PnpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PnpParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PnpParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(PnpParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(PnpParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PnpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PnpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(PnpParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(PnpParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpression(PnpParser.NumericalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpression(PnpParser.NumericalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(PnpParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#integerExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(PnpParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#rationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRationalExpression(PnpParser.RationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#rationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRationalExpression(PnpParser.RationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpression(PnpParser.CharacterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpression(PnpParser.CharacterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PnpParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PnpParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PnpParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PnpParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#readFunction}.
	 * @param ctx the parse tree
	 */
	void enterReadFunction(PnpParser.ReadFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#readFunction}.
	 * @param ctx the parse tree
	 */
	void exitReadFunction(PnpParser.ReadFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#writeFunction}.
	 * @param ctx the parse tree
	 */
	void enterWriteFunction(PnpParser.WriteFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#writeFunction}.
	 * @param ctx the parse tree
	 */
	void exitWriteFunction(PnpParser.WriteFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PnpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PnpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStart(PnpParser.IfStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStart(PnpParser.IfStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(PnpParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(PnpParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(PnpParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(PnpParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIf(PnpParser.IfElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIf(PnpParser.IfElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(PnpParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(PnpParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(PnpParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(PnpParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#switchStart}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStart(PnpParser.SwitchStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#switchStart}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStart(PnpParser.SwitchStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(PnpParser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(PnpParser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefault(PnpParser.SwitchDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefault(PnpParser.SwitchDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PnpParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PnpParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#forStart}.
	 * @param ctx the parse tree
	 */
	void enterForStart(PnpParser.ForStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#forStart}.
	 * @param ctx the parse tree
	 */
	void exitForStart(PnpParser.ForStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#forInterval}.
	 * @param ctx the parse tree
	 */
	void enterForInterval(PnpParser.ForIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#forInterval}.
	 * @param ctx the parse tree
	 */
	void exitForInterval(PnpParser.ForIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterForStep(PnpParser.ForStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitForStep(PnpParser.ForStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(PnpParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(PnpParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PnpParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PnpParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#whileStart}.
	 * @param ctx the parse tree
	 */
	void enterWhileStart(PnpParser.WhileStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#whileStart}.
	 * @param ctx the parse tree
	 */
	void exitWhileStart(PnpParser.WhileStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(PnpParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(PnpParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(PnpParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(PnpParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(PnpParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(PnpParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileEnd(PnpParser.DoWhileEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileEnd(PnpParser.DoWhileEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#typeDefinitionType}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionType(PnpParser.TypeDefinitionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#typeDefinitionType}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionType(PnpParser.TypeDefinitionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PnpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PnpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(PnpParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(PnpParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void enterVariableArrayDimention(PnpParser.VariableArrayDimentionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void exitVariableArrayDimention(PnpParser.VariableArrayDimentionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArrayDimention(PnpParser.LiteralArrayDimentionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArrayDimention(PnpParser.LiteralArrayDimentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#arrayDimentionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimentionLiteral(PnpParser.ArrayDimentionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#arrayDimentionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimentionLiteral(PnpParser.ArrayDimentionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(PnpParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(PnpParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(PnpParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(PnpParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(PnpParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(PnpParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PnpParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PnpParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(PnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(PnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(PnpParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(PnpParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(PnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(PnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#rationalMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterRationalMultiplicativeOperator(PnpParser.RationalMultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#rationalMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitRationalMultiplicativeOperator(PnpParser.RationalMultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicalOperator(PnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicalOperator(PnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalOperator(PnpParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalOperator(PnpParser.BinaryLogicalOperatorContext ctx);
}