// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.sentence.*;
	    import ast.expression.*;
	    import ast.type.*;
	    import ast.*;
}

intType returns[IntType ast]
    :                                     { $ast = new IntType(); }                              
	;


//$ -----------------------------------------------------------------------------
// WARNING. The following nodes are NOT accesibles from the first node of the
// grammar (intType)

doubleType returns[DoubleType ast]
    :                                     { $ast = new DoubleType(); }                           
	;

charType returns[CharType ast]
    :                                     { $ast = new CharType(); }                             
	;

voidType returns[VoidType ast]
    :                                     { $ast = new VoidType(); }                             
	;

structType returns[StructType ast]
    : name=IDENT                          { $ast = new StructType($name); }                      
	;

arrayType returns[ArrayType ast]
    : intConstant type                    { $ast = new ArrayType($intConstant.ast, $type.ast); } 
	;

program returns[Program ast]
    : name=IDENT types+=structDefinition* vars+=varDefinition* builders+=IDENT* features+=functionDefinition* functionCallSent { $ast = new Program($name, $types, $vars, $builders, $features, $functionCallSent.ast); }
	;

structDefinition returns[StructDefinition ast]
    : structType fields+=fieldDefinition* { $ast = new StructDefinition($structType.ast, $fields); }
	;

functionDefinition returns[FunctionDefinition ast]
    : name=IDENT params+=varDefinition* type? vars+=varDefinition* sentences+=sentence* { $ast = new FunctionDefinition($name, $params, ($type.ctx == null) ? null : $type.ast, $vars, $sentences); }
	;

functionCallSent returns[FunctionCallSent ast]
    : name=IDENT args+=expression*        { $ast = new FunctionCallSent($name, $args); }         
	;

assignment returns[Assignment ast]
    : left=expression right=expression    { $ast = new Assignment($left.ast, $right.ast); }      
	;

loop returns[Loop ast]
    : from+=assignment* expression body+=sentence* { $ast = new Loop($from, $expression.ast, $body); }    
	;

ifElse returns[IfElse ast]
    : expression trueBlock+=sentence* falseBlock+=sentence* { $ast = new IfElse($expression.ast, $trueBlock, $falseBlock); }
	;

read returns[Read ast]
    : input+=expression*                  { $ast = new Read($input); }                           
	;

print returns[Print ast]
    : input+=expression*                  { $ast = new Print($input); }                          
	;

println returns[Println ast]
    : input+=expression*                  { $ast = new Println($input); }                        
	;

return returns[Return ast]
    : expression?                         { $ast = new Return(($expression.ctx == null) ? null : $expression.ast); }
	;

intConstant returns[IntConstant ast]
    : value=IDENT                         { $ast = new IntConstant($value); }                    
	;

realConstant returns[RealConstant ast]
    : value=IDENT                         { $ast = new RealConstant($value); }                   
	;

charConstant returns[CharConstant ast]
    : value=IDENT                         { $ast = new CharConstant($value); }                   
	;

variable returns[Variable ast]
    : name=IDENT                          { $ast = new Variable($name); }                        
	;

castExpr returns[CastExpr ast]
    : type expression                     { $ast = new CastExpr($type.ast, $expression.ast); }   
	;

arithmeticExpr returns[ArithmeticExpr ast]
    : op1=expression operator=IDENT op2=expression { $ast = new ArithmeticExpr($op1.ast, $operator, $op2.ast); }
	;

logicalExpr returns[LogicalExpr ast]
    : op1=expression operator=IDENT op2=expression { $ast = new LogicalExpr($op1.ast, $operator, $op2.ast); }
	;

comparationExpr returns[ComparationExpr ast]
    : op1=expression operator=IDENT op2=expression { $ast = new ComparationExpr($op1.ast, $operator, $op2.ast); }
	;

minusExpr returns[MinusExpr ast]
    : expression                          { $ast = new MinusExpr($expression.ast); }             
	;

notExpr returns[NotExpr ast]
    : expression                          { $ast = new NotExpr($expression.ast); }               
	;

functionCallExpr returns[FunctionCallExpr ast]
    : name=IDENT args+=expression*        { $ast = new FunctionCallExpr($name, $args); }         
	;

fieldAccess returns[FieldAccess ast]
    : expression field=IDENT              { $ast = new FieldAccess($expression.ast, $field); }   
	;

arrayAccess returns[ArrayAccess ast]
    : array=expression index=expression   { $ast = new ArrayAccess($array.ast, $index.ast); }    
	;

fieldDefinition returns[FieldDefinition ast]
    : name=IDENT type                     { $ast = new FieldDefinition($name, $type.ast); }      
	;

varDefinition returns[VarDefinition ast]
    : name=IDENT type                     { $ast = new VarDefinition($name, $type.ast); }        
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
