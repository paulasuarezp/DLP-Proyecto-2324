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
		RULE_param = 4, RULE_featureDef = 5, RULE_runCall = 6, RULE_sentence = 7, 
		RULE_expr = 8, RULE_type = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defTypes", "defVar", "field", "param", "featureDef", "runCall", 
			"sentence", "expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'global'", "'types'", "'vars'", "'create'", 
			"'end'", "'deftuple'", "'as'", "','", "':'", "'feature'", "'('", "')'", 
			"'is'", "'local'", "'do'", "'run'", "'if'", "'then'", "'else'", "'from'", 
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
		public RunCallContext runCall() {
			return getRuleContext(RunCallContext.class,0);
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
			setState(20);
			match(T__0);
			setState(21);
			match(IDENT);
			setState(22);
			match(T__1);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(23);
				match(T__2);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(24);
					match(T__3);
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(25);
						defTypes();
						}
						}
						setState(30);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(33);
					match(T__4);
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENT) {
						{
						{
						setState(34);
						defVar();
						}
						}
						setState(39);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(44);
			match(T__5);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(IDENT);
				setState(46);
				match(T__1);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				featureDef();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(56);
			match(T__6);
			setState(57);
			runCall();
			setState(58);
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
			setState(60);
			match(T__7);
			setState(61);
			match(IDENT);
			setState(62);
			match(T__8);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(63);
				field();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(71);
			match(IDENT);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(72);
				match(T__9);
				setState(73);
				match(IDENT);
				}
			}

			setState(76);
			match(T__10);
			setState(77);
			type();
			setState(78);
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
			setState(80);
			match(IDENT);
			setState(81);
			match(T__10);
			setState(82);
			type();
			setState(83);
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
			setState(85);
			match(IDENT);
			setState(86);
			match(T__10);
			setState(87);
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
			setState(89);
			match(T__11);
			setState(90);
			match(IDENT);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(91);
				match(T__12);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(92);
					param();
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(93);
						match(T__9);
						setState(94);
						param();
						}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(102);
				match(T__13);
				}
			}

			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(105);
				match(T__10);
				setState(106);
				type();
				}
			}

			setState(109);
			match(T__14);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(110);
				match(T__15);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(111);
					defVar();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
			match(T__16);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0) {
				{
				{
				setState(120);
				sentence();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
	public static class RunCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runCall; }
	}

	public final RunCallContext runCall() throws RecognitionException {
		RunCallContext _localctx = new RunCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_runCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__17);
			setState(129);
			match(IDENT);
			setState(130);
			match(T__12);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
				{
				setState(131);
				expr(0);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(132);
					match(T__9);
					setState(133);
					expr(0);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141);
			match(T__13);
			setState(142);
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
		enterRule(_localctx, 14, RULE_sentence);
		int _la;
		try {
			int _alt;
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__18);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					expr(0);
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0 );
				setState(150);
				match(T__19);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0) {
					{
					{
					setState(151);
					sentence();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(157);
					match(T__20);
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0) {
						{
						{
						setState(158);
						sentence();
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(166);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(168);
					match(T__21);
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(169);
							sentence();
							}
							} 
						}
						setState(174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
				}

				setState(177);
				match(T__22);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					expr(0);
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0 );
				setState(183);
				match(T__23);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0) {
					{
					{
					setState(184);
					sentence();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__24);
				setState(193);
				expr(0);
				setState(194);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(T__25);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
					{
					setState(197);
					expr(0);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(198);
						match(T__9);
						setState(199);
						expr(0);
						}
						}
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(207);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(T__26);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
					{
					setState(209);
					expr(0);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(210);
						match(T__9);
						setState(211);
						expr(0);
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(219);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				expr(0);
				setState(221);
				match(T__27);
				setState(222);
				expr(0);
				setState(223);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				match(T__28);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
					{
					setState(226);
					expr(0);
					}
				}

				setState(229);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(IDENT);
				setState(231);
				match(T__12);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
					{
					setState(232);
					expr(0);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(233);
						match(T__9);
						setState(234);
						expr(0);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(242);
				match(T__13);
				setState(243);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(247);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(248);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(249);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(250);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(251);
				match(T__12);
				setState(252);
				expr(0);
				setState(253);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(255);
				match(IDENT);
				setState(256);
				match(T__12);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) {
					{
					setState(257);
					expr(0);
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(258);
						match(T__9);
						setState(259);
						expr(0);
						}
						}
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(267);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(268);
				match(T__32);
				setState(269);
				expr(8);
				}
				break;
			case 8:
				{
				setState(270);
				match(T__43);
				setState(271);
				type();
				setState(272);
				match(T__44);
				setState(273);
				expr(0);
				setState(274);
				match(T__13);
				}
				break;
			case 9:
				{
				setState(276);
				match(T__45);
				setState(277);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(281);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(284);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						match(T__46);
						setState(291);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(293);
						match(T__47);
						setState(294);
						expr(2);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(296);
						match(T__29);
						setState(297);
						match(IDENT);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(299);
						match(T__30);
						setState(300);
						expr(0);
						setState(301);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(T__50);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(T__30);
				setState(312);
				match(INT_CONSTANT);
				setState(313);
				match(T__31);
				setState(314);
				type();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
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
		case 8:
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
		"\u0004\u0001:\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e"+
		"\t\u0000\u0003\u0000 \b\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000"+
		"\n\u0000\f\u0000\'\t\u0000\u0003\u0000)\b\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000\f\u0000"+
		"1\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000\f\u00006\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0003\u0005e\b\u0005"+
		"\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b\u0005\n\u0005"+
		"\f\u0005t\t\u0005\u0003\u0005v\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"z\b\u0005\n\u0005\f\u0005}\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0087\b\u0006\n\u0006\f\u0006\u008a\t\u0006\u0003\u0006\u008c\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007"+
		"\u0093\b\u0007\u000b\u0007\f\u0007\u0094\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00a0\b\u0007\n\u0007\f\u0007\u00a3\t\u0007\u0003\u0007\u00a5"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ab"+
		"\b\u0007\n\u0007\f\u0007\u00ae\t\u0007\u0003\u0007\u00b0\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u00b4\b\u0007\u000b\u0007\f\u0007\u00b5"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00ba\b\u0007\n\u0007\f\u0007\u00bd"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c9"+
		"\b\u0007\n\u0007\f\u0007\u00cc\t\u0007\u0003\u0007\u00ce\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d5"+
		"\b\u0007\n\u0007\f\u0007\u00d8\t\u0007\u0003\u0007\u00da\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00e4\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ec\b\u0007\n"+
		"\u0007\f\u0007\u00ef\t\u0007\u0003\u0007\u00f1\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00f5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0105\b\b\n\b\f\b\u0108\t\b\u0003\b\u010a\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0117\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0130"+
		"\b\b\n\b\f\b\u0133\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u013d\b\t\u0001\t\u0000\u0001\u0010\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\"$\u0002"+
		"\u0000!!%%\u0001\u0000&+\u0171\u0000\u0014\u0001\u0000\u0000\u0000\u0002"+
		"<\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006P\u0001"+
		"\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000"+
		"\f\u0080\u0001\u0000\u0000\u0000\u000e\u00f4\u0001\u0000\u0000\u0000\u0010"+
		"\u0116\u0001\u0000\u0000\u0000\u0012\u013c\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u00056\u0000\u0000\u0016*\u0005"+
		"\u0002\u0000\u0000\u0017\u001f\u0005\u0003\u0000\u0000\u0018\u001c\u0005"+
		"\u0004\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 (\u0001\u0000\u0000\u0000"+
		"!%\u0005\u0005\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(!\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000"+
		"*\u0017\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,/\u0005\u0006\u0000\u0000-.\u00056\u0000\u0000.0\u0005\u0002"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u0000"+
		"35\u0003\n\u0005\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000089\u0005\u0007\u0000\u00009:\u0003\f\u0006\u0000:;\u0005\u0000\u0000"+
		"\u0001;\u0001\u0001\u0000\u0000\u0000<=\u0005\b\u0000\u0000=>\u00056\u0000"+
		"\u0000>B\u0005\t\u0000\u0000?A\u0003\u0006\u0003\u0000@?\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0007\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GJ\u00056\u0000\u0000"+
		"HI\u0005\n\u0000\u0000IK\u00056\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000"+
		"\u0000MN\u0003\u0012\t\u0000NO\u0005\u0002\u0000\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PQ\u00056\u0000\u0000QR\u0005\u000b\u0000\u0000RS\u0003\u0012"+
		"\t\u0000ST\u0005\u0002\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005"+
		"6\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0003\u0012\t\u0000X\t\u0001"+
		"\u0000\u0000\u0000YZ\u0005\f\u0000\u0000Zg\u00056\u0000\u0000[d\u0005"+
		"\r\u0000\u0000\\a\u0003\b\u0004\u0000]^\u0005\n\u0000\u0000^`\u0003\b"+
		"\u0004\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fh\u0005\u000e\u0000\u0000g[\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ij\u0005"+
		"\u000b\u0000\u0000jl\u0003\u0012\t\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mu\u0005\u000f\u0000\u0000"+
		"nr\u0005\u0010\u0000\u0000oq\u0003\u0004\u0002\u0000po\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000un\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w{\u0005\u0011\u0000\u0000xz\u0003\u000e\u0007\u0000yx\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0007\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0012\u0000\u0000\u0081\u0082\u00056\u0000\u0000\u0082\u008b\u0005"+
		"\r\u0000\u0000\u0083\u0088\u0003\u0010\b\u0000\u0084\u0085\u0005\n\u0000"+
		"\u0000\u0085\u0087\u0003\u0010\b\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\u000e\u0000\u0000\u008e\u008f\u0005\u0002\u0000\u0000"+
		"\u008f\r\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u0013\u0000\u0000\u0091"+
		"\u0093\u0003\u0010\b\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009a"+
		"\u0005\u0014\u0000\u0000\u0097\u0099\u0003\u000e\u0007\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a4"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a1"+
		"\u0005\u0015\u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u009d"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ac\u0005\u0016\u0000\u0000\u00a9\u00ab"+
		"\u0003\u000e\u0007\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00a8\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0005\u0017\u0000\u0000\u00b2\u00b4\u0003\u0010\b\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bb\u0005\u0018\u0000\u0000\u00b8\u00ba\u0003"+
		"\u000e\u0007\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u0007\u0000\u0000\u00bf\u00f5\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0003"+
		"\u0010\b\u0000\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00c4\u00cd\u0005\u001a\u0000\u0000\u00c5\u00ca\u0003\u0010"+
		"\b\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c9\u0003\u0010\b\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00f5\u0005\u0002\u0000\u0000"+
		"\u00d0\u00d9\u0005\u001b\u0000\u0000\u00d1\u00d6\u0003\u0010\b\u0000\u00d2"+
		"\u00d3\u0005\n\u0000\u0000\u00d3\u00d5\u0003\u0010\b\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00f5\u0005\u0002\u0000\u0000\u00dc\u00dd"+
		"\u0003\u0010\b\u0000\u00dd\u00de\u0005\u001c\u0000\u0000\u00de\u00df\u0003"+
		"\u0010\b\u0000\u00df\u00e0\u0005\u0002\u0000\u0000\u00e0\u00f5\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0005\u001d\u0000\u0000\u00e2\u00e4\u0003\u0010"+
		"\b\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00f5\u0005\u0002\u0000"+
		"\u0000\u00e6\u00e7\u00056\u0000\u0000\u00e7\u00f0\u0005\r\u0000\u0000"+
		"\u00e8\u00ed\u0003\u0010\b\u0000\u00e9\u00ea\u0005\n\u0000\u0000\u00ea"+
		"\u00ec\u0003\u0010\b\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u000e\u0000\u0000\u00f3\u00f5\u0005\u0002\u0000\u0000\u00f4\u0090"+
		"\u0001\u0000\u0000\u0000\u00f4\u00af\u0001\u0000\u0000\u0000\u00f4\u00c0"+
		"\u0001\u0000\u0000\u0000\u00f4\u00c4\u0001\u0000\u0000\u0000\u00f4\u00d0"+
		"\u0001\u0000\u0000\u0000\u00f4\u00dc\u0001\u0000\u0000\u0000\u00f4\u00e1"+
		"\u0001\u0000\u0000\u0000\u00f4\u00e6\u0001\u0000\u0000\u0000\u00f5\u000f"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0006\b\uffff\uffff\u0000\u00f7\u0117"+
		"\u00054\u0000\u0000\u00f8\u0117\u00055\u0000\u0000\u00f9\u0117\u00059"+
		"\u0000\u0000\u00fa\u0117\u00056\u0000\u0000\u00fb\u00fc\u0005\r\u0000"+
		"\u0000\u00fc\u00fd\u0003\u0010\b\u0000\u00fd\u00fe\u0005\u000e\u0000\u0000"+
		"\u00fe\u0117\u0001\u0000\u0000\u0000\u00ff\u0100\u00056\u0000\u0000\u0100"+
		"\u0109\u0005\r\u0000\u0000\u0101\u0106\u0003\u0010\b\u0000\u0102\u0103"+
		"\u0005\n\u0000\u0000\u0103\u0105\u0003\u0010\b\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0101\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u0117\u0005\u000e\u0000\u0000\u010c\u010d\u0005"+
		"!\u0000\u0000\u010d\u0117\u0003\u0010\b\b\u010e\u010f\u0005,\u0000\u0000"+
		"\u010f\u0110\u0003\u0012\t\u0000\u0110\u0111\u0005-\u0000\u0000\u0111"+
		"\u0112\u0003\u0010\b\u0000\u0112\u0113\u0005\u000e\u0000\u0000\u0113\u0117"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005.\u0000\u0000\u0115\u0117\u0003"+
		"\u0010\b\u0003\u0116\u00f6\u0001\u0000\u0000\u0000\u0116\u00f8\u0001\u0000"+
		"\u0000\u0000\u0116\u00f9\u0001\u0000\u0000\u0000\u0116\u00fa\u0001\u0000"+
		"\u0000\u0000\u0116\u00fb\u0001\u0000\u0000\u0000\u0116\u00ff\u0001\u0000"+
		"\u0000\u0000\u0116\u010c\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0131\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\n\u0007\u0000\u0000\u0119\u011a\u0007\u0000\u0000"+
		"\u0000\u011a\u0130\u0003\u0010\b\b\u011b\u011c\n\u0006\u0000\u0000\u011c"+
		"\u011d\u0007\u0001\u0000\u0000\u011d\u0130\u0003\u0010\b\u0007\u011e\u011f"+
		"\n\u0005\u0000\u0000\u011f\u0120\u0007\u0002\u0000\u0000\u0120\u0130\u0003"+
		"\u0010\b\u0006\u0121\u0122\n\u0002\u0000\u0000\u0122\u0123\u0005/\u0000"+
		"\u0000\u0123\u0130\u0003\u0010\b\u0003\u0124\u0125\n\u0001\u0000\u0000"+
		"\u0125\u0126\u00050\u0000\u0000\u0126\u0130\u0003\u0010\b\u0002\u0127"+
		"\u0128\n\n\u0000\u0000\u0128\u0129\u0005\u001e\u0000\u0000\u0129\u0130"+
		"\u00056\u0000\u0000\u012a\u012b\n\t\u0000\u0000\u012b\u012c\u0005\u001f"+
		"\u0000\u0000\u012c\u012d\u0003\u0010\b\u0000\u012d\u012e\u0005 \u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0118\u0001\u0000\u0000"+
		"\u0000\u012f\u011b\u0001\u0000\u0000\u0000\u012f\u011e\u0001\u0000\u0000"+
		"\u0000\u012f\u0121\u0001\u0000\u0000\u0000\u012f\u0124\u0001\u0000\u0000"+
		"\u0000\u012f\u0127\u0001\u0000\u0000\u0000\u012f\u012a\u0001\u0000\u0000"+
		"\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0011\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u013d\u00051\u0000\u0000"+
		"\u0135\u013d\u00052\u0000\u0000\u0136\u013d\u00053\u0000\u0000\u0137\u0138"+
		"\u0005\u001f\u0000\u0000\u0138\u0139\u00054\u0000\u0000\u0139\u013a\u0005"+
		" \u0000\u0000\u013a\u013d\u0003\u0012\t\u0000\u013b\u013d\u00056\u0000"+
		"\u0000\u013c\u0134\u0001\u0000\u0000\u0000\u013c\u0135\u0001\u0000\u0000"+
		"\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u0137\u0001\u0000\u0000"+
		"\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0013\u0001\u0000\u0000"+
		"\u0000(\u001c\u001f%(*16BJadgkru{\u0088\u008b\u0094\u009a\u00a1\u00a4"+
		"\u00ac\u00af\u00b5\u00bb\u00ca\u00cd\u00d6\u00d9\u00e3\u00ed\u00f0\u00f4"+
		"\u0106\u0109\u0116\u012f\u0131\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}