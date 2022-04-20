package antlr;// Generated from C:/Users/charl/OneDrive/Documents/GitHub/p4/src\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_s = 0, RULE_dcl = 1, RULE_importStmt = 2, RULE_cmdStmt = 3, RULE_iterativeStmt = 4, 
		RULE_controlStmt = 5, RULE_playerDcl = 6, RULE_attr = 7, RULE_levelDcl = 8, 
		RULE_levels = 9, RULE_size = 10, RULE_placement = 11, RULE_place = 12, 
		RULE_entityDcl = 13, RULE_entities = 14, RULE_enemy = 15, RULE_item = 16, 
		RULE_bexpr = 17, RULE_bterm = 18, RULE_baexpr = 19, RULE_baterm = 20, 
		RULE_bfactor = 21, RULE_condexpr = 22, RULE_aexpr = 23, RULE_term = 24, 
		RULE_factor = 25, RULE_logoprt = 26, RULE_reloprt = 27, RULE_asoprt = 28, 
		RULE_mmdoprt = 29, RULE_rspnd = 30, RULE_location = 31, RULE_gameLoop = 32, 
		RULE_coordinate = 33, RULE_tileXY = 34, RULE_levelName = 35, RULE_gate = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "dcl", "importStmt", "cmdStmt", "iterativeStmt", "controlStmt", 
			"playerDcl", "attr", "levelDcl", "levels", "size", "placement", "place", 
			"entityDcl", "entities", "enemy", "item", "bexpr", "bterm", "baexpr", 
			"baterm", "bfactor", "condexpr", "aexpr", "term", "factor", "logoprt", 
			"reloprt", "asoprt", "mmdoprt", "rspnd", "location", "gameLoop", "coordinate", 
			"tileXY", "levelName", "gate"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(GrammarParser.Begin, 0); }
		public GameLoopContext gameLoop() {
			return getRuleContext(GameLoopContext.class,0);
		}
		public TerminalNode End() { return getToken(GrammarParser.End, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<ImportStmtContext> importStmt() {
			return getRuleContexts(ImportStmtContext.class);
		}
		public ImportStmtContext importStmt(int i) {
			return getRuleContext(ImportStmtContext.class,i);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public CmdStmtContext cmdStmt() {
			return getRuleContext(CmdStmtContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(74);
				importStmt();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(Begin);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Player) | (1L << LevelDesign) | (1L << Entities) | (1L << COMMENT) | (1L << LINE_COMMENT))) != 0)) {
				{
				{
				setState(81);
				dcl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Command) {
				{
				setState(87);
				cmdStmt();
				}
			}

			setState(90);
			gameLoop();
			setState(91);
			match(End);
			setState(92);
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

	public static class DclContext extends ParserRuleContext {
		public PlayerDclContext playerDcl() {
			return getRuleContext(PlayerDclContext.class,0);
		}
		public LevelDclContext levelDcl() {
			return getRuleContext(LevelDclContext.class,0);
		}
		public EntityDclContext entityDcl() {
			return getRuleContext(EntityDclContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(GrammarParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(GrammarParser.LINE_COMMENT, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcl);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Player:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				playerDcl();
				}
				break;
			case LevelDesign:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				levelDcl();
				}
				break;
			case Entities:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				entityDcl();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(COMMENT);
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(LINE_COMMENT);
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

	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(GrammarParser.Import, 0); }
		public TerminalNode LessThan() { return getToken(GrammarParser.LessThan, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode FileType() { return getToken(GrammarParser.FileType, 0); }
		public TerminalNode GreaterThan() { return getToken(GrammarParser.GreaterThan, 0); }
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Import);
			setState(102);
			match(LessThan);
			setState(103);
			match(ID);
			setState(104);
			match(FileType);
			setState(105);
			match(GreaterThan);
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

	public static class CmdStmtContext extends ParserRuleContext {
		public TerminalNode Command() { return getToken(GrammarParser.Command, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<TerminalNode> Actions() { return getTokens(GrammarParser.Actions); }
		public TerminalNode Actions(int i) {
			return getToken(GrammarParser.Actions, i);
		}
		public CmdStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitCmdStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdStmtContext cmdStmt() throws RecognitionException {
		CmdStmtContext _localctx = new CmdStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Command);
			setState(108);
			match(LBRACE);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Actions) {
				{
				{
				setState(109);
				match(Actions);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(RBRACE);
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

	public static class IterativeStmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(GrammarParser.For, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode Tile() { return getToken(GrammarParser.Tile, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode Tiles() { return getToken(GrammarParser.Tiles, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<ControlStmtContext> controlStmt() {
			return getRuleContexts(ControlStmtContext.class);
		}
		public ControlStmtContext controlStmt(int i) {
			return getRuleContext(ControlStmtContext.class,i);
		}
		public IterativeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitIterativeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeStmtContext iterativeStmt() throws RecognitionException {
		IterativeStmtContext _localctx = new IterativeStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterativeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(For);
			setState(118);
			match(LPAREN);
			setState(119);
			match(Tile);
			setState(120);
			match(COLON);
			setState(121);
			match(Tiles);
			setState(122);
			match(RPAREN);
			setState(123);
			match(LBRACE);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==If) {
				{
				{
				setState(124);
				controlStmt();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(RBRACE);
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

	public static class ControlStmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(GrammarParser.If, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GrammarParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GrammarParser.RBRACE, i);
		}
		public List<PlacementContext> placement() {
			return getRuleContexts(PlacementContext.class);
		}
		public PlacementContext placement(int i) {
			return getRuleContext(PlacementContext.class,i);
		}
		public TerminalNode Else() { return getToken(GrammarParser.Else, 0); }
		public ControlStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitControlStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStmtContext controlStmt() throws RecognitionException {
		ControlStmtContext _localctx = new ControlStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controlStmt);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(If);
				setState(133);
				match(LPAREN);
				setState(134);
				bexpr(0);
				setState(135);
				match(RPAREN);
				setState(136);
				match(LBRACE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Place) | (1L << Print))) != 0)) {
					{
					{
					setState(137);
					placement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(If);
				setState(146);
				match(LPAREN);
				setState(147);
				bexpr(0);
				setState(148);
				match(RPAREN);
				setState(149);
				match(LBRACE);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Place) | (1L << Print))) != 0)) {
					{
					{
					setState(150);
					placement();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RBRACE);
				setState(157);
				match(Else);
				setState(158);
				match(LBRACE);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Place) | (1L << Print))) != 0)) {
					{
					{
					setState(159);
					placement();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(RBRACE);
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

	public static class PlayerDclContext extends ParserRuleContext {
		public TerminalNode Player() { return getToken(GrammarParser.Player, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public PlayerDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerDcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitPlayerDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerDclContext playerDcl() throws RecognitionException {
		PlayerDclContext _localctx = new PlayerDclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_playerDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(Player);
			setState(170);
			match(LBRACE);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				attr();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Lives );
			setState(176);
			match(RBRACE);
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode Lives() { return getToken(GrammarParser.Lives, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode DIGIT() { return getToken(GrammarParser.DIGIT, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Lives);
			setState(179);
			match(COLON);
			setState(180);
			match(DIGIT);
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

	public static class LevelDclContext extends ParserRuleContext {
		public TerminalNode LevelDesign() { return getToken(GrammarParser.LevelDesign, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<LevelsContext> levels() {
			return getRuleContexts(LevelsContext.class);
		}
		public LevelsContext levels(int i) {
			return getRuleContext(LevelsContext.class,i);
		}
		public LevelDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelDcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitLevelDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelDclContext levelDcl() throws RecognitionException {
		LevelDclContext _localctx = new LevelDclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_levelDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(LevelDesign);
			setState(183);
			match(LBRACE);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				levels();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Level );
			setState(189);
			match(RBRACE);
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

	public static class LevelsContext extends ParserRuleContext {
		public LevelNameContext levelName() {
			return getRuleContext(LevelNameContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<PlacementContext> placement() {
			return getRuleContexts(PlacementContext.class);
		}
		public PlacementContext placement(int i) {
			return getRuleContext(PlacementContext.class,i);
		}
		public LevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levels; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitLevels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelsContext levels() throws RecognitionException {
		LevelsContext _localctx = new LevelsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_levels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			levelName();
			setState(192);
			size();
			setState(193);
			match(LBRACE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Place) | (1L << Print))) != 0)) {
				{
				{
				setState(194);
				placement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(RBRACE);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LPAREN);
			setState(203);
			match(DIGIT);
			setState(204);
			match(COMMA);
			setState(205);
			match(DIGIT);
			setState(206);
			match(RPAREN);
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

	public static class PlacementContext extends ParserRuleContext {
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public IterativeStmtContext iterativeStmt() {
			return getRuleContext(IterativeStmtContext.class,0);
		}
		public ControlStmtContext controlStmt() {
			return getRuleContext(ControlStmtContext.class,0);
		}
		public RspndContext rspnd() {
			return getRuleContext(RspndContext.class,0);
		}
		public PlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlacementContext placement() throws RecognitionException {
		PlacementContext _localctx = new PlacementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_placement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Place:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				place();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				iterativeStmt();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				controlStmt();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				rspnd();
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

	public static class PlaceContext extends ParserRuleContext {
		public TerminalNode Place() { return getToken(GrammarParser.Place, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(GrammarParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(GrammarParser.LPAREN, i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(GrammarParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(GrammarParser.RPAREN, i);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode PERIOD() { return getToken(GrammarParser.PERIOD, 0); }
		public TerminalNode Entrance() { return getToken(GrammarParser.Entrance, 0); }
		public TerminalNode Wall() { return getToken(GrammarParser.Wall, 0); }
		public GateContext gate() {
			return getRuleContext(GateContext.class,0);
		}
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitPlace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_place);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(Place);
				setState(215);
				match(LPAREN);
				setState(216);
				match(ID);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(217);
					match(PERIOD);
					setState(218);
					match(ID);
					}
				}

				setState(221);
				match(LPAREN);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(222);
					match(DIGIT);
					}
					break;
				case 2:
					{
					setState(223);
					match(DIGIT);
					setState(224);
					match(COLON);
					setState(225);
					match(DIGIT);
					}
					break;
				case 3:
					{
					setState(226);
					match(STRING);
					}
					break;
				}
				setState(229);
				match(RPAREN);
				setState(230);
				match(RPAREN);
				setState(231);
				location();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(Place);
				setState(233);
				match(LPAREN);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Entrance:
					{
					setState(234);
					match(Entrance);
					}
					break;
				case Wall:
					{
					setState(235);
					match(Wall);
					}
					break;
				case Gate:
					{
					setState(236);
					gate();
					}
					break;
				case ID:
					{
					setState(237);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240);
				match(RPAREN);
				setState(241);
				location();
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

	public static class EntityDclContext extends ParserRuleContext {
		public TerminalNode Entities() { return getToken(GrammarParser.Entities, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<EntitiesContext> entities() {
			return getRuleContexts(EntitiesContext.class);
		}
		public EntitiesContext entities(int i) {
			return getRuleContext(EntitiesContext.class,i);
		}
		public EntityDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitEntityDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDclContext entityDcl() throws RecognitionException {
		EntityDclContext _localctx = new EntityDclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_entityDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(Entities);
			setState(245);
			match(LBRACE);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(246);
				entities();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RBRACE);
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

	public static class EntitiesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode AssignOprt() { return getToken(GrammarParser.AssignOprt, 0); }
		public EnemyContext enemy() {
			return getRuleContext(EnemyContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public EntitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entities; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitEntities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntitiesContext entities() throws RecognitionException {
		EntitiesContext _localctx = new EntitiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_entities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(AssignOprt);
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Enemy:
				{
				setState(256);
				enemy();
				}
				break;
			case Item:
				{
				setState(257);
				item();
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

	public static class EnemyContext extends ParserRuleContext {
		public TerminalNode Enemy() { return getToken(GrammarParser.Enemy, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public EnemyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemy; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitEnemy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyContext enemy() throws RecognitionException {
		EnemyContext _localctx = new EnemyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enemy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Enemy);
			setState(261);
			match(LPAREN);
			setState(262);
			match(DIGIT);
			setState(263);
			match(COMMA);
			setState(264);
			match(DIGIT);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(265);
				match(COMMA);
				setState(266);
				match(STRING);
				}
			}

			setState(269);
			match(RPAREN);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode Item() { return getToken(GrammarParser.Item, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(Item);
			setState(272);
			match(LPAREN);
			setState(273);
			match(STRING);
			setState(274);
			match(COMMA);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(275);
				match(DIGIT);
				}
				break;
			case 2:
				{
				setState(276);
				match(DIGIT);
				setState(277);
				match(COLON);
				setState(278);
				match(DIGIT);
				}
				break;
			}
			setState(281);
			match(RPAREN);
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

	public static class BexprContext extends ParserRuleContext {
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public LogoprtContext logoprt() {
			return getRuleContext(LogoprtContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitBexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_bexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			bterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
					setState(286);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(287);
					logoprt();
					setState(288);
					bterm(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class BtermContext extends ParserRuleContext {
		public BatermContext baterm() {
			return getRuleContext(BatermContext.class,0);
		}
		public BtermContext bterm() {
			return getRuleContext(BtermContext.class,0);
		}
		public ReloprtContext reloprt() {
			return getRuleContext(ReloprtContext.class,0);
		}
		public BaexprContext baexpr() {
			return getRuleContext(BaexprContext.class,0);
		}
		public BtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bterm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitBterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtermContext bterm() throws RecognitionException {
		return bterm(0);
	}

	private BtermContext bterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BtermContext _localctx = new BtermContext(_ctx, _parentState);
		BtermContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_bterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296);
			baterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BtermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bterm);
					setState(298);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(299);
					reloprt();
					setState(300);
					baexpr(0);
					}
					} 
				}
				setState(306);
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

	public static class BaexprContext extends ParserRuleContext {
		public BatermContext baterm() {
			return getRuleContext(BatermContext.class,0);
		}
		public BaexprContext baexpr() {
			return getRuleContext(BaexprContext.class,0);
		}
		public AsoprtContext asoprt() {
			return getRuleContext(AsoprtContext.class,0);
		}
		public BaexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitBaexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaexprContext baexpr() throws RecognitionException {
		return baexpr(0);
	}

	private BaexprContext baexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BaexprContext _localctx = new BaexprContext(_ctx, _parentState);
		BaexprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_baexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			baterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BaexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_baexpr);
					setState(310);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(311);
					asoprt();
					setState(312);
					baterm(0);
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class BatermContext extends ParserRuleContext {
		public BfactorContext bfactor() {
			return getRuleContext(BfactorContext.class,0);
		}
		public BatermContext baterm() {
			return getRuleContext(BatermContext.class,0);
		}
		public MmdoprtContext mmdoprt() {
			return getRuleContext(MmdoprtContext.class,0);
		}
		public BatermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baterm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitBaterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatermContext baterm() throws RecognitionException {
		return baterm(0);
	}

	private BatermContext baterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BatermContext _localctx = new BatermContext(_ctx, _parentState);
		BatermContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_baterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320);
			bfactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BatermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_baterm);
					setState(322);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(323);
					mmdoprt();
					setState(324);
					bfactor();
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class BfactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public CondexprContext condexpr() {
			return getRuleContext(CondexprContext.class,0);
		}
		public BfactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitBfactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfactorContext bfactor() throws RecognitionException {
		BfactorContext _localctx = new BfactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bfactor);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(LPAREN);
				setState(332);
				bexpr(0);
				setState(333);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				condexpr();
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

	public static class CondexprContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode Tile() { return getToken(GrammarParser.Tile, 0); }
		public TileXYContext tileXY() {
			return getRuleContext(TileXYContext.class,0);
		}
		public TerminalNode PlayerPosition() { return getToken(GrammarParser.PlayerPosition, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public CondexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitCondexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondexprContext condexpr() throws RecognitionException {
		CondexprContext _localctx = new CondexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condexpr);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				aexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(Tile);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				tileXY();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				match(PlayerPosition);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				coordinate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				match(ID);
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

	public static class AexprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public AsoprtContext asoprt() {
			return getRuleContext(AsoprtContext.class,0);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitAexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(347);
			term(0);
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
					_localctx = new AexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
					setState(349);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(350);
					asoprt();
					setState(351);
					term(0);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MmdoprtContext mmdoprt() {
			return getRuleContext(MmdoprtContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(361);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(362);
					mmdoprt();
					setState(363);
					factor();
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode DIGIT() { return getToken(GrammarParser.DIGIT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(LPAREN);
				setState(371);
				aexpr(0);
				setState(372);
				match(RPAREN);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(DIGIT);
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

	public static class LogoprtContext extends ParserRuleContext {
		public TerminalNode AndOprt() { return getToken(GrammarParser.AndOprt, 0); }
		public TerminalNode OrOprt() { return getToken(GrammarParser.OrOprt, 0); }
		public LogoprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logoprt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitLogoprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoprtContext logoprt() throws RecognitionException {
		LogoprtContext _localctx = new LogoprtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logoprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==AndOprt || _la==OrOprt) ) {
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

	public static class ReloprtContext extends ParserRuleContext {
		public TerminalNode CompareOprt() { return getToken(GrammarParser.CompareOprt, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(GrammarParser.GreaterOrEqual, 0); }
		public TerminalNode LessOrEqual() { return getToken(GrammarParser.LessOrEqual, 0); }
		public TerminalNode LessThan() { return getToken(GrammarParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(GrammarParser.GreaterThan, 0); }
		public TerminalNode NotOprt() { return getToken(GrammarParser.NotOprt, 0); }
		public ReloprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloprt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitReloprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReloprtContext reloprt() throws RecognitionException {
		ReloprtContext _localctx = new ReloprtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reloprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << GreaterThan) | (1L << GreaterOrEqual) | (1L << LessOrEqual) | (1L << NotOprt) | (1L << CompareOprt))) != 0)) ) {
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

	public static class AsoprtContext extends ParserRuleContext {
		public TerminalNode AddOprt() { return getToken(GrammarParser.AddOprt, 0); }
		public TerminalNode SubOprt() { return getToken(GrammarParser.SubOprt, 0); }
		public AsoprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asoprt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitAsoprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsoprtContext asoprt() throws RecognitionException {
		AsoprtContext _localctx = new AsoprtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asoprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==AddOprt || _la==SubOprt) ) {
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

	public static class MmdoprtContext extends ParserRuleContext {
		public TerminalNode MultiOprt() { return getToken(GrammarParser.MultiOprt, 0); }
		public TerminalNode DivOprt() { return getToken(GrammarParser.DivOprt, 0); }
		public TerminalNode ModOprt() { return getToken(GrammarParser.ModOprt, 0); }
		public MmdoprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmdoprt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitMmdoprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MmdoprtContext mmdoprt() throws RecognitionException {
		MmdoprtContext _localctx = new MmdoprtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mmdoprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiOprt) | (1L << DivOprt) | (1L << ModOprt))) != 0)) ) {
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

	public static class RspndContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(GrammarParser.Print, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public RspndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rspnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitRspnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RspndContext rspnd() throws RecognitionException {
		RspndContext _localctx = new RspndContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rspnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(Print);
			setState(386);
			match(STRING);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(GrammarParser.ON, 0); }
		public CoordinateContext coordinate() {
			return getRuleContext(CoordinateContext.class,0);
		}
		public TerminalNode Tile() { return getToken(GrammarParser.Tile, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(ON);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(389);
				coordinate();
				}
				break;
			case Tile:
				{
				setState(390);
				match(Tile);
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

	public static class GameLoopContext extends ParserRuleContext {
		public TerminalNode Game() { return getToken(GrammarParser.Game, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public LevelNameContext levelName() {
			return getRuleContext(LevelNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GrammarParser.RBRACE, 0); }
		public List<PlacementContext> placement() {
			return getRuleContexts(PlacementContext.class);
		}
		public PlacementContext placement(int i) {
			return getRuleContext(PlacementContext.class,i);
		}
		public GameLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGameLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameLoopContext gameLoop() throws RecognitionException {
		GameLoopContext _localctx = new GameLoopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gameLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Game);
			setState(394);
			match(LPAREN);
			setState(395);
			levelName();
			setState(396);
			match(RPAREN);
			setState(397);
			match(LBRACE);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Place) | (1L << Print))) != 0)) {
				{
				{
				setState(398);
				placement();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(RBRACE);
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

	public static class CoordinateContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_coordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LPAREN);
			setState(407);
			match(DIGIT);
			setState(408);
			match(COMMA);
			setState(409);
			match(DIGIT);
			setState(410);
			match(RPAREN);
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

	public static class TileXYContext extends ParserRuleContext {
		public TerminalNode Tile() { return getToken(GrammarParser.Tile, 0); }
		public TerminalNode PERIOD() { return getToken(GrammarParser.PERIOD, 0); }
		public TerminalNode COORDINATEX() { return getToken(GrammarParser.COORDINATEX, 0); }
		public TerminalNode COORDINATEY() { return getToken(GrammarParser.COORDINATEY, 0); }
		public TileXYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tileXY; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitTileXY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TileXYContext tileXY() throws RecognitionException {
		TileXYContext _localctx = new TileXYContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tileXY);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(Tile);
			setState(413);
			match(PERIOD);
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==COORDINATEX || _la==COORDINATEY) ) {
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

	public static class LevelNameContext extends ParserRuleContext {
		public TerminalNode Level() { return getToken(GrammarParser.Level, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public LevelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitLevelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelNameContext levelName() throws RecognitionException {
		LevelNameContext _localctx = new LevelNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_levelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(Level);
			setState(417);
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

	public static class GateContext extends ParserRuleContext {
		public TerminalNode Gate() { return getToken(GrammarParser.Gate, 0); }
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public LevelNameContext levelName() {
			return getRuleContext(LevelNameContext.class,0);
		}
		public TerminalNode Finish() { return getToken(GrammarParser.Finish, 0); }
		public GateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>)visitor).visitGate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GateContext gate() throws RecognitionException {
		GateContext _localctx = new GateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Gate);
			setState(420);
			match(LPAREN);
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Level:
				{
				setState(421);
				levelName();
				}
				break;
			case Finish:
				{
				setState(422);
				match(Finish);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425);
			match(RPAREN);
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
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		case 18:
			return bterm_sempred((BtermContext)_localctx, predIndex);
		case 19:
			return baexpr_sempred((BaexprContext)_localctx, predIndex);
		case 20:
			return baterm_sempred((BatermContext)_localctx, predIndex);
		case 23:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		case 24:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bterm_sempred(BtermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean baexpr_sempred(BaexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean baterm_sempred(BatermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\7\2U\n\2\f\2\16\2X\13\2\3\2\5\2[\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5q\n\5\f\5\16\5"+
		"t\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6"+
		"\u0083\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\5\7\u00aa"+
		"\n\7\3\b\3\b\3\b\6\b\u00af\n\b\r\b\16\b\u00b0\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\6\n\u00bc\n\n\r\n\16\n\u00bd\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13\u00c6\n\13\f\13\16\13\u00c9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00de"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e6\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3\16\3\16\5\16\u00f5\n\16\3"+
		"\17\3\17\3\17\7\17\u00fa\n\17\f\17\16\17\u00fd\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\5\20\u0105\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u010e\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011a"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0125\n\23\f\23"+
		"\16\23\u0128\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0131\n\24"+
		"\f\24\16\24\u0134\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013d"+
		"\n\25\f\25\16\25\u0140\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0149"+
		"\n\26\f\26\16\26\u014c\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u0153\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u015b\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u0164\n\31\f\31\16\31\u0167\13\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0170\n\32\f\32\16\32\u0173\13\32\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u017a\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 "+
		"\3 \3 \3!\3!\3!\5!\u018a\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0192\n\"\f\""+
		"\16\"\u0195\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&"+
		"\3&\3&\5&\u01aa\n&\3&\3&\3&\2\b$&(*\60\62\'\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\4\2++--\5\2\'*,,..\3\2"+
		"!\"\3\2#%\3\2\35\36\2\u01b6\2O\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bm\3\2\2"+
		"\2\nw\3\2\2\2\f\u00a9\3\2\2\2\16\u00ab\3\2\2\2\20\u00b4\3\2\2\2\22\u00b8"+
		"\3\2\2\2\24\u00c1\3\2\2\2\26\u00cc\3\2\2\2\30\u00d6\3\2\2\2\32\u00f4\3"+
		"\2\2\2\34\u00f6\3\2\2\2\36\u0100\3\2\2\2 \u0106\3\2\2\2\"\u0111\3\2\2"+
		"\2$\u011d\3\2\2\2&\u0129\3\2\2\2(\u0135\3\2\2\2*\u0141\3\2\2\2,\u0152"+
		"\3\2\2\2.\u015a\3\2\2\2\60\u015c\3\2\2\2\62\u0168\3\2\2\2\64\u0179\3\2"+
		"\2\2\66\u017b\3\2\2\28\u017d\3\2\2\2:\u017f\3\2\2\2<\u0181\3\2\2\2>\u0183"+
		"\3\2\2\2@\u0186\3\2\2\2B\u018b\3\2\2\2D\u0198\3\2\2\2F\u019e\3\2\2\2H"+
		"\u01a2\3\2\2\2J\u01a5\3\2\2\2LN\5\6\4\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RV\7\3\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y[\5\b\5\2ZY\3\2\2\2Z[\3\2\2\2"+
		"[\\\3\2\2\2\\]\5B\"\2]^\7\4\2\2^_\7\2\2\3_\3\3\2\2\2`f\5\16\b\2af\5\22"+
		"\n\2bf\5\34\17\2cf\7;\2\2df\7<\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2"+
		"\2\2ed\3\2\2\2f\5\3\2\2\2gh\7\b\2\2hi\7\'\2\2ij\78\2\2jk\7\n\2\2kl\7("+
		"\2\2l\7\3\2\2\2mn\7\26\2\2nr\7/\2\2oq\7\33\2\2po\3\2\2\2qt\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\60\2\2v\t\3\2\2\2wx\7\5\2\2x"+
		"y\7\61\2\2yz\7\34\2\2z{\7\66\2\2{|\7\37\2\2|}\7\62\2\2}\u0081\7/\2\2~"+
		"\u0080\5\f\7\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\60"+
		"\2\2\u0085\13\3\2\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7\61\2\2\u0088\u0089"+
		"\5$\23\2\u0089\u008a\7\62\2\2\u008a\u008e\7/\2\2\u008b\u008d\5\30\r\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\60\2\2"+
		"\u0092\u00aa\3\2\2\2\u0093\u0094\7\6\2\2\u0094\u0095\7\61\2\2\u0095\u0096"+
		"\5$\23\2\u0096\u0097\7\62\2\2\u0097\u009b\7/\2\2\u0098\u009a\5\30\r\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\60\2\2"+
		"\u009f\u00a0\7\7\2\2\u00a0\u00a4\7/\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u0086\3\2\2\2\u00a9\u0093\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00ac"+
		"\7\13\2\2\u00ac\u00ae\7/\2\2\u00ad\u00af\5\20\t\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\7\60\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5"+
		"\u00b6\7\66\2\2\u00b6\u00b7\7\67\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\r"+
		"\2\2\u00b9\u00bb\7/\2\2\u00ba\u00bc\5\24\13\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\7\60\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\5H%\2\u00c2\u00c3"+
		"\5\26\f\2\u00c3\u00c7\7/\2\2\u00c4\u00c6\5\30\r\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\25\3\2\2\2\u00cc"+
		"\u00cd\7\61\2\2\u00cd\u00ce\7\67\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0"+
		"\7\67\2\2\u00d0\u00d1\7\62\2\2\u00d1\27\3\2\2\2\u00d2\u00d7\5\32\16\2"+
		"\u00d3\u00d7\5\n\6\2\u00d4\u00d7\5\f\7\2\u00d5\u00d7\5> \2\u00d6\u00d2"+
		"\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\31\3\2\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00da\7\61\2\2\u00da\u00dd\78\2"+
		"\2\u00db\u00dc\7\64\2\2\u00dc\u00de\78\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e5\7\61\2\2\u00e0\u00e6\7\67\2\2"+
		"\u00e1\u00e2\7\67\2\2\u00e2\u00e3\7\66\2\2\u00e3\u00e6\7\67\2\2\u00e4"+
		"\u00e6\79\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\62\2\2\u00e8\u00e9\7\62\2\2\u00e9"+
		"\u00f5\5@!\2\u00ea\u00eb\7\22\2\2\u00eb\u00f0\7\61\2\2\u00ec\u00f1\7\24"+
		"\2\2\u00ed\u00f1\7\23\2\2\u00ee\u00f1\5J&\2\u00ef\u00f1\78\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\62\2\2\u00f3\u00f5\5@!\2\u00f4\u00d8\3\2"+
		"\2\2\u00f4\u00ea\3\2\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00fb"+
		"\7/\2\2\u00f8\u00fa\5\36\20\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff\35\3\2\2\2\u0100\u0101\78\2\2\u0101"+
		"\u0104\7&\2\2\u0102\u0105\5 \21\2\u0103\u0105\5\"\22\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0103\3\2\2\2\u0105\37\3\2\2\2\u0106\u0107\7\20\2\2\u0107\u0108"+
		"\7\61\2\2\u0108\u0109\7\67\2\2\u0109\u010a\7\63\2\2\u010a\u010d\7\67\2"+
		"\2\u010b\u010c\7\63\2\2\u010c\u010e\79\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\62\2\2\u0110!\3\2\2\2\u0111"+
		"\u0112\7\21\2\2\u0112\u0113\7\61\2\2\u0113\u0114\79\2\2\u0114\u0119\7"+
		"\63\2\2\u0115\u011a\7\67\2\2\u0116\u0117\7\67\2\2\u0117\u0118\7\66\2\2"+
		"\u0118\u011a\7\67\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\7\62\2\2\u011c#\3\2\2\2\u011d\u011e\b\23\1\2\u011e"+
		"\u011f\5&\24\2\u011f\u0126\3\2\2\2\u0120\u0121\f\4\2\2\u0121\u0122\5\66"+
		"\34\2\u0122\u0123\5&\24\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127%\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012a\b\24\1\2\u012a\u012b\5*\26\2\u012b\u0132"+
		"\3\2\2\2\u012c\u012d\f\4\2\2\u012d\u012e\58\35\2\u012e\u012f\5(\25\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012c\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\'\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136"+
		"\b\25\1\2\u0136\u0137\5*\26\2\u0137\u013e\3\2\2\2\u0138\u0139\f\4\2\2"+
		"\u0139\u013a\5:\36\2\u013a\u013b\5*\26\2\u013b\u013d\3\2\2\2\u013c\u0138"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		")\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\b\26\1\2\u0142\u0143\5,\27\2"+
		"\u0143\u014a\3\2\2\2\u0144\u0145\f\4\2\2\u0145\u0146\5<\37\2\u0146\u0147"+
		"\5,\27\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b+\3\2\2\2\u014c\u014a\3\2\2\2"+
		"\u014d\u014e\7\61\2\2\u014e\u014f\5$\23\2\u014f\u0150\7\62\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u0153\5.\30\2\u0152\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"-\3\2\2\2\u0154\u015b\5\60\31\2\u0155\u015b\7\34\2\2\u0156\u015b\5F$\2"+
		"\u0157\u015b\7 \2\2\u0158\u015b\5D#\2\u0159\u015b\78\2\2\u015a\u0154\3"+
		"\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b/\3\2\2\2\u015c\u015d\b\31\1\2"+
		"\u015d\u015e\5\62\32\2\u015e\u0165\3\2\2\2\u015f\u0160\f\4\2\2\u0160\u0161"+
		"\5:\36\2\u0161\u0162\5\62\32\2\u0162\u0164\3\2\2\2\u0163\u015f\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\61"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\b\32\1\2\u0169\u016a\5\64\33"+
		"\2\u016a\u0171\3\2\2\2\u016b\u016c\f\4\2\2\u016c\u016d\5<\37\2\u016d\u016e"+
		"\5\64\33\2\u016e\u0170\3\2\2\2\u016f\u016b\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\63\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176\5\60\31\2\u0176\u0177\7\62\2"+
		"\2\u0177\u017a\3\2\2\2\u0178\u017a\7\67\2\2\u0179\u0174\3\2\2\2\u0179"+
		"\u0178\3\2\2\2\u017a\65\3\2\2\2\u017b\u017c\t\2\2\2\u017c\67\3\2\2\2\u017d"+
		"\u017e\t\3\2\2\u017e9\3\2\2\2\u017f\u0180\t\4\2\2\u0180;\3\2\2\2\u0181"+
		"\u0182\t\5\2\2\u0182=\3\2\2\2\u0183\u0184\7\25\2\2\u0184\u0185\79\2\2"+
		"\u0185?\3\2\2\2\u0186\u0189\7\27\2\2\u0187\u018a\5D#\2\u0188\u018a\7\34"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aA\3\2\2\2\u018b\u018c"+
		"\7\17\2\2\u018c\u018d\7\61\2\2\u018d\u018e\5H%\2\u018e\u018f\7\62\2\2"+
		"\u018f\u0193\7/\2\2\u0190\u0192\5\30\r\2\u0191\u0190\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\7\60\2\2\u0197C\3\2\2\2\u0198\u0199\7\61\2"+
		"\2\u0199\u019a\7\67\2\2\u019a\u019b\7\63\2\2\u019b\u019c\7\67\2\2\u019c"+
		"\u019d\7\62\2\2\u019dE\3\2\2\2\u019e\u019f\7\34\2\2\u019f\u01a0\7\64\2"+
		"\2\u01a0\u01a1\t\6\2\2\u01a1G\3\2\2\2\u01a2\u01a3\7\30\2\2\u01a3\u01a4"+
		"\78\2\2\u01a4I\3\2\2\2\u01a5\u01a6\7\31\2\2\u01a6\u01a9\7\61\2\2\u01a7"+
		"\u01aa\5H%\2\u01a8\u01aa\7\32\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\62\2\2\u01acK\3\2\2\2$OVZer\u0081"+
		"\u008e\u009b\u00a4\u00a9\u00b0\u00bd\u00c7\u00d6\u00dd\u00e5\u00f0\u00f4"+
		"\u00fb\u0104\u010d\u0119\u0126\u0132\u013e\u014a\u0152\u015a\u0165\u0171"+
		"\u0179\u0189\u0193\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}