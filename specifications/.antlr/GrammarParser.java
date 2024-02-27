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
		RULE_program = 0, RULE_defTypes = 1, RULE_globalVars = 2, RULE_globalVarListDefinition = 3, 
		RULE_localVars = 4, RULE_localVarListDefinition = 5, RULE_varListIdents = 6, 
		RULE_field = 7, RULE_param = 8, RULE_featureDef = 9, RULE_runCall = 10, 
		RULE_sentence = 11, RULE_expr = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defTypes", "globalVars", "globalVarListDefinition", "localVars", 
			"localVarListDefinition", "varListIdents", "field", "param", "featureDef", 
			"runCall", "sentence", "expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'global'", "'types'", "'vars'", "'create'", 
			"'end'", "'deftuple'", "'as'", "':'", "','", "'feature'", "'('", "')'", 
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
		public GlobalVarsContext globalVars() {
			return getRuleContext(GlobalVarsContext.class,0);
		}
		public List<DefTypesContext> defTypes() {
			return getRuleContexts(DefTypesContext.class);
		}
		public DefTypesContext defTypes(int i) {
			return getRuleContext(DefTypesContext.class,i);
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
			setState(28);
			match(T__0);
			setState(29);
			match(IDENT);
			setState(30);
			match(T__1);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(31);
				match(T__2);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(32);
					match(T__3);
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(33);
						defTypes();
						}
						}
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(41);
					match(T__4);
					setState(42);
					globalVars();
					}
				}

				}
			}

			setState(47);
			match(T__5);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(IDENT);
				setState(49);
				match(T__1);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				featureDef();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(59);
			match(T__6);
			setState(60);
			runCall();
			setState(61);
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
			setState(63);
			match(T__7);
			setState(64);
			match(IDENT);
			setState(65);
			match(T__8);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(66);
				field();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	public static class GlobalVarsContext extends ParserRuleContext {
		public List<GlobalVarListDefinitionContext> globalVarListDefinition() {
			return getRuleContexts(GlobalVarListDefinitionContext.class);
		}
		public GlobalVarListDefinitionContext globalVarListDefinition(int i) {
			return getRuleContext(GlobalVarListDefinitionContext.class,i);
		}
		public GlobalVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVars; }
	}

	public final GlobalVarsContext globalVars() throws RecognitionException {
		GlobalVarsContext _localctx = new GlobalVarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(74);
				globalVarListDefinition();
				}
				}
				setState(79);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVarListDefinitionContext extends ParserRuleContext {
		public VarListIdentsContext varListIdents() {
			return getRuleContext(VarListIdentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GlobalVarListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVarListDefinition; }
	}

	public final GlobalVarListDefinitionContext globalVarListDefinition() throws RecognitionException {
		GlobalVarListDefinitionContext _localctx = new GlobalVarListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalVarListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			varListIdents();
			setState(81);
			match(T__9);
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
	public static class LocalVarsContext extends ParserRuleContext {
		public List<LocalVarListDefinitionContext> localVarListDefinition() {
			return getRuleContexts(LocalVarListDefinitionContext.class);
		}
		public LocalVarListDefinitionContext localVarListDefinition(int i) {
			return getRuleContext(LocalVarListDefinitionContext.class,i);
		}
		public LocalVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVars; }
	}

	public final LocalVarsContext localVars() throws RecognitionException {
		LocalVarsContext _localctx = new LocalVarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(85);
				localVarListDefinition();
				}
				}
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarListDefinitionContext extends ParserRuleContext {
		public VarListIdentsContext varListIdents() {
			return getRuleContext(VarListIdentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVarListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarListDefinition; }
	}

	public final LocalVarListDefinitionContext localVarListDefinition() throws RecognitionException {
		LocalVarListDefinitionContext _localctx = new LocalVarListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_localVarListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			varListIdents();
			setState(92);
			match(T__9);
			setState(93);
			type();
			setState(94);
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
	public static class VarListIdentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public VarListIdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListIdents; }
	}

	public final VarListIdentsContext varListIdents() throws RecognitionException {
		VarListIdentsContext _localctx = new VarListIdentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varListIdents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENT);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(97);
				match(T__10);
				setState(98);
				match(IDENT);
				}
				}
				setState(103);
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
		enterRule(_localctx, 14, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENT);
			setState(105);
			match(T__9);
			setState(106);
			type();
			setState(107);
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
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IDENT);
			setState(110);
			match(T__9);
			setState(111);
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
		public LocalVarsContext localVars() {
			return getRuleContext(LocalVarsContext.class,0);
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
		public FeatureDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureDef; }
	}

	public final FeatureDefContext featureDef() throws RecognitionException {
		FeatureDefContext _localctx = new FeatureDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_featureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			match(IDENT);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(115);
				match(T__12);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(116);
					param();
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(117);
						match(T__10);
						setState(118);
						param();
						}
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(126);
				match(T__13);
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(129);
				match(T__9);
				setState(130);
				type();
				}
			}

			setState(133);
			match(T__14);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(134);
				match(T__15);
				setState(135);
				localVars();
				}
			}

			setState(138);
			match(T__16);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0)) {
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
		enterRule(_localctx, 20, RULE_runCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__17);
			setState(148);
			match(IDENT);
			setState(149);
			match(T__12);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
				{
				setState(150);
				expr(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(151);
					match(T__10);
					setState(152);
					expr(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
			match(T__13);
			setState(161);
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
		enterRule(_localctx, 22, RULE_sentence);
		int _la;
		try {
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__18);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					expr(0);
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) );
				setState(169);
				match(T__19);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0)) {
					{
					{
					setState(170);
					sentence();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(176);
					match(T__20);
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0)) {
						{
						{
						setState(177);
						sentence();
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(185);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(187);
					match(T__21);
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(188);
							sentence();
							}
							} 
						}
						setState(193);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
				}

				setState(196);
				match(T__22);
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					expr(0);
					}
					}
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0) );
				setState(202);
				match(T__23);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728355772473344L) != 0)) {
					{
					{
					setState(203);
					sentence();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__24);
				setState(212);
				expr(0);
				setState(213);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(T__25);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
					{
					setState(216);
					expr(0);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(217);
						match(T__10);
						setState(218);
						expr(0);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(T__26);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
					{
					setState(228);
					expr(0);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(229);
						match(T__10);
						setState(230);
						expr(0);
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(238);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				expr(0);
				setState(240);
				match(T__27);
				setState(241);
				expr(0);
				setState(242);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(T__28);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
					{
					setState(245);
					expr(0);
					}
				}

				setState(248);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				match(IDENT);
				setState(250);
				match(T__12);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
					{
					setState(251);
					expr(0);
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(252);
						match(T__10);
						setState(253);
						expr(0);
						}
						}
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(261);
				match(T__13);
				setState(262);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(266);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(267);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(268);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(269);
				match(IDENT);
				}
				break;
			case 5:
				{
				setState(270);
				match(T__12);
				setState(271);
				expr(0);
				setState(272);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(274);
				match(IDENT);
				setState(275);
				match(T__12);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175728354987614208L) != 0)) {
					{
					setState(276);
					expr(0);
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(277);
						match(T__10);
						setState(278);
						expr(0);
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(286);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(287);
				match(T__32);
				setState(288);
				expr(8);
				}
				break;
			case 8:
				{
				setState(289);
				match(T__43);
				setState(290);
				type();
				setState(291);
				match(T__44);
				setState(292);
				expr(0);
				setState(293);
				match(T__13);
				}
				break;
			case 9:
				{
				setState(295);
				match(T__45);
				setState(296);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(300);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(306);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						match(T__46);
						setState(310);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(312);
						match(T__47);
						setState(313);
						expr(2);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(315);
						match(T__29);
						setState(316);
						match(IDENT);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(318);
						match(T__30);
						setState(319);
						expr(0);
						setState(320);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(326);
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
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(T__50);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				match(T__30);
				setState(331);
				match(INT_CONSTANT);
				setState(332);
				match(T__31);
				setState(333);
				type();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
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
		case 12:
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
		"\u0004\u0001:\u0152\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000,\b\u0000\u0003"+
		"\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00003\b\u0000"+
		"\u000b\u0000\f\u00004\u0001\u0000\u0004\u00008\b\u0000\u000b\u0000\f\u0000"+
		"9\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002"+
		"O\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006d\b\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tx\b"+
		"\t\n\t\f\t{\t\t\u0003\t}\b\t\u0001\t\u0003\t\u0080\b\t\u0001\t\u0001\t"+
		"\u0003\t\u0084\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0001"+
		"\t\u0005\t\u008d\b\t\n\t\f\t\u0090\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d\t\n\u0003"+
		"\n\u009f\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u00a6\b\u000b\u000b\u000b\f\u000b\u00a7\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00ac\b\u000b\n\u000b\f\u000b\u00af\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6\t\u000b\u0003\u000b\u00b8"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00be"+
		"\b\u000b\n\u000b\f\u000b\u00c1\t\u000b\u0003\u000b\u00c3\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00c7\b\u000b\u000b\u000b\f\u000b\u00c8"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00cd\b\u000b\n\u000b\f\u000b\u00d0"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00dc"+
		"\b\u000b\n\u000b\f\u000b\u00df\t\u000b\u0003\u000b\u00e1\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e8"+
		"\b\u000b\n\u000b\f\u000b\u00eb\t\u000b\u0003\u000b\u00ed\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00f7\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ff\b\u000b\n"+
		"\u000b\f\u000b\u0102\t\u000b\u0003\u000b\u0104\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0108\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0118\b\f\n\f\f\f\u011b\t\f\u0003\f\u011d\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u012a\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0143"+
		"\b\f\n\f\f\f\u0146\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u0150\b\r\u0001\r\u0000\u0001\u0018\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0003\u0001\u0000\"$\u0002\u0000!!%%\u0001\u0000&+\u0180\u0000\u001c"+
		"\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004M\u0001\u0000"+
		"\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000"+
		"\n[\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eh\u0001\u0000"+
		"\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000"+
		"\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u0107\u0001\u0000\u0000\u0000"+
		"\u0018\u0129\u0001\u0000\u0000\u0000\u001a\u014f\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u00056\u0000\u0000\u001e"+
		"-\u0005\u0002\u0000\u0000\u001f\'\u0005\u0003\u0000\u0000 $\u0005\u0004"+
		"\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\' \u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)*\u0005\u0005"+
		"\u0000\u0000*,\u0003\u0004\u0002\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-\u001f\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/2\u0005\u0006"+
		"\u0000\u000001\u00056\u0000\u000013\u0005\u0002\u0000\u000020\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000068\u0003\u0012\t\u000076\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000"+
		"\u0000<=\u0003\u0014\n\u0000=>\u0005\u0000\u0000\u0001>\u0001\u0001\u0000"+
		"\u0000\u0000?@\u0005\b\u0000\u0000@A\u00056\u0000\u0000AE\u0005\t\u0000"+
		"\u0000BD\u0003\u000e\u0007\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0007\u0000\u0000"+
		"I\u0003\u0001\u0000\u0000\u0000JL\u0003\u0006\u0003\u0000KJ\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PQ\u0003\f\u0006\u0000QR\u0005\n\u0000\u0000RS\u0003\u001a\r\u0000"+
		"ST\u0005\u0002\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UW\u0003\n\u0005"+
		"\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u0003\f\u0006\u0000\\]\u0005\n\u0000\u0000]^\u0003"+
		"\u001a\r\u0000^_\u0005\u0002\u0000\u0000_\u000b\u0001\u0000\u0000\u0000"+
		"`e\u00056\u0000\u0000ab\u0005\u000b\u0000\u0000bd\u00056\u0000\u0000c"+
		"a\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hi\u00056\u0000\u0000ij\u0005\n\u0000\u0000jk\u0003\u001a"+
		"\r\u0000kl\u0005\u0002\u0000\u0000l\u000f\u0001\u0000\u0000\u0000mn\u0005"+
		"6\u0000\u0000no\u0005\n\u0000\u0000op\u0003\u001a\r\u0000p\u0011\u0001"+
		"\u0000\u0000\u0000qr\u0005\f\u0000\u0000r\u007f\u00056\u0000\u0000s|\u0005"+
		"\r\u0000\u0000ty\u0003\u0010\b\u0000uv\u0005\u000b\u0000\u0000vx\u0003"+
		"\u0010\b\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0005\u000e\u0000\u0000\u007f"+
		"s\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\u0084\u0003"+
		"\u001a\r\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088\u0005\u000f"+
		"\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0089\u0003\b\u0004"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008e\u0005\u0011\u0000"+
		"\u0000\u008b\u008d\u0003\u0016\u000b\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0007\u0000"+
		"\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0012\u0000"+
		"\u0000\u0094\u0095\u00056\u0000\u0000\u0095\u009e\u0005\r\u0000\u0000"+
		"\u0096\u009b\u0003\u0018\f\u0000\u0097\u0098\u0005\u000b\u0000\u0000\u0098"+
		"\u009a\u0003\u0018\f\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u000e\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u0015"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0013\u0000\u0000\u00a4\u00a6"+
		"\u0003\u0018\f\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005"+
		"\u0014\u0000\u0000\u00aa\u00ac\u0003\u0016\u000b\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b7\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005"+
		"\u0015\u0000\u0000\u00b1\u00b3\u0003\u0016\u000b\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u0108\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bf\u0005\u0016\u0000\u0000\u00bc\u00be\u0003"+
		"\u0016\u000b\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005"+
		"\u0017\u0000\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00ce\u0005\u0018\u0000\u0000\u00cb\u00cd\u0003\u0016"+
		"\u000b\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0007\u0000\u0000\u00d2\u0108\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0019\u0000\u0000\u00d4\u00d5\u0003\u0018"+
		"\f\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000\u00d6\u0108\u0001\u0000\u0000"+
		"\u0000\u00d7\u00e0\u0005\u001a\u0000\u0000\u00d8\u00dd\u0003\u0018\f\u0000"+
		"\u00d9\u00da\u0005\u000b\u0000\u0000\u00da\u00dc\u0003\u0018\f\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0"+
		"\u00d8\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u0108\u0005\u0002\u0000\u0000\u00e3"+
		"\u00ec\u0005\u001b\u0000\u0000\u00e4\u00e9\u0003\u0018\f\u0000\u00e5\u00e6"+
		"\u0005\u000b\u0000\u0000\u00e6\u00e8\u0003\u0018\f\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00e4\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u0108\u0005\u0002\u0000\u0000\u00ef\u00f0\u0003"+
		"\u0018\f\u0000\u00f0\u00f1\u0005\u001c\u0000\u0000\u00f1\u00f2\u0003\u0018"+
		"\f\u0000\u00f2\u00f3\u0005\u0002\u0000\u0000\u00f3\u0108\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0005\u001d\u0000\u0000\u00f5\u00f7\u0003\u0018\f\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0108\u0005\u0002\u0000\u0000"+
		"\u00f9\u00fa\u00056\u0000\u0000\u00fa\u0103\u0005\r\u0000\u0000\u00fb"+
		"\u0100\u0003\u0018\f\u0000\u00fc\u00fd\u0005\u000b\u0000\u0000\u00fd\u00ff"+
		"\u0003\u0018\f\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\u000e\u0000\u0000\u0106\u0108\u0005\u0002\u0000\u0000\u0107\u00a3\u0001"+
		"\u0000\u0000\u0000\u0107\u00c2\u0001\u0000\u0000\u0000\u0107\u00d3\u0001"+
		"\u0000\u0000\u0000\u0107\u00d7\u0001\u0000\u0000\u0000\u0107\u00e3\u0001"+
		"\u0000\u0000\u0000\u0107\u00ef\u0001\u0000\u0000\u0000\u0107\u00f4\u0001"+
		"\u0000\u0000\u0000\u0107\u00f9\u0001\u0000\u0000\u0000\u0108\u0017\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0006\f\uffff\uffff\u0000\u010a\u012a\u0005"+
		"4\u0000\u0000\u010b\u012a\u00055\u0000\u0000\u010c\u012a\u00059\u0000"+
		"\u0000\u010d\u012a\u00056\u0000\u0000\u010e\u010f\u0005\r\u0000\u0000"+
		"\u010f\u0110\u0003\u0018\f\u0000\u0110\u0111\u0005\u000e\u0000\u0000\u0111"+
		"\u012a\u0001\u0000\u0000\u0000\u0112\u0113\u00056\u0000\u0000\u0113\u011c"+
		"\u0005\r\u0000\u0000\u0114\u0119\u0003\u0018\f\u0000\u0115\u0116\u0005"+
		"\u000b\u0000\u0000\u0116\u0118\u0003\u0018\f\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0114\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u012a\u0005\u000e\u0000\u0000\u011f\u0120\u0005!\u0000"+
		"\u0000\u0120\u012a\u0003\u0018\f\b\u0121\u0122\u0005,\u0000\u0000\u0122"+
		"\u0123\u0003\u001a\r\u0000\u0123\u0124\u0005-\u0000\u0000\u0124\u0125"+
		"\u0003\u0018\f\u0000\u0125\u0126\u0005\u000e\u0000\u0000\u0126\u012a\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005.\u0000\u0000\u0128\u012a\u0003\u0018"+
		"\f\u0003\u0129\u0109\u0001\u0000\u0000\u0000\u0129\u010b\u0001\u0000\u0000"+
		"\u0000\u0129\u010c\u0001\u0000\u0000\u0000\u0129\u010d\u0001\u0000\u0000"+
		"\u0000\u0129\u010e\u0001\u0000\u0000\u0000\u0129\u0112\u0001\u0000\u0000"+
		"\u0000\u0129\u011f\u0001\u0000\u0000\u0000\u0129\u0121\u0001\u0000\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0144\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\n\u0007\u0000\u0000\u012c\u012d\u0007\u0000\u0000\u0000"+
		"\u012d\u0143\u0003\u0018\f\b\u012e\u012f\n\u0006\u0000\u0000\u012f\u0130"+
		"\u0007\u0001\u0000\u0000\u0130\u0143\u0003\u0018\f\u0007\u0131\u0132\n"+
		"\u0005\u0000\u0000\u0132\u0133\u0007\u0002\u0000\u0000\u0133\u0143\u0003"+
		"\u0018\f\u0006\u0134\u0135\n\u0002\u0000\u0000\u0135\u0136\u0005/\u0000"+
		"\u0000\u0136\u0143\u0003\u0018\f\u0003\u0137\u0138\n\u0001\u0000\u0000"+
		"\u0138\u0139\u00050\u0000\u0000\u0139\u0143\u0003\u0018\f\u0002\u013a"+
		"\u013b\n\n\u0000\u0000\u013b\u013c\u0005\u001e\u0000\u0000\u013c\u0143"+
		"\u00056\u0000\u0000\u013d\u013e\n\t\u0000\u0000\u013e\u013f\u0005\u001f"+
		"\u0000\u0000\u013f\u0140\u0003\u0018\f\u0000\u0140\u0141\u0005 \u0000"+
		"\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u012b\u0001\u0000\u0000"+
		"\u0000\u0142\u012e\u0001\u0000\u0000\u0000\u0142\u0131\u0001\u0000\u0000"+
		"\u0000\u0142\u0134\u0001\u0000\u0000\u0000\u0142\u0137\u0001\u0000\u0000"+
		"\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142\u013d\u0001\u0000\u0000"+
		"\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0019\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0150\u00051\u0000\u0000"+
		"\u0148\u0150\u00052\u0000\u0000\u0149\u0150\u00053\u0000\u0000\u014a\u014b"+
		"\u0005\u001f\u0000\u0000\u014b\u014c\u00054\u0000\u0000\u014c\u014d\u0005"+
		" \u0000\u0000\u014d\u0150\u0003\u001a\r\u0000\u014e\u0150\u00056\u0000"+
		"\u0000\u014f\u0147\u0001\u0000\u0000\u0000\u014f\u0148\u0001\u0000\u0000"+
		"\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u014a\u0001\u0000\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u001b\u0001\u0000\u0000"+
		"\u0000($\'+-49EMXey|\u007f\u0083\u0088\u008e\u009b\u009e\u00a7\u00ad\u00b4"+
		"\u00b7\u00bf\u00c2\u00c8\u00ce\u00dd\u00e0\u00e9\u00ec\u00f6\u0100\u0103"+
		"\u0107\u0119\u011c\u0129\u0142\u0144\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}