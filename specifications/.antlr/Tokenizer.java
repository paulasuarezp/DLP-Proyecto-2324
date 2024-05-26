// Generated from c://Users//Paula//Desktop//DLP//Practicas//DLP-Proyecto//specifications//Tokenizer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Tokenizer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN_CONSTANT=1, INT_CONSTANT=2, REAL_CONSTANT=3, IDENT=4, LINE_COMMENT=5, 
		MULTILINE_COMMENT=6, CHAR_CONSTANT=7, WHITESPACE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN_CONSTANT", "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "CHAR_CONSTANT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN_CONSTANT", "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "LINE_COMMENT", 
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


	public Tokenizer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tokenizer.g4"; }

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
		"\u0004\u0000\ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000"+
		"\u0001\u0001\u0004\u0001\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001"+
		"\u0002\u0004\u0002#\b\u0002\u000b\u0002\f\u0002$\u0001\u0002\u0001\u0002"+
		"\u0004\u0002)\b\u0002\u000b\u0002\f\u0002*\u0001\u0003\u0001\u0003\u0005"+
		"\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001"+
		"\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005G\b\u0005\n\u0005"+
		"\f\u0005J\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0004"+
		"\u0007\\\b\u0007\u000b\u0007\f\u0007]\u0001\u0007\u0001\u0007\u00029H"+
		"\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0001\u0000\u0006\u0001\u000009\u0002\u0000AZa"+
		"z\u0004\u000009AZ__az\u0001\u0001\n\n\u0002\u0000\t\n\r\r\u0003\u0000"+
		"\t\n\r\r  i\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0001\u001a\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000"+
		"\u0005\"\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t3\u0001"+
		"\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000"+
		"\u0000\u000f[\u0001\u0000\u0000\u0000\u0011\u0012\u0005t\u0000\u0000\u0012"+
		"\u0013\u0005r\u0000\u0000\u0013\u0014\u0005u\u0000\u0000\u0014\u001b\u0005"+
		"e\u0000\u0000\u0015\u0016\u0005f\u0000\u0000\u0016\u0017\u0005a\u0000"+
		"\u0000\u0017\u0018\u0005l\u0000\u0000\u0018\u0019\u0005s\u0000\u0000\u0019"+
		"\u001b\u0005e\u0000\u0000\u001a\u0011\u0001\u0000\u0000\u0000\u001a\u0015"+
		"\u0001\u0000\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0007\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!#\u0007\u0000\u0000"+
		"\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0005"+
		".\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)*"+
		"\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+\u0006\u0001\u0000\u0000\u0000,0\u0007\u0001\u0000\u0000-/\u0007"+
		"\u0002\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\b\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000034\u0005/\u0000\u000045\u0005*\u0000\u0000"+
		"59\u0001\u0000\u0000\u000068\t\u0000\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0007\u0003"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006"+
		"\u0004\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005/\u0000\u0000BC\u0005"+
		"/\u0000\u0000CD\u0005*\u0000\u0000DH\u0001\u0000\u0000\u0000EG\t\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000LM\u0005/\u0000\u0000M"+
		"N\u0005/\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0006\u0005\u0000\u0000"+
		"P\f\u0001\u0000\u0000\u0000QR\u0005\'\u0000\u0000RS\u0005\\\u0000\u0000"+
		"ST\u0005n\u0000\u0000TY\u0005\'\u0000\u0000UV\u0005\'\u0000\u0000VW\b"+
		"\u0004\u0000\u0000WY\u0005\'\u0000\u0000XQ\u0001\u0000\u0000\u0000XU\u0001"+
		"\u0000\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z\\\u0007\u0005\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0006"+
		"\u0007\u0000\u0000`\u0010\u0001\u0000\u0000\u0000\u000b\u0000\u001a\u001f"+
		"$*09=HX]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}