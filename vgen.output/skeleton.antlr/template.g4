// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.sentence.*;
	    import ast.expression.*;
	    import ast.type.*;
	    import ast.*;
}

program returns[Program ast]
    : name=IDENT types+=structDefinition* vars+=globalVariable* builders+=IDENT* features+=functionDefinition* functionCallSent { $ast = new Program($name, $types, $vars, $builders, $features, $functionCallSent.ast); }
	;

structDefinition returns[StructDefinition ast]
    : structType fields+=fieldDefinition* { $ast = new StructDefinition($structType.ast, $fields); }
	;

structType returns[StructType ast]
    : name=IDENT                          { $ast = new StructType($name); }                      
	;

fieldDefinition returns[FieldDefinition ast]
    : name=IDENT type                     { $ast = new FieldDefinition($name, $type.ast); }      
	;

type returns[Type ast]
    :                                     { $ast = new IntType(); }                              
    |                                     { $ast = new DoubleType(); }                           
    |                                     { $ast = new CharType(); }                             
    |                                     { $ast = new VoidType(); }                             
    | name=IDENT                          { $ast = new StructType($name); }                      
    | intConstant type                    { $ast = new ArrayType($intConstant.ast, $type.ast); } 
	;

intConstant returns[IntConstant ast]
    : value=IDENT                         { $ast = new IntConstant($value); }                    
	;

globalVariable returns[GlobalVariable ast]
    : varDefinition                       { $ast = new GlobalVariable($varDefinition.ast); }     
	;

varDefinition returns[VarDefinition ast]
    : name=IDENT type                     { $ast = new VarDefinition($name, $type.ast); }        
	;

functionDefinition returns[FunctionDefinition ast]
    : name=IDENT params+=varDefinition* type localVariables+=localVariable* sentences+=sentence* { $ast = new FunctionDefinition($name, $params, $type.ast, $localVariables, $sentences); }
	;

localVariable returns[LocalVariable ast]
    : varDefinition                       { $ast = new LocalVariable($varDefinition.ast); }      
	;

sentence returns[Sentence ast]
    : name=IDENT args+=expression*        { $ast = new FunctionCallSent($name, $args); }         
    | left=expression right=expression    { $ast = new Assignment($left.ast, $right.ast); }      
    | from+=assignment* expression body+=sentence* { $ast = new Loop($from, $expression.ast, $body); }    
    | expression trueBlock+=sentence* falseBlock+=sentence* { $ast = new IfElse($expression.ast, $trueBlock, $falseBlock); }
    | input+=expression*                  { $ast = new Read($input); }                           
    | input+=expression*                  { $ast = new Print($input); }                          
    | input+=expression*                  { $ast = new Println($input); }                        
    | expression                          { $ast = new Return($expression.ast); }                
	;

expression returns[Expression ast]
    : value=IDENT                         { $ast = new IntConstant($value); }                    
    | value=IDENT                         { $ast = new RealConstant($value); }                   
    | value=IDENT                         { $ast = new CharConstant($value); }                   
    | name=IDENT                          { $ast = new Variable($name); }                        
    | type expression                     { $ast = new Cast($type.ast, $expression.ast); }       
    | op1=expression operator=IDENT op2=expression { $ast = new ArithmeticExpr($op1.ast, $operator, $op2.ast); }
    | op1=expression operator=IDENT op2=expression { $ast = new LogicalExpr($op1.ast, $operator, $op2.ast); }
    | op1=expression operator=IDENT op2=expression { $ast = new ComparationExpr($op1.ast, $operator, $op2.ast); }
    | expression                          { $ast = new MinusExpr($expression.ast); }             
    | expression                          { $ast = new NotExpr($expression.ast); }               
    | name=IDENT args+=expression*        { $ast = new FunctionCallExpr($name, $args); }         
    | expression field=IDENT              { $ast = new FieldAccess($expression.ast, $field); }   
    | array=expression index=expression   { $ast = new ArrayAccess($array.ast, $index.ast); }    
	;

assignment returns[Assignment ast]
    : left=expression right=expression    { $ast = new Assignment($left.ast, $right.ast); }      
	;

functionCallSent returns[FunctionCallSent ast]
    : name=IDENT args+=expression*        { $ast = new FunctionCallSent($name, $args); }         
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
