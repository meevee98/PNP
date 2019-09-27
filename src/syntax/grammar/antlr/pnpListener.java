// Generated from F:/Workspace/PNP/src/syntax/grammar\pnp.g4 by ANTLR 4.7.2
package syntax.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pnpParser}.
 */
public interface pnpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pnpParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(pnpParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(pnpParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(pnpParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(pnpParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(pnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(pnpParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureInput(pnpParser.ProcedureInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedureInput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureInput(pnpParser.ProcedureInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOutput(pnpParser.ProcedureOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedureOutput}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOutput(pnpParser.ProcedureOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void enterProcedureBlock(pnpParser.ProcedureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedureBlock}.
	 * @param ctx the parse tree
	 */
	void exitProcedureBlock(pnpParser.ProcedureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pnpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pnpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#variableDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationBlock(pnpParser.VariableDeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#variableDeclarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationBlock(pnpParser.VariableDeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(pnpParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(pnpParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pnpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pnpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#statementCondition}.
	 * @param ctx the parse tree
	 */
	void enterStatementCondition(pnpParser.StatementConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#statementCondition}.
	 * @param ctx the parse tree
	 */
	void exitStatementCondition(pnpParser.StatementConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperation(pnpParser.RelationalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#relationalOperation}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperation(pnpParser.RelationalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(pnpParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(pnpParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(pnpParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(pnpParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationOperation(pnpParser.ConcatenationOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#concatenationOperation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationOperation(pnpParser.ConcatenationOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(pnpParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(pnpParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(pnpParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(pnpParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(pnpParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(pnpParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pnpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pnpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(pnpParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(pnpParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpression(pnpParser.NumericalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpression(pnpParser.NumericalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpression(pnpParser.CharacterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#characterExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpression(pnpParser.CharacterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(pnpParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(pnpParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(pnpParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(pnpParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pnpParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pnpParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStart(pnpParser.IfStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStart(pnpParser.IfStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(pnpParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(pnpParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(pnpParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(pnpParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIf(pnpParser.IfElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#ifElseIf}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIf(pnpParser.IfElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(pnpParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(pnpParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(pnpParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(pnpParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#switchStart}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStart(pnpParser.SwitchStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#switchStart}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStart(pnpParser.SwitchStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(pnpParser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(pnpParser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefault(pnpParser.SwitchDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefault(pnpParser.SwitchDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pnpParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pnpParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#forStart}.
	 * @param ctx the parse tree
	 */
	void enterForStart(pnpParser.ForStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#forStart}.
	 * @param ctx the parse tree
	 */
	void exitForStart(pnpParser.ForStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#forInterval}.
	 * @param ctx the parse tree
	 */
	void enterForInterval(pnpParser.ForIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#forInterval}.
	 * @param ctx the parse tree
	 */
	void exitForInterval(pnpParser.ForIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterForStep(pnpParser.ForStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitForStep(pnpParser.ForStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(pnpParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(pnpParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pnpParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pnpParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#whileStart}.
	 * @param ctx the parse tree
	 */
	void enterWhileStart(pnpParser.WhileStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#whileStart}.
	 * @param ctx the parse tree
	 */
	void exitWhileStart(pnpParser.WhileStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(pnpParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(pnpParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(pnpParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(pnpParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(pnpParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(pnpParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileEnd(pnpParser.DoWhileEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#doWhileEnd}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileEnd(pnpParser.DoWhileEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(pnpParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(pnpParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimention(pnpParser.ArrayDimentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#arrayDimention}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimention(pnpParser.ArrayDimentionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(pnpParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(pnpParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(pnpParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(pnpParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(pnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(pnpParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(pnpParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(pnpParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(pnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(pnpParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogicalOperator(pnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#unaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogicalOperator(pnpParser.UnaryLogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogicalOperator(pnpParser.BinaryLogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#binaryLogicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogicalOperator(pnpParser.BinaryLogicalOperatorContext ctx);
}