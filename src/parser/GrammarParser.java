// Generated from java-escape by ANTLR 4.11.1
package parser;
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
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
			"'.'", "'['", "']'", "'to<'", "'>('", "'*'", "'/'", "'mod'", "'+'", "'-'", 
			"'='", "'<>'", "'>'", "'<'", "'>='", "'<='", "'not'", "'and'", "'or'", 
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
	public String getGrammarFileName() { return "java-escape"; }

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
		public FeatureDefContext featureDef() {
			return getRuleContext(FeatureDefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
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
			setState(43);
			featureDef();
			setState(44);
			match(T__6);
			setState(45);
			match(T__7);
			setState(46);
			match(IDENT);
			setState(47);
			expr(0);
			setState(48);
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
			setState(50);
			match(T__8);
			setState(51);
			match(IDENT);
			setState(52);
			match(T__9);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(53);
				field();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
			setState(61);
			match(IDENT);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(62);
				match(T__10);
				setState(63);
				match(IDENT);
				}
			}

			setState(66);
			match(T__11);
			setState(67);
			type();
			setState(68);
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
			setState(70);
			match(IDENT);
			setState(71);
			match(T__11);
			setState(72);
			type();
			setState(73);
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
			setState(75);
			match(IDENT);
			setState(76);
			match(T__11);
			setState(77);
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
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
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
			setState(79);
			match(T__12);
			setState(80);
			match(IDENT);
			setState(81);
			match(T__13);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(82);
				param();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(83);
					match(T__10);
					setState(84);
					param();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(T__14);
			setState(93);
			match(T__11);
			setState(94);
			type();
			setState(95);
			match(T__15);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(96);
				match(T__16);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(97);
					defVar();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(105);
			match(T__17);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710763578048512L) != 0) {
				{
				{
				setState(106);
				sentence();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__18);
				setState(115);
				expr(0);
				setState(116);
				match(T__19);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710763578048512L) != 0) {
					{
					{
					setState(117);
					sentence();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(123);
					match(T__20);
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710763578048512L) != 0) {
						{
						{
						setState(124);
						sentence();
						}
						}
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(132);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__21);
				setState(135);
				sentence();
				setState(136);
				match(T__22);
				setState(137);
				expr(0);
				setState(138);
				match(T__23);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710763578048512L) != 0) {
					{
					{
					setState(139);
					sentence();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__24);
				setState(148);
				expr(0);
				setState(149);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(T__25);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710762801577984L) != 0) {
					{
					setState(152);
					expr(0);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(153);
						match(T__10);
						setState(154);
						expr(0);
						}
						}
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(162);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__26);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710762801577984L) != 0) {
					{
					setState(164);
					expr(0);
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(165);
						match(T__10);
						setState(166);
						expr(0);
						}
						}
						setState(171);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(174);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(IDENT);
				setState(176);
				match(T__27);
				setState(177);
				expr(0);
				setState(178);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(T__28);
				setState(181);
				expr(0);
				setState(182);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				expr(0);
				setState(185);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(190);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(191);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(192);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(193);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(194);
				match(IDENT);
				setState(195);
				match(T__13);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175710762801577984L) != 0) {
					{
					setState(196);
					expr(0);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(197);
						match(T__10);
						setState(198);
						expr(0);
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(206);
				match(T__14);
				}
				break;
			case 6:
				{
				setState(207);
				match(T__13);
				setState(208);
				expr(0);
				setState(209);
				match(T__14);
				}
				break;
			case 7:
				{
				setState(211);
				match(T__32);
				setState(212);
				type();
				setState(213);
				match(T__33);
				setState(214);
				expr(0);
				setState(215);
				match(T__14);
				}
				break;
			case 8:
				{
				setState(217);
				match(T__45);
				setState(218);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(222);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(228);
						match(T__46);
						setState(229);
						expr(3);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(231);
						match(T__47);
						setState(232);
						expr(2);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(234);
						match(T__29);
						setState(235);
						match(IDENT);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237);
						match(T__30);
						setState(238);
						expr(0);
						setState(239);
						match(T__31);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(242);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 69269232549888L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(247);
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
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(T__50);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(T__30);
				setState(252);
				match(INT_CONSTANT);
				setState(253);
				match(T__31);
				setState(254);
				type();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0003"+
		"\u0000\u001e\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000"+
		"\f\u0000%\t\u0000\u0003\u0000\'\b\u0000\u0003\u0000)\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"7\b\u0001\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"V\b\u0005\n\u0005\f\u0005Y\t\u0005\u0003\u0005[\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005c\b"+
		"\u0005\n\u0005\f\u0005f\t\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006w\b"+
		"\u0006\n\u0006\f\u0006z\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006~\b"+
		"\u0006\n\u0006\f\u0006\u0081\t\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009c\b\u0006\n"+
		"\u0006\f\u0006\u009f\t\u0006\u0003\u0006\u00a1\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a8\b\u0006\n"+
		"\u0006\f\u0006\u00ab\t\u0006\u0003\u0006\u00ad\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00bc\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00c8\b\u0007\n\u0007\f\u0007\u00cb\t\u0007\u0003\u0007\u00cd\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00dc\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00f4\b\u0007\n\u0007\f\u0007\u00f7\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0101\b\b\u0001\b\u0000\u0001\u000e\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000#%\u0001\u0000&\'\u0001\u0000(-\u0128"+
		"\u0000\u0012\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004"+
		"=\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000\u0000\u0000"+
		"\u000e\u00db\u0001\u0000\u0000\u0000\u0010\u0100\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u00056\u0000\u0000\u0014"+
		"(\u0005\u0002\u0000\u0000\u0015\u001d\u0005\u0003\u0000\u0000\u0016\u001a"+
		"\u0005\u0004\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001e"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u0016"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e&\u0001"+
		"\u0000\u0000\u0000\u001f#\u0005\u0005\u0000\u0000 \"\u0003\u0004\u0002"+
		"\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000&\u001f\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(\u0015\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0006\u0000\u0000"+
		"+,\u0003\n\u0005\u0000,-\u0005\u0007\u0000\u0000-.\u0005\b\u0000\u0000"+
		"./\u00056\u0000\u0000/0\u0003\u000e\u0007\u000001\u0005\u0000\u0000\u0001"+
		"1\u0001\u0001\u0000\u0000\u000023\u0005\t\u0000\u000034\u00056\u0000\u0000"+
		"48\u0005\n\u0000\u000057\u0003\u0006\u0003\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\u0007"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=@\u00056\u0000\u0000>?\u0005"+
		"\u000b\u0000\u0000?A\u00056\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005\f\u0000\u0000CD\u0003"+
		"\u0010\b\u0000DE\u0005\u0002\u0000\u0000E\u0005\u0001\u0000\u0000\u0000"+
		"FG\u00056\u0000\u0000GH\u0005\f\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0005"+
		"\u0002\u0000\u0000J\u0007\u0001\u0000\u0000\u0000KL\u00056\u0000\u0000"+
		"LM\u0005\f\u0000\u0000MN\u0003\u0010\b\u0000N\t\u0001\u0000\u0000\u0000"+
		"OP\u0005\r\u0000\u0000PQ\u00056\u0000\u0000QZ\u0005\u000e\u0000\u0000"+
		"RW\u0003\b\u0004\u0000ST\u0005\u000b\u0000\u0000TV\u0003\b\u0004\u0000"+
		"US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000ZR\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u000f\u0000\u0000]^\u0005\f\u0000\u0000^_"+
		"\u0003\u0010\b\u0000_g\u0005\u0010\u0000\u0000`d\u0005\u0011\u0000\u0000"+
		"ac\u0003\u0004\u0002\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0005\u0012\u0000\u0000"+
		"jl\u0003\f\u0006\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0007\u0000\u0000q\u000b\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0003\u000e\u0007\u0000"+
		"tx\u0005\u0014\u0000\u0000uw\u0003\f\u0006\u0000vu\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u0082\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{\u007f"+
		"\u0005\u0015\u0000\u0000|~\u0003\f\u0006\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082{\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0007\u0000\u0000\u0085\u00bc\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0016\u0000\u0000\u0087\u0088\u0003\f\u0006\u0000\u0088\u0089\u0005\u0017"+
		"\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u008e\u0005\u0018"+
		"\u0000\u0000\u008b\u008d\u0003\f\u0006\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0007\u0000"+
		"\u0000\u0092\u00bc\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0019\u0000"+
		"\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005\u0002\u0000"+
		"\u0000\u0096\u00bc\u0001\u0000\u0000\u0000\u0097\u00a0\u0005\u001a\u0000"+
		"\u0000\u0098\u009d\u0003\u000e\u0007\u0000\u0099\u009a\u0005\u000b\u0000"+
		"\u0000\u009a\u009c\u0003\u000e\u0007\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00bc\u0005\u0002\u0000\u0000\u00a3\u00ac\u0005\u001b\u0000"+
		"\u0000\u00a4\u00a9\u0003\u000e\u0007\u0000\u00a5\u00a6\u0005\u000b\u0000"+
		"\u0000\u00a6\u00a8\u0003\u000e\u0007\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00bc\u0005\u0002\u0000\u0000\u00af\u00b0\u00056\u0000\u0000"+
		"\u00b0\u00b1\u0005\u001c\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000"+
		"\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001d\u0000\u0000\u00b5\u00b6\u0003\u000e\u0007\u0000"+
		"\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0003\u000e\u0007\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000"+
		"\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bbr\u0001\u0000\u0000\u0000\u00bb"+
		"\u0086\u0001\u0000\u0000\u0000\u00bb\u0093\u0001\u0000\u0000\u0000\u00bb"+
		"\u0097\u0001\u0000\u0000\u0000\u00bb\u00a3\u0001\u0000\u0000\u0000\u00bb"+
		"\u00af\u0001\u0000\u0000\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0006\u0007\uffff\uffff\u0000\u00be\u00dc\u00054\u0000\u0000\u00bf\u00dc"+
		"\u00055\u0000\u0000\u00c0\u00dc\u00059\u0000\u0000\u00c1\u00dc\u00056"+
		"\u0000\u0000\u00c2\u00c3\u00056\u0000\u0000\u00c3\u00cc\u0005\u000e\u0000"+
		"\u0000\u00c4\u00c9\u0003\u000e\u0007\u0000\u00c5\u00c6\u0005\u000b\u0000"+
		"\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00dc\u0005\u000f\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000"+
		"\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000\u00d1\u00d2\u0005\u000f\u0000"+
		"\u0000\u00d2\u00dc\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005!\u0000\u0000"+
		"\u00d4\u00d5\u0003\u0010\b\u0000\u00d5\u00d6\u0005\"\u0000\u0000\u00d6"+
		"\u00d7\u0003\u000e\u0007\u0000\u00d7\u00d8\u0005\u000f\u0000\u0000\u00d8"+
		"\u00dc\u0001\u0000\u0000\u0000\u00d9\u00da\u0005.\u0000\u0000\u00da\u00dc"+
		"\u0003\u000e\u0007\u0003\u00db\u00bd\u0001\u0000\u0000\u0000\u00db\u00bf"+
		"\u0001\u0000\u0000\u0000\u00db\u00c0\u0001\u0000\u0000\u0000\u00db\u00c1"+
		"\u0001\u0000\u0000\u0000\u00db\u00c2\u0001\u0000\u0000\u0000\u00db\u00cf"+
		"\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00f5\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\n\u0006\u0000\u0000\u00de\u00df\u0007\u0000\u0000\u0000\u00df\u00f4\u0003"+
		"\u000e\u0007\u0007\u00e0\u00e1\n\u0005\u0000\u0000\u00e1\u00e2\u0007\u0001"+
		"\u0000\u0000\u00e2\u00f4\u0003\u000e\u0007\u0006\u00e3\u00e4\n\u0002\u0000"+
		"\u0000\u00e4\u00e5\u0005/\u0000\u0000\u00e5\u00f4\u0003\u000e\u0007\u0003"+
		"\u00e6\u00e7\n\u0001\u0000\u0000\u00e7\u00e8\u00050\u0000\u0000\u00e8"+
		"\u00f4\u0003\u000e\u0007\u0002\u00e9\u00ea\n\t\u0000\u0000\u00ea\u00eb"+
		"\u0005\u001e\u0000\u0000\u00eb\u00f4\u00056\u0000\u0000\u00ec\u00ed\n"+
		"\b\u0000\u0000\u00ed\u00ee\u0005\u001f\u0000\u0000\u00ee\u00ef\u0003\u000e"+
		"\u0007\u0000\u00ef\u00f0\u0005 \u0000\u0000\u00f0\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\n\u0004\u0000\u0000\u00f2\u00f4\u0007\u0002\u0000\u0000"+
		"\u00f3\u00dd\u0001\u0000\u0000\u0000\u00f3\u00e0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e3\u0001\u0000\u0000\u0000\u00f3\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e9\u0001\u0000\u0000\u0000\u00f3\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u000f\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u0101\u00051\u0000\u0000\u00f9\u0101\u00052\u0000\u0000\u00fa\u0101"+
		"\u00053\u0000\u0000\u00fb\u00fc\u0005\u001f\u0000\u0000\u00fc\u00fd\u0005"+
		"4\u0000\u0000\u00fd\u00fe\u0005 \u0000\u0000\u00fe\u0101\u0003\u0010\b"+
		"\u0000\u00ff\u0101\u00056\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000"+
		"\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000\u0000"+
		"\u0100\u00fb\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0011\u0001\u0000\u0000\u0000\u001b\u001a\u001d#&(8@WZdgmx\u007f"+
		"\u0082\u008e\u009d\u00a0\u00a9\u00ac\u00bb\u00c9\u00cc\u00db\u00f3\u00f5"+
		"\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}