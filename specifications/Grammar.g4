grammar Grammar;

import Tokenizer;

program
	: 'class' IDENT ';' ('global' ('types' defTypes*)? ('vars' defVar*)?)? 'create' (IDENT ';')+ featureDef+ 'end' 'run' sentence EOF
	;

defTypes
	: 'deftuple' IDENT 'as' field* 'end'
	;

defVar 
	: IDENT (',' IDENT)? ':' type ';' 
	;

field 
	: IDENT ':' type ';' 
	;

param 
	: IDENT ':' type 
	;

featureDef
	: 'feature' IDENT ('(' (param (',' param)*)? ')')? (':' type)? 'is' ('local' defVar*)? 'do' sentence* 'end'
	;

sentence
	: 'if' expr+ 'then' sentence* ('else' sentence*)? 'end' 
	| ('from' sentence*)? 'until' expr+ 'loop' sentence* 'end'
	| 'read' expr ';'
	| 'print' (expr (',' expr)*)? ';'
	| 'println' (expr (',' expr)*)? ';'
	| expr ':=' expr ';'
	| 'return' expr? ';'
	| IDENT '(' (expr (',' expr)*)? ')' ';' // function call
	;
	
expr 
: INT_CONSTANT 
| REAL_CONSTANT 
| CHAR_CONSTANT
| IDENT 
| '(' expr ')' 
| IDENT '(' (expr (',' expr)*)? ')'  // function call
| expr '.' IDENT 
| expr'[' expr ']' 
| '-' expr 
| expr ('*' | '/' | 'mod') expr 
| expr ('+' | '-') expr 
| expr ('=' | '<>' | '>' | '<' | '>=' | '<=') expr
| 'to<' type '>(' expr ')' 
| 'not' expr 
| expr 'and' expr 
| expr 'or' expr 

	;



type 
	: 'INTEGER' 
	| 'DOUBLE' 
	| 'CHARACTER' 
	| '[' INT_CONSTANT ']' type  
	| IDENT 
	;