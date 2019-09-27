/**
 * Define a grammar called PNP
 */
grammar pnp;

import tokens;

// usado para testes rápidos
file
    : variableDeclarationBlock? procedure+ EOF
    ;

// procedimento
procedure
    : procedureDeclaration procedureInput? procedureOutput? procedureBlock
    ;
procedureDeclaration
    : PROCEDIMENTO ID
    ;
procedureInput
    : ENTRADA (NULO | variableDeclaration+)
    ;
procedureOutput
    : SAIDA (NULO | variableDeclaration)
    ;
procedureBlock
    : INICIO block FIM
    ;

// bloco - declarações de variáveis sempre no começo do bloco
block
    : variableDeclarationBlock? (command | statement)*
    ;
variableDeclarationBlock
    : variableDeclaration+
    ;

command
    : (function | variableAssignment) FIM_COMANDO
    ;
statement
    : ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    ;
statementCondition
    : ABRE_PARENTESES logicalOperation FECHA_PARENTESES
    ;

// operacao
relationalOperation
    : ABRE_PARENTESES relationalOperation FECHA_PARENTESES
    | arithmeticOperation relationalOperator arithmeticOperation
    | characterExpression relationalOperator characterExpression
    | booleanExpression
    ;
logicalOperation
    : ABRE_PARENTESES logicalOperation FECHA_PARENTESES
    | unaryLogicalOperator logicalOperation
    | logicalOperation binaryLogicalOperator logicalOperation
    | booleanExpression
    | relationalOperation
    ;
arithmeticOperation
    : ABRE_PARENTESES arithmeticOperation FECHA_PARENTESES
    | arithmeticOperation multiplicativeOperator arithmeticOperation
    | arithmeticOperation additiveOperator arithmeticOperation
    | numericalExpression
    ;
concatenationOperation
    : ABRE_PARENTESES concatenationOperation FECHA_PARENTESES
    | concatenationOperation ADICAO concatenationOperation
    | characterExpression
    ;

operation
    : arithmeticOperation
    | logicalOperation
    | relationalOperation
    | concatenationOperation
    ;

variableDeclaration
    : ID (SEPARADOR_VARIAVEL ID)* SEPARADOR_VARIAVEL_TIPO type FIM_COMANDO
    ;
variableAssignment
    : ID arrayDimention? ATRIBUICAO operation
    ;

// expressao - separar depois em expressao de cada tipo
expression
    : booleanExpression
    | numericalExpression
    | characterExpression
    ;
booleanExpression
    : ID
    | BOOLEANO_LITERAL
    ;
numericalExpression
    : ID
    | NATURAL_LITERAL
    | INTEIRO_LITERAL
    | RACIONAL_LITERAL
    ;
characterExpression
    : ID
    | CARACTERE_LITERAL
    | STRING_LITERAL
    ;

function
    : ID ABRE_PARENTESES params? FECHA_PARENTESES
    ;
params
    : expression (SEPARADOR_VARIAVEL expression)*
    ;

// condicional se
ifStatement
    : ifStart ifThen ifElseIf
    ;
ifStart
    : SE statementCondition
    ;
ifThen
    : ENTAO block
    ;
ifElse
    : SENAO block FIM
    ;
ifElseIf
    : elseIf
    | ifElse
    | FIM
    ;
elseIf
    : SENAO ifStatement
    ;

// condicional caso
switchStatement
    : switchStart switchCases+ switchDefault? FIM
    ;
switchStart
    : CASO ID SEJA
    ;
switchCases
    : expression (SEPARADOR_VARIAVEL expression)* SEPARADOR_VARIAVEL_TIPO block
    ;
switchDefault
    : SENAO block
    ;

// laço para
forStatement
    : forStart forInterval forStep? forBlock
    ;
forStart
    : PARA ID
    ;
forInterval
    : DE numericalExpression ATE numericalExpression
    ;
forStep
    : PASSO numericalExpression
    ;
forBlock
    : REPITA block FIM
    ;

// laço enquanto
whileStatement
    : whileStart whileBlock
    ;
whileStart
    : ENQUANTO statementCondition
    ;
whileBlock
    : FACA block FIM
    ;

// laço ate que
doWhileStatement
    : doWhileBlock doWhileEnd
    ;
doWhileBlock
    : REPITA block
    ;
doWhileEnd
    : ATE QUE statementCondition FIM_COMANDO
    ;

// tipos primitivos
type
    : INTEIRO
    | RACIONAL
    | BOOLEANO
    | CARACTERE
    | STRING
    | type arrayDimention
    ;

arrayDimention
    : ABRE_CHAVES (NATURAL_LITERAL | ID) FECHA_CHAVES
    ;

// operadores
binaryOperator
    : relationalOperator
    | arithmeticOperator
    | binaryLogicalOperator
    ;

relationalOperator
    : IGUALDADE
    | DESIGUALDADE
    | MAIOR
    | MAIOR_IGUAL
    | MENOR
    | MENOR_IGUAL
    ;
arithmeticOperator
    : additiveOperator
    | multiplicativeOperator
    ;
additiveOperator
    : ADICAO
    | SUBTRACAO
    ;
multiplicativeOperator
    : MULTIPLICACAO
    | DIVISAO_RAC
    | DIVISAO_INT
    | MODULO
    ;

unaryLogicalOperator
    : NOT
    ;
binaryLogicalOperator
    : AND
    | OR
    | XOR
    ;
