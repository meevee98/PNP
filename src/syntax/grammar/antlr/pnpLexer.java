// Generated from F:/Workspace/PNP/src/syntax/grammar\pnp.g4 by ANTLR 4.7.2
package syntax.grammar.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pnpLexer extends Lexer {
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
			"SEJA", "INTEIRO", "RACIONAL", "BOOLEANO", "CARACTERE", "STRING", "NULO", 
			"IGUALDADE", "DESIGUALDADE", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", 
			"ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO_RAC", "DIVISAO_INT", 
			"MODULO", "AND", "OR", "XOR", "NOT", "NATURAL_LITERAL", "INTEIRO_LITERAL", 
			"RACIONAL_LITERAL", "BOOLEANO_LITERAL", "CARACTERE_LITERAL", "STRING_LITERAL", 
			"ATRIBUICAO", "FIM_COMANDO", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVES", 
			"FECHA_CHAVES", "SEPARADOR_VARIAVEL", "SEPARADOR_VARIAVEL_TIPO", "SINAL", 
			"ZERO", "NAO_ZERO", "DIGITO", "ALFA", "CARACTER", "ESCAPE", "ID", "WS"
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


	public pnpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pnp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0200\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\7*\u014b"+
		"\n*\f*\16*\u014e\13*\3*\3*\7*\u0152\n*\f*\16*\u0155\13*\3+\6+\u0158\n"+
		"+\r+\16+\u0159\3+\5+\u015d\n+\3+\7+\u0160\n+\f+\16+\u0163\13+\3+\3+\7"+
		"+\u0167\n+\f+\16+\u016a\13+\5+\u016c\n+\3,\6,\u016f\n,\r,\16,\u0170\3"+
		",\3,\6,\u0175\n,\r,\16,\u0176\3,\5,\u017a\n,\3,\7,\u017d\n,\f,\16,\u0180"+
		"\13,\3,\3,\7,\u0184\n,\f,\16,\u0187\13,\3,\3,\6,\u018b\n,\r,\16,\u018c"+
		"\3,\5,\u0190\n,\3,\6,\u0193\n,\r,\16,\u0194\3,\3,\7,\u0199\n,\f,\16,\u019c"+
		"\13,\3,\3,\7,\u01a0\n,\f,\16,\u01a3\13,\5,\u01a5\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u01b0\n-\3.\3.\3.\3.\3/\3/\7/\u01b8\n/\f/\16/\u01bb\13/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\5;\u01d8\n;\3<\3<\3=\3=\5"+
		"=\u01de\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01f0\n"+
		">\3?\3?\3?\7?\u01f5\n?\f?\16?\u01f8\13?\3@\6@\u01fb\n@\r@\16@\u01fc\3"+
		"@\3@\3\u01b9\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o\2q\2s\2u\2w\2y\2{\2}9\177:\3\2\7\4\2--//\3\2\63;\5\2C"+
		"\\aac|\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\2\u0219\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\3\u0081\3\2\2\2\5\u008e\3\2\2\2\7\u0096\3\2\2\2\t\u009c\3\2\2"+
		"\2\13\u00a3\3\2\2\2\r\u00a7\3\2\2\2\17\u00aa\3\2\2\2\21\u00b0\3\2\2\2"+
		"\23\u00b6\3\2\2\2\25\u00bb\3\2\2\2\27\u00be\3\2\2\2\31\u00c2\3\2\2\2\33"+
		"\u00c8\3\2\2\2\35\u00cf\3\2\2\2\37\u00d8\3\2\2\2!\u00dd\3\2\2\2#\u00e1"+
		"\3\2\2\2%\u00e6\3\2\2\2\'\u00eb\3\2\2\2)\u00f3\3\2\2\2+\u00fc\3\2\2\2"+
		"-\u0105\3\2\2\2/\u010f\3\2\2\2\61\u0116\3\2\2\2\63\u011d\3\2\2\2\65\u011f"+
		"\3\2\2\2\67\u0122\3\2\2\29\u0124\3\2\2\2;\u0127\3\2\2\2=\u0129\3\2\2\2"+
		"?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0130\3\2\2\2E\u0132\3\2\2\2G\u0134\3"+
		"\2\2\2I\u0138\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0141\3\2\2\2Q\u0145"+
		"\3\2\2\2S\u014c\3\2\2\2U\u016b\3\2\2\2W\u01a4\3\2\2\2Y\u01af\3\2\2\2["+
		"\u01b1\3\2\2\2]\u01b5\3\2\2\2_\u01be\3\2\2\2a\u01c1\3\2\2\2c\u01c3\3\2"+
		"\2\2e\u01c5\3\2\2\2g\u01c7\3\2\2\2i\u01c9\3\2\2\2k\u01cb\3\2\2\2m\u01cd"+
		"\3\2\2\2o\u01cf\3\2\2\2q\u01d1\3\2\2\2s\u01d3\3\2\2\2u\u01d7\3\2\2\2w"+
		"\u01d9\3\2\2\2y\u01dd\3\2\2\2{\u01ef\3\2\2\2}\u01f1\3\2\2\2\177\u01fa"+
		"\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\u0087\7f\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u0089\7o\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7q\2\2\u008d\4\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7f\2\2\u0094\u0095\7c\2\2\u0095\6\3\2\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7k\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2"+
		"\u009b\b\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7k"+
		"\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7q\2\2\u00a2\n"+
		"\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7o\2\2\u00a6"+
		"\f\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\16\3\2\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7c\2\2"+
		"\u00ae\u00af\7q\2\2\u00af\20\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7"+
		"g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7q\2\2\u00b5\22"+
		"\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\26\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\30\3\2\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7q\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\u00ce\7c\2\2\u00ce\34\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7"+
		"p\2\2\u00d1\u00d2\7s\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7q\2\2\u00d7\36\3\2\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7c\2\2\u00dc"+
		" \3\2\2\2\u00dd\u00de\7s\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\"\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7l\2\2\u00e9\u00ea\7c\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7t\2\2\u00f1\u00f2\7q\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7t\2"+
		"\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"*\3\2\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2"+
		"\u0103\u0104\7q\2\2\u0104,\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7c\2"+
		"\2\u0107\u0108\7t\2\2\u0108\u0109\7c\2\2\u0109\u010a\7e\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e"+
		".\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115\60\3\2\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7c\2\2\u0118\u0119\7q\2\2\u0119\u011a\7\"\2"+
		"\2\u011a\u011b\7j\2\2\u011b\u011c\7c\2\2\u011c\62\3\2\2\2\u011d\u011e"+
		"\7?\2\2\u011e\64\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7@\2\2\u0121\66"+
		"\3\2\2\2\u0122\u0123\7@\2\2\u01238\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0126"+
		"\7?\2\2\u0126:\3\2\2\2\u0127\u0128\7>\2\2\u0128<\3\2\2\2\u0129\u012a\7"+
		">\2\2\u012a\u012b\7?\2\2\u012b>\3\2\2\2\u012c\u012d\7-\2\2\u012d@\3\2"+
		"\2\2\u012e\u012f\7/\2\2\u012fB\3\2\2\2\u0130\u0131\7,\2\2\u0131D\3\2\2"+
		"\2\u0132\u0133\7\61\2\2\u0133F\3\2\2\2\u0134\u0135\7f\2\2\u0135\u0136"+
		"\7k\2\2\u0136\u0137\7x\2\2\u0137H\3\2\2\2\u0138\u0139\7o\2\2\u0139\u013a"+
		"\7q\2\2\u013a\u013b\7f\2\2\u013bJ\3\2\2\2\u013c\u013d\7g\2\2\u013dL\3"+
		"\2\2\2\u013e\u013f\7q\2\2\u013f\u0140\7w\2\2\u0140N\3\2\2\2\u0141\u0142"+
		"\7z\2\2\u0142\u0143\7q\2\2\u0143\u0144\7t\2\2\u0144P\3\2\2\2\u0145\u0146"+
		"\7p\2\2\u0146\u0147\7c\2\2\u0147\u0148\7q\2\2\u0148R\3\2\2\2\u0149\u014b"+
		"\5q9\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\5s"+
		":\2\u0150\u0152\5u;\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154T\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\5q9\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u016c\3\2\2\2\u015b\u015d\5o8\2\u015c\u015b"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0161\3\2\2\2\u015e\u0160\5q9\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0168\5s:\2\u0165\u0167"+
		"\5u;\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0157\3\2"+
		"\2\2\u016b\u015c\3\2\2\2\u016cV\3\2\2\2\u016d\u016f\5q9\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\7\60\2\2\u0173\u0175\5q9\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u01a5\3\2\2\2\u0178\u017a\5o8\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017e\3\2\2\2\u017b\u017d\5q9\2\u017c\u017b\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0185\5s:\2\u0182\u0184\5u;\2\u0183\u0182\3\2\2\2"+
		"\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\7\60\2\2\u0189\u018b\5u;\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u01a5\3\2\2\2\u018e\u0190\5o8\2\u018f\u018e\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\5q9\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u019a\7\60\2\2\u0197\u0199\5s:\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u01a1\5u;\2\u019e\u01a0\5s:\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u016e\3\2\2\2\u01a4\u0179\3\2"+
		"\2\2\u01a4\u018f\3\2\2\2\u01a5X\3\2\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8"+
		"\7t\2\2\u01a8\u01a9\7w\2\2\u01a9\u01b0\7g\2\2\u01aa\u01ab\7h\2\2\u01ab"+
		"\u01ac\7c\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7u\2\2\u01ae\u01b0\7g\2\2"+
		"\u01af\u01a6\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0Z\3\2\2\2\u01b1\u01b2\7"+
		")\2\2\u01b2\u01b3\5y=\2\u01b3\u01b4\7)\2\2\u01b4\\\3\2\2\2\u01b5\u01b9"+
		"\7$\2\2\u01b6\u01b8\5y=\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bd\7$\2\2\u01bd^\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0"+
		"\7/\2\2\u01c0`\3\2\2\2\u01c1\u01c2\7=\2\2\u01c2b\3\2\2\2\u01c3\u01c4\7"+
		"*\2\2\u01c4d\3\2\2\2\u01c5\u01c6\7+\2\2\u01c6f\3\2\2\2\u01c7\u01c8\7]"+
		"\2\2\u01c8h\3\2\2\2\u01c9\u01ca\7_\2\2\u01caj\3\2\2\2\u01cb\u01cc\7.\2"+
		"\2\u01ccl\3\2\2\2\u01cd\u01ce\7<\2\2\u01cen\3\2\2\2\u01cf\u01d0\t\2\2"+
		"\2\u01d0p\3\2\2\2\u01d1\u01d2\7\62\2\2\u01d2r\3\2\2\2\u01d3\u01d4\t\3"+
		"\2\2\u01d4t\3\2\2\2\u01d5\u01d8\5q9\2\u01d6\u01d8\5s:\2\u01d7\u01d5\3"+
		"\2\2\2\u01d7\u01d6\3\2\2\2\u01d8v\3\2\2\2\u01d9\u01da\t\4\2\2\u01dax\3"+
		"\2\2\2\u01db\u01de\n\5\2\2\u01dc\u01de\5{>\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01dez\3\2\2\2\u01df\u01e0\7^\2\2\u01e0\u01f0\7d\2\2\u01e1"+
		"\u01e2\7^\2\2\u01e2\u01f0\7v\2\2\u01e3\u01e4\7^\2\2\u01e4\u01f0\7p\2\2"+
		"\u01e5\u01e6\7^\2\2\u01e6\u01f0\7h\2\2\u01e7\u01e8\7^\2\2\u01e8\u01f0"+
		"\7t\2\2\u01e9\u01ea\7^\2\2\u01ea\u01f0\7$\2\2\u01eb\u01ec\7^\2\2\u01ec"+
		"\u01f0\7)\2\2\u01ed\u01ee\7^\2\2\u01ee\u01f0\7^\2\2\u01ef\u01df\3\2\2"+
		"\2\u01ef\u01e1\3\2\2\2\u01ef\u01e3\3\2\2\2\u01ef\u01e5\3\2\2\2\u01ef\u01e7"+
		"\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"|\3\2\2\2\u01f1\u01f6\5w<\2\u01f2\u01f5\5w<\2\u01f3\u01f5\5u;\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7~\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb"+
		"\t\6\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b@\2\2\u01ff\u0080\3\2"+
		"\2\2\35\2\u014c\u0153\u0159\u015c\u0161\u0168\u016b\u0170\u0176\u0179"+
		"\u017e\u0185\u018c\u018f\u0194\u019a\u01a1\u01a4\u01af\u01b9\u01d7\u01dd"+
		"\u01ef\u01f4\u01f6\u01fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}