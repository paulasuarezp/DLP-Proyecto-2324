// Generated from c://Users//Paula//Desktop//DLP//Practicas//DLP-Proyecto//specifications//Grammar.g4 by ANTLR 4.13.1

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
		RULE_program = 0, RULE_defTuple = 1, RULE_field = 2, RULE_vars = 3, RULE_varListDefinition = 4, 
		RULE_multipleAssignment = 5, RULE_varListAssignment = 6, RULE_varListExpr = 7, 
		RULE_varListIdents = 8, RULE_featureBuilder = 9, RULE_featureDef = 10, 
		RULE_param = 11, RULE_runCall = 12, RULE_sentence = 13, RULE_initFromLoop = 14, 
		RULE_expr = 15, RULE_type = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defTuple", "field", "vars", "varListDefinition", "multipleAssignment", 
			"varListAssignment", "varListExpr", "varListIdents", "featureBuilder", 
			"featureDef", "param", "runCall", "sentence", "initFromLoop", "expr", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'global'", "'types'", "'vars'", "'create'", 
			"'end'", "'deftuple'", "'as'", "':'", "':='", "','", "'feature'", "'('", 
			"')'", "'is'", "'local'", "'do'", "'run'", "'if'", "'then'", "'else'", 
			"'from'", "'until'", "'loop'", "'read'", "'print'", "'println'", "'return'", 
			"'.'", "'['", "']'", "'to<'", "'>('", "'-'", "'not'", "'*'", "'/'", "'mod'", 
			"'+'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'and'", "'or'", 
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
		public Program ast;
		public Token name;
		public DefTupleContext defTuple;
		public List<DefTupleContext> dt = new ArrayList<DefTupleContext>();
		public VarsContext vars;
		public FeatureBuilderContext featureBuilder;
		public List<FeatureBuilderContext> b = new ArrayList<FeatureBuilderContext>();
		public FeatureDefContext featureDef;
		public List<FeatureDefContext> fd = new ArrayList<FeatureDefContext>();
		public RunCallContext runCall;
		public RunCallContext runCall() {
			return getRuleContext(RunCallContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<FeatureBuilderContext> featureBuilder() {
			return getRuleContexts(FeatureBuilderContext.class);
		}
		public FeatureBuilderContext featureBuilder(int i) {
			return getRuleContext(FeatureBuilderContext.class,i);
		}
		public List<FeatureDefContext> featureDef() {
			return getRuleContexts(FeatureDefContext.class);
		}
		public FeatureDefContext featureDef(int i) {
			return getRuleContext(FeatureDefContext.class,i);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
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
			setState(34);
			match(T__0);
			setState(35);
			((ProgramContext)_localctx).name = match(IDENT);
			setState(36);
			match(T__1);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(37);
				match(T__2);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(38);
					match(T__3);
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(39);
						((ProgramContext)_localctx).defTuple = defTuple();
						((ProgramContext)_localctx).dt.add(((ProgramContext)_localctx).defTuple);
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(47);
					match(T__4);
					setState(48);
					((ProgramContext)_localctx).vars = vars();
					}
				}

				}
			}

			setState(53);
			match(T__5);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				((ProgramContext)_localctx).featureBuilder = featureBuilder();
				((ProgramContext)_localctx).b.add(((ProgramContext)_localctx).featureBuilder);
				setState(55);
				match(T__1);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(61);
				((ProgramContext)_localctx).featureDef = featureDef();
				((ProgramContext)_localctx).fd.add(((ProgramContext)_localctx).featureDef);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__6);
			setState(68);
			((ProgramContext)_localctx).runCall = runCall();
			setState(69);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).name!=null?((ProgramContext)_localctx).name.getText():null), _localctx.dt != null ? ((ProgramContext)_localctx).dt : null, _localctx.vars != null ? ((ProgramContext)_localctx).vars.list : new ArrayList<VarDefinition>(), ((ProgramContext)_localctx).b, ((ProgramContext)_localctx).fd, 
											(_localctx.runCall.ast != null ? ((ProgramContext)_localctx).runCall.ast : new FunctionCallSent("error", new ArrayList<>()))); 
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
			setState(72);
			match(T__7);
			setState(73);
			((DefTupleContext)_localctx).IDENT = match(IDENT);
			setState(74);
			match(T__8);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(75);
				((DefTupleContext)_localctx).field = field();
				((DefTupleContext)_localctx).f.add(((DefTupleContext)_localctx).field);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
			setState(84);
			((FieldContext)_localctx).IDENT = match(IDENT);
			setState(85);
			match(T__9);
			setState(86);
			((FieldContext)_localctx).type = type();
			setState(87);
			match(T__1);
			 ((FieldContext)_localctx).ast =  _localctx.type.ast != null ? new FieldDefinition(((FieldContext)_localctx).IDENT, ((FieldContext)_localctx).type.ast) : new FieldDefinition(((FieldContext)_localctx).IDENT, new VoidType()); 
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
	public static class VarsContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<VarDefinition>();
		public VarListDefinitionContext varListDefinition;
		public List<VarListDefinitionContext> varListDefinition() {
			return getRuleContexts(VarListDefinitionContext.class);
		}
		public VarListDefinitionContext varListDefinition(int i) {
			return getRuleContext(VarListDefinitionContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(90);
				((VarsContext)_localctx).varListDefinition = varListDefinition();
				 _localctx.list.addAll(((VarsContext)_localctx).varListDefinition.list); 
				}
				}
				setState(97);
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
		enterRule(_localctx, 8, RULE_varListDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((VarListDefinitionContext)_localctx).varListIdents = varListIdents();
			setState(99);
			match(T__9);
			setState(100);
			((VarListDefinitionContext)_localctx).type = type();
			setState(101);
			match(T__1);
			 for (int i = 0; i < ((VarListDefinitionContext)_localctx).varListIdents.list.size(); i++) 
						_localctx.list.add(
							 _localctx.type.ast != null ? new VarDefinition(((VarListDefinitionContext)_localctx).varListIdents.list.get(i), ((VarListDefinitionContext)_localctx).type.ast) : new VarDefinition(((VarListDefinitionContext)_localctx).varListIdents.list.get(i), new VoidType())); 
					
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
	public static class MultipleAssignmentContext extends ParserRuleContext {
		public List<Assignment> list = new ArrayList<Assignment>();
		public VarListAssignmentContext varListAssignment;
		public List<VarListAssignmentContext> varListAssignment() {
			return getRuleContexts(VarListAssignmentContext.class);
		}
		public VarListAssignmentContext varListAssignment(int i) {
			return getRuleContext(VarListAssignmentContext.class,i);
		}
		public MultipleAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleAssignment; }
	}

	public final MultipleAssignmentContext multipleAssignment() throws RecognitionException {
		MultipleAssignmentContext _localctx = new MultipleAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
				{
				{
				setState(104);
				((MultipleAssignmentContext)_localctx).varListAssignment = varListAssignment();
				 _localctx.list.addAll(((MultipleAssignmentContext)_localctx).varListAssignment.list); 
				}
				}
				setState(111);
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
	public static class VarListAssignmentContext extends ParserRuleContext {
		public List<Assignment> list = new ArrayList<Assignment>();
		public VarListExprContext varListExpr;
		public ExprContext expr;
		public VarListExprContext varListExpr() {
			return getRuleContext(VarListExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarListAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListAssignment; }
	}

	public final VarListAssignmentContext varListAssignment() throws RecognitionException {
		VarListAssignmentContext _localctx = new VarListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varListAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((VarListAssignmentContext)_localctx).varListExpr = varListExpr();
			setState(113);
			match(T__10);
			setState(114);
			((VarListAssignmentContext)_localctx).expr = expr(0);
			 for (int i = 0; i < ((VarListAssignmentContext)_localctx).varListExpr.list.size(); i++)
					    _localctx.list.add(new Assignment(((VarListAssignmentContext)_localctx).varListExpr.list.get(i), ((VarListAssignmentContext)_localctx).expr.ast));
					
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
	public static class VarListExprContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VarListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varListExpr; }
	}

	public final VarListExprContext varListExpr() throws RecognitionException {
		VarListExprContext _localctx = new VarListExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varListExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			((VarListExprContext)_localctx).e1 = expr(0);
			 _localctx.list.add(((VarListExprContext)_localctx).e1.ast); 
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(120);
				match(T__11);
				setState(121);
				((VarListExprContext)_localctx).e2 = expr(0);
				 _localctx.list.add(((VarListExprContext)_localctx).e2.ast); 
				}
				}
				setState(128);
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
		enterRule(_localctx, 16, RULE_varListIdents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			((VarListIdentsContext)_localctx).IDENT = match(IDENT);
			 _localctx.list.add((((VarListIdentsContext)_localctx).IDENT!=null?((VarListIdentsContext)_localctx).IDENT.getText():null)); 
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(132);
				match(T__11);
				setState(133);
				((VarListIdentsContext)_localctx).IDENT = match(IDENT);
				 _localctx.list.add((((VarListIdentsContext)_localctx).IDENT!=null?((VarListIdentsContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(139);
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
	public static class FeatureBuilderContext extends ParserRuleContext {
		public FunctionBuilder ast;
		public Token name;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public FeatureBuilderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureBuilder; }
	}

	public final FeatureBuilderContext featureBuilder() throws RecognitionException {
		FeatureBuilderContext _localctx = new FeatureBuilderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_featureBuilder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((FeatureBuilderContext)_localctx).name = match(IDENT);
			 ((FeatureBuilderContext)_localctx).ast =  new FunctionBuilder(((FeatureBuilderContext)_localctx).name); _localctx.ast.updatePositions(((FeatureBuilderContext)_localctx).name);
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
		public VarsContext vars;
		public SentenceContext sentence;
		public List<SentenceContext> s = new ArrayList<SentenceContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
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
		enterRule(_localctx, 20, RULE_featureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__12);
			setState(144);
			((FeatureDefContext)_localctx).IDENT = match(IDENT);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(145);
				match(T__13);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(146);
					((FeatureDefContext)_localctx).param = param();
					((FeatureDefContext)_localctx).p.add(((FeatureDefContext)_localctx).param);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(147);
						match(T__11);
						setState(148);
						((FeatureDefContext)_localctx).param = param();
						((FeatureDefContext)_localctx).p.add(((FeatureDefContext)_localctx).param);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(156);
				match(T__14);
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(159);
				match(T__9);
				setState(160);
				((FeatureDefContext)_localctx).type = type();
				}
			}

			setState(163);
			match(T__15);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(164);
				match(T__16);
				setState(165);
				((FeatureDefContext)_localctx).vars = vars();
				}
			}

			setState(168);
			match(T__17);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640498169462788L) != 0)) {
				{
				{
				setState(169);
				((FeatureDefContext)_localctx).sentence = sentence();
				((FeatureDefContext)_localctx).s.add(((FeatureDefContext)_localctx).sentence);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__6);
			 ((FeatureDefContext)_localctx).ast =  new FunctionDefinition(((FeatureDefContext)_localctx).IDENT, _localctx.p != null ? ((FeatureDefContext)_localctx).p : new ArrayList<>(), _localctx.type != null ? ((FeatureDefContext)_localctx).type.ast : new VoidType(), _localctx.vars != null ? ((FeatureDefContext)_localctx).vars.list : new ArrayList<VarDefinition>(), ((FeatureDefContext)_localctx).s); 
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
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((ParamContext)_localctx).IDENT = match(IDENT);
			setState(179);
			match(T__9);
			setState(180);
			((ParamContext)_localctx).type = type();
			 ((ParamContext)_localctx).ast =  _localctx.type.ast != null ? new VarDefinition(((ParamContext)_localctx).IDENT, ((ParamContext)_localctx).type.ast) : new VarDefinition(((ParamContext)_localctx).IDENT, new VoidType()) ; 
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
		public RunCall ast;
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
		enterRule(_localctx, 24, RULE_runCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__18);
			setState(184);
			((RunCallContext)_localctx).IDENT = match(IDENT);
			setState(185);
			match(T__13);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
				{
				setState(186);
				((RunCallContext)_localctx).expr = expr(0);
				((RunCallContext)_localctx).args.add(((RunCallContext)_localctx).expr);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(187);
					match(T__11);
					setState(188);
					((RunCallContext)_localctx).expr = expr(0);
					((RunCallContext)_localctx).args.add(((RunCallContext)_localctx).expr);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
			match(T__14);
			setState(197);
			match(T__1);
			 ((RunCallContext)_localctx).ast =  new RunCall(((RunCallContext)_localctx).IDENT, _localctx.args != null ? ((RunCallContext)_localctx).args : new ArrayList<>()); 
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
		public Token op;
		public ExprContext left;
		public ExprContext right;
		public MultipleAssignmentContext multipleAssignment;
		public Token token;
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
		public MultipleAssignmentContext multipleAssignment() {
			return getRuleContext(MultipleAssignmentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentence);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__19);
				setState(201);
				((SentenceContext)_localctx).expr = expr(0);
				setState(202);
				match(T__20);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640498169462788L) != 0)) {
					{
					{
					setState(203);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).tb.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(209);
					match(T__21);
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640498169462788L) != 0)) {
						{
						{
						setState(210);
						((SentenceContext)_localctx).sentence = sentence();
						((SentenceContext)_localctx).fb.add(((SentenceContext)_localctx).sentence);
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(218);
				match(T__6);
				 ((SentenceContext)_localctx).ast =  new IfElse(((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).tb, _localctx.fb != null ? ((SentenceContext)_localctx).fb : null); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(221);
					match(T__22);
					setState(222);
					((SentenceContext)_localctx).initFromLoop = initFromLoop();
					}
				}

				setState(225);
				match(T__23);
				setState(226);
				((SentenceContext)_localctx).expr = expr(0);
				setState(227);
				match(T__24);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640498169462788L) != 0)) {
					{
					{
					setState(228);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).c.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__6);
				 ((SentenceContext)_localctx).ast =  new Loop(_localctx.initFromLoop != null ? ((SentenceContext)_localctx).initFromLoop.initializations : null, ((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).c); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(T__25);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
					{
					setState(238);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(239);
						match(T__11);
						setState(240);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(248);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Read(_localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				((SentenceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
					((SentenceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
					{
					setState(251);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(252);
						match(T__11);
						setState(253);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(261);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Print(((SentenceContext)_localctx).op, _localctx.args != null ? ((SentenceContext)_localctx).args : new ArrayList<>()); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				((SentenceContext)_localctx).left = expr(0);
				setState(264);
				match(T__10);
				setState(265);
				((SentenceContext)_localctx).right = expr(0);
				setState(266);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Assignment(((SentenceContext)_localctx).left.ast, ((SentenceContext)_localctx).right.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				((SentenceContext)_localctx).multipleAssignment = multipleAssignment();
				setState(270);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new MultipleAssignment(((SentenceContext)_localctx).multipleAssignment.list); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				((SentenceContext)_localctx).token = match(T__28);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
					{
					setState(274);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(277);
				match(T__1);
				 ((SentenceContext)_localctx).ast =  new Return(_localctx.expr != null ? ((SentenceContext)_localctx).expr.ast : null); _localctx.ast.updatePositions(((SentenceContext)_localctx).token);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				((SentenceContext)_localctx).IDENT = match(IDENT);
				setState(280);
				match(T__13);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
					{
					setState(281);
					((SentenceContext)_localctx).expr = expr(0);
					((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(282);
						match(T__11);
						setState(283);
						((SentenceContext)_localctx).expr = expr(0);
						((SentenceContext)_localctx).args.add(((SentenceContext)_localctx).expr);
						}
						}
						setState(288);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(291);
				match(T__14);
				setState(292);
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
		enterRule(_localctx, 28, RULE_initFromLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
				{
				{
				setState(296);
				((InitFromLoopContext)_localctx).left = expr(0);
				setState(297);
				match(T__10);
				setState(298);
				((InitFromLoopContext)_localctx).right = expr(0);
				setState(299);
				match(T__1);
				 _localctx.initializations.add(new Assignment(((InitFromLoopContext)_localctx).left.ast, ((InitFromLoopContext)_localctx).right.ast)); 
				}
				}
				setState(306);
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
		public TypeContext castType;
		public ExprContext value;
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(308);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntConstant(((ExprContext)_localctx).INT_CONSTANT); 
				}
				break;
			case 2:
				{
				setState(310);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExprContext)_localctx).ast =  new RealConstant(((ExprContext)_localctx).REAL_CONSTANT); 
				}
				break;
			case 3:
				{
				setState(312);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharConstant(((ExprContext)_localctx).CHAR_CONSTANT); 
				}
				break;
			case 4:
				{
				setState(314);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 5:
				{
				setState(316);
				match(T__13);
				setState(317);
				((ExprContext)_localctx).expr = expr(0);
				setState(318);
				match(T__14);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 6:
				{
				setState(321);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(322);
				match(T__13);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 175640497136615424L) != 0)) {
					{
					setState(323);
					((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
					((ExprContext)_localctx).args.add(((ExprContext)_localctx).expr);
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(324);
						match(T__11);
						setState(325);
						((ExprContext)_localctx).expr = ((ExprContext)_localctx).expr = expr(0);
						((ExprContext)_localctx).args.add(((ExprContext)_localctx).expr);
						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(333);
				match(T__14);
				 ((ExprContext)_localctx).ast =  new FunctionCallExpr(((ExprContext)_localctx).IDENT, ((ExprContext)_localctx).args); 
				}
				break;
			case 7:
				{
				setState(335);
				match(T__32);
				setState(336);
				((ExprContext)_localctx).castType = type();
				setState(337);
				match(T__33);
				setState(338);
				((ExprContext)_localctx).value = ((ExprContext)_localctx).expr = expr(0);
				setState(339);
				match(T__14);
				 ((ExprContext)_localctx).ast =  _localctx.castType.ast != null ? new CastExpr(((ExprContext)_localctx).castType.ast, ((ExprContext)_localctx).value.ast) : new CastExpr(new VoidType(), ((ExprContext)_localctx).value.ast);
				}
				break;
			case 8:
				{
				setState(342);
				match(T__34);
				setState(343);
				((ExprContext)_localctx).expr = expr(8);
				 ((ExprContext)_localctx).ast =  new MinusExpr(((ExprContext)_localctx).expr.ast); 
				}
				break;
			case 9:
				{
				setState(346);
				match(T__35);
				setState(347);
				((ExprContext)_localctx).expr = expr(7);
				 ((ExprContext)_localctx).ast =  new NotExpr(((ExprContext)_localctx).expr.ast); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(392);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(353);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(354);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(7);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(358);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__39) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(363);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833280L) != 0)) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).ast =  new ComparationExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
						((ExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__45) ) {
							((ExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).ast =  new ComparationExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						((ExprContext)_localctx).operator = match(T__46);
						setState(374);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(3);
						 ((ExprContext)_localctx).ast =  new LogicalExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.op1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(378);
						((ExprContext)_localctx).operator = match(T__47);
						setState(379);
						((ExprContext)_localctx).op2 = ((ExprContext)_localctx).expr = expr(2);
						 ((ExprContext)_localctx).ast =  new LogicalExpr(((ExprContext)_localctx).op1.ast, ((ExprContext)_localctx).operator, ((ExprContext)_localctx).op2.ast); 
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.root = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(382);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(383);
						match(T__29);
						setState(384);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new FieldAccess(((ExprContext)_localctx).root.ast, ((ExprContext)_localctx).IDENT); 
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(386);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(387);
						match(T__30);
						setState(388);
						((ExprContext)_localctx).index = ((ExprContext)_localctx).expr = expr(0);
						setState(389);
						match(T__31);
						 ((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).array.ast, ((ExprContext)_localctx).index.ast); 
						}
						break;
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				((TypeContext)_localctx).token = match(T__48);
				 ((TypeContext)_localctx).ast =  new IntType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((TypeContext)_localctx).token = match(T__49);
				 ((TypeContext)_localctx).ast =  new DoubleType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				((TypeContext)_localctx).token = match(T__50);
				 ((TypeContext)_localctx).ast =  new CharType(); _localctx.ast.updatePositions(((TypeContext)_localctx).token);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(T__30);
				setState(404);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(405);
				match(T__31);
				setState(406);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(new IntConstant(((TypeContext)_localctx).INT_CONSTANT),((TypeContext)_localctx).type.ast); _localctx.ast.updatePositions(_localctx.start);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
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
		case 15:
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
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u019e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0003\u0000.\b\u0000\u0001\u0000\u0001\u0000\u0003\u00002\b\u0000\u0003"+
		"\u00004\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0000\u0005\u0000?\b\u0000"+
		"\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003^\b\u0003\n\u0003\f\u0003"+
		"a\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005l\b\u0005"+
		"\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080\t"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0088\b"+
		"\b\n\b\f\b\u008b\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0096\b\n\n\n\f\n\u0099\t\n\u0003\n\u009b\b"+
		"\n\u0001\n\u0003\n\u009e\b\n\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00a7\b\n\u0001\n\u0001\n\u0005\n\u00ab\b\n\n"+
		"\n\f\n\u00ae\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00be\b\f\n\f\f\f\u00c1\t\f\u0003\f\u00c3\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00cd"+
		"\b\r\n\r\f\r\u00d0\t\r\u0001\r\u0001\r\u0005\r\u00d4\b\r\n\r\f\r\u00d7"+
		"\t\r\u0003\r\u00d9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00e0\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e6\b\r\n\r\f\r\u00e9"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f2"+
		"\b\r\n\r\f\r\u00f5\t\r\u0003\r\u00f7\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00ff\b\r\n\r\f\r\u0102\t\r\u0003\r\u0104\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0114\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u011d\b\r\n\r\f\r\u0120"+
		"\t\r\u0003\r\u0122\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0127\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u012f\b\u000e\n\u000e\f\u000e\u0132\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0147\b\u000f\n\u000f\f\u000f\u014a\t\u000f\u0003\u000f\u014c\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u015f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0189\b\u000f\n\u000f\f\u000f\u018c\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u019c\b\u0010\u0001\u0010\u0000\u0001\u001e\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0005\u0001\u0000\u001b\u001c\u0001\u0000%\'\u0002\u0000##((\u0001\u0000"+
		"),\u0001\u0000-.\u01c9\u0000\"\u0001\u0000\u0000\u0000\u0002H\u0001\u0000"+
		"\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\bb\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fp\u0001\u0000"+
		"\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000"+
		"\u0000\u0012\u008c\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000"+
		"\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000"+
		"\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c\u0130\u0001\u0000\u0000"+
		"\u0000\u001e\u015e\u0001\u0000\u0000\u0000 \u019b\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0001\u0000\u0000#$\u00056\u0000\u0000$3\u0005\u0002\u0000\u0000"+
		"%-\u0005\u0003\u0000\u0000&*\u0005\u0004\u0000\u0000\')\u0003\u0002\u0001"+
		"\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-&\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/0\u0005\u0005\u0000\u000002\u0003\u0006\u0003"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000"+
		"\u0000\u00003%\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000059\u0005\u0006\u0000\u000067\u0003\u0012\t\u000078\u0005"+
		"\u0002\u0000\u00008:\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<@\u0001\u0000\u0000\u0000=?\u0003\u0014\n\u0000>=\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0007\u0000\u0000DE\u0003\u0018\f\u0000EF\u0005\u0000\u0000\u0001FG\u0006"+
		"\u0000\uffff\uffff\u0000G\u0001\u0001\u0000\u0000\u0000HI\u0005\b\u0000"+
		"\u0000IJ\u00056\u0000\u0000JN\u0005\t\u0000\u0000KM\u0003\u0004\u0002"+
		"\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0007\u0000\u0000RS\u0006\u0001\uffff\uffff"+
		"\u0000S\u0003\u0001\u0000\u0000\u0000TU\u00056\u0000\u0000UV\u0005\n\u0000"+
		"\u0000VW\u0003 \u0010\u0000WX\u0005\u0002\u0000\u0000XY\u0006\u0002\uffff"+
		"\uffff\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0006"+
		"\u0003\uffff\uffff\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u0007\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0003\u0010\b\u0000cd\u0005\n\u0000\u0000de\u0003 \u0010\u0000ef\u0005"+
		"\u0002\u0000\u0000fg\u0006\u0004\uffff\uffff\u0000g\t\u0001\u0000\u0000"+
		"\u0000hi\u0003\f\u0006\u0000ij\u0006\u0005\uffff\uffff\u0000jl\u0001\u0000"+
		"\u0000\u0000kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0005\u000b"+
		"\u0000\u0000rs\u0003\u001e\u000f\u0000st\u0006\u0006\uffff\uffff\u0000"+
		"t\r\u0001\u0000\u0000\u0000uv\u0003\u001e\u000f\u0000vw\u0006\u0007\uffff"+
		"\uffff\u0000w~\u0001\u0000\u0000\u0000xy\u0005\f\u0000\u0000yz\u0003\u001e"+
		"\u000f\u0000z{\u0006\u0007\uffff\uffff\u0000{}\u0001\u0000\u0000\u0000"+
		"|x\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u00056\u0000\u0000\u0082"+
		"\u0083\u0006\b\uffff\uffff\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\f\u0000\u0000\u0085\u0086\u00056\u0000\u0000\u0086\u0088"+
		"\u0006\b\uffff\uffff\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u00056\u0000\u0000\u008d\u008e\u0006"+
		"\t\uffff\uffff\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\r\u0000\u0000\u0090\u009d\u00056\u0000\u0000\u0091\u009a\u0005\u000e"+
		"\u0000\u0000\u0092\u0097\u0003\u0016\u000b\u0000\u0093\u0094\u0005\f\u0000"+
		"\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0005\u000f\u0000\u0000\u009d\u0091\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0005\u0010\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0011\u0000\u0000\u00a5\u00a7\u0003\u0006\u0003\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ac\u0005\u0012\u0000\u0000"+
		"\u00a9\u00ab\u0003\u001a\r\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0"+
		"\u00b1\u0006\n\uffff\uffff\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u00056\u0000\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4\u00b5"+
		"\u0003 \u0010\u0000\u00b5\u00b6\u0006\u000b\uffff\uffff\u0000\u00b6\u0017"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0013\u0000\u0000\u00b8\u00b9"+
		"\u00056\u0000\u0000\u00b9\u00c2\u0005\u000e\u0000\u0000\u00ba\u00bf\u0003"+
		"\u001e\u000f\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc\u00be\u0003\u001e"+
		"\u000f\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000f"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c7\u0006\f\uffff"+
		"\uffff\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0014"+
		"\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u00ce\u0005\u0015"+
		"\u0000\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d5\u0005\u0016\u0000"+
		"\u0000\u00d2\u00d4\u0003\u001a\r\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\u0007\u0000\u0000\u00db\u00dc\u0006\r\uffff\uffff\u0000"+
		"\u00dc\u0127\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0017\u0000\u0000"+
		"\u00de\u00e0\u0003\u001c\u000e\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0018\u0000\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000"+
		"\u00e3\u00e7\u0005\u0019\u0000\u0000\u00e4\u00e6\u0003\u001a\r\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0007\u0000\u0000\u00eb\u00ec\u0006\r\uffff\uffff\u0000\u00ec"+
		"\u0127\u0001\u0000\u0000\u0000\u00ed\u00f6\u0005\u001a\u0000\u0000\u00ee"+
		"\u00f3\u0003\u001e\u000f\u0000\u00ef\u00f0\u0005\f\u0000\u0000\u00f0\u00f2"+
		"\u0003\u001e\u000f\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005\u0002\u0000\u0000\u00f9\u0127\u0006\r\uffff\uffff\u0000\u00fa\u0103"+
		"\u0007\u0000\u0000\u0000\u00fb\u0100\u0003\u001e\u000f\u0000\u00fc\u00fd"+
		"\u0005\f\u0000\u0000\u00fd\u00ff\u0003\u001e\u000f\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u00fb\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106\u0127\u0006"+
		"\r\uffff\uffff\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u0109\u0005"+
		"\u000b\u0000\u0000\u0109\u010a\u0003\u001e\u000f\u0000\u010a\u010b\u0005"+
		"\u0002\u0000\u0000\u010b\u010c\u0006\r\uffff\uffff\u0000\u010c\u0127\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0003\n\u0005\u0000\u010e\u010f\u0005\u0002"+
		"\u0000\u0000\u010f\u0110\u0006\r\uffff\uffff\u0000\u0110\u0127\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0005\u001d\u0000\u0000\u0112\u0114\u0003\u001e"+
		"\u000f\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0002"+
		"\u0000\u0000\u0116\u0127\u0006\r\uffff\uffff\u0000\u0117\u0118\u00056"+
		"\u0000\u0000\u0118\u0121\u0005\u000e\u0000\u0000\u0119\u011e\u0003\u001e"+
		"\u000f\u0000\u011a\u011b\u0005\f\u0000\u0000\u011b\u011d\u0003\u001e\u000f"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u000f\u0000"+
		"\u0000\u0124\u0125\u0005\u0002\u0000\u0000\u0125\u0127\u0006\r\uffff\uffff"+
		"\u0000\u0126\u00c8\u0001\u0000\u0000\u0000\u0126\u00df\u0001\u0000\u0000"+
		"\u0000\u0126\u00ed\u0001\u0000\u0000\u0000\u0126\u00fa\u0001\u0000\u0000"+
		"\u0000\u0126\u0107\u0001\u0000\u0000\u0000\u0126\u010d\u0001\u0000\u0000"+
		"\u0000\u0126\u0111\u0001\u0000\u0000\u0000\u0126\u0117\u0001\u0000\u0000"+
		"\u0000\u0127\u001b\u0001\u0000\u0000\u0000\u0128\u0129\u0003\u001e\u000f"+
		"\u0000\u0129\u012a\u0005\u000b\u0000\u0000\u012a\u012b\u0003\u001e\u000f"+
		"\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012c\u012d\u0006\u000e\uffff"+
		"\uffff\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0128\u0001\u0000"+
		"\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u001d\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0006\u000f"+
		"\uffff\uffff\u0000\u0134\u0135\u00054\u0000\u0000\u0135\u015f\u0006\u000f"+
		"\uffff\uffff\u0000\u0136\u0137\u00055\u0000\u0000\u0137\u015f\u0006\u000f"+
		"\uffff\uffff\u0000\u0138\u0139\u00059\u0000\u0000\u0139\u015f\u0006\u000f"+
		"\uffff\uffff\u0000\u013a\u013b\u00056\u0000\u0000\u013b\u015f\u0006\u000f"+
		"\uffff\uffff\u0000\u013c\u013d\u0005\u000e\u0000\u0000\u013d\u013e\u0003"+
		"\u001e\u000f\u0000\u013e\u013f\u0005\u000f\u0000\u0000\u013f\u0140\u0006"+
		"\u000f\uffff\uffff\u0000\u0140\u015f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u00056\u0000\u0000\u0142\u014b\u0005\u000e\u0000\u0000\u0143\u0148\u0003"+
		"\u001e\u000f\u0000\u0144\u0145\u0005\f\u0000\u0000\u0145\u0147\u0003\u001e"+
		"\u000f\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u0143\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u000f"+
		"\u0000\u0000\u014e\u015f\u0006\u000f\uffff\uffff\u0000\u014f\u0150\u0005"+
		"!\u0000\u0000\u0150\u0151\u0003 \u0010\u0000\u0151\u0152\u0005\"\u0000"+
		"\u0000\u0152\u0153\u0003\u001e\u000f\u0000\u0153\u0154\u0005\u000f\u0000"+
		"\u0000\u0154\u0155\u0006\u000f\uffff\uffff\u0000\u0155\u015f\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005#\u0000\u0000\u0157\u0158\u0003\u001e\u000f"+
		"\b\u0158\u0159\u0006\u000f\uffff\uffff\u0000\u0159\u015f\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005$\u0000\u0000\u015b\u015c\u0003\u001e\u000f\u0007"+
		"\u015c\u015d\u0006\u000f\uffff\uffff\u0000\u015d\u015f\u0001\u0000\u0000"+
		"\u0000\u015e\u0133\u0001\u0000\u0000\u0000\u015e\u0136\u0001\u0000\u0000"+
		"\u0000\u015e\u0138\u0001\u0000\u0000\u0000\u015e\u013a\u0001\u0000\u0000"+
		"\u0000\u015e\u013c\u0001\u0000\u0000\u0000\u015e\u0141\u0001\u0000\u0000"+
		"\u0000\u015e\u014f\u0001\u0000\u0000\u0000\u015e\u0156\u0001\u0000\u0000"+
		"\u0000\u015e\u015a\u0001\u0000\u0000\u0000\u015f\u018a\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\n\u0006\u0000\u0000\u0161\u0162\u0007\u0001\u0000\u0000"+
		"\u0162\u0163\u0003\u001e\u000f\u0007\u0163\u0164\u0006\u000f\uffff\uffff"+
		"\u0000\u0164\u0189\u0001\u0000\u0000\u0000\u0165\u0166\n\u0005\u0000\u0000"+
		"\u0166\u0167\u0007\u0002\u0000\u0000\u0167\u0168\u0003\u001e\u000f\u0006"+
		"\u0168\u0169\u0006\u000f\uffff\uffff\u0000\u0169\u0189\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\n\u0004\u0000\u0000\u016b\u016c\u0007\u0003\u0000\u0000"+
		"\u016c\u016d\u0003\u001e\u000f\u0005\u016d\u016e\u0006\u000f\uffff\uffff"+
		"\u0000\u016e\u0189\u0001\u0000\u0000\u0000\u016f\u0170\n\u0003\u0000\u0000"+
		"\u0170\u0171\u0007\u0004\u0000\u0000\u0171\u0172\u0003\u001e\u000f\u0004"+
		"\u0172\u0173\u0006\u000f\uffff\uffff\u0000\u0173\u0189\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\n\u0002\u0000\u0000\u0175\u0176\u0005/\u0000\u0000"+
		"\u0176\u0177\u0003\u001e\u000f\u0003\u0177\u0178\u0006\u000f\uffff\uffff"+
		"\u0000\u0178\u0189\u0001\u0000\u0000\u0000\u0179\u017a\n\u0001\u0000\u0000"+
		"\u017a\u017b\u00050\u0000\u0000\u017b\u017c\u0003\u001e\u000f\u0002\u017c"+
		"\u017d\u0006\u000f\uffff\uffff\u0000\u017d\u0189\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\n\u000b\u0000\u0000\u017f\u0180\u0005\u001e\u0000\u0000\u0180"+
		"\u0181\u00056\u0000\u0000\u0181\u0189\u0006\u000f\uffff\uffff\u0000\u0182"+
		"\u0183\n\n\u0000\u0000\u0183\u0184\u0005\u001f\u0000\u0000\u0184\u0185"+
		"\u0003\u001e\u000f\u0000\u0185\u0186\u0005 \u0000\u0000\u0186\u0187\u0006"+
		"\u000f\uffff\uffff\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0160"+
		"\u0001\u0000\u0000\u0000\u0188\u0165\u0001\u0000\u0000\u0000\u0188\u016a"+
		"\u0001\u0000\u0000\u0000\u0188\u016f\u0001\u0000\u0000\u0000\u0188\u0174"+
		"\u0001\u0000\u0000\u0000\u0188\u0179\u0001\u0000\u0000\u0000\u0188\u017e"+
		"\u0001\u0000\u0000\u0000\u0188\u0182\u0001\u0000\u0000\u0000\u0189\u018c"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u001f\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u00051\u0000\u0000\u018e\u019c\u0006"+
		"\u0010\uffff\uffff\u0000\u018f\u0190\u00052\u0000\u0000\u0190\u019c\u0006"+
		"\u0010\uffff\uffff\u0000\u0191\u0192\u00053\u0000\u0000\u0192\u019c\u0006"+
		"\u0010\uffff\uffff\u0000\u0193\u0194\u0005\u001f\u0000\u0000\u0194\u0195"+
		"\u00054\u0000\u0000\u0195\u0196\u0005 \u0000\u0000\u0196\u0197\u0003 "+
		"\u0010\u0000\u0197\u0198\u0006\u0010\uffff\uffff\u0000\u0198\u019c\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u00056\u0000\u0000\u019a\u019c\u0006\u0010"+
		"\uffff\uffff\u0000\u019b\u018d\u0001\u0000\u0000\u0000\u019b\u018f\u0001"+
		"\u0000\u0000\u0000\u019b\u0191\u0001\u0000\u0000\u0000\u019b\u0193\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c!\u0001\u0000"+
		"\u0000\u0000\'*-13;@N_m~\u0089\u0097\u009a\u009d\u00a1\u00a6\u00ac\u00bf"+
		"\u00c2\u00ce\u00d5\u00d8\u00df\u00e7\u00f3\u00f6\u0100\u0103\u0113\u011e"+
		"\u0121\u0126\u0130\u0148\u014b\u015e\u0188\u018a\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}