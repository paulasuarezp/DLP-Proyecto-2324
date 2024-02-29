grammar Grammar;

import Tokenizer;

@header {
	    import ast.sentence.*;
	    import ast.expression.*;
	    import ast.type.*;
	    import ast.*;
}

// ##INICIO program: Programa principal
program
	: 'class' IDENT ';' ('global' ('types' defTypes)? ('vars' globalVars)?)? 'create' builders features 'end' runCall EOF
	;
// ##FIN program

// ##INICIO defTypes: Definición de estructuras 
defTypes
	: defTuple*
	;

defTuple
	: 'deftuple' IDENT 'as' fields 'end'
	;

fields
	: field*
	;


field 
	: IDENT ':' type ';' 
	;

// ##FIN defTypes 

// ##INICIO globalVars: Definición de variables globales 
globalVars
	: globalVarListDefinition*
	;

globalVarListDefinition 
	: varListIdents ':' type ';' 
	;

// ##FIN globalVars


// ##INICIO builders: Declaración de funciones (constructores)
builders
	: (IDENT ';')+
	;
// ##FIN builders

// ##INICIO features: Declaración de funciones
features
	: featureDef*
	;
// ##FIN features


// ##INICIO localVars: Declaración de variables locales
localVars
	: localVarListDefinition*
	;

localVarListDefinition 
	: varListIdents ':' type ';' 
	;

// ##FIN localVars


// ##INICIO varListIdents: Lista de identificadores de variables
varListIdents
	: IDENT (',' IDENT)* 
	;

// ##FIN varListIdents


// ##INICIO featureDef: Definición de funciones
featureDef
	: 'feature' IDENT ('(' params ')')? (':' type)? 'is' ('local' localVars)? 'do' sentences 'end'
	;

// ##FIN featureDef

// ##INICIO params: Parámetros de funciones
params
	: (param (',' param)*)?
	;

param 
	: IDENT ':' type 
	;

// ##FIN params

// ##INICIO runCall: Llamada a función principal
runCall
	: 'run' IDENT '(' args ')' ';'
	;
// ##FIN runCall

// ##INICIO sentence: Lista de sentencias
sentences
	: sentence*
	;
// ##FIN sentences

// ##INICIO sentence: Sentencias
sentence
	: 'if' expr 'then' sentences ('else' sentences)? 'end' 
	| ('from' sentences)? 'until' expr 'loop' sentences 'end'
	| 'read' args ';'
	| 'print' args ';'
	| 'println' args ';'
	| expr ':=' expr ';'
	| 'return' expr? ';'
	| IDENT '(' args ')' ';' // functionCallSent
	;
// ##FIN sentence

// ##INICIO args: Lista de argumentos (expresiones) de llamadas a funcion
args
	: (expr (',' expr)*)?
	;
// ##FIN args

// ##INICIO expr: Expresiones
expr 
: INT_CONSTANT 
| REAL_CONSTANT 
| CHAR_CONSTANT
| IDENT 
| '(' expr ')' 
| IDENT '(' args ')'  // functionCallExpr
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
// ##FIN expr


// ##INICIO type: Tipos de datos
type 
	: 'INTEGER' 
	| 'DOUBLE' 
	| 'CHARACTER' 
	| '[' INT_CONSTANT ']' type  
	| IDENT
	| 'void' 
	;
// ##FIN type