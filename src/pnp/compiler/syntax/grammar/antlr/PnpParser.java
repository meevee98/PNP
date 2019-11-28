// Generated from D:/Workspace/PNP/src/pnp/compiler/syntax/grammar\Pnp.g4 by ANTLR 4.7.2
package pnp.compiler.syntax.grammar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PnpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROCEDIMENTO=1, ENTRADA=2, SAIDA=3, INICIO=4, FIM=5, SE=6, ENTAO=7, SENAO=8, 
		PARA=9, DE=10, ATE=11, PASSO=12, REPITA=13, ENQUANTO=14, FACA=15, QUE=16, 
		CASO=17, SEJA=18, TIPO=19, PRINCIPAL=20, ESCREVA=21, LEIA=22, INTEIRO=23, 
		RACIONAL=24, BOOLEANO=25, CARACTERE=26, STRING=27, NULO=28, IGUALDADE=29, 
		DESIGUALDADE=30, MAIOR=31, MAIOR_IGUAL=32, MENOR=33, MENOR_IGUAL=34, ADICAO=35, 
		SUBTRACAO=36, MULTIPLICACAO=37, DIVISAO_RAC=38, DIVISAO_INT=39, MODULO=40, 
		CONCATENACAO=41, AND=42, OR=43, XOR=44, NOT=45, NATURAL_LITERAL=46, INTEIRO_LITERAL=47, 
		RACIONAL_LITERAL=48, BOOLEANO_LITERAL=49, CARACTERE_LITERAL=50, STRING_LITERAL=51, 
		ATRIBUICAO=52, FIM_COMANDO=53, ABRE_PARENTESES=54, FECHA_PARENTESES=55, 
		ABRE_CHAVES=56, FECHA_CHAVES=57, SEPARADOR_VARIAVEL=58, SEPARADOR_VARIAVEL_TIPO=59, 
		SEPARADOR_TIPO_VARIAVEL=60, ID=61, WS=62;
	public static final int
		RULE_file = 0, RULE_procedureDeclarationBlock = 1, RULE_procedure = 2, 
		RULE_procedureBody = 3, RULE_procedureDeclaration = 4, RULE_procedureInput = 5, 
		RULE_procedureOutput = 6, RULE_procedureBlock = 7, RULE_mainProcedure = 8, 
		RULE_typeDeclaration = 9, RULE_typeVariableDeclarationBlock = 10, RULE_block = 11, 
		RULE_variableDeclarationAndAssignmentBlock = 12, RULE_variableDeclarationAndAssignment = 13, 
		RULE_command = 14, RULE_statement = 15, RULE_statementCondition = 16, 
		RULE_relationalOperation = 17, RULE_logicalOperation = 18, RULE_integerArithmeticOperation = 19, 
		RULE_rationalArithmeticOperation = 20, RULE_concatenationOperation = 21, 
		RULE_operation = 22, RULE_variable = 23, RULE_variableDeclaration = 24, 
		RULE_variableAssignment = 25, RULE_expression = 26, RULE_booleanExpression = 27, 
		RULE_numericalExpression = 28, RULE_integerExpression = 29, RULE_rationalExpression = 30, 
		RULE_characterExpression = 31, RULE_function = 32, RULE_params = 33, RULE_readFunction = 34, 
		RULE_writeFunction = 35, RULE_ifStatement = 36, RULE_ifStart = 37, RULE_ifThen = 38, 
		RULE_ifElse = 39, RULE_ifElseIf = 40, RULE_elseIf = 41, RULE_switchStatement = 42, 
		RULE_switchStart = 43, RULE_switchCases = 44, RULE_switchDefault = 45, 
		RULE_forStatement = 46, RULE_forStart = 47, RULE_forInterval = 48, RULE_forStep = 49, 
		RULE_forBlock = 50, RULE_whileStatement = 51, RULE_whileStart = 52, RULE_whileBlock = 53, 
		RULE_doWhileStatement = 54, RULE_doWhileBlock = 55, RULE_doWhileEnd = 56, 
		RULE_typeDefinitionType = 57, RULE_type = 58, RULE_primitiveType = 59, 
		RULE_arrayDimention = 60, RULE_arrayDimentionLiteral = 61, RULE_binaryOperator = 62, 
		RULE_relationalOperator = 63, RULE_equalityOperator = 64, RULE_comparisonOperator = 65, 
		RULE_arithmeticOperator = 66, RULE_additiveOperator = 67, RULE_multiplicativeOperator = 68, 
		RULE_rationalMultiplicativeOperator = 69, RULE_unaryLogicalOperator = 70, 
		RULE_binaryLogicalOperator = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "procedureDeclarationBlock", "procedure", "procedureBody", "procedureDeclaration", 
			"procedureInput", "procedureOutput", "procedureBlock", "mainProcedure", 
			"typeDeclaration", "typeVariableDeclarationBlock", "block", "variableDeclarationAndAssignmentBlock", 
			"variableDeclarationAndAssignment", "command", "statement", "statementCondition", 
			"relationalOperation", "logicalOperation", "integerArithmeticOperation", 
			"rationalArithmeticOperation", "concatenationOperation", "operation", 
			"variable", "variableDeclaration", "variableAssignment", "expression", 
			"booleanExpression", "numericalExpression", "integerExpression", "rationalExpression", 
			"characterExpression", "function", "params", "readFunction", "writeFunction", 
			"ifStatement", "ifStart", "ifThen", "ifElse", "ifElseIf", "elseIf", "switchStatement", 
			"switchStart", "switchCases", "switchDefault", "forStatement", "forStart", 
			"forInterval", "forStep", "forBlock", "whileStatement", "whileStart", 
			"whileBlock", "doWhileStatement", "doWhileBlock", "doWhileEnd", "typeDefinitionType", 
			"type", "primitiveType", "arrayDimention", "arrayDimentionLiteral", "binaryOperator", 
			"relationalOperator", "equalityOperator", "comparisonOperator", "arithmeticOperator", 
			"additiveOperator", "multiplicativeOperator", "rationalMultiplicativeOperator", 
			"unaryLogicalOperator", "binaryLogicalOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedimento'", "'entrada'", "'saida'", "'inicio'", "'fim'", 
			"'se'", "'entao'", "'senao'", "'para'", "'de'", "'ate'", "'passo'", "'repita'", 
			"'enquanto'", "'faca'", "'que'", "'caso'", "'seja'", "'tipo'", "'principal'", 
			"'escreva'", "'leia'", "'inteiro'", "'racional'", "'booleano'", "'caractere'", 
			"'string'", "'nao ha'", "'='", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", "'++'", "'e'", "'ou'", 
			"'oux'", "'nao'", null, null, null, null, null, null, "'<-'", "';'", 
			"'('", "')'", "'['", "']'", "','", "':'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROCEDIMENTO", "ENTRADA", "SAIDA", "INICIO", "FIM", "SE", "ENTAO", 
			"SENAO", "PARA", "DE", "ATE", "PASSO", "REPITA", "ENQUANTO", "FACA", 
			"QUE", "CASO", "SEJA", "TIPO", "PRINCIPAL", "ESCREVA", "LEIA", "INTEIRO", 
			"RACIONAL", "BOOLEANO", "CARACTERE", "STRING", "NULO", "IGUALDADE", "DESIGUALDADE", 
			"MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "ADICAO", "SUBTRACAO", 
			"MULTIPLICACAO", "DIVISAO_RAC", "DIVISAO_INT", "MODULO", "CONCATENACAO", 
			"AND", "OR", "XOR", "NOT", "NATURAL_LITERAL", "INTEIRO_LITERAL", "RACIONAL_LITERAL", 
			"BOOLEANO_LITERAL", "CARACTERE_LITERAL", "STRING_LITERAL", "ATRIBUICAO", 
			"FIM_COMANDO", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVES", 
			"FECHA_CHAVES", "SEPARADOR_VARIAVEL", "SEPARADOR_VARIAVEL_TIPO", "SEPARADOR_TIPO_VARIAVEL", 
			"ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pnp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PnpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PnpParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public VariableDeclarationAndAssignmentBlockContext variableDeclarationAndAssignmentBlock() {
			return getRuleContext(VariableDeclarationAndAssignmentBlockContext.class,0);
		}
		public ProcedureDeclarationBlockContext procedureDeclarationBlock() {
			return getRuleContext(ProcedureDeclarationBlockContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(144);
				typeDeclaration();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(150);
				variableDeclarationAndAssignmentBlock();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDIMENTO) {
				{
				setState(153);
				procedureDeclarationBlock();
				}
			}

			setState(156);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationBlockContext extends ParserRuleContext {
		public MainProcedureContext mainProcedure() {
			return getRuleContext(MainProcedureContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProcedureDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationBlockContext procedureDeclarationBlock() throws RecognitionException {
		ProcedureDeclarationBlockContext _localctx = new ProcedureDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedureDeclarationBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					procedure();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(164);
			mainProcedure();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			procedureDeclaration();
			setState(167);
			procedureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBodyContext extends ParserRuleContext {
		public ProcedureBlockContext procedureBlock() {
			return getRuleContext(ProcedureBlockContext.class,0);
		}
		public ProcedureInputContext procedureInput() {
			return getRuleContext(ProcedureInputContext.class,0);
		}
		public ProcedureOutputContext procedureOutput() {
			return getRuleContext(ProcedureOutputContext.class,0);
		}
		public ProcedureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBodyContext procedureBody() throws RecognitionException {
		ProcedureBodyContext _localctx = new ProcedureBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTRADA) {
				{
				setState(169);
				procedureInput();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SAIDA) {
				{
				setState(172);
				procedureOutput();
				}
			}

			setState(175);
			procedureBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(PnpParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PROCEDIMENTO);
			setState(178);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureInputContext extends ParserRuleContext {
		public TerminalNode ENTRADA() { return getToken(PnpParser.ENTRADA, 0); }
		public TerminalNode NULO() { return getToken(PnpParser.NULO, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ProcedureInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureInputContext procedureInput() throws RecognitionException {
		ProcedureInputContext _localctx = new ProcedureInputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ENTRADA);
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(181);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					variableDeclaration();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureOutputContext extends ParserRuleContext {
		public TerminalNode SAIDA() { return getToken(PnpParser.SAIDA, 0); }
		public TerminalNode NULO() { return getToken(PnpParser.NULO, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ProcedureOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOutputContext procedureOutput() throws RecognitionException {
		ProcedureOutputContext _localctx = new ProcedureOutputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(SAIDA);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(190);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(191);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBlockContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(PnpParser.INICIO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public ProcedureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterProcedureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitProcedureBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitProcedureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(INICIO);
			setState(195);
			block();
			setState(196);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(PnpParser.PROCEDIMENTO, 0); }
		public TerminalNode PRINCIPAL() { return getToken(PnpParser.PRINCIPAL, 0); }
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public MainProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterMainProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitMainProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitMainProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProcedureContext mainProcedure() throws RecognitionException {
		MainProcedureContext _localctx = new MainProcedureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mainProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PROCEDIMENTO);
			setState(199);
			match(PRINCIPAL);
			setState(200);
			procedureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(PnpParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public TerminalNode INICIO() { return getToken(PnpParser.INICIO, 0); }
		public TypeVariableDeclarationBlockContext typeVariableDeclarationBlock() {
			return getRuleContext(TypeVariableDeclarationBlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(TIPO);
			setState(203);
			match(ID);
			setState(204);
			match(INICIO);
			setState(205);
			typeVariableDeclarationBlock();
			setState(206);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclarationBlockContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TypeVariableDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterTypeVariableDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitTypeVariableDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitTypeVariableDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclarationBlockContext typeVariableDeclarationBlock() throws RecognitionException {
		TypeVariableDeclarationBlockContext _localctx = new TypeVariableDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeVariableDeclarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				variableDeclaration();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public VariableDeclarationAndAssignmentBlockContext variableDeclarationAndAssignmentBlock() {
			return getRuleContext(VariableDeclarationAndAssignmentBlockContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(213);
				variableDeclarationAndAssignmentBlock();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(218);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ESCREVA:
					case LEIA:
					case ID:
						{
						setState(216);
						command();
						}
						break;
					case SE:
					case PARA:
					case REPITA:
					case ENQUANTO:
					case CASO:
						{
						setState(217);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationAndAssignmentBlockContext extends ParserRuleContext {
		public List<VariableDeclarationAndAssignmentContext> variableDeclarationAndAssignment() {
			return getRuleContexts(VariableDeclarationAndAssignmentContext.class);
		}
		public VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment(int i) {
			return getRuleContext(VariableDeclarationAndAssignmentContext.class,i);
		}
		public VariableDeclarationAndAssignmentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAndAssignmentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariableDeclarationAndAssignmentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariableDeclarationAndAssignmentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariableDeclarationAndAssignmentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAndAssignmentBlockContext variableDeclarationAndAssignmentBlock() throws RecognitionException {
		VariableDeclarationAndAssignmentBlockContext _localctx = new VariableDeclarationAndAssignmentBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarationAndAssignmentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(223);
					variableDeclarationAndAssignment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationAndAssignmentContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public VariableDeclarationAndAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAndAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariableDeclarationAndAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariableDeclarationAndAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariableDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationAndAssignmentContext variableDeclarationAndAssignment() throws RecognitionException {
		VariableDeclarationAndAssignmentContext _localctx = new VariableDeclarationAndAssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarationAndAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			variableDeclaration();
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					variableAssignment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_command);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				variableAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				ifStatement();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				forStatement();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				whileStatement();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				doWhileStatement();
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementConditionContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public StatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementConditionContext statementCondition() throws RecognitionException {
		StatementConditionContext _localctx = new StatementConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ABRE_PARENTESES);
			setState(246);
			logicalOperation(0);
			setState(247);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperationContext extends ParserRuleContext {
		public RelationalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperation; }
	 
		public RelationalOperationContext() { }
		public void copyFrom(RelationalOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RationalRelationalOperationContext extends RelationalOperationContext {
		public ComparisonOperatorContext operator;
		public List<RationalArithmeticOperationContext> rationalArithmeticOperation() {
			return getRuleContexts(RationalArithmeticOperationContext.class);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation(int i) {
			return getRuleContext(RationalArithmeticOperationContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public RationalRelationalOperationContext(RelationalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterRelationalOperationContext extends RelationalOperationContext {
		public RelationalOperatorContext operator;
		public List<CharacterExpressionContext> characterExpression() {
			return getRuleContexts(CharacterExpressionContext.class);
		}
		public CharacterExpressionContext characterExpression(int i) {
			return getRuleContext(CharacterExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public CharacterRelationalOperationContext(RelationalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterCharacterRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitCharacterRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitCharacterRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityRelationalOperationContext extends RelationalOperationContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public RelationalOperationContext relationalOperation() {
			return getRuleContext(RelationalOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public PriorityRelationalOperationContext(RelationalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPriorityRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPriorityRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPriorityRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerRelationalOperationContext extends RelationalOperationContext {
		public RelationalOperatorContext operator;
		public List<IntegerArithmeticOperationContext> integerArithmeticOperation() {
			return getRuleContexts(IntegerArithmeticOperationContext.class);
		}
		public IntegerArithmeticOperationContext integerArithmeticOperation(int i) {
			return getRuleContext(IntegerArithmeticOperationContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public IntegerRelationalOperationContext(RelationalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIntegerRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIntegerRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIntegerRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionRelationalOperationContext extends RelationalOperationContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionRelationalOperationContext(RelationalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterExpressionRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitExpressionRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitExpressionRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperationContext relationalOperation() throws RecognitionException {
		RelationalOperationContext _localctx = new RelationalOperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalOperation);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new PriorityRelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(ABRE_PARENTESES);
				setState(250);
				relationalOperation();
				setState(251);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				_localctx = new IntegerRelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				integerArithmeticOperation(0);
				setState(254);
				((IntegerRelationalOperationContext)_localctx).operator = relationalOperator();
				setState(255);
				integerArithmeticOperation(0);
				}
				break;
			case 3:
				_localctx = new RationalRelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				rationalArithmeticOperation(0);
				setState(258);
				((RationalRelationalOperationContext)_localctx).operator = comparisonOperator();
				setState(259);
				rationalArithmeticOperation(0);
				}
				break;
			case 4:
				_localctx = new CharacterRelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				characterExpression();
				setState(262);
				((CharacterRelationalOperationContext)_localctx).operator = relationalOperator();
				setState(263);
				characterExpression();
				}
				break;
			case 5:
				_localctx = new ExpressionRelationalOperationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				booleanExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperationContext extends ParserRuleContext {
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
	 
		public LogicalOperationContext() { }
		public void copyFrom(LogicalOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriorityLogicalOperationContext extends LogicalOperationContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public PriorityLogicalOperationContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPriorityLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPriorityLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPriorityLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionLogicalOperationContext extends LogicalOperationContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionLogicalOperationContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterExpressionLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitExpressionLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitExpressionLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLogicalOperationContext extends LogicalOperationContext {
		public BinaryLogicalOperatorContext operator;
		public List<LogicalOperationContext> logicalOperation() {
			return getRuleContexts(LogicalOperationContext.class);
		}
		public LogicalOperationContext logicalOperation(int i) {
			return getRuleContext(LogicalOperationContext.class,i);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator() {
			return getRuleContext(BinaryLogicalOperatorContext.class,0);
		}
		public BinaryLogicalOperationContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterBinaryLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitBinaryLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitBinaryLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalLogicalOperationContext extends LogicalOperationContext {
		public RelationalOperationContext relationalOperation() {
			return getRuleContext(RelationalOperationContext.class,0);
		}
		public RelationalLogicalOperationContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRelationalLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRelationalLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRelationalLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryLogicalOperationContext extends LogicalOperationContext {
		public UnaryLogicalOperatorContext operator;
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public UnaryLogicalOperatorContext unaryLogicalOperator() {
			return getRuleContext(UnaryLogicalOperatorContext.class,0);
		}
		public UnaryLogicalOperationContext(LogicalOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterUnaryLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitUnaryLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitUnaryLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		return logicalOperation(0);
	}

	private LogicalOperationContext logicalOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, _parentState);
		LogicalOperationContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new PriorityLogicalOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(269);
				match(ABRE_PARENTESES);
				setState(270);
				logicalOperation(0);
				setState(271);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				_localctx = new UnaryLogicalOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				((UnaryLogicalOperationContext)_localctx).operator = unaryLogicalOperator();
				setState(274);
				logicalOperation(4);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionLogicalOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				booleanExpression();
				}
				break;
			case 4:
				{
				_localctx = new RelationalLogicalOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				relationalOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryLogicalOperationContext(new LogicalOperationContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOperation);
					setState(280);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(281);
					((BinaryLogicalOperationContext)_localctx).operator = binaryLogicalOperator();
					setState(282);
					logicalOperation(4);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntegerArithmeticOperationContext extends ParserRuleContext {
		public IntegerArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerArithmeticOperation; }
	 
		public IntegerArithmeticOperationContext() { }
		public void copyFrom(IntegerArithmeticOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerMultiplicativeOperationContext extends IntegerArithmeticOperationContext {
		public MultiplicativeOperatorContext operator;
		public List<IntegerArithmeticOperationContext> integerArithmeticOperation() {
			return getRuleContexts(IntegerArithmeticOperationContext.class);
		}
		public IntegerArithmeticOperationContext integerArithmeticOperation(int i) {
			return getRuleContext(IntegerArithmeticOperationContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public IntegerMultiplicativeOperationContext(IntegerArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIntegerMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIntegerMultiplicativeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIntegerMultiplicativeOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionIntegerArithmeticOperationContext extends IntegerArithmeticOperationContext {
		public IntegerExpressionContext integerExpression() {
			return getRuleContext(IntegerExpressionContext.class,0);
		}
		public ExpressionIntegerArithmeticOperationContext(IntegerArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterExpressionIntegerArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitExpressionIntegerArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitExpressionIntegerArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityIntegerArithmeticOperationContext extends IntegerArithmeticOperationContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public IntegerArithmeticOperationContext integerArithmeticOperation() {
			return getRuleContext(IntegerArithmeticOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public PriorityIntegerArithmeticOperationContext(IntegerArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPriorityIntegerArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPriorityIntegerArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPriorityIntegerArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerAdditiveOperationContext extends IntegerArithmeticOperationContext {
		public AdditiveOperatorContext operator;
		public List<IntegerArithmeticOperationContext> integerArithmeticOperation() {
			return getRuleContexts(IntegerArithmeticOperationContext.class);
		}
		public IntegerArithmeticOperationContext integerArithmeticOperation(int i) {
			return getRuleContext(IntegerArithmeticOperationContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public IntegerAdditiveOperationContext(IntegerArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIntegerAdditiveOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIntegerAdditiveOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIntegerAdditiveOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerArithmeticOperationContext integerArithmeticOperation() throws RecognitionException {
		return integerArithmeticOperation(0);
	}

	private IntegerArithmeticOperationContext integerArithmeticOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntegerArithmeticOperationContext _localctx = new IntegerArithmeticOperationContext(_ctx, _parentState);
		IntegerArithmeticOperationContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_integerArithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				{
				_localctx = new PriorityIntegerArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				match(ABRE_PARENTESES);
				setState(291);
				integerArithmeticOperation(0);
				setState(292);
				match(FECHA_PARENTESES);
				}
				break;
			case NATURAL_LITERAL:
			case INTEIRO_LITERAL:
			case ID:
				{
				_localctx = new ExpressionIntegerArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				integerExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerMultiplicativeOperationContext(new IntegerArithmeticOperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_integerArithmeticOperation);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						((IntegerMultiplicativeOperationContext)_localctx).operator = multiplicativeOperator();
						setState(299);
						integerArithmeticOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new IntegerAdditiveOperationContext(new IntegerArithmeticOperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_integerArithmeticOperation);
						setState(301);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(302);
						((IntegerAdditiveOperationContext)_localctx).operator = additiveOperator();
						setState(303);
						integerArithmeticOperation(3);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RationalArithmeticOperationContext extends ParserRuleContext {
		public RationalArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalArithmeticOperation; }
	 
		public RationalArithmeticOperationContext() { }
		public void copyFrom(RationalArithmeticOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RationalAdditiveOperationContext extends RationalArithmeticOperationContext {
		public AdditiveOperatorContext operator;
		public List<RationalArithmeticOperationContext> rationalArithmeticOperation() {
			return getRuleContexts(RationalArithmeticOperationContext.class);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation(int i) {
			return getRuleContext(RationalArithmeticOperationContext.class,i);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public RationalAdditiveOperationContext(RationalArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalAdditiveOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalAdditiveOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalAdditiveOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionRationalArithmeticOperationContext extends RationalArithmeticOperationContext {
		public IntegerArithmeticOperationContext integerArithmeticOperation() {
			return getRuleContext(IntegerArithmeticOperationContext.class,0);
		}
		public IntegerExpressionRationalArithmeticOperationContext(RationalArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIntegerExpressionRationalArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIntegerExpressionRationalArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIntegerExpressionRationalArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RationalExpressionRationalArithmeticOperationContext extends RationalArithmeticOperationContext {
		public RationalExpressionContext rationalExpression() {
			return getRuleContext(RationalExpressionContext.class,0);
		}
		public RationalExpressionRationalArithmeticOperationContext(RationalArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalExpressionRationalArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalExpressionRationalArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalExpressionRationalArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityRationalArithmeticOperationContext extends RationalArithmeticOperationContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public RationalArithmeticOperationContext rationalArithmeticOperation() {
			return getRuleContext(RationalArithmeticOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public PriorityRationalArithmeticOperationContext(RationalArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPriorityRationalArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPriorityRationalArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPriorityRationalArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RationalMultiplicativeOperationContext extends RationalArithmeticOperationContext {
		public RationalMultiplicativeOperatorContext operator;
		public List<RationalArithmeticOperationContext> rationalArithmeticOperation() {
			return getRuleContexts(RationalArithmeticOperationContext.class);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation(int i) {
			return getRuleContext(RationalArithmeticOperationContext.class,i);
		}
		public RationalMultiplicativeOperatorContext rationalMultiplicativeOperator() {
			return getRuleContext(RationalMultiplicativeOperatorContext.class,0);
		}
		public RationalMultiplicativeOperationContext(RationalArithmeticOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalMultiplicativeOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalMultiplicativeOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalMultiplicativeOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalArithmeticOperationContext rationalArithmeticOperation() throws RecognitionException {
		return rationalArithmeticOperation(0);
	}

	private RationalArithmeticOperationContext rationalArithmeticOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RationalArithmeticOperationContext _localctx = new RationalArithmeticOperationContext(_ctx, _parentState);
		RationalArithmeticOperationContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_rationalArithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new IntegerExpressionRationalArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(311);
				integerArithmeticOperation(0);
				}
				break;
			case 2:
				{
				_localctx = new PriorityRationalArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(ABRE_PARENTESES);
				setState(313);
				rationalArithmeticOperation(0);
				setState(314);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				{
				_localctx = new RationalExpressionRationalArithmeticOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				rationalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new RationalMultiplicativeOperationContext(new RationalArithmeticOperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rationalArithmeticOperation);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						((RationalMultiplicativeOperationContext)_localctx).operator = rationalMultiplicativeOperator();
						setState(321);
						rationalArithmeticOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new RationalAdditiveOperationContext(new RationalArithmeticOperationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rationalArithmeticOperation);
						setState(323);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(324);
						((RationalAdditiveOperationContext)_localctx).operator = additiveOperator();
						setState(325);
						rationalArithmeticOperation(3);
						}
						break;
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcatenationOperationContext extends ParserRuleContext {
		public ConcatenationOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenationOperation; }
	 
		public ConcatenationOperationContext() { }
		public void copyFrom(ConcatenationOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecursiveConcatenationOperationContext extends ConcatenationOperationContext {
		public List<ConcatenationOperationContext> concatenationOperation() {
			return getRuleContexts(ConcatenationOperationContext.class);
		}
		public ConcatenationOperationContext concatenationOperation(int i) {
			return getRuleContext(ConcatenationOperationContext.class,i);
		}
		public TerminalNode CONCATENACAO() { return getToken(PnpParser.CONCATENACAO, 0); }
		public RecursiveConcatenationOperationContext(ConcatenationOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRecursiveConcatenationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRecursiveConcatenationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRecursiveConcatenationOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterExpressionConcatenationOperationContext extends ConcatenationOperationContext {
		public CharacterExpressionContext characterExpression() {
			return getRuleContext(CharacterExpressionContext.class,0);
		}
		public CharacterExpressionConcatenationOperationContext(ConcatenationOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterCharacterExpressionConcatenationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitCharacterExpressionConcatenationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitCharacterExpressionConcatenationOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityConcatenationOperationContext extends ConcatenationOperationContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public ConcatenationOperationContext concatenationOperation() {
			return getRuleContext(ConcatenationOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public PriorityConcatenationOperationContext(ConcatenationOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPriorityConcatenationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPriorityConcatenationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPriorityConcatenationOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericalExpressionConcatenationOperationContext extends ConcatenationOperationContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public NumericalExpressionConcatenationOperationContext(ConcatenationOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterNumericalExpressionConcatenationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitNumericalExpressionConcatenationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitNumericalExpressionConcatenationOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationOperationContext concatenationOperation() throws RecognitionException {
		return concatenationOperation(0);
	}

	private ConcatenationOperationContext concatenationOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConcatenationOperationContext _localctx = new ConcatenationOperationContext(_ctx, _parentState);
		ConcatenationOperationContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_concatenationOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new PriorityConcatenationOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(333);
				match(ABRE_PARENTESES);
				setState(334);
				concatenationOperation(0);
				setState(335);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				_localctx = new CharacterExpressionConcatenationOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				characterExpression();
				}
				break;
			case 3:
				{
				_localctx = new NumericalExpressionConcatenationOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				numericalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RecursiveConcatenationOperationContext(new ConcatenationOperationContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_concatenationOperation);
					setState(341);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(342);
					match(CONCATENACAO);
					setState(343);
					concatenationOperation(4);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public IntegerArithmeticOperationContext integerArithmeticOperation() {
			return getRuleContext(IntegerArithmeticOperationContext.class,0);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation() {
			return getRuleContext(RationalArithmeticOperationContext.class,0);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public RelationalOperationContext relationalOperation() {
			return getRuleContext(RelationalOperationContext.class,0);
		}
		public ConcatenationOperationContext concatenationOperation() {
			return getRuleContext(ConcatenationOperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operation);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				integerArithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				rationalArithmeticOperation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				logicalOperation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				relationalOperation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				concatenationOperation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public ArrayDimentionContext arrayDimention() {
			return getRuleContext(ArrayDimentionContext.class,0);
		}
		public TerminalNode SEPARADOR_TIPO_VARIAVEL() { return getToken(PnpParser.SEPARADOR_TIPO_VARIAVEL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((VariableContext)_localctx).id = match(ID);
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(357);
				arrayDimention();
				}
				break;
			}
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(360);
				match(SEPARADOR_TIPO_VARIAVEL);
				setState(361);
				variable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PnpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PnpParser.ID, i);
		}
		public TerminalNode SEPARADOR_VARIAVEL_TIPO() { return getToken(PnpParser.SEPARADOR_VARIAVEL_TIPO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(PnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(PnpParser.SEPARADOR_VARIAVEL, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ID);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(365);
				match(SEPARADOR_VARIAVEL);
				setState(366);
				match(ID);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(373);
			type(0);
			setState(374);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(PnpParser.ATRIBUICAO, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			variable();
			setState(377);
			match(ATRIBUICAO);
			setState(378);
			operation();
			setState(379);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public CharacterExpressionContext characterExpression() {
			return getRuleContext(CharacterExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				booleanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				numericalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				characterExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEANO_LITERAL() { return getToken(PnpParser.BOOLEANO_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanExpression);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(BOOLEANO_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalExpressionContext extends ParserRuleContext {
		public IntegerExpressionContext integerExpression() {
			return getRuleContext(IntegerExpressionContext.class,0);
		}
		public RationalExpressionContext rationalExpression() {
			return getRuleContext(RationalExpressionContext.class,0);
		}
		public NumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitNumericalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numericalExpression);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				integerExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				rationalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerExpressionContext extends ParserRuleContext {
		public TerminalNode NATURAL_LITERAL() { return getToken(PnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode INTEIRO_LITERAL() { return getToken(PnpParser.INTEIRO_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntegerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerExpressionContext integerExpression() throws RecognitionException {
		IntegerExpressionContext _localctx = new IntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_integerExpression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(NATURAL_LITERAL);
				}
				break;
			case INTEIRO_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(INTEIRO_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RationalExpressionContext extends ParserRuleContext {
		public TerminalNode RACIONAL_LITERAL() { return getToken(PnpParser.RACIONAL_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalExpressionContext rationalExpression() throws RecognitionException {
		RationalExpressionContext _localctx = new RationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rationalExpression);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(RACIONAL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterExpressionContext extends ParserRuleContext {
		public TerminalNode CARACTERE_LITERAL() { return getToken(PnpParser.CARACTERE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PnpParser.STRING_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CharacterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterCharacterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitCharacterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitCharacterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterExpressionContext characterExpression() throws RecognitionException {
		CharacterExpressionContext _localctx = new CharacterExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_characterExpression);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARACTERE_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(CARACTERE_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(STRING_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public ReadFunctionContext readFunction() {
			return getRuleContext(ReadFunctionContext.class,0);
		}
		public WriteFunctionContext writeFunction() {
			return getRuleContext(WriteFunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				readFunction();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				writeFunction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				match(ID);
				setState(411);
				match(ABRE_PARENTESES);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(412);
					params();
					}
				}

				setState(415);
				match(FECHA_PARENTESES);
				setState(416);
				match(FIM_COMANDO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(PnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(PnpParser.SEPARADOR_VARIAVEL, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			expression();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(420);
				match(SEPARADOR_VARIAVEL);
				setState(421);
				expression();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadFunctionContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(PnpParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public ReadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterReadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitReadFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitReadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFunctionContext readFunction() throws RecognitionException {
		ReadFunctionContext _localctx = new ReadFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_readFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(LEIA);
			setState(428);
			match(ABRE_PARENTESES);
			setState(429);
			match(FECHA_PARENTESES);
			setState(430);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteFunctionContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(PnpParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(PnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(PnpParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public WriteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterWriteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitWriteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitWriteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFunctionContext writeFunction() throws RecognitionException {
		WriteFunctionContext _localctx = new WriteFunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_writeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ESCREVA);
			setState(433);
			match(ABRE_PARENTESES);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(434);
				params();
				}
			}

			setState(437);
			match(FECHA_PARENTESES);
			setState(438);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStartContext ifStart() {
			return getRuleContext(IfStartContext.class,0);
		}
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public IfElseIfContext ifElseIf() {
			return getRuleContext(IfElseIfContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			ifStart();
			setState(441);
			ifThen();
			setState(442);
			ifElseIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStartContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(PnpParser.SE, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public IfStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIfStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIfStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIfStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStartContext ifStart() throws RecognitionException {
		IfStartContext _localctx = new IfStartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(SE);
			setState(445);
			statementCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenContext extends ParserRuleContext {
		public TerminalNode ENTAO() { return getToken(PnpParser.ENTAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ENTAO);
			setState(448);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(PnpParser.SENAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(SENAO);
			setState(451);
			block();
			setState(452);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseIfContext extends ParserRuleContext {
		public ElseIfContext elseIf() {
			return getRuleContext(ElseIfContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public IfElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterIfElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitIfElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitIfElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseIfContext ifElseIf() throws RecognitionException {
		IfElseIfContext _localctx = new IfElseIfContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifElseIf);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				elseIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				ifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(FIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(PnpParser.SENAO, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(SENAO);
			setState(460);
			ifStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStartContext switchStart() {
			return getRuleContext(SwitchStartContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public List<SwitchCasesContext> switchCases() {
			return getRuleContexts(SwitchCasesContext.class);
		}
		public SwitchCasesContext switchCases(int i) {
			return getRuleContext(SwitchCasesContext.class,i);
		}
		public SwitchDefaultContext switchDefault() {
			return getRuleContext(SwitchDefaultContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			switchStart();
			setState(464); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(463);
				switchCases();
				}
				}
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0) );
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(468);
				switchDefault();
				}
			}

			setState(471);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStartContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PnpParser.CASO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(PnpParser.SEJA, 0); }
		public SwitchStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterSwitchStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitSwitchStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitSwitchStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStartContext switchStart() throws RecognitionException {
		SwitchStartContext _localctx = new SwitchStartContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(CASO);
			setState(474);
			variable();
			setState(475);
			match(SEJA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCasesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEPARADOR_VARIAVEL_TIPO() { return getToken(PnpParser.SEPARADOR_VARIAVEL_TIPO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(PnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(PnpParser.SEPARADOR_VARIAVEL, i);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitSwitchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			expression();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(478);
				match(SEPARADOR_VARIAVEL);
				setState(479);
				expression();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(486);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(PnpParser.SENAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterSwitchDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitSwitchDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitSwitchDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDefaultContext switchDefault() throws RecognitionException {
		SwitchDefaultContext _localctx = new SwitchDefaultContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SENAO);
			setState(489);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStartContext forStart() {
			return getRuleContext(ForStartContext.class,0);
		}
		public ForIntervalContext forInterval() {
			return getRuleContext(ForIntervalContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForStepContext forStep() {
			return getRuleContext(ForStepContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			forStart();
			setState(492);
			forInterval();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(493);
				forStep();
				}
			}

			setState(496);
			forBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStartContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PnpParser.PARA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterForStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitForStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitForStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStartContext forStart() throws RecognitionException {
		ForStartContext _localctx = new ForStartContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(PARA);
			setState(499);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIntervalContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(PnpParser.DE, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public TerminalNode ATE() { return getToken(PnpParser.ATE, 0); }
		public ForIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterForInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitForInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitForInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIntervalContext forInterval() throws RecognitionException {
		ForIntervalContext _localctx = new ForIntervalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(DE);
			setState(502);
			numericalExpression();
			setState(503);
			match(ATE);
			setState(504);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStepContext extends ParserRuleContext {
		public TerminalNode PASSO() { return getToken(PnpParser.PASSO, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public ForStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterForStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitForStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitForStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStepContext forStep() throws RecognitionException {
		ForStepContext _localctx = new ForStepContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(PASSO);
			setState(507);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(PnpParser.REPITA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(REPITA);
			setState(510);
			block();
			setState(511);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStartContext whileStart() {
			return getRuleContext(WhileStartContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			whileStart();
			setState(514);
			whileBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStartContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(PnpParser.ENQUANTO, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public WhileStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterWhileStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitWhileStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitWhileStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStartContext whileStart() throws RecognitionException {
		WhileStartContext _localctx = new WhileStartContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whileStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ENQUANTO);
			setState(517);
			statementCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(PnpParser.FACA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(PnpParser.FIM, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(FACA);
			setState(520);
			block();
			setState(521);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public DoWhileEndContext doWhileEnd() {
			return getRuleContext(DoWhileEndContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			doWhileBlock();
			setState(524);
			doWhileEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(PnpParser.REPITA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(REPITA);
			setState(527);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileEndContext extends ParserRuleContext {
		public TerminalNode ATE() { return getToken(PnpParser.ATE, 0); }
		public TerminalNode QUE() { return getToken(PnpParser.QUE, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(PnpParser.FIM_COMANDO, 0); }
		public DoWhileEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterDoWhileEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitDoWhileEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitDoWhileEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileEndContext doWhileEnd() throws RecognitionException {
		DoWhileEndContext _localctx = new DoWhileEndContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_doWhileEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(ATE);
			setState(530);
			match(QUE);
			setState(531);
			statementCondition();
			setState(532);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public TypeDefinitionTypeContext typeDefinitionType() {
			return getRuleContext(TypeDefinitionTypeContext.class,0);
		}
		public ArrayDimentionLiteralContext arrayDimentionLiteral() {
			return getRuleContext(ArrayDimentionLiteralContext.class,0);
		}
		public TypeDefinitionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterTypeDefinitionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitTypeDefinitionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitTypeDefinitionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionTypeContext typeDefinitionType() throws RecognitionException {
		return typeDefinitionType(0);
	}

	private TypeDefinitionTypeContext typeDefinitionType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeDefinitionTypeContext _localctx = new TypeDefinitionTypeContext(_ctx, _parentState);
		TypeDefinitionTypeContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_typeDefinitionType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case RACIONAL:
			case BOOLEANO:
			case CARACTERE:
			case STRING:
				{
				setState(535);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(536);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeDefinitionTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeDefinitionType);
					setState(539);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(540);
					arrayDimentionLiteral();
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PnpParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDimentionContext arrayDimention() {
			return getRuleContext(ArrayDimentionContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case RACIONAL:
			case BOOLEANO:
			case CARACTERE:
			case STRING:
				{
				setState(547);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(548);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(551);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(552);
					arrayDimention();
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(PnpParser.INTEIRO, 0); }
		public TerminalNode RACIONAL() { return getToken(PnpParser.RACIONAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(PnpParser.BOOLEANO, 0); }
		public TerminalNode CARACTERE() { return getToken(PnpParser.CARACTERE, 0); }
		public TerminalNode STRING() { return getToken(PnpParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << RACIONAL) | (1L << BOOLEANO) | (1L << CARACTERE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimentionContext extends ParserRuleContext {
		public ArrayDimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimention; }
	 
		public ArrayDimentionContext() { }
		public void copyFrom(ArrayDimentionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableArrayDimentionContext extends ArrayDimentionContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PnpParser.ABRE_CHAVES, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(PnpParser.FECHA_CHAVES, 0); }
		public VariableArrayDimentionContext(ArrayDimentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterVariableArrayDimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitVariableArrayDimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitVariableArrayDimention(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralArrayDimentionContext extends ArrayDimentionContext {
		public ArrayDimentionLiteralContext arrayDimentionLiteral() {
			return getRuleContext(ArrayDimentionLiteralContext.class,0);
		}
		public LiteralArrayDimentionContext(ArrayDimentionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterLiteralArrayDimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitLiteralArrayDimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitLiteralArrayDimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimentionContext arrayDimention() throws RecognitionException {
		ArrayDimentionContext _localctx = new ArrayDimentionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayDimention);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new VariableArrayDimentionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(ABRE_CHAVES);
				setState(561);
				variable();
				setState(562);
				match(FECHA_CHAVES);
				}
				break;
			case 2:
				_localctx = new LiteralArrayDimentionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				arrayDimentionLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimentionLiteralContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(PnpParser.ABRE_CHAVES, 0); }
		public TerminalNode NATURAL_LITERAL() { return getToken(PnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(PnpParser.FECHA_CHAVES, 0); }
		public ArrayDimentionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimentionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterArrayDimentionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitArrayDimentionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitArrayDimentionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimentionLiteralContext arrayDimentionLiteral() throws RecognitionException {
		ArrayDimentionLiteralContext _localctx = new ArrayDimentionLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrayDimentionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(ABRE_CHAVES);
			setState(568);
			match(NATURAL_LITERAL);
			setState(569);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator() {
			return getRuleContext(BinaryLogicalOperatorContext.class,0);
		}
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_binaryOperator);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALDADE:
			case DESIGUALDADE:
			case MAIOR:
			case MAIOR_IGUAL:
			case MENOR:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				relationalOperator();
				}
				break;
			case ADICAO:
			case SUBTRACAO:
			case MULTIPLICACAO:
			case DIVISAO_RAC:
			case DIVISAO_INT:
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				arithmeticOperator();
				}
				break;
			case AND:
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				binaryLogicalOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relationalOperator);
		try {
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALDADE:
			case DESIGUALDADE:
			case MAIOR_IGUAL:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				equalityOperator();
				}
				break;
			case MAIOR:
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				comparisonOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode IGUALDADE() { return getToken(PnpParser.IGUALDADE, 0); }
		public TerminalNode DESIGUALDADE() { return getToken(PnpParser.DESIGUALDADE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(PnpParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PnpParser.MENOR_IGUAL, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALDADE) | (1L << DESIGUALDADE) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(PnpParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(PnpParser.MENOR, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==MAIOR || _la==MENOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arithmeticOperator);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADICAO:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				additiveOperator();
				}
				break;
			case MULTIPLICACAO:
			case DIVISAO_RAC:
			case DIVISAO_INT:
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				multiplicativeOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(PnpParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(PnpParser.SUBTRACAO, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !(_la==ADICAO || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public RationalMultiplicativeOperatorContext rationalMultiplicativeOperator() {
			return getRuleContext(RationalMultiplicativeOperatorContext.class,0);
		}
		public TerminalNode DIVISAO_INT() { return getToken(PnpParser.DIVISAO_INT, 0); }
		public TerminalNode MODULO() { return getToken(PnpParser.MODULO, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_multiplicativeOperator);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVISAO_RAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				rationalMultiplicativeOperator();
				}
				break;
			case DIVISAO_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(DIVISAO_INT);
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(MODULO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RationalMultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(PnpParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO_RAC() { return getToken(PnpParser.DIVISAO_RAC, 0); }
		public RationalMultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalMultiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterRationalMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitRationalMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitRationalMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalMultiplicativeOperatorContext rationalMultiplicativeOperator() throws RecognitionException {
		RationalMultiplicativeOperatorContext _localctx = new RationalMultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rationalMultiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO_RAC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PnpParser.NOT, 0); }
		public UnaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterUnaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitUnaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitUnaryLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryLogicalOperatorContext unaryLogicalOperator() throws RecognitionException {
		UnaryLogicalOperatorContext _localctx = new UnaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unaryLogicalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PnpParser.AND, 0); }
		public TerminalNode OR() { return getToken(PnpParser.OR, 0); }
		public TerminalNode XOR() { return getToken(PnpParser.XOR, 0); }
		public BinaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).enterBinaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PnpListener ) ((PnpListener)listener).exitBinaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PnpVisitor ) return ((PnpVisitor<? extends T>)visitor).visitBinaryLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLogicalOperatorContext binaryLogicalOperator() throws RecognitionException {
		BinaryLogicalOperatorContext _localctx = new BinaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
//			_errHandler.recover(this, re);
			throw re;
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return logicalOperation_sempred((LogicalOperationContext)_localctx, predIndex);
		case 19:
			return integerArithmeticOperation_sempred((IntegerArithmeticOperationContext)_localctx, predIndex);
		case 20:
			return rationalArithmeticOperation_sempred((RationalArithmeticOperationContext)_localctx, predIndex);
		case 21:
			return concatenationOperation_sempred((ConcatenationOperationContext)_localctx, predIndex);
		case 57:
			return typeDefinitionType_sempred((TypeDefinitionTypeContext)_localctx, predIndex);
		case 58:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalOperation_sempred(LogicalOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean integerArithmeticOperation_sempred(IntegerArithmeticOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rationalArithmeticOperation_sempred(RationalArithmeticOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean concatenationOperation_sempred(ConcatenationOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean typeDefinitionType_sempred(TypeDefinitionTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u025c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\5\2\u009a\n\2\3\2\5\2\u009d"+
		"\n\2\3\2\3\2\3\3\7\3\u00a2\n\3\f\3\16\3\u00a5\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\5\5\u00ad\n\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\6"+
		"\7\u00ba\n\7\r\7\16\7\u00bb\5\7\u00be\n\7\3\b\3\b\3\b\5\b\u00c3\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u00d4"+
		"\n\f\r\f\16\f\u00d5\3\r\5\r\u00d9\n\r\3\r\3\r\7\r\u00dd\n\r\f\r\16\r\u00e0"+
		"\13\r\3\16\6\16\u00e3\n\16\r\16\16\16\u00e4\3\17\3\17\6\17\u00e9\n\17"+
		"\r\17\16\17\u00ea\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00f6\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010d\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0119\n\24\3\24\3\24"+
		"\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u012a\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0134\n\25\f\25\16\25\u0137\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0140\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014a\n"+
		"\26\f\26\16\26\u014d\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0156"+
		"\n\27\3\27\3\27\3\27\7\27\u015b\n\27\f\27\16\27\u015e\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0165\n\30\3\31\3\31\5\31\u0169\n\31\3\31\3\31\5"+
		"\31\u016d\n\31\3\32\3\32\3\32\7\32\u0172\n\32\f\32\16\32\u0175\13\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0183"+
		"\n\34\3\35\3\35\5\35\u0187\n\35\3\36\3\36\5\36\u018b\n\36\3\37\3\37\3"+
		"\37\5\37\u0190\n\37\3 \3 \5 \u0194\n \3!\3!\3!\5!\u0199\n!\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01a0\n\"\3\"\3\"\5\"\u01a4\n\"\3#\3#\3#\7#\u01a9\n#\f#\16"+
		"#\u01ac\13#\3$\3$\3$\3$\3$\3%\3%\3%\5%\u01b6\n%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\5*\u01cc\n*\3+\3+\3+\3,\3,\6"+
		",\u01d3\n,\r,\16,\u01d4\3,\5,\u01d8\n,\3,\3,\3-\3-\3-\3-\3.\3.\3.\7.\u01e3"+
		"\n.\f.\16.\u01e6\13.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\5\60\u01f1\n\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\5;\u021c\n;\3;\3;\7;\u0220\n;\f"+
		";\16;\u0223\13;\3<\3<\3<\5<\u0228\n<\3<\3<\7<\u022c\n<\f<\16<\u022f\13"+
		"<\3=\3=\3>\3>\3>\3>\3>\5>\u0238\n>\3?\3?\3?\3?\3@\3@\3@\5@\u0241\n@\3"+
		"A\3A\5A\u0245\nA\3B\3B\3C\3C\3D\3D\5D\u024d\nD\3E\3E\3F\3F\3F\5F\u0254"+
		"\nF\3G\3G\3H\3H\3I\3I\3I\2\b&(*,tvJ\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\2\b\3\2\31\35\5\2\37 \"\"$"+
		"$\4\2!!##\3\2%&\3\2\'(\3\2,.\2\u025f\2\u0095\3\2\2\2\4\u00a3\3\2\2\2\6"+
		"\u00a8\3\2\2\2\b\u00ac\3\2\2\2\n\u00b3\3\2\2\2\f\u00b6\3\2\2\2\16\u00bf"+
		"\3\2\2\2\20\u00c4\3\2\2\2\22\u00c8\3\2\2\2\24\u00cc\3\2\2\2\26\u00d3\3"+
		"\2\2\2\30\u00d8\3\2\2\2\32\u00e2\3\2\2\2\34\u00e6\3\2\2\2\36\u00ee\3\2"+
		"\2\2 \u00f5\3\2\2\2\"\u00f7\3\2\2\2$\u010c\3\2\2\2&\u0118\3\2\2\2(\u0129"+
		"\3\2\2\2*\u013f\3\2\2\2,\u0155\3\2\2\2.\u0164\3\2\2\2\60\u0166\3\2\2\2"+
		"\62\u016e\3\2\2\2\64\u017a\3\2\2\2\66\u0182\3\2\2\28\u0186\3\2\2\2:\u018a"+
		"\3\2\2\2<\u018f\3\2\2\2>\u0193\3\2\2\2@\u0198\3\2\2\2B\u01a3\3\2\2\2D"+
		"\u01a5\3\2\2\2F\u01ad\3\2\2\2H\u01b2\3\2\2\2J\u01ba\3\2\2\2L\u01be\3\2"+
		"\2\2N\u01c1\3\2\2\2P\u01c4\3\2\2\2R\u01cb\3\2\2\2T\u01cd\3\2\2\2V\u01d0"+
		"\3\2\2\2X\u01db\3\2\2\2Z\u01df\3\2\2\2\\\u01ea\3\2\2\2^\u01ed\3\2\2\2"+
		"`\u01f4\3\2\2\2b\u01f7\3\2\2\2d\u01fc\3\2\2\2f\u01ff\3\2\2\2h\u0203\3"+
		"\2\2\2j\u0206\3\2\2\2l\u0209\3\2\2\2n\u020d\3\2\2\2p\u0210\3\2\2\2r\u0213"+
		"\3\2\2\2t\u021b\3\2\2\2v\u0227\3\2\2\2x\u0230\3\2\2\2z\u0237\3\2\2\2|"+
		"\u0239\3\2\2\2~\u0240\3\2\2\2\u0080\u0244\3\2\2\2\u0082\u0246\3\2\2\2"+
		"\u0084\u0248\3\2\2\2\u0086\u024c\3\2\2\2\u0088\u024e\3\2\2\2\u008a\u0253"+
		"\3\2\2\2\u008c\u0255\3\2\2\2\u008e\u0257\3\2\2\2\u0090\u0259\3\2\2\2\u0092"+
		"\u0094\5\24\13\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009a\5\32\16\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3"+
		"\2\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\2\2\3\u009f\3\3\2\2\2\u00a0\u00a2\5\6\4\2"+
		"\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\5\22\n\2"+
		"\u00a7\5\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\5\b\5\2\u00aa\7\3\2\2"+
		"\2\u00ab\u00ad\5\f\7\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00b0\5\16\b\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\20\t\2\u00b2\t\3\2\2\2\u00b3\u00b4"+
		"\7\3\2\2\u00b4\u00b5\7?\2\2\u00b5\13\3\2\2\2\u00b6\u00bd\7\4\2\2\u00b7"+
		"\u00be\7\36\2\2\u00b8\u00ba\5\62\32\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\r\3\2\2\2\u00bf\u00c2\7\5\2\2"+
		"\u00c0\u00c3\7\36\2\2\u00c1\u00c3\5\62\32\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\7\6\2\2\u00c5\u00c6\5\30\r"+
		"\2\u00c6\u00c7\7\7\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca"+
		"\7\26\2\2\u00ca\u00cb\5\b\5\2\u00cb\23\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\u00cf\7\6\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1\7\7"+
		"\2\2\u00d1\25\3\2\2\2\u00d2\u00d4\5\62\32\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\27\3\2\2"+
		"\2\u00d7\u00d9\5\32\16\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00de\3\2\2\2\u00da\u00dd\5\36\20\2\u00db\u00dd\5 \21\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5\34\17"+
		"\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e8\5\62\32\2\u00e7\u00e9\5\64\33\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ef\5B\"\2\u00ed\u00ef\5\64\33\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\37\3\2\2\2\u00f0\u00f6\5J&\2"+
		"\u00f1\u00f6\5^\60\2\u00f2\u00f6\5h\65\2\u00f3\u00f6\5n8\2\u00f4\u00f6"+
		"\5V,\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f8\78\2\2\u00f8"+
		"\u00f9\5&\24\2\u00f9\u00fa\79\2\2\u00fa#\3\2\2\2\u00fb\u00fc\78\2\2\u00fc"+
		"\u00fd\5$\23\2\u00fd\u00fe\79\2\2\u00fe\u010d\3\2\2\2\u00ff\u0100\5(\25"+
		"\2\u0100\u0101\5\u0080A\2\u0101\u0102\5(\25\2\u0102\u010d\3\2\2\2\u0103"+
		"\u0104\5*\26\2\u0104\u0105\5\u0084C\2\u0105\u0106\5*\26\2\u0106\u010d"+
		"\3\2\2\2\u0107\u0108\5@!\2\u0108\u0109\5\u0080A\2\u0109\u010a\5@!\2\u010a"+
		"\u010d\3\2\2\2\u010b\u010d\58\35\2\u010c\u00fb\3\2\2\2\u010c\u00ff\3\2"+
		"\2\2\u010c\u0103\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"%\3\2\2\2\u010e\u010f\b\24\1\2\u010f\u0110\78\2\2\u0110\u0111\5&\24\2"+
		"\u0111\u0112\79\2\2\u0112\u0119\3\2\2\2\u0113\u0114\5\u008eH\2\u0114\u0115"+
		"\5&\24\6\u0115\u0119\3\2\2\2\u0116\u0119\58\35\2\u0117\u0119\5$\23\2\u0118"+
		"\u010e\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u0120\3\2\2\2\u011a\u011b\f\5\2\2\u011b\u011c\5\u0090I\2\u011c"+
		"\u011d\5&\24\6\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\'\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\b\25\1\2\u0124\u0125\78\2\2\u0125\u0126\5(\25\2\u0126"+
		"\u0127\79\2\2\u0127\u012a\3\2\2\2\u0128\u012a\5<\37\2\u0129\u0123\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\u0135\3\2\2\2\u012b\u012c\f\5\2\2\u012c"+
		"\u012d\5\u008aF\2\u012d\u012e\5(\25\6\u012e\u0134\3\2\2\2\u012f\u0130"+
		"\f\4\2\2\u0130\u0131\5\u0088E\2\u0131\u0132\5(\25\5\u0132\u0134\3\2\2"+
		"\2\u0133\u012b\3\2\2\2\u0133\u012f\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136)\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u0139\b\26\1\2\u0139\u0140\5(\25\2\u013a\u013b\78\2\2\u013b\u013c\5*"+
		"\26\2\u013c\u013d\79\2\2\u013d\u0140\3\2\2\2\u013e\u0140\5> \2\u013f\u0138"+
		"\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u014b\3\2\2\2\u0141"+
		"\u0142\f\5\2\2\u0142\u0143\5\u008cG\2\u0143\u0144\5*\26\6\u0144\u014a"+
		"\3\2\2\2\u0145\u0146\f\4\2\2\u0146\u0147\5\u0088E\2\u0147\u0148\5*\26"+
		"\5\u0148\u014a\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u0145\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c+\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\b\27\1\2\u014f\u0150\78\2\2\u0150\u0151\5,"+
		"\27\2\u0151\u0152\79\2\2\u0152\u0156\3\2\2\2\u0153\u0156\5@!\2\u0154\u0156"+
		"\5:\36\2\u0155\u014e\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u015c\3\2\2\2\u0157\u0158\f\5\2\2\u0158\u0159\7+\2\2\u0159\u015b\5,\27"+
		"\6\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d-\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0165\5(\25\2\u0160"+
		"\u0165\5*\26\2\u0161\u0165\5&\24\2\u0162\u0165\5$\23\2\u0163\u0165\5,"+
		"\27\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165/\3\2\2\2\u0166\u0168\7?\2\2\u0167"+
		"\u0169\5z>\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016c\3\2\2"+
		"\2\u016a\u016b\7>\2\2\u016b\u016d\5\60\31\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\61\3\2\2\2\u016e\u0173\7?\2\2\u016f\u0170\7<\2\2"+
		"\u0170\u0172\7?\2\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7=\2\2\u0177\u0178\5v<\2\u0178\u0179\7\67\2\2\u0179\63\3\2\2\2"+
		"\u017a\u017b\5\60\31\2\u017b\u017c\7\66\2\2\u017c\u017d\5.\30\2\u017d"+
		"\u017e\7\67\2\2\u017e\65\3\2\2\2\u017f\u0183\58\35\2\u0180\u0183\5:\36"+
		"\2\u0181\u0183\5@!\2\u0182\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181"+
		"\3\2\2\2\u0183\67\3\2\2\2\u0184\u0187\7\63\2\2\u0185\u0187\5\60\31\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u01879\3\2\2\2\u0188\u018b\5<\37\2"+
		"\u0189\u018b\5> \2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b;\3\2"+
		"\2\2\u018c\u0190\7\60\2\2\u018d\u0190\7\61\2\2\u018e\u0190\5\60\31\2\u018f"+
		"\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190=\3\2\2\2"+
		"\u0191\u0194\7\62\2\2\u0192\u0194\5\60\31\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194?\3\2\2\2\u0195\u0199\7\64\2\2\u0196\u0199\7\65\2"+
		"\2\u0197\u0199\5\60\31\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199A\3\2\2\2\u019a\u01a4\5F$\2\u019b\u01a4\5H%\2\u019c"+
		"\u019d\7?\2\2\u019d\u019f\78\2\2\u019e\u01a0\5D#\2\u019f\u019e\3\2\2\2"+
		"\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\79\2\2\u01a2\u01a4"+
		"\7\67\2\2\u01a3\u019a\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2"+
		"\u01a4C\3\2\2\2\u01a5\u01aa\5\66\34\2\u01a6\u01a7\7<\2\2\u01a7\u01a9\5"+
		"\66\34\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01abE\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\30\2\2"+
		"\u01ae\u01af\78\2\2\u01af\u01b0\79\2\2\u01b0\u01b1\7\67\2\2\u01b1G\3\2"+
		"\2\2\u01b2\u01b3\7\27\2\2\u01b3\u01b5\78\2\2\u01b4\u01b6\5D#\2\u01b5\u01b4"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\79\2\2\u01b8"+
		"\u01b9\7\67\2\2\u01b9I\3\2\2\2\u01ba\u01bb\5L\'\2\u01bb\u01bc\5N(\2\u01bc"+
		"\u01bd\5R*\2\u01bdK\3\2\2\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\5\"\22\2\u01c0"+
		"M\3\2\2\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\5\30\r\2\u01c3O\3\2\2\2\u01c4"+
		"\u01c5\7\n\2\2\u01c5\u01c6\5\30\r\2\u01c6\u01c7\7\7\2\2\u01c7Q\3\2\2\2"+
		"\u01c8\u01cc\5T+\2\u01c9\u01cc\5P)\2\u01ca\u01cc\7\7\2\2\u01cb\u01c8\3"+
		"\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccS\3\2\2\2\u01cd\u01ce"+
		"\7\n\2\2\u01ce\u01cf\5J&\2\u01cfU\3\2\2\2\u01d0\u01d2\5X-\2\u01d1\u01d3"+
		"\5Z.\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\5\\/\2\u01d7\u01d6\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7\7\2\2\u01da"+
		"W\3\2\2\2\u01db\u01dc\7\23\2\2\u01dc\u01dd\5\60\31\2\u01dd\u01de\7\24"+
		"\2\2\u01deY\3\2\2\2\u01df\u01e4\5\66\34\2\u01e0\u01e1\7<\2\2\u01e1\u01e3"+
		"\5\66\34\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8"+
		"\7=\2\2\u01e8\u01e9\5\30\r\2\u01e9[\3\2\2\2\u01ea\u01eb\7\n\2\2\u01eb"+
		"\u01ec\5\30\r\2\u01ec]\3\2\2\2\u01ed\u01ee\5`\61\2\u01ee\u01f0\5b\62\2"+
		"\u01ef\u01f1\5d\63\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\5f\64\2\u01f3_\3\2\2\2\u01f4\u01f5\7\13\2\2\u01f5"+
		"\u01f6\5\60\31\2\u01f6a\3\2\2\2\u01f7\u01f8\7\f\2\2\u01f8\u01f9\5:\36"+
		"\2\u01f9\u01fa\7\r\2\2\u01fa\u01fb\5:\36\2\u01fbc\3\2\2\2\u01fc\u01fd"+
		"\7\16\2\2\u01fd\u01fe\5:\36\2\u01fee\3\2\2\2\u01ff\u0200\7\17\2\2\u0200"+
		"\u0201\5\30\r\2\u0201\u0202\7\7\2\2\u0202g\3\2\2\2\u0203\u0204\5j\66\2"+
		"\u0204\u0205\5l\67\2\u0205i\3\2\2\2\u0206\u0207\7\20\2\2\u0207\u0208\5"+
		"\"\22\2\u0208k\3\2\2\2\u0209\u020a\7\21\2\2\u020a\u020b\5\30\r\2\u020b"+
		"\u020c\7\7\2\2\u020cm\3\2\2\2\u020d\u020e\5p9\2\u020e\u020f\5r:\2\u020f"+
		"o\3\2\2\2\u0210\u0211\7\17\2\2\u0211\u0212\5\30\r\2\u0212q\3\2\2\2\u0213"+
		"\u0214\7\r\2\2\u0214\u0215\7\22\2\2\u0215\u0216\5\"\22\2\u0216\u0217\7"+
		"\67\2\2\u0217s\3\2\2\2\u0218\u0219\b;\1\2\u0219\u021c\5x=\2\u021a\u021c"+
		"\7?\2\2\u021b\u0218\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u0221\3\2\2\2\u021d"+
		"\u021e\f\4\2\2\u021e\u0220\5|?\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2"+
		"\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222u\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0224\u0225\b<\1\2\u0225\u0228\5x=\2\u0226\u0228\7?\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022d\3\2\2\2\u0229\u022a\f\4"+
		"\2\2\u022a\u022c\5z>\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022ew\3\2\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0231\t\2\2\2\u0231y\3\2\2\2\u0232\u0233\7:\2\2\u0233\u0234\5\60\31\2"+
		"\u0234\u0235\7;\2\2\u0235\u0238\3\2\2\2\u0236\u0238\5|?\2\u0237\u0232"+
		"\3\2\2\2\u0237\u0236\3\2\2\2\u0238{\3\2\2\2\u0239\u023a\7:\2\2\u023a\u023b"+
		"\7\60\2\2\u023b\u023c\7;\2\2\u023c}\3\2\2\2\u023d\u0241\5\u0080A\2\u023e"+
		"\u0241\5\u0086D\2\u023f\u0241\5\u0090I\2\u0240\u023d\3\2\2\2\u0240\u023e"+
		"\3\2\2\2\u0240\u023f\3\2\2\2\u0241\177\3\2\2\2\u0242\u0245\5\u0082B\2"+
		"\u0243\u0245\5\u0084C\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245"+
		"\u0081\3\2\2\2\u0246\u0247\t\3\2\2\u0247\u0083\3\2\2\2\u0248\u0249\t\4"+
		"\2\2\u0249\u0085\3\2\2\2\u024a\u024d\5\u0088E\2\u024b\u024d\5\u008aF\2"+
		"\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u0087\3\2\2\2\u024e\u024f"+
		"\t\5\2\2\u024f\u0089\3\2\2\2\u0250\u0254\5\u008cG\2\u0251\u0254\7)\2\2"+
		"\u0252\u0254\7*\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0252"+
		"\3\2\2\2\u0254\u008b\3\2\2\2\u0255\u0256\t\6\2\2\u0256\u008d\3\2\2\2\u0257"+
		"\u0258\7/\2\2\u0258\u008f\3\2\2\2\u0259\u025a\t\7\2\2\u025a\u0091\3\2"+
		"\2\2:\u0095\u0099\u009c\u00a3\u00ac\u00af\u00bb\u00bd\u00c2\u00d5\u00d8"+
		"\u00dc\u00de\u00e4\u00ea\u00ee\u00f5\u010c\u0118\u0120\u0129\u0133\u0135"+
		"\u013f\u0149\u014b\u0155\u015c\u0164\u0168\u016c\u0173\u0182\u0186\u018a"+
		"\u018f\u0193\u0198\u019f\u01a3\u01aa\u01b5\u01cb\u01d4\u01d7\u01e4\u01f0"+
		"\u021b\u0221\u0227\u022d\u0237\u0240\u0244\u024c\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}