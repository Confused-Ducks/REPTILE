package antlr;// Generated from C:/Users/charl/OneDrive/Documents/GitHub/p4/src\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Begin=1, End=2, For=3, If=4, Else=5, Import=6, Quotes=7, FileType=8, Player=9, 
		Lives=10, LevelDesign=11, Entities=12, Game=13, Enemy=14, Item=15, Place=16, 
		Wall=17, Entrance=18, Print=19, Command=20, ON=21, Level=22, Gate=23, 
		Finish=24, Actions=25, Tile=26, COORDINATEX=27, COORDINATEY=28, Tiles=29, 
		PlayerPosition=30, AddOprt=31, SubOprt=32, MultiOprt=33, DivOprt=34, ModOprt=35, 
		AssignOprt=36, LessThan=37, GreaterThan=38, GreaterOrEqual=39, LessOrEqual=40, 
		AndOprt=41, NotOprt=42, OrOprt=43, CompareOprt=44, LBRACE=45, RBRACE=46, 
		LPAREN=47, RPAREN=48, COMMA=49, PERIOD=50, SEMICOLON=51, COLON=52, DIGIT=53, 
		ID=54, STRING=55, DAMAGE=56, COMMENT=57, LINE_COMMENT=58, WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Begin", "End", "For", "If", "Else", "Import", "Quotes", "FileType", 
			"Player", "Lives", "LevelDesign", "Entities", "Game", "Enemy", "Item", 
			"Place", "Wall", "Entrance", "Print", "Command", "ON", "Level", "Gate", 
			"Finish", "Actions", "Tile", "COORDINATEX", "COORDINATEY", "Tiles", "PlayerPosition", 
			"AddOprt", "SubOprt", "MultiOprt", "DivOprt", "ModOprt", "AssignOprt", 
			"LessThan", "GreaterThan", "GreaterOrEqual", "LessOrEqual", "AndOprt", 
			"NotOprt", "OrOprt", "CompareOprt", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"COMMA", "PERIOD", "SEMICOLON", "COLON", "DIGIT", "ID", "IDe", "STRING", 
			"DAMAGE", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'for'", "'if'", "'else'", "'import'", "'\"'", 
			"'.rpt'", "'Player'", "'Lives'", "'LevelDesign'", "'Entities'", "'Game'", 
			"'Enemy'", "'Item'", "'place'", "'Wall'", "'Entrance'", "'Print'", "'Command'", 
			"'on'", "'level-'", "'Gate'", "'Finish'", null, "'Tile'", "'x'", "'y'", 
			"'Tiles'", "'PlayerPosition'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'<'", "'>'", "'>='", "'<='", "'and'", "'not'", "'or'", "'is'", "'{'", 
			"'}'", "'('", "')'", "','", "'.'", "';'", "':'", null, null, null, "'Damage'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Begin", "End", "For", "If", "Else", "Import", "Quotes", "FileType", 
			"Player", "Lives", "LevelDesign", "Entities", "Game", "Enemy", "Item", 
			"Place", "Wall", "Entrance", "Print", "Command", "ON", "Level", "Gate", 
			"Finish", "Actions", "Tile", "COORDINATEX", "COORDINATEY", "Tiles", "PlayerPosition", 
			"AddOprt", "SubOprt", "MultiOprt", "DivOprt", "ModOprt", "AssignOprt", 
			"LessThan", "GreaterThan", "GreaterOrEqual", "LessOrEqual", "AndOprt", 
			"NotOprt", "OrOprt", "CompareOprt", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"COMMA", "PERIOD", "SEMICOLON", "COLON", "DIGIT", "ID", "STRING", "DAMAGE", 
			"COMMENT", "LINE_COMMENT", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0123\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\6\66\u0178\n\66\r\66\16\66\u0179\3\67\3\67\38\38\78\u0180\n8\f8"+
		"\168\u0183\138\39\39\79\u0187\n9\f9\169\u018a\139\39\39\3:\3:\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\7;\u0199\n;\f;\16;\u019c\13;\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\7<\u01a7\n<\f<\16<\u01aa\13<\3<\3<\3=\3=\3=\3=\3\u019a\2>\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q9"+
		"s:u;w<y=\3\2\b\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\4\2\f\f\17\17\5"+
		"\2\13\f\17\17\"\"\2\u01b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2"+
		"\2y\3\2\2\2\3{\3\2\2\2\5\u0081\3\2\2\2\7\u0085\3\2\2\2\t\u0089\3\2\2\2"+
		"\13\u008c\3\2\2\2\r\u0091\3\2\2\2\17\u0098\3\2\2\2\21\u009a\3\2\2\2\23"+
		"\u009f\3\2\2\2\25\u00a6\3\2\2\2\27\u00ac\3\2\2\2\31\u00b8\3\2\2\2\33\u00c1"+
		"\3\2\2\2\35\u00c6\3\2\2\2\37\u00cc\3\2\2\2!\u00d1\3\2\2\2#\u00d7\3\2\2"+
		"\2%\u00dc\3\2\2\2\'\u00e5\3\2\2\2)\u00eb\3\2\2\2+\u00f3\3\2\2\2-\u00f6"+
		"\3\2\2\2/\u00fd\3\2\2\2\61\u0102\3\2\2\2\63\u0122\3\2\2\2\65\u0124\3\2"+
		"\2\2\67\u0129\3\2\2\29\u012b\3\2\2\2;\u012d\3\2\2\2=\u0133\3\2\2\2?\u0142"+
		"\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E\u0148\3\2\2\2G\u014a\3\2\2\2I"+
		"\u014c\3\2\2\2K\u014e\3\2\2\2M\u0150\3\2\2\2O\u0152\3\2\2\2Q\u0155\3\2"+
		"\2\2S\u0158\3\2\2\2U\u015c\3\2\2\2W\u0160\3\2\2\2Y\u0163\3\2\2\2[\u0166"+
		"\3\2\2\2]\u0168\3\2\2\2_\u016a\3\2\2\2a\u016c\3\2\2\2c\u016e\3\2\2\2e"+
		"\u0170\3\2\2\2g\u0172\3\2\2\2i\u0174\3\2\2\2k\u0177\3\2\2\2m\u017b\3\2"+
		"\2\2o\u017d\3\2\2\2q\u0184\3\2\2\2s\u018d\3\2\2\2u\u0194\3\2\2\2w\u01a2"+
		"\3\2\2\2y\u01ad\3\2\2\2{|\7d\2\2|}\7g\2\2}~\7i\2\2~\177\7k\2\2\177\u0080"+
		"\7p\2\2\u0080\4\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7f\2\2\u0084\6\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7t\2\2\u0088\b\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7h\2\2\u008b\n"+
		"\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7g\2\2\u0090\f\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7r\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7v\2\2"+
		"\u0097\16\3\2\2\2\u0098\u0099\7$\2\2\u0099\20\3\2\2\2\u009a\u009b\7\60"+
		"\2\2\u009b\u009c\7t\2\2\u009c\u009d\7r\2\2\u009d\u009e\7v\2\2\u009e\22"+
		"\3\2\2\2\u009f\u00a0\7R\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7{\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\24\3\2\2\2\u00a6"+
		"\u00a7\7N\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7u\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7"+
		"g\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7F\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7i\2\2\u00b6\u00b7\7p\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\u00be\7k\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7u\2\2\u00c0\32\3\2"+
		"\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7{\2\2\u00cb\36\3\2\2\2\u00cc\u00cd"+
		"\7K\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7o\2\2\u00d0"+
		" \3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7e\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7Y\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7n\2\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\7G\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7R\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea(\3\2\2\2\u00eb\u00ec"+
		"\7E\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef\7o\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2*\3\2\2\2\u00f3"+
		"\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7x\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7n\2\2"+
		"\u00fb\u00fc\7/\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7I\2\2\u00fe\u00ff\7c\2"+
		"\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\60\3\2\2\2\u0102\u0103"+
		"\7H\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7u\2\2\u0107\u0108\7j\2\2\u0108\62\3\2\2\2\u0109\u010a\7o\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7x\2\2\u010c\u0123\7g\2\2\u010d\u010e\7v\2\2"+
		"\u010e\u010f\7c\2\2\u010f\u0110\7m\2\2\u0110\u0123\7g\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114\7v\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0123\7m\2\2\u0117\u0118\7g\2\2\u0118\u0119\7s\2\2"+
		"\u0119\u011a\7w\2\2\u011a\u011b\7k\2\2\u011b\u0123\7r\2\2\u011c\u011d"+
		"\7u\2\2\u011d\u011e\7v\2\2\u011e\u011f\7c\2\2\u011f\u0120\7v\2\2\u0120"+
		"\u0121\7w\2\2\u0121\u0123\7u\2\2\u0122\u0109\3\2\2\2\u0122\u010d\3\2\2"+
		"\2\u0122\u0111\3\2\2\2\u0122\u0117\3\2\2\2\u0122\u011c\3\2\2\2\u0123\64"+
		"\3\2\2\2\u0124\u0125\7V\2\2\u0125\u0126\7k\2\2\u0126\u0127\7n\2\2\u0127"+
		"\u0128\7g\2\2\u0128\66\3\2\2\2\u0129\u012a\7z\2\2\u012a8\3\2\2\2\u012b"+
		"\u012c\7{\2\2\u012c:\3\2\2\2\u012d\u012e\7V\2\2\u012e\u012f\7k\2\2\u012f"+
		"\u0130\7n\2\2\u0130\u0131\7g\2\2\u0131\u0132\7u\2\2\u0132<\3\2\2\2\u0133"+
		"\u0134\7R\2\2\u0134\u0135\7n\2\2\u0135\u0136\7c\2\2\u0136\u0137\7{\2\2"+
		"\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7R\2\2\u013a\u013b"+
		"\7q\2\2\u013b\u013c\7u\2\2\u013c\u013d\7k\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141>\3\2\2\2\u0142"+
		"\u0143\7-\2\2\u0143@\3\2\2\2\u0144\u0145\7/\2\2\u0145B\3\2\2\2\u0146\u0147"+
		"\7,\2\2\u0147D\3\2\2\2\u0148\u0149\7\61\2\2\u0149F\3\2\2\2\u014a\u014b"+
		"\7\'\2\2\u014bH\3\2\2\2\u014c\u014d\7?\2\2\u014dJ\3\2\2\2\u014e\u014f"+
		"\7>\2\2\u014fL\3\2\2\2\u0150\u0151\7@\2\2\u0151N\3\2\2\2\u0152\u0153\7"+
		"@\2\2\u0153\u0154\7?\2\2\u0154P\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157"+
		"\7?\2\2\u0157R\3\2\2\2\u0158\u0159\7c\2\2\u0159\u015a\7p\2\2\u015a\u015b"+
		"\7f\2\2\u015bT\3\2\2\2\u015c\u015d\7p\2\2\u015d\u015e\7q\2\2\u015e\u015f"+
		"\7v\2\2\u015fV\3\2\2\2\u0160\u0161\7q\2\2\u0161\u0162\7t\2\2\u0162X\3"+
		"\2\2\2\u0163\u0164\7k\2\2\u0164\u0165\7u\2\2\u0165Z\3\2\2\2\u0166\u0167"+
		"\7}\2\2\u0167\\\3\2\2\2\u0168\u0169\7\177\2\2\u0169^\3\2\2\2\u016a\u016b"+
		"\7*\2\2\u016b`\3\2\2\2\u016c\u016d\7+\2\2\u016db\3\2\2\2\u016e\u016f\7"+
		".\2\2\u016fd\3\2\2\2\u0170\u0171\7\60\2\2\u0171f\3\2\2\2\u0172\u0173\7"+
		"=\2\2\u0173h\3\2\2\2\u0174\u0175\7<\2\2\u0175j\3\2\2\2\u0176\u0178\t\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017al\3\2\2\2\u017b\u017c\5o8\2\u017cn\3\2\2\2\u017d\u0181"+
		"\t\3\2\2\u017e\u0180\t\4\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182p\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0188\7$\2\2\u0185\u0187\n\5\2\2\u0186\u0185\3\2\2\2\u0187\u018a"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018c\7$\2\2\u018cr\3\2\2\2\u018d\u018e\7F\2\2\u018e"+
		"\u018f\7c\2\2\u018f\u0190\7o\2\2\u0190\u0191\7c\2\2\u0191\u0192\7i\2\2"+
		"\u0192\u0193\7g\2\2\u0193t\3\2\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7"+
		",\2\2\u0196\u019a\3\2\2\2\u0197\u0199\13\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7,\2\2\u019e\u019f\7\61\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\b;\2\2\u01a1v\3\2\2\2\u01a2\u01a3\7\61\2\2"+
		"\u01a3\u01a4\7\61\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\n\6\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\b<\2\2\u01acx\3\2\2\2\u01ad"+
		"\u01ae\t\7\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\b=\3\2\u01b0z\3\2\2\2\t"+
		"\2\u0122\u0179\u0181\u0188\u019a\u01a8\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}