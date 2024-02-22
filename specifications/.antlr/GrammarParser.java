// Generated from c://Users//Paula//Desktop//DLP//Practicas//DLP-Proyecto//specifications//Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, INT_CONSTANT=52, 
		REAL_CONSTANT=53, IDENT=54, LINE_COMMENT=55, MULTILINE_COMMENT=56, CHAR_CONSTANT=57, 
		WHITESPACE=58;
	public static final int
		RULE_program = 0, RULE_defTypes = 1, RULE_defVar = 2, RULE_field = 3, 
		RULE_param = 4, RULE_featureDef = 5, RULE_sentence = 6, RULE_expr = 7, 
		RULE_type = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defTypes", "defVar", "field", "param", "featureDef", "sentence", 
			"expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'global'", "'types'", "'vars'", "'create'", 
			"'end'", "'run'", "'deftuple'", "'as'", "','", "':'", "'feature'", "'('", 
			"')'", "'is'", "'local'", "'do'", "'if'", "'then'", "'else'", "'from'", 
			"'until'", "'loop'", "'read'", "'print'", "'println'", "':='", "'return'", 
			"'.'", "'['", "']'", "'-'", "'*'", "'/'", "'mod'", "'+'", "'='", "'<>'", 
			"'>'", "'<'", "'>='", "'<='", "'to<'", "'>('", "'not'", "'and'", "'or'", 
			"'INTEGER'", "'DOUBLE'", "'CHARACTER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "CHAR_CONSTANT", "WHITESPACE"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<FeatureDefContext> featureDef() {
			return getRuleContexts(FeatureDefContext.class);
		}
		public FeatureDefContext featureDef(int i) {
			return getRuleContext(FeatureDefContext.class,i);
		}
		public List<DefTypesContext> defTypes() {
			return getRuleContexts(DefTypesContext.class);
		}
		public DefTypesContext defTypes(int i) {
			return getRuleContext(DefTypesContext.class,i);
		}
		public List<DefVarContext> defVar() {
			return getRuleContexts(DefVarContext.class);
		}
		public DefVarContext defVar(int i) {
			return getRuleContext(DefVarContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(IDENT);
			setState(20);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(21);
				match(T__2);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(22);
					match(T__3);
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(23);
						defTypes();
						}
						}
						setState(28);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(31);
					match(T__4);
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENT) {
						{
						{
						setState(32);
						defVar();
						}
						}
						setState(37);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(42);
			match(T__5);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(IDENT);
				setState(44);
				match(T__1);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				featureDef();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			sentence();
			setState(57);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefTypesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public DefTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTypes; }
	}

	public final DefTypesContext defTypes() throws RecognitionException {
		DefTypesContext _localctx = new DefTypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__8);
			setState(60);
			match(IDENT);
			setState(61);
			match(T__9);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(62);
				field();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefVarContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVar; }
	}

	public final DefVarContext defVar() throws RecognitionException {
		DefVarContext _localctx = new DefVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(71);
				match(T__10);
				setState(72);
				match(IDENT);
				}
			}

			setState(75);
			match(T__11);
			setState(76);
			type();
			setState(77);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IDENT);
			setState(80);
			match(T__11);
			setState(81);
			type();
			setState(82);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENT);
			setState(85);
			match(T__11);
			setState(86);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureDefContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<DefVarContext> defVar() {
			return getRuleContexts(DefVarContext.class);
		}
		public DefVarContext defVar(int i) {
			return getRuleContext(DefVarContext.class,i);
		}
		public FeatureDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDef; }
	}

	public final FeatureDefContext featureDef() throws RecognitionException {
		FeatureDefContext _localctx = new FeatureDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_featureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__12);
			setState(89);
			match(IDENT);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(90);
				match(T__13);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(91);
					param();
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(92);
						match(T__10);
						setState(93);
						param();
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(101);
				match(T__14);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(104);
				match(T__11);
				setState(105);
				type();
				}
			}

			setState(108);
			match(T__15);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(109);
				match(T__16);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(110);
					defVar();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(T__17);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772481536L) != 0)) {
				{
				{
				setState(119);
				sentence();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentence);
		int _la;
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__18);
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					expr(0);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0) );
				setState(133);
				match(T__19);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772481536L) != 0)) {
					{
					{
					setState(134);
					sentence();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(140);
					match(T__20);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772481536L) != 0)) {
						{
						{
						setState(141);
						sentence();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(149);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(151);
					match(T__21);
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(152);
							sentence();
							}
							} 
						}
						setState(157);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
				}

				setState(160);
				match(T__22);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					expr(0);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0) );
				setState(166);
				match(T__23);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772481536L) != 0)) {
					{
					{
					setState(167);
					sentence();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__24);
				setState(176);
				expr(0);
				setState(177);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(T__25);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0)) {
					{
					setState(180);
					expr(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(181);
						match(T__10);
						setState(182);
						expr(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(T__26);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0)) {
					{
					setState(192);
					expr(0);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(193);
						match(T__10);
						setState(194);
						expr(0);
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(202);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				expr(0);
				setState(204);
				match(T__27);
				setState(205);
				expr(0);
				setState(206);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(T__28);
				setState(209);
				expr(0);
				setState(210);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				match(IDENT);
				setState(213);
				match(T__13);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0)) {
					{
					setState(214);
					expr(0);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(215);
						match(T__10);
						setState(216);
						expr(0);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(224);
				match(T__14);
				setState(225);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(229);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(230);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(231);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(232);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(233);
				match(T__13);
				setState(234);
				expr(0);
				setState(235);
				match(T__14);
				}
				break;
			case 6:
				{
				setState(237);
				match(IDENT);
				setState(238);
				match(T__13);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987622400L) != 0)) {
					{
					setState(239);
					expr(0);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(240);
						match(T__10);
						setState(241);
						expr(0);
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(T__14);
				}
				break;
			case 7:
				{
				setState(250);
				match(T__32);
				setState(251);
				expr(8);
				}
				break;
			case 8:
				{
				setState(252);
				match(T__43);
				setState(253);
				type();
				setState(254);
				match(T__44);
				setState(255);
				expr(0);
				setState(256);
				match(T__14);
				}
				break;
			case 9:
				{
				setState(258);
				match(T__45);
				setState(259);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(263);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						match(T__46);
						setState(273);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(275);
						match(T__47);
						setState(276);
						expr(2);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(278);
						match(T__29);
						setState(279);
						match(IDENT);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(281);
						match(T__30);
						setState(282);
						expr(0);
						setState(283);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__50);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(T__30);
				setState(294);
				match(INT_CONSTANT);
				setState(295);
				match(T__31);
				setState(296);
				type();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(IDENT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0003"+
		"\u0000\u001e\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000"+
		"\f\u0000%\t\u0000\u0003\u0000\'\b\u0000\u0003\u0000)\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000.\b\u0000\u000b\u0000\f\u0000/\u0001"+
		"\u0000\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005_\b\u0005\n\u0005\f\u0005b\t\u0005\u0003\u0005"+
		"d\b\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005p\b\u0005"+
		"\n\u0005\f\u0005s\t\u0005\u0003\u0005u\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005y\b\u0005\n\u0005\f\u0005|\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0082\b\u0006\u000b\u0006\f\u0006"+
		"\u0083\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006\f\u0006"+
		"\u008b\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008f\b\u0006\n\u0006"+
		"\f\u0006\u0092\t\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006\u009d"+
		"\t\u0006\u0003\u0006\u009f\b\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00a3\b\u0006\u000b\u0006\f\u0006\u00a4\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00a9\b\u0006\n\u0006\f\u0006\u00ac\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b8\b\u0006\n\u0006\f\u0006\u00bb"+
		"\t\u0006\u0003\u0006\u00bd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00c4\b\u0006\n\u0006\f\u0006\u00c7"+
		"\t\u0006\u0003\u0006\u00c9\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00da\b\u0006\n\u0006\f\u0006\u00dd\t\u0006\u0003\u0006\u00df"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e3\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00f3\b\u0007\n\u0007\f\u0007\u00f6\t\u0007\u0003"+
		"\u0007\u00f8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0105\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u011e\b\u0007\n\u0007\f\u0007\u0121\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u012b\b\b\u0001\b\u0000\u0001\u000e\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000\"$\u0002\u0000!!%%\u0001\u0000&+"+
		"\u015d\u0000\u0012\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000"+
		"\u0004F\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bT\u0001"+
		"\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\f\u00e2\u0001\u0000\u0000"+
		"\u0000\u000e\u0104\u0001\u0000\u0000\u0000\u0010\u012a\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u00056\u0000\u0000"+
		"\u0014(\u0005\u0002\u0000\u0000\u0015\u001d\u0005\u0003\u0000\u0000\u0016"+
		"\u001a\u0005\u0004\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000\u0018"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d"+
		"\u0016\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"&\u0001\u0000\u0000\u0000\u001f#\u0005\u0005\u0000\u0000 \"\u0003\u0004"+
		"\u0002\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\u001f\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\')\u0001\u0000\u0000\u0000(\u0015\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*-\u0005\u0006\u0000"+
		"\u0000+,\u00056\u0000\u0000,.\u0005\u0002\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u000013\u0003\n\u0005\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0005\u0007\u0000\u0000"+
		"78\u0005\b\u0000\u000089\u0003\f\u0006\u00009:\u0005\u0000\u0000\u0001"+
		":\u0001\u0001\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u00056\u0000\u0000"+
		"=A\u0005\n\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0007"+
		"\u0000\u0000E\u0003\u0001\u0000\u0000\u0000FI\u00056\u0000\u0000GH\u0005"+
		"\u000b\u0000\u0000HJ\u00056\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\f\u0000\u0000LM\u0003"+
		"\u0010\b\u0000MN\u0005\u0002\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OP\u00056\u0000\u0000PQ\u0005\f\u0000\u0000QR\u0003\u0010\b\u0000RS\u0005"+
		"\u0002\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TU\u00056\u0000\u0000"+
		"UV\u0005\f\u0000\u0000VW\u0003\u0010\b\u0000W\t\u0001\u0000\u0000\u0000"+
		"XY\u0005\r\u0000\u0000Yf\u00056\u0000\u0000Zc\u0005\u000e\u0000\u0000"+
		"[`\u0003\b\u0004\u0000\\]\u0005\u000b\u0000\u0000]_\u0003\b\u0004\u0000"+
		"^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000c[\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0005\u000f\u0000\u0000fZ\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hi\u0005\f\u0000\u0000"+
		"ik\u0003\u0010\b\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lt\u0005\u0010\u0000\u0000mq\u0005\u0011\u0000"+
		"\u0000np\u0003\u0004\u0002\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tm\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vz\u0005\u0012\u0000"+
		"\u0000wy\u0003\f\u0006\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u0007\u0000\u0000~\u000b"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0005\u0013\u0000\u0000\u0080\u0082"+
		"\u0003\u000e\u0007\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0089"+
		"\u0005\u0014\u0000\u0000\u0086\u0088\u0003\f\u0006\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0093\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0090\u0005"+
		"\u0015\u0000\u0000\u008d\u008f\u0003\f\u0006\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u00e3\u0001\u0000"+
		"\u0000\u0000\u0097\u009b\u0005\u0016\u0000\u0000\u0098\u009a\u0003\f\u0006"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0017\u0000"+
		"\u0000\u00a1\u00a3\u0003\u000e\u0007\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00aa\u0005\u0018\u0000\u0000\u00a7\u00a9\u0003\f\u0006\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0007\u0000\u0000\u00ae\u00e3\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000"+
		"\u00b1\u00b2\u0005\u0002\u0000\u0000\u00b2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00bc\u0005\u001a\u0000\u0000\u00b4\u00b9\u0003\u000e\u0007\u0000"+
		"\u00b5\u00b6\u0005\u000b\u0000\u0000\u00b6\u00b8\u0003\u000e\u0007\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00e3\u0005\u0002\u0000\u0000"+
		"\u00bf\u00c8\u0005\u001b\u0000\u0000\u00c0\u00c5\u0003\u000e\u0007\u0000"+
		"\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00e3\u0005\u0002\u0000\u0000"+
		"\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000"+
		"\u00cd\u00ce\u0003\u000e\u0007\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000"+
		"\u00cf\u00e3\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u001d\u0000\u0000"+
		"\u00d1\u00d2\u0003\u000e\u0007\u0000\u00d2\u00d3\u0005\u0002\u0000\u0000"+
		"\u00d3\u00e3\u0001\u0000\u0000\u0000\u00d4\u00d5\u00056\u0000\u0000\u00d5"+
		"\u00de\u0005\u000e\u0000\u0000\u00d6\u00db\u0003\u000e\u0007\u0000\u00d7"+
		"\u00d8\u0005\u000b\u0000\u0000\u00d8\u00da\u0003\u000e\u0007\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00d6\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1"+
		"\u00e3\u0005\u0002\u0000\u0000\u00e2\u007f\u0001\u0000\u0000\u0000\u00e2"+
		"\u009e\u0001\u0000\u0000\u0000\u00e2\u00af\u0001\u0000\u0000\u0000\u00e2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00e2\u00bf\u0001\u0000\u0000\u0000\u00e2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00e2\u00d0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0006\u0007\uffff\uffff\u0000\u00e5\u0105\u00054\u0000\u0000\u00e6\u0105"+
		"\u00055\u0000\u0000\u00e7\u0105\u00059\u0000\u0000\u00e8\u0105\u00056"+
		"\u0000\u0000\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00eb\u0003\u000e"+
		"\u0007\u0000\u00eb\u00ec\u0005\u000f\u0000\u0000\u00ec\u0105\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u00056\u0000\u0000\u00ee\u00f7\u0005\u000e\u0000"+
		"\u0000\u00ef\u00f4\u0003\u000e\u0007\u0000\u00f0\u00f1\u0005\u000b\u0000"+
		"\u0000\u00f1\u00f3\u0003\u000e\u0007\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u0105\u0005\u000f\u0000\u0000\u00fa\u00fb\u0005!\u0000\u0000"+
		"\u00fb\u0105\u0003\u000e\u0007\b\u00fc\u00fd\u0005,\u0000\u0000\u00fd"+
		"\u00fe\u0003\u0010\b\u0000\u00fe\u00ff\u0005-\u0000\u0000\u00ff\u0100"+
		"\u0003\u000e\u0007\u0000\u0100\u0101\u0005\u000f\u0000\u0000\u0101\u0105"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005.\u0000\u0000\u0103\u0105\u0003"+
		"\u000e\u0007\u0003\u0104\u00e4\u0001\u0000\u0000\u0000\u0104\u00e6\u0001"+
		"\u0000\u0000\u0000\u0104\u00e7\u0001\u0000\u0000\u0000\u0104\u00e8\u0001"+
		"\u0000\u0000\u0000\u0104\u00e9\u0001\u0000\u0000\u0000\u0104\u00ed\u0001"+
		"\u0000\u0000\u0000\u0104\u00fa\u0001\u0000\u0000\u0000\u0104\u00fc\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u011f\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\n\u0007\u0000\u0000\u0107\u0108\u0007\u0000"+
		"\u0000\u0000\u0108\u011e\u0003\u000e\u0007\b\u0109\u010a\n\u0006\u0000"+
		"\u0000\u010a\u010b\u0007\u0001\u0000\u0000\u010b\u011e\u0003\u000e\u0007"+
		"\u0007\u010c\u010d\n\u0005\u0000\u0000\u010d\u010e\u0007\u0002\u0000\u0000"+
		"\u010e\u011e\u0003\u000e\u0007\u0006\u010f\u0110\n\u0002\u0000\u0000\u0110"+
		"\u0111\u0005/\u0000\u0000\u0111\u011e\u0003\u000e\u0007\u0003\u0112\u0113"+
		"\n\u0001\u0000\u0000\u0113\u0114\u00050\u0000\u0000\u0114\u011e\u0003"+
		"\u000e\u0007\u0002\u0115\u0116\n\n\u0000\u0000\u0116\u0117\u0005\u001e"+
		"\u0000\u0000\u0117\u011e\u00056\u0000\u0000\u0118\u0119\n\t\u0000\u0000"+
		"\u0119\u011a\u0005\u001f\u0000\u0000\u011a\u011b\u0003\u000e\u0007\u0000"+
		"\u011b\u011c\u0005 \u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d"+
		"\u0106\u0001\u0000\u0000\u0000\u011d\u0109\u0001\u0000\u0000\u0000\u011d"+
		"\u010c\u0001\u0000\u0000\u0000\u011d\u010f\u0001\u0000\u0000\u0000\u011d"+
		"\u0112\u0001\u0000\u0000\u0000\u011d\u0115\u0001\u0000\u0000\u0000\u011d"+
		"\u0118\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u000f\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u012b\u00051\u0000\u0000\u0123\u012b\u00052\u0000\u0000\u0124\u012b\u0005"+
		"3\u0000\u0000\u0125\u0126\u0005\u001f\u0000\u0000\u0126\u0127\u00054\u0000"+
		"\u0000\u0127\u0128\u0005 \u0000\u0000\u0128\u012b\u0003\u0010\b\u0000"+
		"\u0129\u012b\u00056\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a"+
		"\u0123\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a"+
		"\u0125\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u0011\u0001\u0000\u0000\u0000%\u001a\u001d#&(/4AI`cfjqtz\u0083\u0089"+
		"\u0090\u0093\u009b\u009e\u00a4\u00aa\u00b9\u00bc\u00c5\u00c8\u00db\u00de"+
		"\u00e2\u00f4\u00f7\u0104\u011d\u011f\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}