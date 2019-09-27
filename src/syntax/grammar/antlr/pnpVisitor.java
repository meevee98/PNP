// Generated from F:/Workspace/PNP/src/syntax/grammar\pnp.g4 by ANTLR 4.7.2
package syntax.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pnpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pnpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pnpParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(pnpParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(pnpParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(pnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#procedureInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInput(pnpParser.ProcedureInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOutput(pnpParser.ProcedureOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureBlock(pnpParser.ProcedureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pnpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#variableDeclarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationBlock(pnpParser.VariableDeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(pnpParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pnpParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#statementCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCondition(pnpParser.StatementConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperation(pnpParser.RelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(pnpParser.LogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(pnpParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenationOperation(pnpParser.ConcatenationOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(pnpParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(pnpParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(pnpParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pnpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(pnpParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalExpression(pnpParser.NumericalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#characterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpression(pnpParser.CharacterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(pnpParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(pnpParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(pnpParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#ifStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStart(pnpParser.IfStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(pnpParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(pnpParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIf(pnpParser.IfElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(pnpParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(pnpParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#switchStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStart(pnpParser.SwitchStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(pnpParser.SwitchCasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#switchDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefault(pnpParser.SwitchDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(pnpParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#forStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStart(pnpParser.ForStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#forInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInterval(pnpParser.ForIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#forStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStep(pnpParser.ForStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(pnpParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(pnpParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#whileStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStart(pnpParser.WhileStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(pnpParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(pnpParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(pnpParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileEnd(pnpParser.DoWhileEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(pnpParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimention(pnpParser.ArrayDimentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(pnpParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(pnpParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(pnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(pnpParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(pnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogicalOperator(pnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogicalOperator(pnpParser.BinaryLogicalOperatorContext ctx);
}