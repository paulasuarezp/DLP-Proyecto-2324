grammar Grammar;

import Tokenizer;

@header {
	    import ast.sentence.*;
	    import ast.expression.*;
	    import ast.type.*;
	    import ast.*;
}

program
	: 'class' IDENT ';' ('global' ('types' defTypes*)? ('vars' globalVars)?)? 'create' (IDENT ';')+ featureDef+ 'end' runCall EOF
	;

defTypes
	: 'deftuple' IDENT 'as' field* 'end'
	;

globalVars
	: globalVarListDefinition*
	;

globalVarListDefinition 
	: varListIdents ':' type ';' 
	;

localVars
	: localVarListDefinition*
	;

localVarListDefinition 
	: varListIdents ':' type ';' 
	;

varListIdents
	: IDENT (',' IDENT)* 
	;

field 
	: IDENT ':' type ';' 
	;

param 
	: IDENT ':' type 
	;

featureDef
	: 'feature' IDENT ('(' (param (',' param)*)? ')')? (':' type)? 'is' ('local' localVars)? 'do' sentence* 'end'
	;

runCall
	: 'run' IDENT '(' (expr (',' expr)*)? ')' ';'
	;


sentence
	: 'if' expr 'then' sentence* ('else' sentence*)? 'end' 
	| ('from' sentence*)? 'until' expr+ 'loop' sentence* 'end'
	| 'read' expr ';'
	| 'print' (expr (',' expr)*)? ';'
	| 'println' (expr (',' expr)*)? ';'
	| expr ':=' expr ';'
	| 'return' expr? ';'
	| IDENT '(' (expr (',' expr)*)? ')' ';' // functionCallSent
	;
	
expr 
: INT_CONSTANT 
| REAL_CONSTANT 
| CHAR_CONSTANT
| IDENT 
| '(' expr ')' 
| IDENT '(' (expr (',' expr)*)? ')'  // functionCallExpr
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