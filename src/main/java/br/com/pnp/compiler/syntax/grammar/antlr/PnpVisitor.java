// Generated from C:/Workspace/PNP/src/main/java/br/com/pnp/compiler/syntax/grammar\Pnp.g4 by ANTLR 4.7.2
package br.com.pnp.compiler.syntax.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PnpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PnpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PnpParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(PnpParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureDeclarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclarationBlock(PnpParser.ProcedureDeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(PnpParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBody(PnpParser.ProcedureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(PnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInput(PnpParser.ProcedureInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOutput(PnpParser.ProcedureOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBlock(PnpParser.ProcedureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#mainProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProcedure(PnpParser.MainProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(PnpParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#typeVariableDeclarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclarationBlock(PnpParser.TypeVariableDeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PnpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#variableDeclarationAndAssignmentBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAndAssignmentBlock(PnpParser.VariableDeclarationAndAssignmentBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#variableDeclarationAndAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAndAssignment(PnpParser.VariableDeclarationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PnpParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PnpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#statementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCondition(PnpParser.StatementConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityRelationalOperation(PnpParser.PriorityRelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerRelationalOperation(PnpParser.IntegerRelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalRelationalOperation(PnpParser.RationalRelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterRelationalOperation(PnpParser.CharacterRelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRelationalOperation}
	 * labeled alternative in {@link PnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRelationalOperation(PnpParser.ExpressionRelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityLogicalOperation(PnpParser.PriorityLogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLogicalOperation(PnpParser.ExpressionLogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogicalOperation(PnpParser.BinaryLogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalLogicalOperation(PnpParser.RelationalLogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryLogicalOperation}
	 * labeled alternative in {@link PnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalOperation(PnpParser.UnaryLogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerMultiplicativeOperation(PnpParser.IntegerMultiplicativeOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIntegerArithmeticOperation(PnpParser.ExpressionIntegerArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityIntegerArithmeticOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityIntegerArithmeticOperation(PnpParser.PriorityIntegerArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerAdditiveOperation}
	 * labeled alternative in {@link PnpParser#integerArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAdditiveOperation(PnpParser.IntegerAdditiveOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalAdditiveOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalAdditiveOperation(PnpParser.RationalAdditiveOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpressionRationalArithmeticOperation(PnpParser.IntegerExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalExpressionRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalExpressionRationalArithmeticOperation(PnpParser.RationalExpressionRationalArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityRationalArithmeticOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityRationalArithmeticOperation(PnpParser.PriorityRationalArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rationalMultiplicativeOperation}
	 * labeled alternative in {@link PnpParser#rationalArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalMultiplicativeOperation(PnpParser.RationalMultiplicativeOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recursiveConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursiveConcatenationOperation(PnpParser.RecursiveConcatenationOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpressionConcatenationOperation(PnpParser.CharacterExpressionConcatenationOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorityConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityConcatenationOperation(PnpParser.PriorityConcatenationOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericalExpressionConcatenationOperation}
	 * labeled alternative in {@link PnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpressionConcatenationOperation(PnpParser.NumericalExpressionConcatenationOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(PnpParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PnpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PnpParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(PnpParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PnpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(PnpParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(PnpParser.NumericalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#integerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(PnpParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#rationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalExpression(PnpParser.RationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#characterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpression(PnpParser.CharacterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PnpParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PnpParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#readFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFunction(PnpParser.ReadFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#writeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFunction(PnpParser.WriteFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PnpParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#ifStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStart(PnpParser.IfStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(PnpParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(PnpParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIf(PnpParser.IfElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(PnpParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(PnpParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#switchStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStart(PnpParser.SwitchStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(PnpParser.SwitchCasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#switchDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefault(PnpParser.SwitchDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PnpParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#forStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStart(PnpParser.ForStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#forInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInterval(PnpParser.ForIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#forStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStep(PnpParser.ForStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(PnpParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PnpParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#whileStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStart(PnpParser.WhileStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(PnpParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(PnpParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(PnpParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileEnd(PnpParser.DoWhileEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#typeDefinitionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionType(PnpParser.TypeDefinitionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PnpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PnpParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArrayDimention(PnpParser.VariableArrayDimentionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalArrayDimention}
	 * labeled alternative in {@link PnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralArrayDimention(PnpParser.LiteralArrayDimentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#arrayDimentionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimentionLiteral(PnpParser.ArrayDimentionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(PnpParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(PnpParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(PnpParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(PnpParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(PnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(PnpParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(PnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#rationalMultiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRationalMultiplicativeOperator(PnpParser.RationalMultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalOperator(PnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogicalOperator(PnpParser.BinaryLogicalOperatorContext ctx);
}