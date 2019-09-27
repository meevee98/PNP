// Generated from F:/Workspace/PNP/src/syntax/grammar\pnp.g4 by ANTLR 4.7.2
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
		CASO=17, SEJA=18, INTEIRO=19, RACIONAL=20, BOOLEANO=21, CARACTERE=22, 
		STRING=23, NULO=24, IGUALDADE=25, DESIGUALDADE=26, MAIOR=27, MAIOR_IGUAL=28, 
		MENOR=29, MENOR_IGUAL=30, ADICAO=31, SUBTRACAO=32, MULTIPLICACAO=33, DIVISAO_RAC=34, 
		DIVISAO_INT=35, MODULO=36, AND=37, OR=38, XOR=39, NOT=40, NATURAL_LITERAL=41, 
		INTEIRO_LITERAL=42, RACIONAL_LITERAL=43, BOOLEANO_LITERAL=44, CARACTERE_LITERAL=45, 
		STRING_LITERAL=46, ATRIBUICAO=47, FIM_COMANDO=48, ABRE_PARENTESES=49, 
		FECHA_PARENTESES=50, ABRE_CHAVES=51, FECHA_CHAVES=52, SEPARADOR_VARIAVEL=53, 
		SEPARADOR_VARIAVEL_TIPO=54, ID=55, WS=56;
	public static final int
		RULE_file = 0, RULE_procedure = 1, RULE_procedureDeclaration = 2, RULE_procedureInput = 3, 
		RULE_procedureOutput = 4, RULE_procedureBlock = 5, RULE_block = 6, RULE_variableDeclarationBlock = 7, 
		RULE_command = 8, RULE_statement = 9, RULE_statementCondition = 10, RULE_relationalOperation = 11, 
		RULE_logicalOperation = 12, RULE_arithmeticOperation = 13, RULE_concatenationOperation = 14, 
		RULE_operation = 15, RULE_variableDeclaration = 16, RULE_variableAssignment = 17, 
		RULE_expression = 18, RULE_booleanExpression = 19, RULE_numericalExpression = 20, 
		RULE_characterExpression = 21, RULE_function = 22, RULE_params = 23, RULE_ifStatement = 24, 
		RULE_ifStart = 25, RULE_ifThen = 26, RULE_ifElse = 27, RULE_ifElseIf = 28, 
		RULE_elseIf = 29, RULE_switchStatement = 30, RULE_switchStart = 31, RULE_switchCases = 32, 
		RULE_switchDefault = 33, RULE_forStatement = 34, RULE_forStart = 35, RULE_forInterval = 36, 
		RULE_forStep = 37, RULE_forBlock = 38, RULE_whileStatement = 39, RULE_whileStart = 40, 
		RULE_whileBlock = 41, RULE_doWhileStatement = 42, RULE_doWhileBlock = 43, 
		RULE_doWhileEnd = 44, RULE_type = 45, RULE_arrayDimention = 46, RULE_binaryOperator = 47, 
		RULE_relationalOperator = 48, RULE_arithmeticOperator = 49, RULE_additiveOperator = 50, 
		RULE_multiplicativeOperator = 51, RULE_unaryLogicalOperator = 52, RULE_binaryLogicalOperator = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "procedure", "procedureDeclaration", "procedureInput", "procedureOutput", 
			"procedureBlock", "block", "variableDeclarationBlock", "command", "statement", 
			"statementCondition", "relationalOperation", "logicalOperation", "arithmeticOperation", 
			"concatenationOperation", "operation", "variableDeclaration", "variableAssignment", 
			"expression", "booleanExpression", "numericalExpression", "characterExpression", 
			"function", "params", "ifStatement", "ifStart", "ifThen", "ifElse", "ifElseIf", 
			"elseIf", "switchStatement", "switchStart", "switchCases", "switchDefault", 
			"forStatement", "forStart", "forInterval", "forStep", "forBlock", "whileStatement", 
			"whileStart", "whileBlock", "doWhileStatement", "doWhileBlock", "doWhileEnd", 
			"type", "arrayDimention", "binaryOperator", "relationalOperator", "arithmeticOperator", 
			"additiveOperator", "multiplicativeOperator", "unaryLogicalOperator", 
			"binaryLogicalOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'procedimento'", "'entrada'", "'saida'", "'inicio'", "'fim'", 
			"'se'", "'entao'", "'senao'", "'para'", "'de'", "'ate'", "'passo'", "'repita'", 
			"'enquanto'", "'faca'", "'que'", "'caso'", "'seja'", "'inteiro'", "'racional'", 
			"'booleano'", "'caractere'", "'string'", "'nao ha'", "'='", "'<>'", "'>'", 
			"'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'div'", "'mod'", 
			"'e'", "'ou'", "'xor'", "'nao'", null, null, null, null, null, null, 
			"'<-'", "';'", "'('", "')'", "'['", "']'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROCEDIMENTO", "ENTRADA", "SAIDA", "INICIO", "FIM", "SE", "ENTAO", 
			"SENAO", "PARA", "DE", "ATE", "PASSO", "REPITA", "ENQUANTO", "FACA", 
			"QUE", "CASO", "SEJA", "INTEIRO", "RACIONAL", "BOOLEANO", "CARACTERE", 
			"STRING", "NULO", "IGUALDADE", "DESIGUALDADE", "MAIOR", "MAIOR_IGUAL", 
			"MENOR", "MENOR_IGUAL", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO_RAC", 
			"DIVISAO_INT", "MODULO", "AND", "OR", "XOR", "NOT", "NATURAL_LITERAL", 
			"INTEIRO_LITERAL", "RACIONAL_LITERAL", "BOOLEANO_LITERAL", "CARACTERE_LITERAL", 
			"STRING_LITERAL", "ATRIBUICAO", "FIM_COMANDO", "ABRE_PARENTESES", "FECHA_PARENTESES", 
			"ABRE_CHAVES", "FECHA_CHAVES", "SEPARADOR_VARIAVEL", "SEPARADOR_VARIAVEL_TIPO", 
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
		public VariableDeclarationBlockContext variableDeclarationBlock() {
			return getRuleContext(VariableDeclarationBlockContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				variableDeclarationBlock();
				}
			}

			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				procedure();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROCEDIMENTO );
			setState(116);
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
		public ProcedureBlockContext procedureBlock() {
			return getRuleContext(ProcedureBlockContext.class,0);
		}
		public ProcedureInputContext procedureInput() {
			return getRuleContext(ProcedureInputContext.class,0);
		}
		public ProcedureOutputContext procedureOutput() {
			return getRuleContext(ProcedureOutputContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			procedureDeclaration();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTRADA) {
				{
				setState(119);
				procedureInput();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SAIDA) {
				{
				setState(122);
				procedureOutput();
				}
			}

			setState(125);
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
		enterRule(_localctx, 4, RULE_procedureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PROCEDIMENTO);
			setState(128);
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
		enterRule(_localctx, 6, RULE_procedureInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ENTRADA);
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(131);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					variableDeclaration();
					}
					}
					setState(135); 
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
		enterRule(_localctx, 8, RULE_procedureOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SAIDA);
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULO:
				{
				setState(140);
				match(NULO);
				}
				break;
			case ID:
				{
				setState(141);
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
		enterRule(_localctx, 10, RULE_procedureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(INICIO);
			setState(145);
			block();
			setState(146);
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
		enterRule(_localctx, 12, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(148);
				variableDeclarationBlock();
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(151);
						command();
						}
						break;
					case SE:
					case PARA:
					case REPITA:
					case ENQUANTO:
					case CASO:
						{
						setState(152);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 14, RULE_variableDeclarationBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(158);
					variableDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 16, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				function();
				}
				break;
			case 2:
				{
				setState(164);
				variableAssignment();
				}
				break;
			}
			setState(167);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				ifStatement();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				forStatement();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				whileStatement();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				doWhileStatement();
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
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
		enterRule(_localctx, 20, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ABRE_PARENTESES);
			setState(177);
			logicalOperation(0);
			setState(178);
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
		public List<ArithmeticOperationContext> arithmeticOperation() {
			return getRuleContexts(ArithmeticOperationContext.class);
		}
		public ArithmeticOperationContext arithmeticOperation(int i) {
			return getRuleContext(ArithmeticOperationContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
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
		enterRule(_localctx, 22, RULE_relationalOperation);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ABRE_PARENTESES);
				setState(181);
				relationalOperation();
				setState(182);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				arithmeticOperation(0);
				setState(185);
				relationalOperator();
				setState(186);
				arithmeticOperation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				characterExpression();
				setState(189);
				relationalOperator();
				setState(190);
				characterExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(196);
				match(ABRE_PARENTESES);
				setState(197);
				logicalOperation(0);
				setState(198);
				match(FECHA_PARENTESES);
				}
				break;
			case 2:
				{
				setState(200);
				unaryLogicalOperator();
				setState(201);
				logicalOperation(4);
				}
				break;
			case 3:
				{
				setState(203);
				booleanExpression();
				}
				break;
			case 4:
				{
				setState(204);
				relationalOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOperation);
					setState(207);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(208);
					binaryLogicalOperator();
					setState(209);
					logicalOperation(4);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ArithmeticOperationContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(pnpParser.ABRE_PARENTESES, 0); }
		public List<ArithmeticOperationContext> arithmeticOperation() {
			return getRuleContexts(ArithmeticOperationContext.class);
		}
		public ArithmeticOperationContext arithmeticOperation(int i) {
			return getRuleContext(ArithmeticOperationContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(pnpParser.FECHA_PARENTESES, 0); }
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public ArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pnpVisitor ) return ((pnpVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		return arithmeticOperation(0);
	}

	private ArithmeticOperationContext arithmeticOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, _parentState);
		ArithmeticOperationContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_arithmeticOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				{
				setState(217);
				match(ABRE_PARENTESES);
				setState(218);
				arithmeticOperation(0);
				setState(219);
				match(FECHA_PARENTESES);
				}
				break;
			case NATURAL_LITERAL:
			case INTEIRO_LITERAL:
			case RACIONAL_LITERAL:
			case ID:
				{
				setState(221);
				numericalExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperation);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						multiplicativeOperator();
						setState(226);
						arithmeticOperation(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticOperation);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						additiveOperator();
						setState(230);
						arithmeticOperation(3);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode ADICAO() { return getToken(pnpParser.ADICAO, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_concatenationOperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				{
				setState(238);
				match(ABRE_PARENTESES);
				setState(239);
				concatenationOperation(0);
				setState(240);
				match(FECHA_PARENTESES);
				}
				break;
			case CARACTERE_LITERAL:
			case STRING_LITERAL:
			case ID:
				{
				setState(242);
				characterExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatenationOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concatenationOperation);
					setState(245);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(246);
					match(ADICAO);
					setState(247);
					concatenationOperation(3);
					}
					} 
				}
				setState(252);
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

	public static class OperationContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
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
		enterRule(_localctx, 30, RULE_operation);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				arithmeticOperation(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				logicalOperation(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				relationalOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
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
		enterRule(_localctx, 32, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(260);
				match(SEPARADOR_VARIAVEL);
				setState(261);
				match(ID);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(268);
			type(0);
			setState(269);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(pnpParser.ATRIBUICAO, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ArrayDimentionContext arrayDimention() {
			return getRuleContext(ArrayDimentionContext.class,0);
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
		enterRule(_localctx, 34, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_CHAVES) {
				{
				setState(272);
				arrayDimention();
				}
			}

			setState(275);
			match(ATRIBUICAO);
			setState(276);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				booleanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				numericalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode BOOLEANO_LITERAL() { return getToken(pnpParser.BOOLEANO_LITERAL, 0); }
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
		enterRule(_localctx, 38, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANO_LITERAL || _la==ID) ) {
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

	public static class NumericalExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode NATURAL_LITERAL() { return getToken(pnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode INTEIRO_LITERAL() { return getToken(pnpParser.INTEIRO_LITERAL, 0); }
		public TerminalNode RACIONAL_LITERAL() { return getToken(pnpParser.RACIONAL_LITERAL, 0); }
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
		enterRule(_localctx, 40, RULE_numericalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << ID))) != 0)) ) {
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

	public static class CharacterExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode CARACTERE_LITERAL() { return getToken(pnpParser.CARACTERE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(pnpParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 42, RULE_characterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) ) {
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

	public static class FunctionContext extends ParserRuleContext {
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
		enterRule(_localctx, 44, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
			setState(290);
			match(ABRE_PARENTESES);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(291);
				params();
				}
			}

			setState(294);
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
		enterRule(_localctx, 46, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			expression();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(297);
				match(SEPARADOR_VARIAVEL);
				setState(298);
				expression();
				}
				}
				setState(303);
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
		enterRule(_localctx, 48, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			ifStart();
			setState(305);
			ifThen();
			setState(306);
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
		enterRule(_localctx, 50, RULE_ifStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SE);
			setState(309);
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
		enterRule(_localctx, 52, RULE_ifThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ENTAO);
			setState(312);
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
		enterRule(_localctx, 54, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(SENAO);
			setState(315);
			block();
			setState(316);
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
		enterRule(_localctx, 56, RULE_ifElseIf);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				elseIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				ifElse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
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
		enterRule(_localctx, 58, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SENAO);
			setState(324);
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
		enterRule(_localctx, 60, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			switchStart();
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327);
				switchCases();
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATURAL_LITERAL) | (1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0) );
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(332);
				switchDefault();
				}
			}

			setState(335);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
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
		enterRule(_localctx, 62, RULE_switchStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CASO);
			setState(338);
			match(ID);
			setState(339);
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
		enterRule(_localctx, 64, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expression();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR_VARIAVEL) {
				{
				{
				setState(342);
				match(SEPARADOR_VARIAVEL);
				setState(343);
				expression();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(SEPARADOR_VARIAVEL_TIPO);
			setState(350);
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
		enterRule(_localctx, 66, RULE_switchDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(SENAO);
			setState(353);
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
		enterRule(_localctx, 68, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			forStart();
			setState(356);
			forInterval();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(357);
				forStep();
				}
			}

			setState(360);
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
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
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
		enterRule(_localctx, 70, RULE_forStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(PARA);
			setState(363);
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
		enterRule(_localctx, 72, RULE_forInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(DE);
			setState(366);
			numericalExpression();
			setState(367);
			match(ATE);
			setState(368);
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
		enterRule(_localctx, 74, RULE_forStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(PASSO);
			setState(371);
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
		enterRule(_localctx, 76, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(REPITA);
			setState(374);
			block();
			setState(375);
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
		enterRule(_localctx, 78, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			whileStart();
			setState(378);
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
		enterRule(_localctx, 80, RULE_whileStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ENQUANTO);
			setState(381);
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
		enterRule(_localctx, 82, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(FACA);
			setState(384);
			block();
			setState(385);
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
		enterRule(_localctx, 84, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			doWhileBlock();
			setState(388);
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
		enterRule(_localctx, 86, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(REPITA);
			setState(391);
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
		enterRule(_localctx, 88, RULE_doWhileEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(ATE);
			setState(394);
			match(QUE);
			setState(395);
			statementCondition();
			setState(396);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(pnpParser.INTEIRO, 0); }
		public TerminalNode RACIONAL() { return getToken(pnpParser.RACIONAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(pnpParser.BOOLEANO, 0); }
		public TerminalNode CARACTERE() { return getToken(pnpParser.CARACTERE, 0); }
		public TerminalNode STRING() { return getToken(pnpParser.STRING, 0); }
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
				{
				setState(399);
				match(INTEIRO);
				}
				break;
			case RACIONAL:
				{
				setState(400);
				match(RACIONAL);
				}
				break;
			case BOOLEANO:
				{
				setState(401);
				match(BOOLEANO);
				}
				break;
			case CARACTERE:
				{
				setState(402);
				match(CARACTERE);
				}
				break;
			case STRING:
				{
				setState(403);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(406);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(407);
					arrayDimention();
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class ArrayDimentionContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVES() { return getToken(pnpParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(pnpParser.FECHA_CHAVES, 0); }
		public TerminalNode NATURAL_LITERAL() { return getToken(pnpParser.NATURAL_LITERAL, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
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
		enterRule(_localctx, 92, RULE_arrayDimention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(ABRE_CHAVES);
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==NATURAL_LITERAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(415);
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
		enterRule(_localctx, 94, RULE_binaryOperator);
		try {
			setState(420);
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
				setState(417);
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
				setState(418);
				arithmeticOperator();
				}
				break;
			case AND:
			case OR:
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
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
		public TerminalNode IGUALDADE() { return getToken(pnpParser.IGUALDADE, 0); }
		public TerminalNode DESIGUALDADE() { return getToken(pnpParser.DESIGUALDADE, 0); }
		public TerminalNode MAIOR() { return getToken(pnpParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(pnpParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(pnpParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(pnpParser.MENOR_IGUAL, 0); }
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
		enterRule(_localctx, 96, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALDADE) | (1L << DESIGUALDADE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_arithmeticOperator);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADICAO:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				additiveOperator();
				}
				break;
			case MULTIPLICACAO:
			case DIVISAO_RAC:
			case DIVISAO_INT:
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
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
		enterRule(_localctx, 100, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		public TerminalNode MULTIPLICACAO() { return getToken(pnpParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO_RAC() { return getToken(pnpParser.DIVISAO_RAC, 0); }
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
		enterRule(_localctx, 102, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACAO) | (1L << DIVISAO_RAC) | (1L << DIVISAO_INT) | (1L << MODULO))) != 0)) ) {
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
		enterRule(_localctx, 104, RULE_unaryLogicalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 106, RULE_binaryLogicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		case 12:
			return logicalOperation_sempred((LogicalOperationContext)_localctx, predIndex);
		case 13:
			return arithmeticOperation_sempred((ArithmeticOperationContext)_localctx, predIndex);
		case 14:
			return concatenationOperation_sempred((ConcatenationOperationContext)_localctx, predIndex);
		case 45:
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
	private boolean arithmeticOperation_sempred(ArithmeticOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean concatenationOperation_sempred(ConcatenationOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\5\2p\n\2\3\2\6\2s\n\2\r\2\16\2t"+
		"\3\2\3\2\3\3\3\3\5\3{\n\3\3\3\5\3~\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\6\5\u0088\n\5\r\5\16\5\u0089\5\5\u008c\n\5\3\6\3\6\3\6\5\6\u0091\n\6"+
		"\3\7\3\7\3\7\3\7\3\b\5\b\u0098\n\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f"+
		"\13\b\3\t\6\t\u00a2\n\t\r\t\16\t\u00a3\3\n\3\n\5\n\u00a8\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00d6\n\16\f\16\16\16\u00d9\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00e1\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00eb\n"+
		"\17\f\17\16\17\u00ee\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f6\n"+
		"\20\3\20\3\20\3\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21\3\21\3"+
		"\21\3\21\5\21\u0104\n\21\3\22\3\22\3\22\7\22\u0109\n\22\f\22\16\22\u010c"+
		"\13\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u0114\n\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u0127\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u012e\n\31\f\31\16"+
		"\31\u0131\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0144\n\36\3\37\3\37\3\37\3 \3 \6"+
		" \u014b\n \r \16 \u014c\3 \5 \u0150\n \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\7"+
		"\"\u015b\n\"\f\"\16\"\u015e\13\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\5$\u0169"+
		"\n$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3*"+
		"\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\5/\u0197\n/\3/\3/\7/\u019b\n/\f/\16/\u019e\13/\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\5\61\u01a7\n\61\3\62\3\62\3\63\3\63\5\63\u01ad\n\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\2\6\32\34\36\\8\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjl\2\n\4\2..99\4\2+-99\4\2/\6099\4\2++99\3\2\33 \3\2!\"\3\2#&\3\2\'"+
		")\2\u01b3\2o\3\2\2\2\4x\3\2\2\2\6\u0081\3\2\2\2\b\u0084\3\2\2\2\n\u008d"+
		"\3\2\2\2\f\u0092\3\2\2\2\16\u0097\3\2\2\2\20\u00a1\3\2\2\2\22\u00a7\3"+
		"\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2\2\2\30\u00c3\3\2\2\2\32\u00cf\3\2"+
		"\2\2\34\u00e0\3\2\2\2\36\u00f5\3\2\2\2 \u0103\3\2\2\2\"\u0105\3\2\2\2"+
		"$\u0111\3\2\2\2&\u011b\3\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,\u0121\3"+
		"\2\2\2.\u0123\3\2\2\2\60\u012a\3\2\2\2\62\u0132\3\2\2\2\64\u0136\3\2\2"+
		"\2\66\u0139\3\2\2\28\u013c\3\2\2\2:\u0143\3\2\2\2<\u0145\3\2\2\2>\u0148"+
		"\3\2\2\2@\u0153\3\2\2\2B\u0157\3\2\2\2D\u0162\3\2\2\2F\u0165\3\2\2\2H"+
		"\u016c\3\2\2\2J\u016f\3\2\2\2L\u0174\3\2\2\2N\u0177\3\2\2\2P\u017b\3\2"+
		"\2\2R\u017e\3\2\2\2T\u0181\3\2\2\2V\u0185\3\2\2\2X\u0188\3\2\2\2Z\u018b"+
		"\3\2\2\2\\\u0196\3\2\2\2^\u019f\3\2\2\2`\u01a6\3\2\2\2b\u01a8\3\2\2\2"+
		"d\u01ac\3\2\2\2f\u01ae\3\2\2\2h\u01b0\3\2\2\2j\u01b2\3\2\2\2l\u01b4\3"+
		"\2\2\2np\5\20\t\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\4\3\2rq\3\2\2\2st"+
		"\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\2\2\3w\3\3\2\2\2xz\5\6\4\2"+
		"y{\5\b\5\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5\n\6\2}|\3\2\2\2}~\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\5\f\7\2\u0080\5\3\2\2\2\u0081\u0082\7\3\2\2\u0082"+
		"\u0083\79\2\2\u0083\7\3\2\2\2\u0084\u008b\7\4\2\2\u0085\u008c\7\32\2\2"+
		"\u0086\u0088\5\"\22\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008c\t\3\2\2\2\u008d\u0090\7\5\2\2\u008e\u0091\7\32\2"+
		"\2\u008f\u0091\5\"\22\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\13\3\2\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\16\b\2\u0094\u0095\7\7\2"+
		"\2\u0095\r\3\2\2\2\u0096\u0098\5\20\t\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u009c\5\22\n\2\u009a\u009c\5\24\13"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\5\"\22\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a8\5.\30\2\u00a6"+
		"\u00a8\5$\23\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\7\62\2\2\u00aa\23\3\2\2\2\u00ab\u00b1\5\62\32\2\u00ac"+
		"\u00b1\5F$\2\u00ad\u00b1\5P)\2\u00ae\u00b1\5V,\2\u00af\u00b1\5> \2\u00b0"+
		"\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00af\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\63\2\2\u00b3\u00b4"+
		"\5\32\16\2\u00b4\u00b5\7\64\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7\63\2\2"+
		"\u00b7\u00b8\5\30\r\2\u00b8\u00b9\7\64\2\2\u00b9\u00c4\3\2\2\2\u00ba\u00bb"+
		"\5\34\17\2\u00bb\u00bc\5b\62\2\u00bc\u00bd\5\34\17\2\u00bd\u00c4\3\2\2"+
		"\2\u00be\u00bf\5,\27\2\u00bf\u00c0\5b\62\2\u00c0\u00c1\5,\27\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c4\5(\25\2\u00c3\u00b6\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\b\16\1"+
		"\2\u00c6\u00c7\7\63\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7\64\2\2\u00c9"+
		"\u00d0\3\2\2\2\u00ca\u00cb\5j\66\2\u00cb\u00cc\5\32\16\6\u00cc\u00d0\3"+
		"\2\2\2\u00cd\u00d0\5(\25\2\u00ce\u00d0\5\30\r\2\u00cf\u00c5\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d7\3\2"+
		"\2\2\u00d1\u00d2\f\5\2\2\u00d2\u00d3\5l\67\2\u00d3\u00d4\5\32\16\6\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\33\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db"+
		"\b\17\1\2\u00db\u00dc\7\63\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\64"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5*\26\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00ec\3\2\2\2\u00e2\u00e3\f\5\2\2\u00e3\u00e4\5h"+
		"\65\2\u00e4\u00e5\5\34\17\6\u00e5\u00eb\3\2\2\2\u00e6\u00e7\f\4\2\2\u00e7"+
		"\u00e8\5f\64\2\u00e8\u00e9\5\34\17\5\u00e9\u00eb\3\2\2\2\u00ea\u00e2\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\b\20\1"+
		"\2\u00f0\u00f1\7\63\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\64\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f6\5,\27\2\u00f5\u00ef\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\f\4\2\2\u00f8\u00f9\7!\2\2\u00f9"+
		"\u00fb\5\36\20\5\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0104\5\34\17\2\u0100\u0104\5\32\16\2\u0101\u0104\5\30\r\2\u0102\u0104"+
		"\5\36\20\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0102\3\2\2\2\u0104!\3\2\2\2\u0105\u010a\79\2\2\u0106\u0107\7\67"+
		"\2\2\u0107\u0109\79\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\78\2\2\u010e\u010f\5\\/\2\u010f\u0110\7\62\2\2\u0110"+
		"#\3\2\2\2\u0111\u0113\79\2\2\u0112\u0114\5^\60\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\61\2\2\u0116\u0117\5"+
		" \21\2\u0117%\3\2\2\2\u0118\u011c\5(\25\2\u0119\u011c\5*\26\2\u011a\u011c"+
		"\5,\27\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\'\3\2\2\2\u011d\u011e\t\2\2\2\u011e)\3\2\2\2\u011f\u0120\t\3\2\2\u0120"+
		"+\3\2\2\2\u0121\u0122\t\4\2\2\u0122-\3\2\2\2\u0123\u0124\79\2\2\u0124"+
		"\u0126\7\63\2\2\u0125\u0127\5\60\31\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\64\2\2\u0129/\3\2\2\2\u012a"+
		"\u012f\5&\24\2\u012b\u012c\7\67\2\2\u012c\u012e\5&\24\2\u012d\u012b\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\61\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\64\33\2\u0133\u0134\5\66"+
		"\34\2\u0134\u0135\5:\36\2\u0135\63\3\2\2\2\u0136\u0137\7\b\2\2\u0137\u0138"+
		"\5\26\f\2\u0138\65\3\2\2\2\u0139\u013a\7\t\2\2\u013a\u013b\5\16\b\2\u013b"+
		"\67\3\2\2\2\u013c\u013d\7\n\2\2\u013d\u013e\5\16\b\2\u013e\u013f\7\7\2"+
		"\2\u013f9\3\2\2\2\u0140\u0144\5<\37\2\u0141\u0144\58\35\2\u0142\u0144"+
		"\7\7\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		";\3\2\2\2\u0145\u0146\7\n\2\2\u0146\u0147\5\62\32\2\u0147=\3\2\2\2\u0148"+
		"\u014a\5@!\2\u0149\u014b\5B\"\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150"+
		"\5D#\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\7\7\2\2\u0152?\3\2\2\2\u0153\u0154\7\23\2\2\u0154\u0155\79\2\2"+
		"\u0155\u0156\7\24\2\2\u0156A\3\2\2\2\u0157\u015c\5&\24\2\u0158\u0159\7"+
		"\67\2\2\u0159\u015b\5&\24\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0160\78\2\2\u0160\u0161\5\16\b\2\u0161C\3\2\2\2\u0162\u0163"+
		"\7\n\2\2\u0163\u0164\5\16\b\2\u0164E\3\2\2\2\u0165\u0166\5H%\2\u0166\u0168"+
		"\5J&\2\u0167\u0169\5L\'\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\5N(\2\u016bG\3\2\2\2\u016c\u016d\7\13\2\2\u016d"+
		"\u016e\79\2\2\u016eI\3\2\2\2\u016f\u0170\7\f\2\2\u0170\u0171\5*\26\2\u0171"+
		"\u0172\7\r\2\2\u0172\u0173\5*\26\2\u0173K\3\2\2\2\u0174\u0175\7\16\2\2"+
		"\u0175\u0176\5*\26\2\u0176M\3\2\2\2\u0177\u0178\7\17\2\2\u0178\u0179\5"+
		"\16\b\2\u0179\u017a\7\7\2\2\u017aO\3\2\2\2\u017b\u017c\5R*\2\u017c\u017d"+
		"\5T+\2\u017dQ\3\2\2\2\u017e\u017f\7\20\2\2\u017f\u0180\5\26\f\2\u0180"+
		"S\3\2\2\2\u0181\u0182\7\21\2\2\u0182\u0183\5\16\b\2\u0183\u0184\7\7\2"+
		"\2\u0184U\3\2\2\2\u0185\u0186\5X-\2\u0186\u0187\5Z.\2\u0187W\3\2\2\2\u0188"+
		"\u0189\7\17\2\2\u0189\u018a\5\16\b\2\u018aY\3\2\2\2\u018b\u018c\7\r\2"+
		"\2\u018c\u018d\7\22\2\2\u018d\u018e\5\26\f\2\u018e\u018f\7\62\2\2\u018f"+
		"[\3\2\2\2\u0190\u0191\b/\1\2\u0191\u0197\7\25\2\2\u0192\u0197\7\26\2\2"+
		"\u0193\u0197\7\27\2\2\u0194\u0197\7\30\2\2\u0195\u0197\7\31\2\2\u0196"+
		"\u0190\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197\u019c\3\2\2\2\u0198\u0199\f\3\2\2\u0199"+
		"\u019b\5^\60\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d]\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0"+
		"\7\65\2\2\u01a0\u01a1\t\5\2\2\u01a1\u01a2\7\66\2\2\u01a2_\3\2\2\2\u01a3"+
		"\u01a7\5b\62\2\u01a4\u01a7\5d\63\2\u01a5\u01a7\5l\67\2\u01a6\u01a3\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7a\3\2\2\2\u01a8\u01a9"+
		"\t\6\2\2\u01a9c\3\2\2\2\u01aa\u01ad\5f\64\2\u01ab\u01ad\5h\65\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ade\3\2\2\2\u01ae\u01af\t\7\2\2"+
		"\u01afg\3\2\2\2\u01b0\u01b1\t\b\2\2\u01b1i\3\2\2\2\u01b2\u01b3\7*\2\2"+
		"\u01b3k\3\2\2\2\u01b4\u01b5\t\t\2\2\u01b5m\3\2\2\2&otz}\u0089\u008b\u0090"+
		"\u0097\u009b\u009d\u00a3\u00a7\u00b0\u00c3\u00cf\u00d7\u00e0\u00ea\u00ec"+
		"\u00f5\u00fc\u0103\u010a\u0113\u011b\u0126\u012f\u0143\u014c\u014f\u015c"+
		"\u0168\u0196\u019c\u01a6\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}