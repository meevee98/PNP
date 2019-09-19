// Generated from D:/Workspace/PNP/src/lexer/src/grammar\pnp.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PROCEDIMENTO=6, ENTRADA=7, SAIDA=8, 
		INICIO=9, FIM=10, SE=11, ENTAO=12, SENAO=13, PARA=14, DE=15, ATE=16, PASSO=17, 
		REPITA=18, ENQUANTO=19, FACA=20, INTEIRO=21, RACIONAL=22, BOOLEANO=23, 
		CARACTERE=24, STRING=25, NULO=26, IGUALDADE=27, DESIGUALDADE=28, MAIOR=29, 
		MAIOR_IGUAL=30, MENOR=31, MENOR_IGUAL=32, ADICAO=33, SUBTRACAO=34, MULTIPLICACAO=35, 
		DIVISAO_RAC=36, DIVISAO_INT=37, MODULO=38, AND=39, OR=40, XOR=41, NOT=42, 
		ATRIBUICAO=43, INTEIRO_LITERAL=44, RACIONAL_LITERAL=45, BOOLEANO_LITERAL=46, 
		CARACTERE_LITERAL=47, STRING_LITERAL=48, ID=49, WS=50;
	public static final int
		RULE_arquivo = 0, RULE_procedimento = 1, RULE_procedimento_declaracao = 2, 
		RULE_procedimento_entrada = 3, RULE_procedimento_saida = 4, RULE_procedimento_bloco = 5, 
		RULE_procedimento_variavel_declaracao = 6, RULE_bloco = 7, RULE_bloco_variavel_declaracao = 8, 
		RULE_comando = 9, RULE_statement = 10, RULE_operacao_relacional = 11, 
		RULE_operacao_logica = 12, RULE_operacao = 13, RULE_variavel_declaracao = 14, 
		RULE_variavel_atribuicao = 15, RULE_expressao = 16, RULE_expressao_booleana = 17, 
		RULE_funcao = 18, RULE_params = 19, RULE_se_statement = 20, RULE_se_inicio = 21, 
		RULE_se_entao = 22, RULE_se_senao = 23, RULE_se_senao_se = 24, RULE_senao_se = 25, 
		RULE_para_statement = 26, RULE_para_inicio = 27, RULE_para_intervalo = 28, 
		RULE_para_passo = 29, RULE_para_bloco = 30, RULE_enquanto_statement = 31, 
		RULE_enquanto_inicio = 32, RULE_enquanto_bloco = 33, RULE_tipo = 34, RULE_operador = 35, 
		RULE_operador_relacional = 36, RULE_operador_aritmetico = 37, RULE_operador_logico = 38, 
		RULE_valor_literal = 39, RULE_numero_literal = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"arquivo", "procedimento", "procedimento_declaracao", "procedimento_entrada", 
			"procedimento_saida", "procedimento_bloco", "procedimento_variavel_declaracao", 
			"bloco", "bloco_variavel_declaracao", "comando", "statement", "operacao_relacional", 
			"operacao_logica", "operacao", "variavel_declaracao", "variavel_atribuicao", 
			"expressao", "expressao_booleana", "funcao", "params", "se_statement", 
			"se_inicio", "se_entao", "se_senao", "se_senao_se", "senao_se", "para_statement", 
			"para_inicio", "para_intervalo", "para_passo", "para_bloco", "enquanto_statement", 
			"enquanto_inicio", "enquanto_bloco", "tipo", "operador", "operador_relacional", 
			"operador_aritmetico", "operador_logico", "valor_literal", "numero_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'('", "')'", "'procedimento'", "'entrada'", 
			"'saida'", "'inicio'", "'fim'", "'se'", "'entao'", "'senao'", "'para'", 
			"'de'", "'ate'", "'passo'", "'repita'", "'enquanto'", "'faca'", "'inteiro'", 
			"'racional'", "'booleano'", "'caractere'", "'string'", "'nulo'", "'='", 
			"'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'div'", 
			"'mod'", "'e'", "'ou'", "'xor'", "'nao'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PROCEDIMENTO", "ENTRADA", "SAIDA", 
			"INICIO", "FIM", "SE", "ENTAO", "SENAO", "PARA", "DE", "ATE", "PASSO", 
			"REPITA", "ENQUANTO", "FACA", "INTEIRO", "RACIONAL", "BOOLEANO", "CARACTERE", 
			"STRING", "NULO", "IGUALDADE", "DESIGUALDADE", "MAIOR", "MAIOR_IGUAL", 
			"MENOR", "MENOR_IGUAL", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO_RAC", 
			"DIVISAO_INT", "MODULO", "AND", "OR", "XOR", "NOT", "ATRIBUICAO", "INTEIRO_LITERAL", 
			"RACIONAL_LITERAL", "BOOLEANO_LITERAL", "CARACTERE_LITERAL", "STRING_LITERAL", 
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

	public static class ArquivoContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pnpParser.EOF, 0); }
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public ArquivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterArquivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitArquivo(this);
		}
	}

	public final ArquivoContext arquivo() throws RecognitionException {
		ArquivoContext _localctx = new ArquivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arquivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				procedimento();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROCEDIMENTO );
			setState(87);
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

	public static class ProcedimentoContext extends ParserRuleContext {
		public Procedimento_declaracaoContext procedimento_declaracao() {
			return getRuleContext(Procedimento_declaracaoContext.class,0);
		}
		public Procedimento_blocoContext procedimento_bloco() {
			return getRuleContext(Procedimento_blocoContext.class,0);
		}
		public Procedimento_entradaContext procedimento_entrada() {
			return getRuleContext(Procedimento_entradaContext.class,0);
		}
		public Procedimento_saidaContext procedimento_saida() {
			return getRuleContext(Procedimento_saidaContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			procedimento_declaracao();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTRADA) {
				{
				setState(90);
				procedimento_entrada();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SAIDA) {
				{
				setState(93);
				procedimento_saida();
				}
			}

			setState(96);
			procedimento_bloco();
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

	public static class Procedimento_declaracaoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(pnpParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public Procedimento_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento_declaracao(this);
		}
	}

	public final Procedimento_declaracaoContext procedimento_declaracao() throws RecognitionException {
		Procedimento_declaracaoContext _localctx = new Procedimento_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedimento_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PROCEDIMENTO);
			setState(99);
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

	public static class Procedimento_entradaContext extends ParserRuleContext {
		public TerminalNode ENTRADA() { return getToken(pnpParser.ENTRADA, 0); }
		public Procedimento_variavel_declaracaoContext procedimento_variavel_declaracao() {
			return getRuleContext(Procedimento_variavel_declaracaoContext.class,0);
		}
		public Procedimento_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento_entrada(this);
		}
	}

	public final Procedimento_entradaContext procedimento_entrada() throws RecognitionException {
		Procedimento_entradaContext _localctx = new Procedimento_entradaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedimento_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ENTRADA);
			setState(102);
			procedimento_variavel_declaracao();
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

	public static class Procedimento_saidaContext extends ParserRuleContext {
		public TerminalNode SAIDA() { return getToken(pnpParser.SAIDA, 0); }
		public Procedimento_variavel_declaracaoContext procedimento_variavel_declaracao() {
			return getRuleContext(Procedimento_variavel_declaracaoContext.class,0);
		}
		public Procedimento_saidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento_saida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento_saida(this);
		}
	}

	public final Procedimento_saidaContext procedimento_saida() throws RecognitionException {
		Procedimento_saidaContext _localctx = new Procedimento_saidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimento_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(SAIDA);
			setState(105);
			procedimento_variavel_declaracao();
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

	public static class Procedimento_blocoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(pnpParser.INICIO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public Procedimento_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento_bloco(this);
		}
	}

	public final Procedimento_blocoContext procedimento_bloco() throws RecognitionException {
		Procedimento_blocoContext _localctx = new Procedimento_blocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedimento_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(INICIO);
			setState(108);
			bloco();
			setState(109);
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

	public static class Procedimento_variavel_declaracaoContext extends ParserRuleContext {
		public List<Variavel_declaracaoContext> variavel_declaracao() {
			return getRuleContexts(Variavel_declaracaoContext.class);
		}
		public Variavel_declaracaoContext variavel_declaracao(int i) {
			return getRuleContext(Variavel_declaracaoContext.class,i);
		}
		public Procedimento_variavel_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento_variavel_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterProcedimento_variavel_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitProcedimento_variavel_declaracao(this);
		}
	}

	public final Procedimento_variavel_declaracaoContext procedimento_variavel_declaracao() throws RecognitionException {
		Procedimento_variavel_declaracaoContext _localctx = new Procedimento_variavel_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedimento_variavel_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				variavel_declaracao();
				setState(112);
				match(T__0);
				}
				}
				setState(116); 
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

	public static class BlocoContext extends ParserRuleContext {
		public List<Bloco_variavel_declaracaoContext> bloco_variavel_declaracao() {
			return getRuleContexts(Bloco_variavel_declaracaoContext.class);
		}
		public Bloco_variavel_declaracaoContext bloco_variavel_declaracao(int i) {
			return getRuleContext(Bloco_variavel_declaracaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					bloco_variavel_declaracao();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << PARA) | (1L << ENQUANTO) | (1L << ID))) != 0)) {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(124);
					comando();
					}
					break;
				case SE:
				case PARA:
				case ENQUANTO:
					{
					setState(125);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(130);
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

	public static class Bloco_variavel_declaracaoContext extends ParserRuleContext {
		public Variavel_declaracaoContext variavel_declaracao() {
			return getRuleContext(Variavel_declaracaoContext.class,0);
		}
		public Bloco_variavel_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_variavel_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterBloco_variavel_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitBloco_variavel_declaracao(this);
		}
	}

	public final Bloco_variavel_declaracaoContext bloco_variavel_declaracao() throws RecognitionException {
		Bloco_variavel_declaracaoContext _localctx = new Bloco_variavel_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloco_variavel_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			variavel_declaracao();
			setState(132);
			match(T__0);
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

	public static class ComandoContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Variavel_atribuicaoContext variavel_atribuicao() {
			return getRuleContext(Variavel_atribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(134);
				funcao();
				}
				break;
			case 2:
				{
				setState(135);
				variavel_atribuicao();
				}
				break;
			}
			setState(138);
			match(T__0);
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

	public static class StatementContext extends ParserRuleContext {
		public Se_statementContext se_statement() {
			return getRuleContext(Se_statementContext.class,0);
		}
		public Para_statementContext para_statement() {
			return getRuleContext(Para_statementContext.class,0);
		}
		public Enquanto_statementContext enquanto_statement() {
			return getRuleContext(Enquanto_statementContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				se_statement();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				para_statement();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				enquanto_statement();
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

	public static class Operacao_relacionalContext extends ParserRuleContext {
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public Operacao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperacao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperacao_relacional(this);
		}
	}

	public final Operacao_relacionalContext operacao_relacional() throws RecognitionException {
		Operacao_relacionalContext _localctx = new Operacao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacao_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			operacao();
			setState(146);
			operador_relacional();
			setState(147);
			operacao();
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

	public static class Operacao_logicaContext extends ParserRuleContext {
		public List<OperacaoContext> operacao() {
			return getRuleContexts(OperacaoContext.class);
		}
		public OperacaoContext operacao(int i) {
			return getRuleContext(OperacaoContext.class,i);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Operacao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperacao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperacao_logica(this);
		}
	}

	public final Operacao_logicaContext operacao_logica() throws RecognitionException {
		Operacao_logicaContext _localctx = new Operacao_logicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacao_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			operacao();
			setState(150);
			operador_logico();
			setState(151);
			operacao();
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

	public static class OperacaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operacao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expressao();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					operador();
					setState(155);
					expressao();
					}
					} 
				}
				setState(161);
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

	public static class Variavel_declaracaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pnpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pnpParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Variavel_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariavel_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariavel_declaracao(this);
		}
	}

	public final Variavel_declaracaoContext variavel_declaracao() throws RecognitionException {
		Variavel_declaracaoContext _localctx = new Variavel_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variavel_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(163);
				match(T__1);
				setState(164);
				match(ID);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__2);
			setState(171);
			tipo();
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

	public static class Variavel_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(pnpParser.ATRIBUICAO, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public Variavel_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterVariavel_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitVariavel_atribuicao(this);
		}
	}

	public final Variavel_atribuicaoContext variavel_atribuicao() throws RecognitionException {
		Variavel_atribuicaoContext _localctx = new Variavel_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variavel_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			match(ATRIBUICAO);
			setState(175);
			operacao();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public Valor_literalContext valor_literal() {
			return getRuleContext(Valor_literalContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressao);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				valor_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				funcao();
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

	public static class Expressao_booleanaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public TerminalNode BOOLEANO_LITERAL() { return getToken(pnpParser.BOOLEANO_LITERAL, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Operacao_relacionalContext operacao_relacional() {
			return getRuleContext(Operacao_relacionalContext.class,0);
		}
		public Operacao_logicaContext operacao_logica() {
			return getRuleContext(Operacao_logicaContext.class,0);
		}
		public Expressao_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterExpressao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitExpressao_booleana(this);
		}
	}

	public final Expressao_booleanaContext expressao_booleana() throws RecognitionException {
		Expressao_booleanaContext _localctx = new Expressao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao_booleana);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(BOOLEANO_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				funcao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				operacao_relacional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				operacao_logica();
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(T__3);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(191);
				params();
				}
			}

			setState(194);
			match(T__4);
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			expressao();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(197);
				match(T__1);
				setState(198);
				expressao();
				}
				}
				setState(203);
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

	public static class Se_statementContext extends ParserRuleContext {
		public Se_inicioContext se_inicio() {
			return getRuleContext(Se_inicioContext.class,0);
		}
		public Se_entaoContext se_entao() {
			return getRuleContext(Se_entaoContext.class,0);
		}
		public Se_senao_seContext se_senao_se() {
			return getRuleContext(Se_senao_seContext.class,0);
		}
		public Se_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSe_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSe_statement(this);
		}
	}

	public final Se_statementContext se_statement() throws RecognitionException {
		Se_statementContext _localctx = new Se_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_se_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			se_inicio();
			setState(205);
			se_entao();
			setState(206);
			se_senao_se();
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

	public static class Se_inicioContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(pnpParser.SE, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public Se_inicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSe_inicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSe_inicio(this);
		}
	}

	public final Se_inicioContext se_inicio() throws RecognitionException {
		Se_inicioContext _localctx = new Se_inicioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_se_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SE);
			setState(209);
			match(T__3);
			setState(210);
			expressao_booleana();
			setState(211);
			match(T__4);
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

	public static class Se_entaoContext extends ParserRuleContext {
		public TerminalNode ENTAO() { return getToken(pnpParser.ENTAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Se_entaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_entao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSe_entao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSe_entao(this);
		}
	}

	public final Se_entaoContext se_entao() throws RecognitionException {
		Se_entaoContext _localctx = new Se_entaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_se_entao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ENTAO);
			setState(214);
			bloco();
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

	public static class Se_senaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(pnpParser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public Se_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSe_senao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSe_senao(this);
		}
	}

	public final Se_senaoContext se_senao() throws RecognitionException {
		Se_senaoContext _localctx = new Se_senaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_se_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SENAO);
			setState(217);
			bloco();
			setState(218);
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

	public static class Se_senao_seContext extends ParserRuleContext {
		public Senao_seContext senao_se() {
			return getRuleContext(Senao_seContext.class,0);
		}
		public Se_senaoContext se_senao() {
			return getRuleContext(Se_senaoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public Se_senao_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_senao_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSe_senao_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSe_senao_se(this);
		}
	}

	public final Se_senao_seContext se_senao_se() throws RecognitionException {
		Se_senao_seContext _localctx = new Se_senao_seContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_se_senao_se);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				senao_se();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				se_senao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
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

	public static class Senao_seContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(pnpParser.SENAO, 0); }
		public Se_statementContext se_statement() {
			return getRuleContext(Se_statementContext.class,0);
		}
		public Senao_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterSenao_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitSenao_se(this);
		}
	}

	public final Senao_seContext senao_se() throws RecognitionException {
		Senao_seContext _localctx = new Senao_seContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_senao_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(SENAO);
			setState(226);
			se_statement();
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

	public static class Para_statementContext extends ParserRuleContext {
		public Para_inicioContext para_inicio() {
			return getRuleContext(Para_inicioContext.class,0);
		}
		public Para_intervaloContext para_intervalo() {
			return getRuleContext(Para_intervaloContext.class,0);
		}
		public Para_blocoContext para_bloco() {
			return getRuleContext(Para_blocoContext.class,0);
		}
		public Para_passoContext para_passo() {
			return getRuleContext(Para_passoContext.class,0);
		}
		public Para_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPara_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPara_statement(this);
		}
	}

	public final Para_statementContext para_statement() throws RecognitionException {
		Para_statementContext _localctx = new Para_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_para_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			para_inicio();
			setState(229);
			para_intervalo();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(230);
				para_passo();
				}
			}

			setState(233);
			para_bloco();
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

	public static class Para_inicioContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(pnpParser.PARA, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public Para_inicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPara_inicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPara_inicio(this);
		}
	}

	public final Para_inicioContext para_inicio() throws RecognitionException {
		Para_inicioContext _localctx = new Para_inicioContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_para_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PARA);
			setState(236);
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

	public static class Para_intervaloContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(pnpParser.DE, 0); }
		public TerminalNode ATE() { return getToken(pnpParser.ATE, 0); }
		public List<TerminalNode> ID() { return getTokens(pnpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pnpParser.ID, i);
		}
		public List<Numero_literalContext> numero_literal() {
			return getRuleContexts(Numero_literalContext.class);
		}
		public Numero_literalContext numero_literal(int i) {
			return getRuleContext(Numero_literalContext.class,i);
		}
		public Para_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPara_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPara_intervalo(this);
		}
	}

	public final Para_intervaloContext para_intervalo() throws RecognitionException {
		Para_intervaloContext _localctx = new Para_intervaloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_para_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DE);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(239);
				match(ID);
				}
				break;
			case INTEIRO_LITERAL:
			case RACIONAL_LITERAL:
				{
				setState(240);
				numero_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			match(ATE);
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(244);
				match(ID);
				}
				break;
			case INTEIRO_LITERAL:
			case RACIONAL_LITERAL:
				{
				setState(245);
				numero_literal();
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

	public static class Para_passoContext extends ParserRuleContext {
		public TerminalNode PASSO() { return getToken(pnpParser.PASSO, 0); }
		public TerminalNode ID() { return getToken(pnpParser.ID, 0); }
		public Numero_literalContext numero_literal() {
			return getRuleContext(Numero_literalContext.class,0);
		}
		public Para_passoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_passo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPara_passo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPara_passo(this);
		}
	}

	public final Para_passoContext para_passo() throws RecognitionException {
		Para_passoContext _localctx = new Para_passoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_para_passo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(PASSO);
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(249);
				match(ID);
				}
				break;
			case INTEIRO_LITERAL:
			case RACIONAL_LITERAL:
				{
				setState(250);
				numero_literal();
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

	public static class Para_blocoContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(pnpParser.REPITA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public Para_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterPara_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitPara_bloco(this);
		}
	}

	public final Para_blocoContext para_bloco() throws RecognitionException {
		Para_blocoContext _localctx = new Para_blocoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_para_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(REPITA);
			setState(254);
			bloco();
			setState(255);
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

	public static class Enquanto_statementContext extends ParserRuleContext {
		public Enquanto_inicioContext enquanto_inicio() {
			return getRuleContext(Enquanto_inicioContext.class,0);
		}
		public Enquanto_blocoContext enquanto_bloco() {
			return getRuleContext(Enquanto_blocoContext.class,0);
		}
		public Enquanto_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterEnquanto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitEnquanto_statement(this);
		}
	}

	public final Enquanto_statementContext enquanto_statement() throws RecognitionException {
		Enquanto_statementContext _localctx = new Enquanto_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enquanto_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			enquanto_inicio();
			setState(258);
			enquanto_bloco();
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

	public static class Enquanto_inicioContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(pnpParser.ENQUANTO, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public Enquanto_inicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterEnquanto_inicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitEnquanto_inicio(this);
		}
	}

	public final Enquanto_inicioContext enquanto_inicio() throws RecognitionException {
		Enquanto_inicioContext _localctx = new Enquanto_inicioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enquanto_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ENQUANTO);
			setState(261);
			match(T__3);
			setState(262);
			expressao_booleana();
			setState(263);
			match(T__4);
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

	public static class Enquanto_blocoContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(pnpParser.FACA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(pnpParser.FIM, 0); }
		public Enquanto_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterEnquanto_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitEnquanto_bloco(this);
		}
	}

	public final Enquanto_blocoContext enquanto_bloco() throws RecognitionException {
		Enquanto_blocoContext _localctx = new Enquanto_blocoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enquanto_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FACA);
			setState(266);
			bloco();
			setState(267);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(pnpParser.INTEIRO, 0); }
		public TerminalNode RACIONAL() { return getToken(pnpParser.RACIONAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(pnpParser.BOOLEANO, 0); }
		public TerminalNode CARACTERE() { return getToken(pnpParser.CARACTERE, 0); }
		public TerminalNode STRING() { return getToken(pnpParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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

	public static class OperadorContext extends ParserRuleContext {
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operador);
		try {
			setState(274);
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
				setState(271);
				operador_relacional();
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
				setState(272);
				operador_aritmetico();
				}
				break;
			case AND:
			case OR:
			case XOR:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				operador_logico();
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

	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUALDADE() { return getToken(pnpParser.IGUALDADE, 0); }
		public TerminalNode DESIGUALDADE() { return getToken(pnpParser.DESIGUALDADE, 0); }
		public TerminalNode MAIOR() { return getToken(pnpParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(pnpParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(pnpParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(pnpParser.MENOR_IGUAL, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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

	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(pnpParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(pnpParser.SUBTRACAO, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(pnpParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO_INT() { return getToken(pnpParser.DIVISAO_INT, 0); }
		public TerminalNode DIVISAO_RAC() { return getToken(pnpParser.DIVISAO_RAC, 0); }
		public TerminalNode MODULO() { return getToken(pnpParser.MODULO, 0); }
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADICAO) | (1L << SUBTRACAO) | (1L << MULTIPLICACAO) | (1L << DIVISAO_RAC) | (1L << DIVISAO_INT) | (1L << MODULO))) != 0)) ) {
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

	public static class Operador_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(pnpParser.AND, 0); }
		public TerminalNode OR() { return getToken(pnpParser.OR, 0); }
		public TerminalNode XOR() { return getToken(pnpParser.XOR, 0); }
		public TerminalNode NOT() { return getToken(pnpParser.NOT, 0); }
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR) | (1L << NOT))) != 0)) ) {
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

	public static class Valor_literalContext extends ParserRuleContext {
		public TerminalNode INTEIRO_LITERAL() { return getToken(pnpParser.INTEIRO_LITERAL, 0); }
		public TerminalNode RACIONAL_LITERAL() { return getToken(pnpParser.RACIONAL_LITERAL, 0); }
		public TerminalNode BOOLEANO_LITERAL() { return getToken(pnpParser.BOOLEANO_LITERAL, 0); }
		public TerminalNode CARACTERE_LITERAL() { return getToken(pnpParser.CARACTERE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(pnpParser.STRING_LITERAL, 0); }
		public Valor_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterValor_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitValor_literal(this);
		}
	}

	public final Valor_literalContext valor_literal() throws RecognitionException {
		Valor_literalContext _localctx = new Valor_literalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_valor_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO_LITERAL) | (1L << RACIONAL_LITERAL) | (1L << BOOLEANO_LITERAL) | (1L << CARACTERE_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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

	public static class Numero_literalContext extends ParserRuleContext {
		public TerminalNode INTEIRO_LITERAL() { return getToken(pnpParser.INTEIRO_LITERAL, 0); }
		public TerminalNode RACIONAL_LITERAL() { return getToken(pnpParser.RACIONAL_LITERAL, 0); }
		public Numero_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).enterNumero_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pnpListener ) ((pnpListener)listener).exitNumero_literal(this);
		}
	}

	public final Numero_literalContext numero_literal() throws RecognitionException {
		Numero_literalContext _localctx = new Numero_literalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_numero_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==INTEIRO_LITERAL || _la==RACIONAL_LITERAL) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0121\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\6\2"+
		"V\n\2\r\2\16\2W\3\2\3\2\3\3\3\3\5\3^\n\3\3\3\5\3a\n\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bu\n\b\r\b"+
		"\16\bv\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084"+
		"\13\t\3\n\3\n\3\n\3\13\3\13\5\13\u008b\n\13\3\13\3\13\3\f\3\f\3\f\5\f"+
		"\u0092\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17"+
		"\u00a0\n\17\f\17\16\17\u00a3\13\17\3\20\3\20\3\20\7\20\u00a8\n\20\f\20"+
		"\16\20\u00ab\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5"+
		"\22\u00b7\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00be\n\23\3\24\3\24\3\24"+
		"\5\24\u00c3\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u00ca\n\25\f\25\16\25\u00cd"+
		"\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u00e2\n\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\5\34\u00ea\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u00f4"+
		"\n\36\3\36\3\36\3\36\5\36\u00f9\n\36\3\37\3\37\3\37\5\37\u00fe\n\37\3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\5%"+
		"\u0115\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\b\3\2\27\33\3"+
		"\2\35\"\3\2#(\3\2),\3\2.\62\3\2./\2\u0113\2U\3\2\2\2\4[\3\2\2\2\6d\3\2"+
		"\2\2\bg\3\2\2\2\nj\3\2\2\2\fm\3\2\2\2\16t\3\2\2\2\20{\3\2\2\2\22\u0085"+
		"\3\2\2\2\24\u008a\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32\u0097\3"+
		"\2\2\2\34\u009b\3\2\2\2\36\u00a4\3\2\2\2 \u00af\3\2\2\2\"\u00b6\3\2\2"+
		"\2$\u00bd\3\2\2\2&\u00bf\3\2\2\2(\u00c6\3\2\2\2*\u00ce\3\2\2\2,\u00d2"+
		"\3\2\2\2.\u00d7\3\2\2\2\60\u00da\3\2\2\2\62\u00e1\3\2\2\2\64\u00e3\3\2"+
		"\2\2\66\u00e6\3\2\2\28\u00ed\3\2\2\2:\u00f0\3\2\2\2<\u00fa\3\2\2\2>\u00ff"+
		"\3\2\2\2@\u0103\3\2\2\2B\u0106\3\2\2\2D\u010b\3\2\2\2F\u010f\3\2\2\2H"+
		"\u0114\3\2\2\2J\u0116\3\2\2\2L\u0118\3\2\2\2N\u011a\3\2\2\2P\u011c\3\2"+
		"\2\2R\u011e\3\2\2\2TV\5\4\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2YZ\7\2\2\3Z\3\3\2\2\2[]\5\6\4\2\\^\5\b\5\2]\\\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_a\5\n\6\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\f\7\2c\5\3"+
		"\2\2\2de\7\b\2\2ef\7\63\2\2f\7\3\2\2\2gh\7\t\2\2hi\5\16\b\2i\t\3\2\2\2"+
		"jk\7\n\2\2kl\5\16\b\2l\13\3\2\2\2mn\7\13\2\2no\5\20\t\2op\7\f\2\2p\r\3"+
		"\2\2\2qr\5\36\20\2rs\7\3\2\2su\3\2\2\2tq\3\2\2\2uv\3\2\2\2vt\3\2\2\2v"+
		"w\3\2\2\2w\17\3\2\2\2xz\5\22\n\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\u0082\3\2\2\2}{\3\2\2\2~\u0081\5\24\13\2\177\u0081\5\26\f\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\36\20"+
		"\2\u0086\u0087\7\3\2\2\u0087\23\3\2\2\2\u0088\u008b\5&\24\2\u0089\u008b"+
		"\5 \21\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\3\2\2\u008d\25\3\2\2\2\u008e\u0092\5*\26\2\u008f\u0092\5\66\34"+
		"\2\u0090\u0092\5@!\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\5\34\17\2\u0094\u0095\5J&\2\u0095"+
		"\u0096\5\34\17\2\u0096\31\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\5"+
		"N(\2\u0099\u009a\5\34\17\2\u009a\33\3\2\2\2\u009b\u00a1\5\"\22\2\u009c"+
		"\u009d\5H%\2\u009d\u009e\5\"\22\2\u009e\u00a0\3\2\2\2\u009f\u009c\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\35\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a9\7\63\2\2\u00a5\u00a6\7\4\2"+
		"\2\u00a6\u00a8\7\63\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\7\5\2\2\u00ad\u00ae\5F$\2\u00ae\37\3\2\2\2\u00af\u00b0"+
		"\7\63\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\5\34\17\2\u00b2!\3\2\2\2\u00b3"+
		"\u00b7\7\63\2\2\u00b4\u00b7\5P)\2\u00b5\u00b7\5&\24\2\u00b6\u00b3\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00be"+
		"\7\63\2\2\u00b9\u00be\7\60\2\2\u00ba\u00be\5&\24\2\u00bb\u00be\5\30\r"+
		"\2\u00bc\u00be\5\32\16\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be%\3\2\2\2"+
		"\u00bf\u00c0\7\63\2\2\u00c0\u00c2\7\6\2\2\u00c1\u00c3\5(\25\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\7\2\2\u00c5"+
		"\'\3\2\2\2\u00c6\u00cb\5\"\22\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5\"\22"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5,\27\2\u00cf"+
		"\u00d0\5.\30\2\u00d0\u00d1\5\62\32\2\u00d1+\3\2\2\2\u00d2\u00d3\7\r\2"+
		"\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d6\7\7\2\2\u00d6-"+
		"\3\2\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\5\20\t\2\u00d9/\3\2\2\2\u00da"+
		"\u00db\7\17\2\2\u00db\u00dc\5\20\t\2\u00dc\u00dd\7\f\2\2\u00dd\61\3\2"+
		"\2\2\u00de\u00e2\5\64\33\2\u00df\u00e2\5\60\31\2\u00e0\u00e2\7\f\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\63\3\2\2"+
		"\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5\5*\26\2\u00e5\65\3\2\2\2\u00e6\u00e7"+
		"\58\35\2\u00e7\u00e9\5:\36\2\u00e8\u00ea\5<\37\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5> \2\u00ec\67\3\2\2\2"+
		"\u00ed\u00ee\7\20\2\2\u00ee\u00ef\7\63\2\2\u00ef9\3\2\2\2\u00f0\u00f3"+
		"\7\21\2\2\u00f1\u00f4\7\63\2\2\u00f2\u00f4\5R*\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\7\22\2\2\u00f6\u00f9\7"+
		"\63\2\2\u00f7\u00f9\5R*\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		";\3\2\2\2\u00fa\u00fd\7\23\2\2\u00fb\u00fe\7\63\2\2\u00fc\u00fe\5R*\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe=\3\2\2\2\u00ff\u0100\7"+
		"\24\2\2\u0100\u0101\5\20\t\2\u0101\u0102\7\f\2\2\u0102?\3\2\2\2\u0103"+
		"\u0104\5B\"\2\u0104\u0105\5D#\2\u0105A\3\2\2\2\u0106\u0107\7\25\2\2\u0107"+
		"\u0108\7\6\2\2\u0108\u0109\5$\23\2\u0109\u010a\7\7\2\2\u010aC\3\2\2\2"+
		"\u010b\u010c\7\26\2\2\u010c\u010d\5\20\t\2\u010d\u010e\7\f\2\2\u010eE"+
		"\3\2\2\2\u010f\u0110\t\2\2\2\u0110G\3\2\2\2\u0111\u0115\5J&\2\u0112\u0115"+
		"\5L\'\2\u0113\u0115\5N(\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115I\3\2\2\2\u0116\u0117\t\3\2\2\u0117K\3\2\2\2\u0118"+
		"\u0119\t\4\2\2\u0119M\3\2\2\2\u011a\u011b\t\5\2\2\u011bO\3\2\2\2\u011c"+
		"\u011d\t\6\2\2\u011dQ\3\2\2\2\u011e\u011f\t\7\2\2\u011fS\3\2\2\2\27W]"+
		"`v{\u0080\u0082\u008a\u0091\u00a1\u00a9\u00b6\u00bd\u00c2\u00cb\u00e1"+
		"\u00e9\u00f3\u00f8\u00fd\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}