// Generated from C:/Workspace/PNP/src/main/kotlin/br/com/pnp/grammar\Pnp.g4 by ANTLR 4.7.2
package br.com.pnp.grammar.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PnpLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROCEDIMENTO", "ENTRADA", "SAIDA", "INICIO", "FIM", "SE", "ENTAO", "SENAO", 
			"PARA", "DE", "ATE", "PASSO", "REPITA", "ENQUANTO", "FACA", "QUE", "CASO", 
			"SEJA", "TIPO", "PRINCIPAL", "ESCREVA", "LEIA", "INTEIRO", "RACIONAL", 
			"BOOLEANO", "CARACTERE", "STRING", "NULO", "IGUALDADE", "DESIGUALDADE", 
			"MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", "ADICAO", "SUBTRACAO", 
			"MULTIPLICACAO", "DIVISAO_RAC", "DIVISAO_INT", "MODULO", "CONCATENACAO", 
			"AND", "OR", "XOR", "NOT", "NATURAL_LITERAL", "INTEIRO_LITERAL", "RACIONAL_LITERAL", 
			"BOOLEANO_LITERAL", "CARACTERE_LITERAL", "STRING_LITERAL", "ATRIBUICAO", 
			"FIM_COMANDO", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVES", 
			"FECHA_CHAVES", "SEPARADOR_VARIAVEL", "SEPARADOR_VARIAVEL_TIPO", "SEPARADOR_TIPO_VARIAVEL", 
			"SINAL", "ZERO", "NAO_ZERO", "DIGITO", "ALFA", "CARACTER", "ESCAPE", 
			"ID", "WS"
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


	public PnpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pnp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u022d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3/\7/\u0176\n/\f/\16/\u0179\13/\3/\3/\7/\u017d\n/\f/\16/"+
		"\u0180\13/\3\60\6\60\u0183\n\60\r\60\16\60\u0184\3\60\5\60\u0188\n\60"+
		"\3\60\7\60\u018b\n\60\f\60\16\60\u018e\13\60\3\60\3\60\7\60\u0192\n\60"+
		"\f\60\16\60\u0195\13\60\5\60\u0197\n\60\3\61\6\61\u019a\n\61\r\61\16\61"+
		"\u019b\3\61\3\61\6\61\u01a0\n\61\r\61\16\61\u01a1\3\61\5\61\u01a5\n\61"+
		"\3\61\7\61\u01a8\n\61\f\61\16\61\u01ab\13\61\3\61\3\61\7\61\u01af\n\61"+
		"\f\61\16\61\u01b2\13\61\3\61\3\61\6\61\u01b6\n\61\r\61\16\61\u01b7\3\61"+
		"\5\61\u01bb\n\61\3\61\6\61\u01be\n\61\r\61\16\61\u01bf\3\61\3\61\7\61"+
		"\u01c4\n\61\f\61\16\61\u01c7\13\61\3\61\3\61\7\61\u01cb\n\61\f\61\16\61"+
		"\u01ce\13\61\5\61\u01d0\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u01db\n\62\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u01e3\n\64\f\64"+
		"\16\64\u01e6\13\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\5A\u0205\nA\3B"+
		"\3B\3C\3C\5C\u020b\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u021d\nD\3E\3E\3E\7E\u0222\nE\fE\16E\u0225\13E\3F\6F\u0228\nF\rF\16"+
		"F\u0229\3F\3F\3\u01e4\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{\2}\2\177\2\u0081\2\u0083\2\u0085\2"+
		"\u0087\2\u0089?\u008b@\3\2\7\4\2--//\3\2\63;\5\2C\\aac|\6\2\f\f\17\17"+
		"))^^\5\2\13\f\17\17\"\"\2\u0246\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d"+
		"\3\2\2\2\5\u009a\3\2\2\2\7\u00a2\3\2\2\2\t\u00a8\3\2\2\2\13\u00af\3\2"+
		"\2\2\r\u00b3\3\2\2\2\17\u00b6\3\2\2\2\21\u00bc\3\2\2\2\23\u00c2\3\2\2"+
		"\2\25\u00c7\3\2\2\2\27\u00ca\3\2\2\2\31\u00ce\3\2\2\2\33\u00d4\3\2\2\2"+
		"\35\u00db\3\2\2\2\37\u00e4\3\2\2\2!\u00e9\3\2\2\2#\u00ed\3\2\2\2%\u00f2"+
		"\3\2\2\2\'\u00f7\3\2\2\2)\u00fc\3\2\2\2+\u0106\3\2\2\2-\u010e\3\2\2\2"+
		"/\u0113\3\2\2\2\61\u011b\3\2\2\2\63\u0124\3\2\2\2\65\u012d\3\2\2\2\67"+
		"\u0137\3\2\2\29\u013e\3\2\2\2;\u0145\3\2\2\2=\u0147\3\2\2\2?\u014a\3\2"+
		"\2\2A\u014c\3\2\2\2C\u014f\3\2\2\2E\u0151\3\2\2\2G\u0154\3\2\2\2I\u0156"+
		"\3\2\2\2K\u0158\3\2\2\2M\u015a\3\2\2\2O\u015c\3\2\2\2Q\u0160\3\2\2\2S"+
		"\u0164\3\2\2\2U\u0167\3\2\2\2W\u0169\3\2\2\2Y\u016c\3\2\2\2[\u0170\3\2"+
		"\2\2]\u0177\3\2\2\2_\u0196\3\2\2\2a\u01cf\3\2\2\2c\u01da\3\2\2\2e\u01dc"+
		"\3\2\2\2g\u01e0\3\2\2\2i\u01e9\3\2\2\2k\u01ec\3\2\2\2m\u01ee\3\2\2\2o"+
		"\u01f0\3\2\2\2q\u01f2\3\2\2\2s\u01f4\3\2\2\2u\u01f6\3\2\2\2w\u01f8\3\2"+
		"\2\2y\u01fa\3\2\2\2{\u01fc\3\2\2\2}\u01fe\3\2\2\2\177\u0200\3\2\2\2\u0081"+
		"\u0204\3\2\2\2\u0083\u0206\3\2\2\2\u0085\u020a\3\2\2\2\u0087\u021c\3\2"+
		"\2\2\u0089\u021e\3\2\2\2\u008b\u0227\3\2\2\2\u008d\u008e\7r\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090\u0091\7e\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7f\2\2\u0093\u0094\7k\2\2\u0094\u0095\7o\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\u0099\7q\2\2\u0099"+
		"\4\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\6\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7k"+
		"\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7c\2\2\u00a7\b\3\2\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7o\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7q\2\2\u00bb\20\3\2\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7c\2\2"+
		"\u00c0\u00c1\7q\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7"+
		"c\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6\24\3\2\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\30\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\32\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7r\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7c\2\2\u00da\34\3\2\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7s\2\2\u00de\u00df\7w\2\2"+
		"\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7c\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7s\2\2\u00ea\u00eb"+
		"\7w\2\2\u00eb\u00ec\7g\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7q\2\2\u00f1$\3\2\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7l\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"&\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7r\2\2\u00fa"+
		"\u00fb\7q\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7e\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7r\2\2\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105*\3\2\2"+
		"\2\u0106\u0107\7g\2\2\u0107\u0108\7u\2\2\u0108\u0109\7e\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7x\2\2\u010c\u010d\7c\2\2\u010d"+
		",\3\2\2\2\u010e\u010f\7n\2\2\u010f\u0110\7g\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7c\2\2\u0112.\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7v\2\2\u0116\u0117\7g\2\2\u0117\u0118\7k\2\2\u0118\u0119\7t\2\2"+
		"\u0119\u011a\7q\2\2\u011a\60\3\2\2\2\u011b\u011c\7t\2\2\u011c\u011d\7"+
		"c\2\2\u011d\u011e\7e\2\2\u011e\u011f\7k\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7p\2\2\u0121\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\62\3\2\2\2\u0124\u0125"+
		"\7d\2\2\u0125\u0126\7q\2\2\u0126\u0127\7q\2\2\u0127\u0128\7n\2\2\u0128"+
		"\u0129\7g\2\2\u0129\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b\u012c\7q\2\2"+
		"\u012c\64\3\2\2\2\u012d\u012e\7e\2\2\u012e\u012f\7c\2\2\u012f\u0130\7"+
		"t\2\2\u0130\u0131\7c\2\2\u0131\u0132\7e\2\2\u0132\u0133\7v\2\2\u0133\u0134"+
		"\7g\2\2\u0134\u0135\7t\2\2\u0135\u0136\7g\2\2\u0136\66\3\2\2\2\u0137\u0138"+
		"\7u\2\2\u0138\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7p\2\2\u013c\u013d\7i\2\2\u013d8\3\2\2\2\u013e\u013f\7p\2\2\u013f"+
		"\u0140\7c\2\2\u0140\u0141\7q\2\2\u0141\u0142\7\"\2\2\u0142\u0143\7j\2"+
		"\2\u0143\u0144\7c\2\2\u0144:\3\2\2\2\u0145\u0146\7?\2\2\u0146<\3\2\2\2"+
		"\u0147\u0148\7#\2\2\u0148\u0149\7?\2\2\u0149>\3\2\2\2\u014a\u014b\7@\2"+
		"\2\u014b@\3\2\2\2\u014c\u014d\7@\2\2\u014d\u014e\7?\2\2\u014eB\3\2\2\2"+
		"\u014f\u0150\7>\2\2\u0150D\3\2\2\2\u0151\u0152\7>\2\2\u0152\u0153\7?\2"+
		"\2\u0153F\3\2\2\2\u0154\u0155\7-\2\2\u0155H\3\2\2\2\u0156\u0157\7/\2\2"+
		"\u0157J\3\2\2\2\u0158\u0159\7,\2\2\u0159L\3\2\2\2\u015a\u015b\7\61\2\2"+
		"\u015bN\3\2\2\2\u015c\u015d\7f\2\2\u015d\u015e\7k\2\2\u015e\u015f\7x\2"+
		"\2\u015fP\3\2\2\2\u0160\u0161\7o\2\2\u0161\u0162\7q\2\2\u0162\u0163\7"+
		"f\2\2\u0163R\3\2\2\2\u0164\u0165\7-\2\2\u0165\u0166\7-\2\2\u0166T\3\2"+
		"\2\2\u0167\u0168\7g\2\2\u0168V\3\2\2\2\u0169\u016a\7q\2\2\u016a\u016b"+
		"\7w\2\2\u016bX\3\2\2\2\u016c\u016d\7q\2\2\u016d\u016e\7w\2\2\u016e\u016f"+
		"\7z\2\2\u016fZ\3\2\2\2\u0170\u0171\7p\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7q\2\2\u0173\\\3\2\2\2\u0174\u0176\5}?\2\u0175\u0174\3\2\2\2\u0176\u0179"+
		"\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017e\5\177@\2\u017b\u017d\5\u0081A\2\u017c\u017b"+
		"\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"^\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5}?\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0197\3\2"+
		"\2\2\u0186\u0188\5{>\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018c"+
		"\3\2\2\2\u0189\u018b\5}?\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0193\5\177@\2\u0190\u0192\5\u0081A\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0182\3\2\2\2\u0196\u0187\3\2\2\2\u0197"+
		"`\3\2\2\2\u0198\u019a\5}?\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7\60"+
		"\2\2\u019e\u01a0\5}?\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01d0\3\2\2\2\u01a3\u01a5\5{>\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a8\5}"+
		"?\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\5\177"+
		"@\2\u01ad\u01af\5\u0081A\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b5\7\60\2\2\u01b4\u01b6\5\u0081A\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01d0\3\2"+
		"\2\2\u01b9\u01bb\5{>\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd"+
		"\3\2\2\2\u01bc\u01be\5}?\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\7\60"+
		"\2\2\u01c2\u01c4\5\177@\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c8\u01cc\5\u0081A\2\u01c9\u01cb\5\177@\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u0199\3\2\2\2\u01cf\u01a4\3\2\2\2\u01cf"+
		"\u01ba\3\2\2\2\u01d0b\3\2\2\2\u01d1\u01d2\7v\2\2\u01d2\u01d3\7t\2\2\u01d3"+
		"\u01d4\7w\2\2\u01d4\u01db\7g\2\2\u01d5\u01d6\7h\2\2\u01d6\u01d7\7c\2\2"+
		"\u01d7\u01d8\7n\2\2\u01d8\u01d9\7u\2\2\u01d9\u01db\7g\2\2\u01da\u01d1"+
		"\3\2\2\2\u01da\u01d5\3\2\2\2\u01dbd\3\2\2\2\u01dc\u01dd\7)\2\2\u01dd\u01de"+
		"\5\u0085C\2\u01de\u01df\7)\2\2\u01dff\3\2\2\2\u01e0\u01e4\7$\2\2\u01e1"+
		"\u01e3\5\u0085C\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e8\7$\2\2\u01e8h\3\2\2\2\u01e9\u01ea\7>\2\2\u01ea\u01eb\7/\2\2\u01eb"+
		"j\3\2\2\2\u01ec\u01ed\7=\2\2\u01edl\3\2\2\2\u01ee\u01ef\7*\2\2\u01efn"+
		"\3\2\2\2\u01f0\u01f1\7+\2\2\u01f1p\3\2\2\2\u01f2\u01f3\7]\2\2\u01f3r\3"+
		"\2\2\2\u01f4\u01f5\7_\2\2\u01f5t\3\2\2\2\u01f6\u01f7\7.\2\2\u01f7v\3\2"+
		"\2\2\u01f8\u01f9\7<\2\2\u01f9x\3\2\2\2\u01fa\u01fb\7\60\2\2\u01fbz\3\2"+
		"\2\2\u01fc\u01fd\t\2\2\2\u01fd|\3\2\2\2\u01fe\u01ff\7\62\2\2\u01ff~\3"+
		"\2\2\2\u0200\u0201\t\3\2\2\u0201\u0080\3\2\2\2\u0202\u0205\5}?\2\u0203"+
		"\u0205\5\177@\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0082\3"+
		"\2\2\2\u0206\u0207\t\4\2\2\u0207\u0084\3\2\2\2\u0208\u020b\n\5\2\2\u0209"+
		"\u020b\5\u0087D\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u0086"+
		"\3\2\2\2\u020c\u020d\7^\2\2\u020d\u021d\7d\2\2\u020e\u020f\7^\2\2\u020f"+
		"\u021d\7v\2\2\u0210\u0211\7^\2\2\u0211\u021d\7p\2\2\u0212\u0213\7^\2\2"+
		"\u0213\u021d\7h\2\2\u0214\u0215\7^\2\2\u0215\u021d\7t\2\2\u0216\u0217"+
		"\7^\2\2\u0217\u021d\7$\2\2\u0218\u0219\7^\2\2\u0219\u021d\7)\2\2\u021a"+
		"\u021b\7^\2\2\u021b\u021d\7^\2\2\u021c\u020c\3\2\2\2\u021c\u020e\3\2\2"+
		"\2\u021c\u0210\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0216"+
		"\3\2\2\2\u021c\u0218\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0088\3\2\2\2\u021e"+
		"\u0223\5\u0083B\2\u021f\u0222\5\u0083B\2\u0220\u0222\5\u0081A\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u008a\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\t\6\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bF\2\2\u022c"+
		"\u008c\3\2\2\2\35\2\u0177\u017e\u0184\u0187\u018c\u0193\u0196\u019b\u01a1"+
		"\u01a4\u01a9\u01b0\u01b7\u01ba\u01bf\u01c5\u01cc\u01cf\u01da\u01e4\u0204"+
		"\u020a\u021c\u0221\u0223\u0229\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}