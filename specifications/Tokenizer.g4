lexer grammar Tokenizer;

BOOLEAN_CONSTANT
	: 'true' | 'false'
	;

INT_CONSTANT
	: [0-9]+
	;

REAL_CONSTANT
	: [0-9]+ '.' [0-9]+
	;

IDENT
	: [a-zA-Z][a-zA-Z0-9_]*
	;

LINE_COMMENT
	: '/*' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '//*' .*? '*//' -> skip
	;

CHAR_CONSTANT
	: '\'\\n\'' 
    | '\''~[\n\t\r]'\'' 
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;