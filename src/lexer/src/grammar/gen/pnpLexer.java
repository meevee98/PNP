// Generated from D:/Workspace/PNP/src/lexer/src/grammar\pnp.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PROCEDIMENTO=6, ENTRADA=7, SAIDA=8, 
		INICIO=9, FIM=10, SE=11, ENTAO=12, SENAO=13, PARA=14, DE=15, ATE=16, PASSO=17, 
		REPITA=18, ENQUANTO=19, FACA=20, INTEIRO=21, RACIONAL=22, BOOLEANO=23, 
		CARACTERE=24, STRING=25, NULO=26, IGUALDADE=27, DESIGUALDADE=28, MAIOR=29, 
		MAIOR_IGUAL=30, MENOR=31, MENOR_IGUAL=32, ADICAO=33, SUBTRACAO=34, MULTIPLICACAO=35, 
		DIVISAO_RAC=36, DIVISAO_INT=37, MODULO=38, AND=39, OR=40, XOR=41, NOT=42, 
		ATRIBUICAO=43, INTEIRO_LITERAL=44, RACIONAL_LITERAL=45, BOOLEANO_LITERAL=46, 
		CARACTERE_LITERAL=47, STRING_LITERAL=48, ID=49, WS=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "PROCEDIMENTO", "ENTRADA", "SAIDA", 
			"INICIO", "FIM", "SE", "ENTAO", "SENAO", "PARA", "DE", "ATE", "PASSO", 
			"REPITA", "ENQUANTO", "FACA", "INTEIRO", "RACIONAL", "BOOLEANO", "CARACTERE", 
			"STRING", "NULO", "IGUALDADE", "DESIGUALDADE", "MAIOR", "MAIOR_IGUAL", 
			"MENOR", "MENOR_IGUAL", "ADICAO", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO_RAC", 
			"DIVISAO_INT", "MODULO", "AND", "OR", "XOR", "NOT", "ATRIBUICAO", "INTEIRO_LITERAL", 
			"RACIONAL_LITERAL", "BOOLEANO_LITERAL", "CARACTERE_LITERAL", "STRING_LITERAL", 
			"ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\6.\u0132\n.\r.\16.\u0133\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u013f\n/\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u0147"+
		"\n\61\f\61\16\61\u014a\13\61\3\61\3\61\3\62\3\62\7\62\u0150\n\62\f\62"+
		"\16\62\u0153\13\62\3\63\6\63\u0156\n\63\r\63\16\63\u0157\3\63\3\63\3\u0148"+
		"\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\6\3\2\62"+
		";\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u015f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3"+
		"\2\2\2\17~\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25\u0093\3\2\2\2"+
		"\27\u0097\3\2\2\2\31\u009a\3\2\2\2\33\u00a0\3\2\2\2\35\u00a6\3\2\2\2\37"+
		"\u00ab\3\2\2\2!\u00ae\3\2\2\2#\u00b2\3\2\2\2%\u00b8\3\2\2\2\'\u00bf\3"+
		"\2\2\2)\u00c8\3\2\2\2+\u00cd\3\2\2\2-\u00d5\3\2\2\2/\u00de\3\2\2\2\61"+
		"\u00e7\3\2\2\2\63\u00f1\3\2\2\2\65\u00f8\3\2\2\2\67\u00fd\3\2\2\29\u00ff"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010e\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u0114\3\2"+
		"\2\2M\u0118\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2\2\2S\u0121\3\2\2\2U\u0125"+
		"\3\2\2\2W\u0129\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2\2\2]\u013e\3\2\2\2_"+
		"\u0140\3\2\2\2a\u0144\3\2\2\2c\u014d\3\2\2\2e\u0155\3\2\2\2gh\7=\2\2h"+
		"\4\3\2\2\2ij\7.\2\2j\6\3\2\2\2kl\7<\2\2l\b\3\2\2\2mn\7*\2\2n\n\3\2\2\2"+
		"op\7+\2\2p\f\3\2\2\2qr\7r\2\2rs\7t\2\2st\7q\2\2tu\7e\2\2uv\7g\2\2vw\7"+
		"f\2\2wx\7k\2\2xy\7o\2\2yz\7g\2\2z{\7p\2\2{|\7v\2\2|}\7q\2\2}\16\3\2\2"+
		"\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2"+
		"\u0082\u0083\7c\2\2\u0083\u0084\7f\2\2\u0084\u0085\7c\2\2\u0085\20\3\2"+
		"\2\2\u0086\u0087\7u\2\2\u0087\u0088\7c\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7f\2\2\u008a\u008b\7c\2\2\u008b\22\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7k\2\2\u008f\u0090\7e\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7q\2\2\u0092\24\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7o\2\2\u0096\26\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7c\2\2\u009e\u009f\7q\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5\34\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7"+
		"t\2\2\u00a9\u00aa\7c\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad \3\2\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7g\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7u\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7q\2\2\u00b7$\3\2\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\7c\2\2\u00be&\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\u00c2\7s\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7q\2\2\u00c7(\3\2\2"+
		"\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7c\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7c\2\2\u00d7"+
		"\u00d8\7e\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd.\3\2\2\2\u00de\u00df\7d\2"+
		"\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\60\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7c\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7"+
		"u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6"+
		"\7p\2\2\u00f6\u00f7\7i\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7w\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7q\2\2\u00fc\66\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe8\3\2\2\2\u00ff\u0100\7>\2\2\u0100\u0101\7@\2\2\u0101:\3"+
		"\2\2\2\u0102\u0103\7@\2\2\u0103<\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106"+
		"\7?\2\2\u0106>\3\2\2\2\u0107\u0108\7>\2\2\u0108@\3\2\2\2\u0109\u010a\7"+
		">\2\2\u010a\u010b\7?\2\2\u010bB\3\2\2\2\u010c\u010d\7-\2\2\u010dD\3\2"+
		"\2\2\u010e\u010f\7/\2\2\u010fF\3\2\2\2\u0110\u0111\7,\2\2\u0111H\3\2\2"+
		"\2\u0112\u0113\7\61\2\2\u0113J\3\2\2\2\u0114\u0115\7f\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7x\2\2\u0117L\3\2\2\2\u0118\u0119\7o\2\2\u0119\u011a"+
		"\7q\2\2\u011a\u011b\7f\2\2\u011bN\3\2\2\2\u011c\u011d\7g\2\2\u011dP\3"+
		"\2\2\2\u011e\u011f\7q\2\2\u011f\u0120\7w\2\2\u0120R\3\2\2\2\u0121\u0122"+
		"\7z\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124T\3\2\2\2\u0125\u0126"+
		"\7p\2\2\u0126\u0127\7c\2\2\u0127\u0128\7q\2\2\u0128V\3\2\2\2\u0129\u012a"+
		"\7>\2\2\u012a\u012b\7/\2\2\u012bX\3\2\2\2\u012c\u012d\t\2\2\2\u012dZ\3"+
		"\2\2\2\u012e\u012f\5Y-\2\u012f\u0131\7\60\2\2\u0130\u0132\t\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\\\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138"+
		"\7w\2\2\u0138\u013f\7g\2\2\u0139\u013a\7h\2\2\u013a\u013b\7c\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d\u013f\7g\2\2\u013e\u0135\3\2\2"+
		"\2\u013e\u0139\3\2\2\2\u013f^\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0142\13"+
		"\2\2\2\u0142\u0143\7)\2\2\u0143`\3\2\2\2\u0144\u0148\7$\2\2\u0145\u0147"+
		"\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c"+
		"\7$\2\2\u014cb\3\2\2\2\u014d\u0151\t\3\2\2\u014e\u0150\t\4\2\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"d\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\t\5\2\2\u0155\u0154\3\2\2\2"+
		"\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\b\63\2\2\u015af\3\2\2\2\b\2\u0133\u013e\u0148\u0151"+
		"\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}