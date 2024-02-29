// Generated from java-escape by ANTLR 4.11.1
package parser;

	    import ast.sentence.*;
	    import ast.expression.*;
	    import ast.type.*;
	    import ast.*;

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		INT_CONSTANT=53, REAL_CONSTANT=54, IDENT=55, LINE_COMMENT=56, MULTILINE_COMMENT=57, 
		CHAR_CONSTANT=58, WHITESPACE=59;
	public static final int
		RULE_program = 0, RULE_defTuple = 1, RULE_field = 2, RULE_globalVars = 3, 
		RULE_localVars = 4, RULE_varListDefinition = 5, RULE_varListIdents = 6, 
		RULE_featureDef = 7, RULE_param = 8, RULE_runCall = 9, RULE_sentence = 10, 
		RULE_initFromLoop = 11, RULE_expr = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defTuple", "field", "globalVars", "localVars", "varListDefinition", 
			"varListIdents", "featureDef", "param", "runCall", "sentence", "initFromLoop", 
			"expr", "type"
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
			"'INTEGER'", "'DOUBLE'", "'CHARACTER'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "IDENT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "CHAR_CONSTANT", "WHITESPACE"
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
		public Program ast;
		public Token name;
		public DefTupleContext defTuple;
		public List<DefTupleContext> dt = new ArrayList<DefTupleContext>();
		public GlobalVarsContext globalVars;
		public Token IDENT;
		public List<Token> b = new ArrayList<Token>();
		public FeatureDefContext featureDef;
		public List<FeatureDefContext> fd = new ArrayList<FeatureDefContext>();
		public RunCallContext runCall;
		public RunCallContext runCall() {
			return getRuleContext(RunCallContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<FeatureDefContext> featureDef() {
			return getRuleContexts(FeatureDefContext.class);
		}
		public FeatureDefContext featureDef(int i) {
			return getRuleContext(FeatureDefContext.class,i);
		}
		public GlobalVarsContext globalVars() {
			return getRuleContext(GlobalVarsContext.class,0);
		}
		public List<DefTupleContext> defTuple() {
			return getRuleContexts(DefTupleContext.class);
		}
		public DefTupleContext defTuple(int i) {
			return getRuleContext(DefTupleContext.class,i);
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
			((ProgramContext)_localctx).name = match(IDENT);
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
						((ProgramContext)_localctx).defTuple = defTuple();
						((ProgramContext)_localctx).dt.add(((ProgramContext)_localctx).defTuple);
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
					((ProgramContext)_localctx).globalVars = globalVars();
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
				((ProgramContext)_localctx).IDENT = match(IDENT);
				((ProgramContext)_localctx).b.add(((ProgramContext)_localctx).IDENT);
				setState(49);
				match(T__1);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(54);
				((ProgramContext)_localctx).featureDef = featureDef();
				((ProgramContext)_localctx).fd.add(((ProgramContext)_localctx).featureDef);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(T__6);
			setState(61);
			((ProgramContext)_localctx).runCall = runCall();
			setState(62);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).name!=null?((ProgramContext)_localctx).name.getText():null), _localctx.dt != null ? ((ProgramContext)_localctx).dt : null, _localctx.globalVars != null ? ((ProgramContext)_localctx).globalVars.list : null, ((ProgramContext)_localctx).b, ((ProgramContext)_localctx).fd, ((ProgramContext)_localctx).runCall.ast); 
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
	public static class DefTupleContext extends ParserRuleContext {
		public StructDefinition ast;
		public Token IDENT;
		public FieldContext field;
		public List<FieldContext> f = new ArrayList<FieldContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public DefTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTuple; }
	}

	public final DefTupleContext defTuple() throws RecognitionException {
		DefTupleContext _localctx = new DefTupleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__7);
			setState(66);
			((DefTupleContext)_localctx).IDENT = match(IDENT);
			setState(67);
			match(T__8);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(68);
				((DefTupleContext)_localctx).field = field();
				((DefTupleContext)_localctx).f.add(((DefTupleContext)_localctx).field);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__6);
			 ((DefTupleContext)_localctx).ast =  new StructDefinition(new StructType(((DefTupleContext)_localctx).IDENT), ((DefTupleContext)_localctx).f); 
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
		public FieldDefinition ast;
		public Token IDENT;
		public TypeContext type;
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
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((FieldContext)_localctx).IDENT = match(IDENT);
			setState(78);
			match(T__9);
			setState(79);
			((FieldContext)_localctx).type = type();
			setState(80);
			match(T__1);
			 ((FieldContext)_localctx).ast =  new FieldDefinition(((FieldContext)_localctx).IDENT, ((FieldContext)_localctx).type.ast); 
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
		public List<GlobalVariable> list = new ArrayList<GlobalVariable>();
		public VarListDefinitionContext varListDefinition;
		public List<VarListDefinitionContext> varListDefinition() {
			return getRuleContexts(VarListDefinitionContext.class);
		}
		public VarListDefinitionContext varListDefinition(int i) {
			return getRuleContext(VarListDefinitionContext.class,i);
		}
		public GlobalVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVars; }
	}

	public final GlobalVarsContext globalVars() throws RecognitionException {
		GlobalVarsContext _localctx = new GlobalVarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalVars);
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
				setState(83);
				((GlobalVarsContext)_localctx).varListDefinition = varListDefinition();
				 
						for (int i = 0; i < ((GlobalVarsContext)_localctx).varListDefinition.list.size(); i++) 
							_localctx.list.add(new GlobalVariable(((GlobalVarsContext)_localctx).varListDefinition.list.get(i))); 
					
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
	public static class LocalVarsContext extends ParserRuleContext {
		public List<LocalVariable> list = new ArrayList<LocalVariable>();
		public VarListDefinitionContext varListDefinition;
		public List<VarListDefinitionContext> varListDefinition() {
			return getRuleContexts(VarListDefinitionContext.class);
		}
		public VarListDefinitionContext varListDefinition(int i) {
			return getRuleContext(VarListDefinitionContext.class,i);
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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(91);
				((LocalVarsContext)_localctx).varListDefinition = varListDefinition();
				 
						for (int i = 0; i < ((LocalVarsContext)_localctx).varListDefinition.list.size(); i++) 
							_localctx.list.add(new LocalVariable(((LocalVarsContext)_localctx).varListDefinition.list.get(i))); 
					
				}
				}
				setState(98);
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
	public static class VarListDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarListIdentsContext varListIdents;
		public TypeContext type;
		public VarListIdentsContext varListIdents() {
			return getRuleContext(VarListIdentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListDefinition; }
	}

	public final VarListDefinitionContext varListDefinition() throws RecognitionException {
		VarListDefinitionContext _localctx = new VarListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((VarListDefinitionContext)_localctx).varListIdents = varListIdents();
			setState(100);
			match(T__9);
			setState(101);
			((VarListDefinitionContext)_localctx).type = type();
			setState(102);
			match(T__1);
			 for (int i = 0; i < ((VarListDefinitionContext)_localctx).varListIdents.list.size(); i++) 
						_localctx.list.add(new VarDefinition(((VarListDefinitionContext)_localctx).varListIdents.list.get(i), ((VarListDefinitionContext)_localctx).type.ast)); 
					
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
		public List<String> list = new ArrayList<String>();
		public Token IDENT;
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
			{
			setState(105);
			((VarListIdentsContext)_localctx).IDENT = match(IDENT);
			 _localctx.list.add((((VarListIdentsContext)_localctx).IDENT!=null?((VarListIdentsContext)_localctx).IDENT.getText():null)); 
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(108);
				match(T__10);
				setState(109);
				((VarListIdentsContext)_localctx).IDENT = match(IDENT);
				 _localctx.list.add((((VarListIdentsContext)_localctx).IDENT!=null?((VarListIdentsContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(115);
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
	public static class FeatureDefContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token IDENT;
		public ParamContext param;
		public List<ParamContext> p = new ArrayList<ParamContext>();
		public TypeContext type;
		public LocalVarsContext localVars;
		public SentenceContext sentence;
		public List<SentenceContext> s = new ArrayList<SentenceContext>();
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
		enterRule(_localctx, 14, RULE_featureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__11);
			setState(117);
			((FeatureDefContext)_localctx).IDENT = match(IDENT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(118);
				match(T__12);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(119);
					((FeatureDefContext)_localctx).param = param();
					((FeatureDefContext)_localctx).p.add(((FeatureDefContext)_localctx).param);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(120);
						match(T__10);
						setState(121);
						((FeatureDefContext)_localctx).param = param();
						((FeatureDefContext)_localctx).p.add(((FeatureDefContext)_localctx).param);
						}
						}
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(129);
				match(T__13);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(132);
				match(T__9);
				setState(133);
				((FeatureDefContext)_localctx).type = type();
				}
			}

			setState(136);
			match(T__14);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(137);
				match(T__15);
				setState(138);
				((FeatureDefContext)_localctx).localVars = localVars();
				}
			}

			setState(141);
			match(T__16);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368741239922688L) != 0) {
				{
				{
				setState(142);
				((FeatureDefContext)_localctx).sentence = sentence();
				((FeatureDefContext)_localctx).s.add(((FeatureDefContext)_localctx).sentence);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__6);
			 ((FeatureDefContext)_localctx).ast =  new FunctionDefinition(((FeatureDefContext)_localctx).IDENT, _localctx.p != null ? ((FeatureDefContext)_localctx).p : new ArrayList<>(), _localctx.type != null ? ((FeatureDefContext)_localctx).type.ast : new VoidType(), _localctx.localVars != null ? ((FeatureDefContext)_localctx).localVars.list : new ArrayList<>(), ((FeatureDefContext)_localctx).s); 
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
		public VarDefinition ast;
		public Token IDENT;
		public TypeContext type;
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
			setState(151);
			((ParamContext)_localctx).IDENT = match(IDENT);
			setState(152);
			match(T__9);
			setState(153);
			((ParamContext)_localctx).type = type();
			 ((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).IDENT, ((ParamContext)_localctx).type.ast); 
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
		public FunctionCallSent ast;
		public Token IDENT;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
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
		enterRule(_localctx, 18, RULE_runCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__17);
			setState(157);
			((RunCallContext)_localctx).IDENT = match(IDENT);
			setState(158);
			match(T__12);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
				{
				setState(159);
				((RunCallContext)_localctx).expr = expr(0);
				((RunCallContext)_localctx).args.add(((RunCallContext)_localctx).expr);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(160);
					match(T__10);
					setState(161);
					((RunCallContext)_localctx).expr = expr(0);
					((RunCallContext)_localctx).args.add(((RunCallContext)_localctx).expr);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(169);
			match(T__13);
			setState(170);
			match(T__1);
			 ((RunCallContext)_localctx).ast =  new FunctionCallSent(((RunCallContext)_localctx).IDENT, _localctx.args != null ? ((RunCallContext)_localctx).args : new ArrayList<>()); 
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
		public Sentence ast;
		public ExprContext expr;
		public SentenceContext sentence;
		public List<SentenceContext> tb = new ArrayList<SentenceContext>();
		public List<SentenceContext> fb = new ArrayList<SentenceContext>();
		public InitFromLoopContext initFromLoop;
		public List<SentenceContext> c = new ArrayList<SentenceContext>();
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public ExprContext left;
		public ExprContext right;
		public Token IDENT;
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
		public InitFromLoopContext initFromLoop() {
			return getRuleContext(InitFromLoopContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentence);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__18);
				setState(174);
				((SentenceContext)_localctx).expr = expr(0);
				setState(175);
				match(T__19);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368741239922688L) != 0) {
					{
					{
					setState(176);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).tb.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(182);
					match(T__20);
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368741239922688L) != 0) {
						{
						{
						setState(183);
						((SentenceContext)_localctx).sentence = sentence();
						((SentenceContext)_localctx).fb.add(((SentenceContext)_localctx).sentence);
						}
						}
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(191);
				match(T__6);
				 ((SentenceContext)_localctx).ast =  new IfElse(((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).tb, _localctx.fb != null ? ((SentenceContext)_localctx).fb : null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(194);
					match(T__21);
					setState(195);
					((SentenceContext)_localctx).initFromLoop = initFromLoop();
					}
				}

				setState(198);
				match(T__22);
				setState(199);
				((SentenceContext)_localctx).expr = expr(0);
				setState(200);
				match(T__23);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368741239922688L) != 0) {
					{
					{
					setState(201);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).c.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__6);
				 ((SentenceContext)_localctx).ast =  new Loop(_localctx.initFromLoop != null ? ((SentenceContext)_localctx).initFromLoop.initializations : null, ((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).c); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__24);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(211);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(212);
						match(T__10);
						setState(213);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(221);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Read(_localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__25);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(224);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(225);
						match(T__10);
						setState(226);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Print(_localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__26);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(237);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(238);
						match(T__10);
						setState(239);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(247);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Println(_localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				((SentenceContext)_localctx).left = expr(0);
				setState(250);
				match(T__27);
				setState(251);
				((SentenceContext)_localctx).right = expr(0);
				setState(252);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Assignment(((SentenceContext)_localctx).left.ast, ((SentenceContext)_localctx).right.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(T__28);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(256);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(259);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Return(_localctx.expr != null ? ((SentenceContext)_localctx).expr.ast : null); _localctx.ast.updatePositions(_localctx.start);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				((SentenceContext)_localctx).IDENT = match(IDENT);
				setState(262);
				match(T__12);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(263);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(264);
						match(T__10);
						setState(265);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(273);
				match(T__13);
				setState(274);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new FunctionCallSent(((SentenceContext)_localctx).IDENT, _localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
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
	public static class InitFromLoopContext extends ParserRuleContext {
		public List<Assignment> initializations = new ArrayList<Assignment>();
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InitFromLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initFromLoop; }
	}

	public final InitFromLoopContext initFromLoop() throws RecognitionException {
		InitFromLoopContext _localctx = new InitFromLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_initFromLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
				{
				{
				setState(278);
				((InitFromLoopContext)_localctx).left = expr(0);
				setState(279);
				match(T__27);
				setState(280);
				((InitFromLoopContext)_localctx).right = expr(0);
				setState(281);
				match(T__1);
				 _localctx.initializations.add(new Assignment(((InitFromLoopContext)_localctx).left.ast, ((InitFromLoopContext)_localctx).right.ast)); 
				}
				}
				setState(288);
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
	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext root;
		public ExprContext array;
		public ExprContext op1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token IDENT;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TypeContext type;
		public Token operator;
		public ExprContext op2;
		public ExprContext index;
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(290);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntConstant(((ExprContext)_localctx).INT_CONSTANT); 
				}
				break;
			case 2:
				{
				setState(292);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealConstant(((ExprContext)_localctx).REAL_CONSTANT); 
				}
				break;
			case 3:
				{
				setState(294);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharConstant(((ExprContext)_localctx).CHAR_CONSTANT); 
				}
				break;
			case 4:
				{
				setState(296);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 5:
				{
				setState(298);
				match(T__12);
				setState(299);
				((ExprContext)_localctx).expr = expr(0);
				setState(300);
				match(T__13);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 6:
				{
				setState(303);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(304);
				match(T__12);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 351368740455063552L) != 0) {
					{
					setState(305);
					((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
					((ExprContext)_localctx).args.add(((ExprContext)_localctx).expr);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(306);
						match(T__10);
						setState(307);
						((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
						((ExprContext)_localctx).args.add(((ExprContext)_localctx).expr);
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(315);
				match(T__13);
				 ((ExprContext)_localctx).ast =  new FunctionCallExpr(((ExprContext)_localctx).IDENT, ((ExprContext)_localctx).args); 
				}
				break;
			case 7:
				{
				setState(317);
				match(T__32);
				setState(318);
				((ExprContext)_localctx).expr = expr(8);
				 ((ExprContext)_localctx).ast =  new MinusExpr(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 8:
				{
				setState(321);
				match(T__43);
				setState(322);
				((ExprContext)_localctx).type = type();
				setState(323);
				match(T__44);
				setState(324);
				((ExprContext)_localctx).expr = expr(0);
				setState(325);
				match(T__13);
				 ((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast, ((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 9:
				{
				setState(328);
				match(T__45);
				setState(329);
				((ExprContext)_localctx).expr = expr(3);
				 ((ExprContext)_localctx).ast =  new NotExpr(((ExprContext)_localctx).expr.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(335);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(340);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__36) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).ast =  new ComparationExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(350);
						((ExprContext)_localctx).operator = match(T__46);
						setState(351);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(3);
						 ((ExprContext)_localctx).ast =  new LogicalExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(355);
						((ExprContext)_localctx).operator = match(T__47);
						setState(356);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(2);
						 ((ExprContext)_localctx).ast =  new LogicalExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.root = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						match(T__29);
						setState(361);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new FieldAccess(((ExprContext)_localctx).root.ast, ((ExprContext)_localctx).IDENT); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(364);
						match(T__30);
						setState(365);
						((ExprContext)_localctx).index = ((ExprContext)_localctx).expr = expr(0);
						setState(366);
						match(T__31);
						 ((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).array.ast, ((ExprContext)_localctx).index.ast); 
						}
						break;
					}
					} 
				}
				setState(373);
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
		public Type ast;
		public Token token;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Token IDENT;
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
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				((TypeContext)_localctx).token = match(T__48);
				 ((TypeContext)_localctx).ast =  new IntType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				((TypeContext)_localctx).token = match(T__49);
				 ((TypeContext)_localctx).ast =  new DoubleType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				((TypeContext)_localctx).token = match(T__50);
				 ((TypeContext)_localctx).ast =  new CharType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				((TypeContext)_localctx).token = match(T__51);
				 ((TypeContext)_localctx).ast =  new VoidType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(T__30);
				setState(383);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(384);
				match(T__31);
				setState(385);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(new IntConstant(((TypeContext)_localctx).INT_CONSTANT),((TypeContext)_localctx).type.ast); _localctx.ast.updatePositions(_localctx.start);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).IDENT); _localctx.ast.updatePositions(_localctx.start); 
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
		"\u0004\u0001;\u0189\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000,\b\u0000\u0003"+
		"\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u00003\b\u0000"+
		"\u000b\u0000\f\u00004\u0001\u0000\u0005\u00008\b\u0000\n\u0000\f\u0000"+
		";\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001F\b\u0001"+
		"\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003Z\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f\u0004"+
		"b\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006p\b\u0006\n\u0006\f\u0006s\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"{\b\u0007\n\u0007\f\u0007~\t\u0007\u0003\u0007\u0080\b\u0007\u0001\u0007"+
		"\u0003\u0007\u0083\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0087\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0090\b\u0007\n\u0007\f\u0007\u0093\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a3\b\t\n"+
		"\t\f\t\u00a6\t\t\u0003\t\u00a8\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b2\b\n\n\n\f\n\u00b5\t\n\u0001\n"+
		"\u0001\n\u0005\n\u00b9\b\n\n\n\f\n\u00bc\t\n\u0003\n\u00be\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c5\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00cb\b\n\n\n\f\n\u00ce\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d7\b\n\n\n\f\n\u00da\t\n\u0003"+
		"\n\u00dc\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e4"+
		"\b\n\n\n\f\n\u00e7\t\n\u0003\n\u00e9\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00f1\b\n\n\n\f\n\u00f4\t\n\u0003\n\u00f6\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0102\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u010b\b\n\n\n\f\n\u010e\t\n\u0003\n\u0110\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0115\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u011d\b\u000b\n\u000b"+
		"\f\u000b\u0120\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0135\b\f\n\f\f\f\u0138\t\f"+
		"\u0003\f\u013a\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u014d\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0172\b\f\n\f\f\f\u0175\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0187\b\r\u0001\r\u0000"+
		"\u0001\u0018\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u0000\u0003\u0001\u0000\"$\u0002\u0000!!%%\u0001\u0000"+
		"&+\u01b8\u0000\u001c\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000"+
		"\u0000\u0004M\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\b"+
		"`\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fi\u0001\u0000\u0000"+
		"\u0000\u000et\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000\u0000\u0000"+
		"\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u0114\u0001\u0000\u0000\u0000"+
		"\u0016\u011e\u0001\u0000\u0000\u0000\u0018\u014c\u0001\u0000\u0000\u0000"+
		"\u001a\u0186\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\u001e\u00057\u0000\u0000\u001e-\u0005\u0002\u0000\u0000\u001f\'"+
		"\u0005\u0003\u0000\u0000 $\u0005\u0004\u0000\u0000!#\u0003\u0002\u0001"+
		"\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\' \u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000*,\u0003\u0006\u0003"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-\u001f\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/2\u0005\u0006\u0000\u000001\u00057\u0000\u0000"+
		"13\u0005\u0002\u0000\u000020\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000059\u0001\u0000"+
		"\u0000\u000068\u0003\u000e\u0007\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0007\u0000"+
		"\u0000=>\u0003\u0012\t\u0000>?\u0005\u0000\u0000\u0001?@\u0006\u0000\uffff"+
		"\uffff\u0000@\u0001\u0001\u0000\u0000\u0000AB\u0005\b\u0000\u0000BC\u0005"+
		"7\u0000\u0000CG\u0005\t\u0000\u0000DF\u0003\u0004\u0002\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0007\u0000\u0000KL\u0006\u0001\uffff\uffff\u0000L\u0003"+
		"\u0001\u0000\u0000\u0000MN\u00057\u0000\u0000NO\u0005\n\u0000\u0000OP"+
		"\u0003\u001a\r\u0000PQ\u0005\u0002\u0000\u0000QR\u0006\u0002\uffff\uffff"+
		"\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0003\n\u0005\u0000TU\u0006\u0003"+
		"\uffff\uffff\u0000UW\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u0007\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003"+
		"\n\u0005\u0000\\]\u0006\u0004\uffff\uffff\u0000]_\u0001\u0000\u0000\u0000"+
		"^[\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0003\f\u0006\u0000de\u0005\n\u0000\u0000ef\u0003\u001a"+
		"\r\u0000fg\u0005\u0002\u0000\u0000gh\u0006\u0005\uffff\uffff\u0000h\u000b"+
		"\u0001\u0000\u0000\u0000ij\u00057\u0000\u0000jk\u0006\u0006\uffff\uffff"+
		"\u0000kq\u0001\u0000\u0000\u0000lm\u0005\u000b\u0000\u0000mn\u00057\u0000"+
		"\u0000np\u0006\u0006\uffff\uffff\u0000ol\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\r\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\f\u0000"+
		"\u0000u\u0082\u00057\u0000\u0000v\u007f\u0005\r\u0000\u0000w|\u0003\u0010"+
		"\b\u0000xy\u0005\u000b\u0000\u0000y{\u0003\u0010\b\u0000zx\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007fw\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0005\u000e\u0000\u0000"+
		"\u0082v\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085\u0087"+
		"\u0003\u001a\r\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0005"+
		"\u000f\u0000\u0000\u0089\u008a\u0005\u0010\u0000\u0000\u008a\u008c\u0003"+
		"\b\u0004\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0091\u0005\u0011"+
		"\u0000\u0000\u008e\u0090\u0003\u0014\n\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0007\u0000"+
		"\u0000\u0095\u0096\u0006\u0007\uffff\uffff\u0000\u0096\u000f\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u00057\u0000\u0000\u0098\u0099\u0005\n\u0000"+
		"\u0000\u0099\u009a\u0003\u001a\r\u0000\u009a\u009b\u0006\b\uffff\uffff"+
		"\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0012\u0000"+
		"\u0000\u009d\u009e\u00057\u0000\u0000\u009e\u00a7\u0005\r\u0000\u0000"+
		"\u009f\u00a4\u0003\u0018\f\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000\u00a1"+
		"\u00a3\u0003\u0018\f\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u000e\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00ac"+
		"\u0006\t\uffff\uffff\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0013\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u00b3\u0005"+
		"\u0014\u0000\u0000\u00b0\u00b2\u0003\u0014\n\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\u0015"+
		"\u0000\u0000\u00b7\u00b9\u0003\u0014\n\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u00c1\u0006\n\uffff\uffff"+
		"\u0000\u00c1\u0115\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000"+
		"\u0000\u00c3\u00c5\u0003\u0016\u000b\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0017\u0000\u0000\u00c7\u00c8\u0003\u0018\f\u0000"+
		"\u00c8\u00cc\u0005\u0018\u0000\u0000\u00c9\u00cb\u0003\u0014\n\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0007\u0000\u0000\u00d0\u00d1\u0006\n\uffff\uffff\u0000\u00d1"+
		"\u0115\u0001\u0000\u0000\u0000\u00d2\u00db\u0005\u0019\u0000\u0000\u00d3"+
		"\u00d8\u0003\u0018\f\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d7"+
		"\u0003\u0018\f\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0002\u0000\u0000\u00de\u0115\u0006\n\uffff\uffff\u0000\u00df\u00e8\u0005"+
		"\u001a\u0000\u0000\u00e0\u00e5\u0003\u0018\f\u0000\u00e1\u00e2\u0005\u000b"+
		"\u0000\u0000\u00e2\u00e4\u0003\u0018\f\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000\u00eb\u0115\u0006\n\uffff\uffff"+
		"\u0000\u00ec\u00f5\u0005\u001b\u0000\u0000\u00ed\u00f2\u0003\u0018\f\u0000"+
		"\u00ee\u00ef\u0005\u000b\u0000\u0000\u00ef\u00f1\u0003\u0018\f\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8"+
		"\u0115\u0006\n\uffff\uffff\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa"+
		"\u00fb\u0005\u001c\u0000\u0000\u00fb\u00fc\u0003\u0018\f\u0000\u00fc\u00fd"+
		"\u0005\u0002\u0000\u0000\u00fd\u00fe\u0006\n\uffff\uffff\u0000\u00fe\u0115"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\u001d\u0000\u0000\u0100\u0102"+
		"\u0003\u0018\f\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\u0002\u0000\u0000\u0104\u0115\u0006\n\uffff\uffff\u0000\u0105\u0106\u0005"+
		"7\u0000\u0000\u0106\u010f\u0005\r\u0000\u0000\u0107\u010c\u0003\u0018"+
		"\f\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u010b\u0003\u0018\f"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u000e\u0000"+
		"\u0000\u0112\u0113\u0005\u0002\u0000\u0000\u0113\u0115\u0006\n\uffff\uffff"+
		"\u0000\u0114\u00ad\u0001\u0000\u0000\u0000\u0114\u00c4\u0001\u0000\u0000"+
		"\u0000\u0114\u00d2\u0001\u0000\u0000\u0000\u0114\u00df\u0001\u0000\u0000"+
		"\u0000\u0114\u00ec\u0001\u0000\u0000\u0000\u0114\u00f9\u0001\u0000\u0000"+
		"\u0000\u0114\u00ff\u0001\u0000\u0000\u0000\u0114\u0105\u0001\u0000\u0000"+
		"\u0000\u0115\u0015\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000"+
		"\u0117\u0118\u0005\u001c\u0000\u0000\u0118\u0119\u0003\u0018\f\u0000\u0119"+
		"\u011a\u0005\u0002\u0000\u0000\u011a\u011b\u0006\u000b\uffff\uffff\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000\u0000"+
		"\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0017\u0001\u0000\u0000\u0000"+
		"\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0006\f\uffff\uffff\u0000"+
		"\u0122\u0123\u00055\u0000\u0000\u0123\u014d\u0006\f\uffff\uffff\u0000"+
		"\u0124\u0125\u00056\u0000\u0000\u0125\u014d\u0006\f\uffff\uffff\u0000"+
		"\u0126\u0127\u0005:\u0000\u0000\u0127\u014d\u0006\f\uffff\uffff\u0000"+
		"\u0128\u0129\u00057\u0000\u0000\u0129\u014d\u0006\f\uffff\uffff\u0000"+
		"\u012a\u012b\u0005\r\u0000\u0000\u012b\u012c\u0003\u0018\f\u0000\u012c"+
		"\u012d\u0005\u000e\u0000\u0000\u012d\u012e\u0006\f\uffff\uffff\u0000\u012e"+
		"\u014d\u0001\u0000\u0000\u0000\u012f\u0130\u00057\u0000\u0000\u0130\u0139"+
		"\u0005\r\u0000\u0000\u0131\u0136\u0003\u0018\f\u0000\u0132\u0133\u0005"+
		"\u000b\u0000\u0000\u0133\u0135\u0003\u0018\f\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005\u000e\u0000\u0000\u013c\u014d\u0006\f\uffff"+
		"\uffff\u0000\u013d\u013e\u0005!\u0000\u0000\u013e\u013f\u0003\u0018\f"+
		"\b\u013f\u0140\u0006\f\uffff\uffff\u0000\u0140\u014d\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0005,\u0000\u0000\u0142\u0143\u0003\u001a\r\u0000"+
		"\u0143\u0144\u0005-\u0000\u0000\u0144\u0145\u0003\u0018\f\u0000\u0145"+
		"\u0146\u0005\u000e\u0000\u0000\u0146\u0147\u0006\f\uffff\uffff\u0000\u0147"+
		"\u014d\u0001\u0000\u0000\u0000\u0148\u0149\u0005.\u0000\u0000\u0149\u014a"+
		"\u0003\u0018\f\u0003\u014a\u014b\u0006\f\uffff\uffff\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u0121\u0001\u0000\u0000\u0000\u014c\u0124"+
		"\u0001\u0000\u0000\u0000\u014c\u0126\u0001\u0000\u0000\u0000\u014c\u0128"+
		"\u0001\u0000\u0000\u0000\u014c\u012a\u0001\u0000\u0000\u0000\u014c\u012f"+
		"\u0001\u0000\u0000\u0000\u014c\u013d\u0001\u0000\u0000\u0000\u014c\u0141"+
		"\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014d\u0173"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\n\u0007\u0000\u0000\u014f\u0150\u0007"+
		"\u0000\u0000\u0000\u0150\u0151\u0003\u0018\f\b\u0151\u0152\u0006\f\uffff"+
		"\uffff\u0000\u0152\u0172\u0001\u0000\u0000\u0000\u0153\u0154\n\u0006\u0000"+
		"\u0000\u0154\u0155\u0007\u0001\u0000\u0000\u0155\u0156\u0003\u0018\f\u0007"+
		"\u0156\u0157\u0006\f\uffff\uffff\u0000\u0157\u0172\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\n\u0005\u0000\u0000\u0159\u015a\u0007\u0002\u0000\u0000\u015a"+
		"\u015b\u0003\u0018\f\u0006\u015b\u015c\u0006\f\uffff\uffff\u0000\u015c"+
		"\u0172\u0001\u0000\u0000\u0000\u015d\u015e\n\u0002\u0000\u0000\u015e\u015f"+
		"\u0005/\u0000\u0000\u015f\u0160\u0003\u0018\f\u0003\u0160\u0161\u0006"+
		"\f\uffff\uffff\u0000\u0161\u0172\u0001\u0000\u0000\u0000\u0162\u0163\n"+
		"\u0001\u0000\u0000\u0163\u0164\u00050\u0000\u0000\u0164\u0165\u0003\u0018"+
		"\f\u0002\u0165\u0166\u0006\f\uffff\uffff\u0000\u0166\u0172\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\n\n\u0000\u0000\u0168\u0169\u0005\u001e\u0000"+
		"\u0000\u0169\u016a\u00057\u0000\u0000\u016a\u0172\u0006\f\uffff\uffff"+
		"\u0000\u016b\u016c\n\t\u0000\u0000\u016c\u016d\u0005\u001f\u0000\u0000"+
		"\u016d\u016e\u0003\u0018\f\u0000\u016e\u016f\u0005 \u0000\u0000\u016f"+
		"\u0170\u0006\f\uffff\uffff\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171"+
		"\u014e\u0001\u0000\u0000\u0000\u0171\u0153\u0001\u0000\u0000\u0000\u0171"+
		"\u0158\u0001\u0000\u0000\u0000\u0171\u015d\u0001\u0000\u0000\u0000\u0171"+
		"\u0162\u0001\u0000\u0000\u0000\u0171\u0167\u0001\u0000\u0000\u0000\u0171"+
		"\u016b\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u0019\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u00051\u0000\u0000\u0177\u0187\u0006\r\uffff\uffff\u0000\u0178"+
		"\u0179\u00052\u0000\u0000\u0179\u0187\u0006\r\uffff\uffff\u0000\u017a"+
		"\u017b\u00053\u0000\u0000\u017b\u0187\u0006\r\uffff\uffff\u0000\u017c"+
		"\u017d\u00054\u0000\u0000\u017d\u0187\u0006\r\uffff\uffff\u0000\u017e"+
		"\u017f\u0005\u001f\u0000\u0000\u017f\u0180\u00055\u0000\u0000\u0180\u0181"+
		"\u0005 \u0000\u0000\u0181\u0182\u0003\u001a\r\u0000\u0182\u0183\u0006"+
		"\r\uffff\uffff\u0000\u0183\u0187\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"7\u0000\u0000\u0185\u0187\u0006\r\uffff\uffff\u0000\u0186\u0176\u0001"+
		"\u0000\u0000\u0000\u0186\u0178\u0001\u0000\u0000\u0000\u0186\u017a\u0001"+
		"\u0000\u0000\u0000\u0186\u017c\u0001\u0000\u0000\u0000\u0186\u017e\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u001b\u0001"+
		"\u0000\u0000\u0000($\'+-49GX`q|\u007f\u0082\u0086\u008b\u0091\u00a4\u00a7"+
		"\u00b3\u00ba\u00bd\u00c4\u00cc\u00d8\u00db\u00e5\u00e8\u00f2\u00f5\u0101"+
		"\u010c\u010f\u0114\u011e\u0136\u0139\u014c\u0171\u0173\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}