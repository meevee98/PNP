// Generated from C:/Workspace/PNP/src/syntax/grammar\pnp.g4 by ANTLR 4.7.2
package syntax.grammar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pnpParser extends Parser {
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
		RULE_file = 0, RULE_procedure = 1, RULE_procedureBody = 2, RULE_procedureDeclaration = 3, 
		RULE_procedureInput = 4, RULE_procedureOutput = 5, RULE_procedureBlock = 6, 
		RULE_mainProcedure = 7, RULE_typeDeclaration = 8, RULE_typeVariableDeclarationBlock = 9, 
		RULE_block = 10, RULE_variableDeclarationBlock = 11, RULE_variableAssignmentBlock = 12, 
		RULE_command = 13, RULE_statement = 14, RULE_statementCondition = 15, 
		RULE_relationalOperation = 16, RULE_logicalOperation = 17, RULE_integerArithmeticOperation = 18, 
		RULE_rationalArithmeticOperation = 19, RULE_concatenationOperation = 20, 
		RULE_operation = 21, RULE_variable = 22, RULE_variableDeclaration = 23, 
		RULE_variableAssignment = 24, RULE_expression = 25, RULE_booleanExpression = 26, 
		RULE_numericalExpression = 27, RULE_integerExpression = 28, RULE_rationalExpression = 29, 
		RULE_characterExpression = 30, RULE_function = 31, RULE_params = 32, RULE_readFunction = 33, 
		RULE_writeFunction = 34, RULE_ifStatement = 35, RULE_ifStart = 36, RULE_ifThen = 37, 
		RULE_ifElse = 38, RULE_ifElseIf = 39, RULE_elseIf = 40, RULE_switchStatement = 41, 
		RULE_switchStart = 42, RULE_switchCases = 43, RULE_switchDefault = 44, 
		RULE_forStatement = 45, RULE_forStart = 46, RULE_forInterval = 47, RULE_forStep = 48, 
		RULE_forBlock = 49, RULE_whileStatement = 50, RULE_whileStart = 51, RULE_whileBlock = 52, 
		RULE_doWhileStatement = 53, RULE_doWhileBlock = 54, RULE_doWhileEnd = 55, 
		RULE_typeDefinitionType = 56, RULE_type = 57, RULE_primitiveType = 58, 
		RULE_arrayDimention = 59, RULE_arrayDimentionLiteral = 60, RULE_binaryOperator = 61, 
		RULE_relationalOperator = 62, RULE_equalityOperator = 63, RULE_comparisonOperator = 64, 
		RULE_arithmeticOperator = 65, RULE_additiveOperator = 66, RULE_multiplicativeOperator = 67, 
		RULE_rationalMultiplicativeOperator = 68, RULE_unaryLogicalOperator = 69, 
		RULE_binaryLogicalOperator = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "procedure", "procedureBody", "procedureDeclaration", "procedureInput", 
			"procedureOutput", "procedureBlock", "mainProcedure", "typeDeclaration", 
			"typeVariableDeclarationBlock", "block", "variableDeclarationBlock", 
			"variableAssignmentBlock", "command", "statement", "statementCondition", 
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
			"'xor'", "'nao'", null, null, null, null, null, null, "'<-'", "';'", 
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
	public String getGrammarFileName() { return "pnp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pnpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pnpParser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public VariableDeclarationBlockContext variableDeclarationBlock() {
			return getRuleContext(VariableDeclarationBlockContext.class,0);
		}
		public VariableAssignmentBlockContext variableAssignmentBlock() {
			return getRuleContext(VariableAssignmentBlockContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public MainProcedureContext mainProcedure() {
			return getRuleContext(MainProcedureContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(142);
				typeDeclaration();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(148);
				variableDeclarationBlock();
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(151);
				variableAssignmentBlock();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					procedure();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDIMENTO) {
				{
				setState(160);
				mainProcedure();
				}
			}

			setState(163);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			procedureDeclaration();
			setState(166);
			procedureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedureBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBodyContext procedureBody() throws RecognitionException {
		ProcedureBodyContext _localctx = new ProcedureBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedureBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTRADA) {
				{
				setState(168);
				procedureInput();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SAIDA) {
				{
				setState(171);
				procedureOutput();
				}
			}

			setState(174);
			procedureBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(pnpParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PROCEDIMENTO);
			setState(177);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureInputContext extends ParserRuleContext {
		public TerminalNode ENTRADA() { return getToken(pnpParser.ENTRADA, 0); }
		public TerminalNode NULO() { return getToken(pnpParser.NULO, 0); }
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedureInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedureInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedureInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureInputContext procedureInput() throws RecognitionException {
		ProcedureInputContext _localctx = new ProcedureInputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ENTRADA);
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(180);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					variableDeclaration();
					}
					}
					setState(184); 
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureOutputContext extends ParserRuleContext {
		public TerminalNode SAIDA() { return getToken(pnpParser.SAIDA, 0); }
		public TerminalNode NULO() { return getToken(pnpParser.NULO, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ProcedureOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedureOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedureOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedureOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOutputContext procedureOutput() throws RecognitionException {
		ProcedureOutputContext _localctx = new ProcedureOutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedureOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SAIDA);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(189);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(190);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBlockContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(pnpParser.INICIO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public ProcedureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedureBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitProcedureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(INICIO);
			setState(194);
			block();
			setState(195);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(pnpParser.PROCEDIMENTO, 0); }
		public TerminalNode PRINCIPAL() { return getToken(pnpParser.PRINCIPAL, 0); }
		public ProcedureBodyContext procedureBody() {
			return getRuleContext(ProcedureBodyContext.class,0);
		}
		public MainProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterMainProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitMainProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitMainProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProcedureContext mainProcedure() throws RecognitionException {
		MainProcedureContext _localctx = new MainProcedureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(PROCEDIMENTO);
			setState(198);
			match(PRINCIPAL);
			setState(199);
			procedureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(pnpParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode INICIO() { return getToken(pnpParser.INICIO, 0); }
		public TypeVariableDeclarationBlockContext typeVariableDeclarationBlock() {
			return getRuleContext(TypeVariableDeclarationBlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TIPO);
			setState(202);
			match(ID);
			setState(203);
			match(INICIO);
			setState(204);
			typeVariableDeclarationBlock();
			setState(205);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableDeclarationBlockContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pnpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pnpParser.ID, i);
		}
		public TerminalNode SEPARADOR_VARIAVEL_TIPO() { return getToken(pnpParser.SEPARADOR_VARIAVEL_TIPO, 0); }
		public TypeDefinitionTypeContext typeDefinitionType() {
			return getRuleContext(TypeDefinitionTypeContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(pnpParser.FIM_COMANDO, 0); }
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(pnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(pnpParser.SEPARADOR_VARIAVEL, i);
		}
		public TypeVariableDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterTypeVariableDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitTypeVariableDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitTypeVariableDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableDeclarationBlockContext typeVariableDeclarationBlock() throws RecognitionException {
		TypeVariableDeclarationBlockContext _localctx = new TypeVariableDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeVariableDeclarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(208);
				match(SEPARADOR_VARIAVEL);
				setState(209);
				match(ID);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(216);
			typeDefinitionType(0);
			setState(217);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public VariableDeclarationBlockContext variableDeclarationBlock() {
			return getRuleContext(VariableDeclarationBlockContext.class,0);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(219);
				variableDeclarationBlock();
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ESCREVA:
					case LEIA:
					case ID:
						{
						setState(222);
						command();
						}
						break;
					case SE:
					case PARA:
					case REPITA:
					case ENQUANTO:
					case CASO:
						{
						setState(223);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationBlockContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariableDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariableDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitVariableDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationBlockContext variableDeclarationBlock() throws RecognitionException {
		VariableDeclarationBlockContext _localctx = new VariableDeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarationBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					variableDeclaration();
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentBlockContext extends ParserRuleContext {
		public List<VariableAssignmentContext> variableAssignment() {
			return getRuleContexts(VariableAssignmentContext.class);
		}
		public VariableAssignmentContext variableAssignment(int i) {
			return getRuleContext(VariableAssignmentContext.class,i);
		}
		public List<TerminalNode> FIM_COMANDO() { return getTokens(pnpParser.FIM_COMANDO); }
		public TerminalNode FIM_COMANDO(int i) {
			return getToken(pnpParser.FIM_COMANDO, i);
		}
		public VariableAssignmentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignmentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariableAssignmentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariableAssignmentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitVariableAssignmentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentBlockContext variableAssignmentBlock() throws RecognitionException {
		VariableAssignmentBlockContext _localctx = new VariableAssignmentBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				variableAssignment();
				setState(235);
				match(FIM_COMANDO);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode FIM_COMANDO() { return getToken(pnpParser.FIM_COMANDO, 0); }
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(241);
				function();
				}
				break;
			case 2:
				{
				setState(242);
				variableAssignment();
				}
				break;
			}
			setState(245);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				ifStatement();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				forStatement();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				whileStatement();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				doWhileStatement();
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementConditionContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public StatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitStatementCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitStatementCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementConditionContext statementCondition() throws RecognitionException {
		StatementConditionContext _localctx = new StatementConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ABRE_PARENTESES);
			setState(255);
			logicalOperation(0);
			setState(256);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperationContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public RelationalOperationContext relationalOperation() {
			return getRuleContext(RelationalOperationContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public List<IntegerArithmeticOperationContext> integerArithmeticOperation() {
			return getRuleContexts(IntegerArithmeticOperationContext.class);
		}
		public IntegerArithmeticOperationContext integerArithmeticOperation(int i) {
			return getRuleContext(IntegerArithmeticOperationContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public List<RationalArithmeticOperationContext> rationalArithmeticOperation() {
			return getRuleContexts(RationalArithmeticOperationContext.class);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation(int i) {
			return getRuleContext(RationalArithmeticOperationContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<CharacterExpressionContext> characterExpression() {
			return getRuleContexts(CharacterExpressionContext.class);
		}
		public CharacterExpressionContext characterExpression(int i) {
			return getRuleContext(CharacterExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public RelationalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterRelationalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitRelationalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitRelationalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperationContext relationalOperation() throws RecognitionException {
		RelationalOperationContext _localctx = new RelationalOperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalOperation);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ABRE_PARENTESES);
				setState(259);
				relationalOperation();
				setState(260);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				integerArithmeticOperation(0);
				setState(263);
				relationalOperator();
				setState(264);
				integerArithmeticOperation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				rationalArithmeticOperation(0);
				setState(267);
				comparisonOperator();
				setState(268);
				rationalArithmeticOperation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				characterExpression();
				setState(271);
				relationalOperator();
				setState(272);
				characterExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				booleanExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperationContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public List<LogicalOperationContext> logicalOperation() {
			return getRuleContexts(LogicalOperationContext.class);
		}
		public LogicalOperationContext logicalOperation(int i) {
			return getRuleContext(LogicalOperationContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public UnaryLogicalOperatorContext unaryLogicalOperator() {
			return getRuleContext(UnaryLogicalOperatorContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public RelationalOperationContext relationalOperation() {
			return getRuleContext(RelationalOperationContext.class,0);
		}
		public BinaryLogicalOperatorContext binaryLogicalOperator() {
			return getRuleContext(BinaryLogicalOperatorContext.class,0);
		}
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitLogicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitLogicalOperation(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logicalOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(278);
				match(ABRE_PARENTESES);
				setState(279);
				logicalOperation(0);
				setState(280);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				setState(282);
				unaryLogicalOperator();
				setState(283);
				logicalOperation(4);
				}
				break;
			case 3:
				{
				setState(285);
				booleanExpression();
				}
				break;
			case 4:
				{
				setState(286);
				relationalOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOperation);
					setState(289);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(290);
					binaryLogicalOperator();
					setState(291);
					logicalOperation(4);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntegerArithmeticOperationContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public List<IntegerArithmeticOperationContext> integerArithmeticOperation() {
			return getRuleContexts(IntegerArithmeticOperationContext.class);
		}
		public IntegerArithmeticOperationContext integerArithmeticOperation(int i) {
			return getRuleContext(IntegerArithmeticOperationContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public IntegerExpressionContext integerExpression() {
			return getRuleContext(IntegerExpressionContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public IntegerArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerArithmeticOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIntegerArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIntegerArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIntegerArithmeticOperation(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_integerArithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				{
				setState(299);
				match(ABRE_PARENTESES);
				setState(300);
				integerArithmeticOperation(0);
				setState(301);
				match(FECHA_PARENTESES);
				}
				break;
			case NATURAL_LITERAL:
			case INTEIRO_LITERAL:
			case ID:
				{
				setState(303);
				integerExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_integerArithmeticOperation);
						setState(306);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(307);
						multiplicativeOperator();
						setState(308);
						integerArithmeticOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new IntegerArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_integerArithmeticOperation);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						additiveOperator();
						setState(312);
						integerArithmeticOperation(3);
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RationalArithmeticOperationContext extends ParserRuleContext {
		public IntegerArithmeticOperationContext integerArithmeticOperation() {
			return getRuleContext(IntegerArithmeticOperationContext.class,0);
		}
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public List<RationalArithmeticOperationContext> rationalArithmeticOperation() {
			return getRuleContexts(RationalArithmeticOperationContext.class);
		}
		public RationalArithmeticOperationContext rationalArithmeticOperation(int i) {
			return getRuleContext(RationalArithmeticOperationContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public RationalExpressionContext rationalExpression() {
			return getRuleContext(RationalExpressionContext.class,0);
		}
		public RationalMultiplicativeOperatorContext rationalMultiplicativeOperator() {
			return getRuleContext(RationalMultiplicativeOperatorContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public RationalArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalArithmeticOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterRationalArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitRationalArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitRationalArithmeticOperation(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_rationalArithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(320);
				integerArithmeticOperation(0);
				}
				break;
			case 2:
				{
				setState(321);
				match(ABRE_PARENTESES);
				setState(322);
				rationalArithmeticOperation(0);
				setState(323);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				{
				setState(325);
				rationalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new RationalArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rationalArithmeticOperation);
						setState(328);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(329);
						rationalMultiplicativeOperator();
						setState(330);
						rationalArithmeticOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new RationalArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rationalArithmeticOperation);
						setState(332);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(333);
						additiveOperator();
						setState(334);
						rationalArithmeticOperation(3);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcatenationOperationContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public List<ConcatenationOperationContext> concatenationOperation() {
			return getRuleContexts(ConcatenationOperationContext.class);
		}
		public ConcatenationOperationContext concatenationOperation(int i) {
			return getRuleContext(ConcatenationOperationContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public CharacterExpressionContext characterExpression() {
			return getRuleContext(CharacterExpressionContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public TerminalNode CONCATENACAO() { return getToken(pnpParser.CONCATENACAO, 0); }
		public ConcatenationOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenationOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterConcatenationOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitConcatenationOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitConcatenationOperation(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_concatenationOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(342);
				match(ABRE_PARENTESES);
				setState(343);
				concatenationOperation(0);
				setState(344);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				setState(346);
				characterExpression();
				}
				break;
			case 3:
				{
				setState(347);
				numericalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatenationOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concatenationOperation);
					setState(350);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(351);
					match(CONCATENACAO);
					setState(352);
					concatenationOperation(4);
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operation);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				integerArithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				rationalArithmeticOperation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				logicalOperation(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				relationalOperation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				concatenationOperation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public ArrayDimentionContext arrayDimention() {
			return getRuleContext(ArrayDimentionContext.class,0);
		}
		public TerminalNode SEPARADOR_TIPO_VARIAVEL() { return getToken(pnpParser.SEPARADOR_TIPO_VARIAVEL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(366);
				arrayDimention();
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(369);
				match(SEPARADOR_TIPO_VARIAVEL);
				setState(370);
				variable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pnpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pnpParser.ID, i);
		}
		public TerminalNode SEPARADOR_VARIAVEL_TIPO() { return getToken(pnpParser.SEPARADOR_VARIAVEL_TIPO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(pnpParser.FIM_COMANDO, 0); }
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(pnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(pnpParser.SEPARADOR_VARIAVEL, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ID);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(374);
				match(SEPARADOR_VARIAVEL);
				setState(375);
				match(ID);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(382);
			type(0);
			setState(383);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode ATRIBUICAO() { return getToken(pnpParser.ATRIBUICAO, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			variable();
			setState(386);
			match(ATRIBUICAO);
			setState(387);
			operation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				booleanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				numericalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				characterExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEANO_LITERAL() { return getToken(pnpParser.BOOLEANO_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanExpression);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(BOOLEANO_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitNumericalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitNumericalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numericalExpression);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				integerExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				rationalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerExpressionContext extends ParserRuleContext {
		public TerminalNode NATURAL_LITERAL() { return getToken(pnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode INTEIRO_LITERAL() { return getToken(pnpParser.INTEIRO_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntegerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerExpressionContext integerExpression() throws RecognitionException {
		IntegerExpressionContext _localctx = new IntegerExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integerExpression);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NATURAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(NATURAL_LITERAL);
				}
				break;
			case INTEIRO_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(INTEIRO_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RationalExpressionContext extends ParserRuleContext {
		public TerminalNode RACIONAL_LITERAL() { return getToken(pnpParser.RACIONAL_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterRationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitRationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitRationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalExpressionContext rationalExpression() throws RecognitionException {
		RationalExpressionContext _localctx = new RationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rationalExpression);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RACIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(RACIONAL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterExpressionContext extends ParserRuleContext {
		public TerminalNode CARACTERE_LITERAL() { return getToken(pnpParser.CARACTERE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(pnpParser.STRING_LITERAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CharacterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterCharacterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitCharacterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitCharacterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterExpressionContext characterExpression() throws RecognitionException {
		CharacterExpressionContext _localctx = new CharacterExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_characterExpression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARACTERE_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(CARACTERE_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(STRING_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
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
			_errHandler.recover(this, re);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				readFunction();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				writeFunction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(ID);
				setState(419);
				match(ABRE_PARENTESES);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
					{
					setState(420);
					params();
					}
				}

				setState(423);
				match(FECHA_PARENTESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(pnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(pnpParser.SEPARADOR_VARIAVEL, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			expression();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(427);
				match(SEPARADOR_VARIAVEL);
				setState(428);
				expression();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadFunctionContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(pnpParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public ReadFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterReadFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitReadFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitReadFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFunctionContext readFunction() throws RecognitionException {
		ReadFunctionContext _localctx = new ReadFunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_readFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LEIA);
			setState(435);
			match(ABRE_PARENTESES);
			setState(436);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteFunctionContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(pnpParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public WriteFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterWriteFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitWriteFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitWriteFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteFunctionContext writeFunction() throws RecognitionException {
		WriteFunctionContext _localctx = new WriteFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_writeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ESCREVA);
			setState(439);
			match(ABRE_PARENTESES);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(440);
				params();
				}
			}

			setState(443);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			ifStart();
			setState(446);
			ifThen();
			setState(447);
			ifElseIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStartContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(pnpParser.SE, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public IfStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIfStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIfStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIfStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStartContext ifStart() throws RecognitionException {
		IfStartContext _localctx = new IfStartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(SE);
			setState(450);
			statementCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenContext extends ParserRuleContext {
		public TerminalNode ENTAO() { return getToken(pnpParser.ENTAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ENTAO);
			setState(453);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(pnpParser.SENAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(SENAO);
			setState(456);
			block();
			setState(457);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public IfElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterIfElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitIfElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitIfElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseIfContext ifElseIf() throws RecognitionException {
		IfElseIfContext _localctx = new IfElseIfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ifElseIf);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				elseIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				ifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(FIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(pnpParser.SENAO, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(SENAO);
			setState(465);
			ifStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			switchStart();
			setState(469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(468);
				switchCases();
				}
				}
				setState(471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0) );
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(473);
				switchDefault();
				}
			}

			setState(476);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStartContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(pnpParser.CASO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(pnpParser.SEJA, 0); }
		public SwitchStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSwitchStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSwitchStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitSwitchStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStartContext switchStart() throws RecognitionException {
		SwitchStartContext _localctx = new SwitchStartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(CASO);
			setState(479);
			variable();
			setState(480);
			match(SEJA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode SEPARADOR_VARIAVEL_TIPO() { return getToken(pnpParser.SEPARADOR_VARIAVEL_TIPO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEPARADOR_VARIAVEL() { return getTokens(pnpParser.SEPARADOR_VARIAVEL); }
		public TerminalNode SEPARADOR_VARIAVEL(int i) {
			return getToken(pnpParser.SEPARADOR_VARIAVEL, i);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSwitchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			expression();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(483);
				match(SEPARADOR_VARIAVEL);
				setState(484);
				expression();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(491);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(pnpParser.SENAO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSwitchDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSwitchDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitSwitchDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDefaultContext switchDefault() throws RecognitionException {
		SwitchDefaultContext _localctx = new SwitchDefaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(SENAO);
			setState(494);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			forStart();
			setState(497);
			forInterval();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(498);
				forStep();
				}
			}

			setState(501);
			forBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStartContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(pnpParser.PARA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterForStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitForStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitForStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStartContext forStart() throws RecognitionException {
		ForStartContext _localctx = new ForStartContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_forStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PARA);
			setState(504);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForIntervalContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(pnpParser.DE, 0); }
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public TerminalNode ATE() { return getToken(pnpParser.ATE, 0); }
		public ForIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterForInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitForInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitForInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIntervalContext forInterval() throws RecognitionException {
		ForIntervalContext _localctx = new ForIntervalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(DE);
			setState(507);
			numericalExpression();
			setState(508);
			match(ATE);
			setState(509);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStepContext extends ParserRuleContext {
		public TerminalNode PASSO() { return getToken(pnpParser.PASSO, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public ForStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterForStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitForStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitForStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStepContext forStep() throws RecognitionException {
		ForStepContext _localctx = new ForStepContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(PASSO);
			setState(512);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(pnpParser.REPITA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(REPITA);
			setState(515);
			block();
			setState(516);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			whileStart();
			setState(519);
			whileBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStartContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(pnpParser.ENQUANTO, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public WhileStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterWhileStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitWhileStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitWhileStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStartContext whileStart() throws RecognitionException {
		WhileStartContext _localctx = new WhileStartContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_whileStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ENQUANTO);
			setState(522);
			statementCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(pnpParser.FACA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(FACA);
			setState(525);
			block();
			setState(526);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			doWhileBlock();
			setState(529);
			doWhileEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(pnpParser.REPITA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(REPITA);
			setState(532);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileEndContext extends ParserRuleContext {
		public TerminalNode ATE() { return getToken(pnpParser.ATE, 0); }
		public TerminalNode QUE() { return getToken(pnpParser.QUE, 0); }
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public TerminalNode FIM_COMANDO() { return getToken(pnpParser.FIM_COMANDO, 0); }
		public DoWhileEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterDoWhileEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitDoWhileEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitDoWhileEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileEndContext doWhileEnd() throws RecognitionException {
		DoWhileEndContext _localctx = new DoWhileEndContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_doWhileEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(ATE);
			setState(535);
			match(QUE);
			setState(536);
			statementCondition();
			setState(537);
			match(FIM_COMANDO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterTypeDefinitionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitTypeDefinitionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitTypeDefinitionType(this);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_typeDefinitionType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case RACIONAL:
			case BOOLEANO:
			case CARACTERE:
			case STRING:
				{
				setState(540);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(541);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeDefinitionTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeDefinitionType);
					setState(544);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(545);
					arrayDimentionLiteral();
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitType(this);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case RACIONAL:
			case BOOLEANO:
			case CARACTERE:
			case STRING:
				{
				setState(552);
				primitiveType();
				}
				break;
			case ID:
				{
				setState(553);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(556);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(557);
					arrayDimention();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(pnpParser.INTEIRO, 0); }
		public TerminalNode RACIONAL() { return getToken(pnpParser.RACIONAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(pnpParser.BOOLEANO, 0); }
		public TerminalNode CARACTERE() { return getToken(pnpParser.CARACTERE, 0); }
		public TerminalNode STRING() { return getToken(pnpParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimentionContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(pnpParser.ABRE_CHAVES, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(pnpParser.FECHA_CHAVES, 0); }
		public ArrayDimentionLiteralContext arrayDimentionLiteral() {
			return getRuleContext(ArrayDimentionLiteralContext.class,0);
		}
		public ArrayDimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterArrayDimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitArrayDimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitArrayDimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimentionContext arrayDimention() throws RecognitionException {
		ArrayDimentionContext _localctx = new ArrayDimentionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arrayDimention);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(ABRE_CHAVES);
				setState(566);
				variable();
				setState(567);
				match(FECHA_CHAVES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				arrayDimentionLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDimentionLiteralContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(pnpParser.ABRE_CHAVES, 0); }
		public TerminalNode NATURAL_LITERAL() { return getToken(pnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(pnpParser.FECHA_CHAVES, 0); }
		public ArrayDimentionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimentionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterArrayDimentionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitArrayDimentionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitArrayDimentionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimentionLiteralContext arrayDimentionLiteral() throws RecognitionException {
		ArrayDimentionLiteralContext _localctx = new ArrayDimentionLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayDimentionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(ABRE_CHAVES);
			setState(573);
			match(NATURAL_LITERAL);
			setState(574);
			match(FECHA_CHAVES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_binaryOperator);
		try {
			setState(579);
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
				setState(576);
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
				setState(577);
				arithmeticOperator();
				}
				break;
			case AND:
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
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
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationalOperator);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALDADE:
			case DESIGUALDADE:
			case MAIOR_IGUAL:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				equalityOperator();
				}
				break;
			case MAIOR:
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode IGUALDADE() { return getToken(pnpParser.IGUALDADE, 0); }
		public TerminalNode DESIGUALDADE() { return getToken(pnpParser.DESIGUALDADE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(pnpParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(pnpParser.MENOR_IGUAL, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(pnpParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(pnpParser.MENOR, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
			_errHandler.recover(this, re);
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
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arithmeticOperator);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADICAO:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				additiveOperator();
				}
				break;
			case MULTIPLICACAO:
			case DIVISAO_RAC:
			case DIVISAO_INT:
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(pnpParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(pnpParser.SUBTRACAO, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
			_errHandler.recover(this, re);
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
		public TerminalNode DIVISAO_INT() { return getToken(pnpParser.DIVISAO_INT, 0); }
		public TerminalNode MODULO() { return getToken(pnpParser.MODULO, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_multiplicativeOperator);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVISAO_RAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				rationalMultiplicativeOperator();
				}
				break;
			case DIVISAO_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(DIVISAO_INT);
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RationalMultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(pnpParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO_RAC() { return getToken(pnpParser.DIVISAO_RAC, 0); }
		public RationalMultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rationalMultiplicativeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterRationalMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitRationalMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitRationalMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RationalMultiplicativeOperatorContext rationalMultiplicativeOperator() throws RecognitionException {
		RationalMultiplicativeOperatorContext _localctx = new RationalMultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_rationalMultiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(pnpParser.NOT, 0); }
		public UnaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterUnaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitUnaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitUnaryLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryLogicalOperatorContext unaryLogicalOperator() throws RecognitionException {
		UnaryLogicalOperatorContext _localctx = new UnaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unaryLogicalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryLogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(pnpParser.AND, 0); }
		public TerminalNode OR() { return getToken(pnpParser.OR, 0); }
		public TerminalNode XOR() { return getToken(pnpParser.XOR, 0); }
		public BinaryLogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBinaryLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBinaryLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitBinaryLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLogicalOperatorContext binaryLogicalOperator() throws RecognitionException {
		BinaryLogicalOperatorContext _localctx = new BinaryLogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return logicalOperation_sempred((LogicalOperationContext)_localctx, predIndex);
		case 18:
			return integerArithmeticOperation_sempred((IntegerArithmeticOperationContext)_localctx, predIndex);
		case 19:
			return rationalArithmeticOperation_sempred((RationalArithmeticOperationContext)_localctx, predIndex);
		case 20:
			return concatenationOperation_sempred((ConcatenationOperationContext)_localctx, predIndex);
		case 56:
			return typeDefinitionType_sempred((TypeDefinitionTypeContext)_localctx, predIndex);
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0261\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3\2\5\2\u0098\n\2\3\2\5\2\u009b\n\2"+
		"\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13\2\3\2\5\2\u00a4\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\5\4\u00ac\n\4\3\4\5\4\u00af\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\6\6\u00b9\n\6\r\6\16\6\u00ba\5\6\u00bd\n\6\3\7\3\7\3\7\5\7\u00c2"+
		"\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13\u00d5\n\13\f\13\16\13\u00d8\13\13\3\13\3\13\3\13\3\13\3\f\5"+
		"\f\u00df\n\f\3\f\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\r\6\r\u00e9\n"+
		"\r\r\r\16\r\u00ea\3\16\3\16\3\16\6\16\u00f0\n\16\r\16\16\16\u00f1\3\17"+
		"\3\17\5\17\u00f6\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00ff\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0116\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0122\n\23\3\23\3\23\3\23\3\23"+
		"\7\23\u0128\n\23\f\23\16\23\u012b\13\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0133\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013d\n"+
		"\24\f\24\16\24\u0140\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0149"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0153\n\25\f\25\16"+
		"\25\u0156\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u015f\n\26\3\26"+
		"\3\26\3\26\7\26\u0164\n\26\f\26\16\26\u0167\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u016e\n\27\3\30\3\30\5\30\u0172\n\30\3\30\3\30\5\30\u0176\n"+
		"\30\3\31\3\31\3\31\7\31\u017b\n\31\f\31\16\31\u017e\13\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u018b\n\33\3\34\3\34"+
		"\5\34\u018f\n\34\3\35\3\35\5\35\u0193\n\35\3\36\3\36\3\36\5\36\u0198\n"+
		"\36\3\37\3\37\5\37\u019c\n\37\3 \3 \3 \5 \u01a1\n \3!\3!\3!\3!\3!\5!\u01a8"+
		"\n!\3!\5!\u01ab\n!\3\"\3\"\3\"\7\"\u01b0\n\"\f\"\16\"\u01b3\13\"\3#\3"+
		"#\3#\3#\3$\3$\3$\5$\u01bc\n$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\3)\3)\5)\u01d1\n)\3*\3*\3*\3+\3+\6+\u01d8\n+\r+\16+\u01d9"+
		"\3+\5+\u01dd\n+\3+\3+\3,\3,\3,\3,\3-\3-\3-\7-\u01e8\n-\f-\16-\u01eb\13"+
		"-\3-\3-\3-\3.\3.\3.\3/\3/\3/\5/\u01f6\n/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\39\39"+
		"\3:\3:\3:\5:\u0221\n:\3:\3:\7:\u0225\n:\f:\16:\u0228\13:\3;\3;\3;\5;\u022d"+
		"\n;\3;\3;\7;\u0231\n;\f;\16;\u0234\13;\3<\3<\3=\3=\3=\3=\3=\5=\u023d\n"+
		"=\3>\3>\3>\3>\3?\3?\3?\5?\u0246\n?\3@\3@\5@\u024a\n@\3A\3A\3B\3B\3C\3"+
		"C\5C\u0252\nC\3D\3D\3E\3E\3E\5E\u0259\nE\3F\3F\3G\3G\3H\3H\3H\2\b$&(*"+
		"rtI\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\2\b\3\2\31\35\5\2\37 \"\"$$\4\2!!##\3\2%&\3\2\'(\3\2,.\2\u0266"+
		"\2\u0093\3\2\2\2\4\u00a7\3\2\2\2\6\u00ab\3\2\2\2\b\u00b2\3\2\2\2\n\u00b5"+
		"\3\2\2\2\f\u00be\3\2\2\2\16\u00c3\3\2\2\2\20\u00c7\3\2\2\2\22\u00cb\3"+
		"\2\2\2\24\u00d1\3\2\2\2\26\u00de\3\2\2\2\30\u00e8\3\2\2\2\32\u00ef\3\2"+
		"\2\2\34\u00f5\3\2\2\2\36\u00fe\3\2\2\2 \u0100\3\2\2\2\"\u0115\3\2\2\2"+
		"$\u0121\3\2\2\2&\u0132\3\2\2\2(\u0148\3\2\2\2*\u015e\3\2\2\2,\u016d\3"+
		"\2\2\2.\u016f\3\2\2\2\60\u0177\3\2\2\2\62\u0183\3\2\2\2\64\u018a\3\2\2"+
		"\2\66\u018e\3\2\2\28\u0192\3\2\2\2:\u0197\3\2\2\2<\u019b\3\2\2\2>\u01a0"+
		"\3\2\2\2@\u01aa\3\2\2\2B\u01ac\3\2\2\2D\u01b4\3\2\2\2F\u01b8\3\2\2\2H"+
		"\u01bf\3\2\2\2J\u01c3\3\2\2\2L\u01c6\3\2\2\2N\u01c9\3\2\2\2P\u01d0\3\2"+
		"\2\2R\u01d2\3\2\2\2T\u01d5\3\2\2\2V\u01e0\3\2\2\2X\u01e4\3\2\2\2Z\u01ef"+
		"\3\2\2\2\\\u01f2\3\2\2\2^\u01f9\3\2\2\2`\u01fc\3\2\2\2b\u0201\3\2\2\2"+
		"d\u0204\3\2\2\2f\u0208\3\2\2\2h\u020b\3\2\2\2j\u020e\3\2\2\2l\u0212\3"+
		"\2\2\2n\u0215\3\2\2\2p\u0218\3\2\2\2r\u0220\3\2\2\2t\u022c\3\2\2\2v\u0235"+
		"\3\2\2\2x\u023c\3\2\2\2z\u023e\3\2\2\2|\u0245\3\2\2\2~\u0249\3\2\2\2\u0080"+
		"\u024b\3\2\2\2\u0082\u024d\3\2\2\2\u0084\u0251\3\2\2\2\u0086\u0253\3\2"+
		"\2\2\u0088\u0258\3\2\2\2\u008a\u025a\3\2\2\2\u008c\u025c\3\2\2\2\u008e"+
		"\u025e\3\2\2\2\u0090\u0092\5\22\n\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\5\30\r\2\u0097\u0096\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a2\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\2\2\3\u00a6"+
		"\3\3\2\2\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\5\6\4\2\u00a9\5\3\2\2\2\u00aa"+
		"\u00ac\5\n\6\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\5\16\b\2\u00b1\7\3\2\2\2\u00b2\u00b3\7\3\2"+
		"\2\u00b3\u00b4\7?\2\2\u00b4\t\3\2\2\2\u00b5\u00bc\7\4\2\2\u00b6\u00bd"+
		"\7\36\2\2\u00b7\u00b9\5\60\31\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6"+
		"\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00c1\7\5\2\2\u00bf"+
		"\u00c2\7\36\2\2\u00c0\u00c2\5\60\31\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\r\3\2\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5\26\f\2\u00c5"+
		"\u00c6\7\7\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\7\3\2\2\u00c8\u00c9\7\26\2"+
		"\2\u00c9\u00ca\5\6\4\2\u00ca\21\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\7\2\2"+
		"\u00d0\23\3\2\2\2\u00d1\u00d6\7?\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d5\7"+
		"?\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7="+
		"\2\2\u00da\u00db\5r:\2\u00db\u00dc\7\67\2\2\u00dc\25\3\2\2\2\u00dd\u00df"+
		"\5\30\r\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e4\3\2\2\2"+
		"\u00e0\u00e3\5\34\17\2\u00e1\u00e3\5\36\20\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\27\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5\60\31\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\31\3\2\2\2\u00ec\u00ed\5\62\32\2\u00ed\u00ee\7\67\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\33\3\2\2\2\u00f3\u00f6\5@!\2\u00f4\u00f6"+
		"\5\62\32\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f8\7\67\2\2\u00f8\35\3\2\2\2\u00f9\u00ff\5H%\2\u00fa\u00ff\5"+
		"\\/\2\u00fb\u00ff\5f\64\2\u00fc\u00ff\5l\67\2\u00fd\u00ff\5T+\2\u00fe"+
		"\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00ff\37\3\2\2\2\u0100\u0101\78\2\2\u0101\u0102"+
		"\5$\23\2\u0102\u0103\79\2\2\u0103!\3\2\2\2\u0104\u0105\78\2\2\u0105\u0106"+
		"\5\"\22\2\u0106\u0107\79\2\2\u0107\u0116\3\2\2\2\u0108\u0109\5&\24\2\u0109"+
		"\u010a\5~@\2\u010a\u010b\5&\24\2\u010b\u0116\3\2\2\2\u010c\u010d\5(\25"+
		"\2\u010d\u010e\5\u0082B\2\u010e\u010f\5(\25\2\u010f\u0116\3\2\2\2\u0110"+
		"\u0111\5> \2\u0111\u0112\5~@\2\u0112\u0113\5> \2\u0113\u0116\3\2\2\2\u0114"+
		"\u0116\5\66\34\2\u0115\u0104\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u010c\3"+
		"\2\2\2\u0115\u0110\3\2\2\2\u0115\u0114\3\2\2\2\u0116#\3\2\2\2\u0117\u0118"+
		"\b\23\1\2\u0118\u0119\78\2\2\u0119\u011a\5$\23\2\u011a\u011b\79\2\2\u011b"+
		"\u0122\3\2\2\2\u011c\u011d\5\u008cG\2\u011d\u011e\5$\23\6\u011e\u0122"+
		"\3\2\2\2\u011f\u0122\5\66\34\2\u0120\u0122\5\"\22\2\u0121\u0117\3\2\2"+
		"\2\u0121\u011c\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0129"+
		"\3\2\2\2\u0123\u0124\f\5\2\2\u0124\u0125\5\u008eH\2\u0125\u0126\5$\23"+
		"\6\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a%\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\b\24\1\2\u012d\u012e\78\2\2\u012e\u012f\5&\24\2\u012f\u0130\79"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u0133\5:\36\2\u0132\u012c\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u013e\3\2\2\2\u0134\u0135\f\5\2\2\u0135\u0136\5\u0088"+
		"E\2\u0136\u0137\5&\24\6\u0137\u013d\3\2\2\2\u0138\u0139\f\4\2\2\u0139"+
		"\u013a\5\u0086D\2\u013a\u013b\5&\24\5\u013b\u013d\3\2\2\2\u013c\u0134"+
		"\3\2\2\2\u013c\u0138\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\'\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\b\25\1"+
		"\2\u0142\u0149\5&\24\2\u0143\u0144\78\2\2\u0144\u0145\5(\25\2\u0145\u0146"+
		"\79\2\2\u0146\u0149\3\2\2\2\u0147\u0149\5<\37\2\u0148\u0141\3\2\2\2\u0148"+
		"\u0143\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u0154\3\2\2\2\u014a\u014b\f\5"+
		"\2\2\u014b\u014c\5\u008aF\2\u014c\u014d\5(\25\6\u014d\u0153\3\2\2\2\u014e"+
		"\u014f\f\4\2\2\u014f\u0150\5\u0086D\2\u0150\u0151\5(\25\5\u0151\u0153"+
		"\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155)\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0158\b\26\1\2\u0158\u0159\78\2\2\u0159\u015a\5*\26\2\u015a\u015b"+
		"\79\2\2\u015b\u015f\3\2\2\2\u015c\u015f\5> \2\u015d\u015f\58\35\2\u015e"+
		"\u0157\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0165\3\2"+
		"\2\2\u0160\u0161\f\5\2\2\u0161\u0162\7+\2\2\u0162\u0164\5*\26\6\u0163"+
		"\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166+\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016e\5&\24\2\u0169\u016e"+
		"\5(\25\2\u016a\u016e\5$\23\2\u016b\u016e\5\"\22\2\u016c\u016e\5*\26\2"+
		"\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016e-\3\2\2\2\u016f\u0171\7?\2\2\u0170\u0172"+
		"\5x=\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0174\7>\2\2\u0174\u0176\5.\30\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176/\3\2\2\2\u0177\u017c\7?\2\2\u0178\u0179\7<\2\2\u0179\u017b"+
		"\7?\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7="+
		"\2\2\u0180\u0181\5t;\2\u0181\u0182\7\67\2\2\u0182\61\3\2\2\2\u0183\u0184"+
		"\5.\30\2\u0184\u0185\7\66\2\2\u0185\u0186\5,\27\2\u0186\63\3\2\2\2\u0187"+
		"\u018b\5\66\34\2\u0188\u018b\58\35\2\u0189\u018b\5> \2\u018a\u0187\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\65\3\2\2\2\u018c\u018f"+
		"\7\63\2\2\u018d\u018f\5.\30\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2"+
		"\u018f\67\3\2\2\2\u0190\u0193\5:\36\2\u0191\u0193\5<\37\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0191\3\2\2\2\u01939\3\2\2\2\u0194\u0198\7\60\2\2\u0195"+
		"\u0198\7\61\2\2\u0196\u0198\5.\30\2\u0197\u0194\3\2\2\2\u0197\u0195\3"+
		"\2\2\2\u0197\u0196\3\2\2\2\u0198;\3\2\2\2\u0199\u019c\7\62\2\2\u019a\u019c"+
		"\5.\30\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c=\3\2\2\2\u019d"+
		"\u01a1\7\64\2\2\u019e\u01a1\7\65\2\2\u019f\u01a1\5.\30\2\u01a0\u019d\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1?\3\2\2\2\u01a2\u01ab"+
		"\5D#\2\u01a3\u01ab\5F$\2\u01a4\u01a5\7?\2\2\u01a5\u01a7\78\2\2\u01a6\u01a8"+
		"\5B\"\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\79\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa\u01a4\3\2"+
		"\2\2\u01abA\3\2\2\2\u01ac\u01b1\5\64\33\2\u01ad\u01ae\7<\2\2\u01ae\u01b0"+
		"\5\64\33\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2C\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7"+
		"\30\2\2\u01b5\u01b6\78\2\2\u01b6\u01b7\79\2\2\u01b7E\3\2\2\2\u01b8\u01b9"+
		"\7\27\2\2\u01b9\u01bb\78\2\2\u01ba\u01bc\5B\"\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\79\2\2\u01beG\3\2\2\2\u01bf"+
		"\u01c0\5J&\2\u01c0\u01c1\5L\'\2\u01c1\u01c2\5P)\2\u01c2I\3\2\2\2\u01c3"+
		"\u01c4\7\b\2\2\u01c4\u01c5\5 \21\2\u01c5K\3\2\2\2\u01c6\u01c7\7\t\2\2"+
		"\u01c7\u01c8\5\26\f\2\u01c8M\3\2\2\2\u01c9\u01ca\7\n\2\2\u01ca\u01cb\5"+
		"\26\f\2\u01cb\u01cc\7\7\2\2\u01ccO\3\2\2\2\u01cd\u01d1\5R*\2\u01ce\u01d1"+
		"\5N(\2\u01cf\u01d1\7\7\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1Q\3\2\2\2\u01d2\u01d3\7\n\2\2\u01d3\u01d4\5H%\2\u01d4"+
		"S\3\2\2\2\u01d5\u01d7\5V,\2\u01d6\u01d8\5X-\2\u01d7\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2"+
		"\2\2\u01db\u01dd\5Z.\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01df\7\7\2\2\u01dfU\3\2\2\2\u01e0\u01e1\7\23\2\2\u01e1"+
		"\u01e2\5.\30\2\u01e2\u01e3\7\24\2\2\u01e3W\3\2\2\2\u01e4\u01e9\5\64\33"+
		"\2\u01e5\u01e6\7<\2\2\u01e6\u01e8\5\64\33\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7=\2\2\u01ed\u01ee\5\26\f\2\u01ee"+
		"Y\3\2\2\2\u01ef\u01f0\7\n\2\2\u01f0\u01f1\5\26\f\2\u01f1[\3\2\2\2\u01f2"+
		"\u01f3\5^\60\2\u01f3\u01f5\5`\61\2\u01f4\u01f6\5b\62\2\u01f5\u01f4\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\5d\63\2\u01f8"+
		"]\3\2\2\2\u01f9\u01fa\7\13\2\2\u01fa\u01fb\5.\30\2\u01fb_\3\2\2\2\u01fc"+
		"\u01fd\7\f\2\2\u01fd\u01fe\58\35\2\u01fe\u01ff\7\r\2\2\u01ff\u0200\58"+
		"\35\2\u0200a\3\2\2\2\u0201\u0202\7\16\2\2\u0202\u0203\58\35\2\u0203c\3"+
		"\2\2\2\u0204\u0205\7\17\2\2\u0205\u0206\5\26\f\2\u0206\u0207\7\7\2\2\u0207"+
		"e\3\2\2\2\u0208\u0209\5h\65\2\u0209\u020a\5j\66\2\u020ag\3\2\2\2\u020b"+
		"\u020c\7\20\2\2\u020c\u020d\5 \21\2\u020di\3\2\2\2\u020e\u020f\7\21\2"+
		"\2\u020f\u0210\5\26\f\2\u0210\u0211\7\7\2\2\u0211k\3\2\2\2\u0212\u0213"+
		"\5n8\2\u0213\u0214\5p9\2\u0214m\3\2\2\2\u0215\u0216\7\17\2\2\u0216\u0217"+
		"\5\26\f\2\u0217o\3\2\2\2\u0218\u0219\7\r\2\2\u0219\u021a\7\22\2\2\u021a"+
		"\u021b\5 \21\2\u021b\u021c\7\67\2\2\u021cq\3\2\2\2\u021d\u021e\b:\1\2"+
		"\u021e\u0221\5v<\2\u021f\u0221\7?\2\2\u0220\u021d\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221\u0226\3\2\2\2\u0222\u0223\f\4\2\2\u0223\u0225\5z>\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227s\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\b;\1\2\u022a\u022d"+
		"\5v<\2\u022b\u022d\7?\2\2\u022c\u0229\3\2\2\2\u022c\u022b\3\2\2\2\u022d"+
		"\u0232\3\2\2\2\u022e\u022f\f\4\2\2\u022f\u0231\5x=\2\u0230\u022e\3\2\2"+
		"\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233u"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\t\2\2\2\u0236w\3\2\2\2\u0237"+
		"\u0238\7:\2\2\u0238\u0239\5.\30\2\u0239\u023a\7;\2\2\u023a\u023d\3\2\2"+
		"\2\u023b\u023d\5z>\2\u023c\u0237\3\2\2\2\u023c\u023b\3\2\2\2\u023dy\3"+
		"\2\2\2\u023e\u023f\7:\2\2\u023f\u0240\7\60\2\2\u0240\u0241\7;\2\2\u0241"+
		"{\3\2\2\2\u0242\u0246\5~@\2\u0243\u0246\5\u0084C\2\u0244\u0246\5\u008e"+
		"H\2\u0245\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246"+
		"}\3\2\2\2\u0247\u024a\5\u0080A\2\u0248\u024a\5\u0082B\2\u0249\u0247\3"+
		"\2\2\2\u0249\u0248\3\2\2\2\u024a\177\3\2\2\2\u024b\u024c\t\3\2\2\u024c"+
		"\u0081\3\2\2\2\u024d\u024e\t\4\2\2\u024e\u0083\3\2\2\2\u024f\u0252\5\u0086"+
		"D\2\u0250\u0252\5\u0088E\2\u0251\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252"+
		"\u0085\3\2\2\2\u0253\u0254\t\5\2\2\u0254\u0087\3\2\2\2\u0255\u0259\5\u008a"+
		"F\2\u0256\u0259\7)\2\2\u0257\u0259\7*\2\2\u0258\u0255\3\2\2\2\u0258\u0256"+
		"\3\2\2\2\u0258\u0257\3\2\2\2\u0259\u0089\3\2\2\2\u025a\u025b\t\6\2\2\u025b"+
		"\u008b\3\2\2\2\u025c\u025d\7/\2\2\u025d\u008d\3\2\2\2\u025e\u025f\t\7"+
		"\2\2\u025f\u008f\3\2\2\2;\u0093\u0097\u009a\u009f\u00a3\u00ab\u00ae\u00ba"+
		"\u00bc\u00c1\u00d6\u00de\u00e2\u00e4\u00ea\u00f1\u00f5\u00fe\u0115\u0121"+
		"\u0129\u0132\u013c\u013e\u0148\u0152\u0154\u015e\u0165\u016d\u0171\u0175"+
		"\u017c\u018a\u018e\u0192\u0197\u019b\u01a0\u01a7\u01aa\u01b1\u01bb\u01d0"+
		"\u01d9\u01dc\u01e9\u01f5\u0220\u0226\u022c\u0232\u023c\u0245\u0249\u0251"+
		"\u0258";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}