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
		INT_CONSTANT=1, REAL_CONSTANT=2, IDENT=3, LINE_COMMENT=4, MULTILINE_COMMENT=5, 
		CHAR_CONSTANT=6, WHITESPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "REAL_CONSTANT", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"CHAR_CONSTANT", "WHITESPACE"
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
			null, "INT_CONSTANT", "REAL_CONSTANT", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"CHAR_CONSTANT", "WHITESPACE"
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
		"\u0004\u0000\u0007T\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0004\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0001\u0004"+
		"\u0001\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\"\b\u0002\n\u0002\f\u0002%\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t"+
		"\u0003\u0001\u0003\u0003\u00031\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004:\b"+
		"\u0004\n\u0004\f\u0004=\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001"+
		"\u0006\u0004\u0006O\b\u0006\u000b\u0006\f\u0006P\u0001\u0006\u0001\u0006"+
		"\u0002,;\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u0001\u0000\u0006\u0001\u000009\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0001\u0001\n\n\u0002\u0000\t\n\r\r\u0003\u0000"+
		"\t\n\r\r  [\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u0010\u0001\u0000\u0000\u0000"+
		"\u0003\u0015\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000"+
		"\u0007&\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000bK\u0001"+
		"\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000f\u0011\u0007\u0000"+
		"\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0002\u0001\u0000\u0000\u0000\u0014\u0016\u0007\u0000"+
		"\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0005.\u0000"+
		"\u0000\u001a\u001c\u0007\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0004\u0001\u0000\u0000"+
		"\u0000\u001f#\u0007\u0001\u0000\u0000 \"\u0007\u0002\u0000\u0000! \u0001"+
		"\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005*\u0000\u0000(,\u0001\u0000"+
		"\u0000\u0000)+\t\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/1\u0007\u0003\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0003\u0000"+
		"\u00003\b\u0001\u0000\u0000\u000045\u0005/\u0000\u000056\u0005/\u0000"+
		"\u000067\u0005*\u0000\u00007;\u0001\u0000\u0000\u00008:\t\u0000\u0000"+
		"\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>?\u0005*\u0000\u0000?@\u0005/\u0000\u0000@A\u0005/"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0006\u0004\u0000\u0000C\n\u0001"+
		"\u0000\u0000\u0000DE\u0005\'\u0000\u0000EF\u0005\\\u0000\u0000FG\u0005"+
		"n\u0000\u0000GL\u0005\'\u0000\u0000HI\u0005\'\u0000\u0000IJ\b\u0004\u0000"+
		"\u0000JL\u0005\'\u0000\u0000KD\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000L\f\u0001\u0000\u0000\u0000MO\u0007\u0005\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u0006\u0000\u0000"+
		"S\u000e\u0001\u0000\u0000\u0000\n\u0000\u0012\u0017\u001d#,0;KP\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}