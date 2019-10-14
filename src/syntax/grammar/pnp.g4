/**
 * Define a grammar called PNP
 */
grammar pnp;

import tokens;

// estrutura dos arquivos
file
    : typeDeclaration*            // criação de tipos abstratos
      variableDeclarationBlock?   // declaração das variáveis globais
      variableAssignmentBlock?    // atribuição das variáveis globais
      procedure*                  // procedimentos
      mainProcedure               // procedimento principal
      EOF
    ;

// procedimento
procedure
    : procedureDeclaration procedureBody
    ;
procedureBody
    : procedureInput? procedureOutput? procedureBlock
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
mainProcedure
    : PROCEDIMENTO PRINCIPAL procedureBody
    ;

// tipo abstrato
typeDeclaration
    : TIPO ID INICIO typeVariableDeclarationBlock FIM
    ;
typeVariableDeclarationBlock
    : ID (SEPARADOR_VARIAVEL ID)* SEPARADOR_VARIAVEL_TIPO typeDefinitionType FIM_COMANDO
    ;

// bloco - declarações de variáveis sempre no começo do bloco
block
    : variableDeclarationBlock? (command | statement)*
    ;
variableDeclarationBlock
    : variableDeclaration+
    ;
variableAssignmentBlock
    : (variableAssignment FIM_COMANDO)+
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
    | integerArithmeticOperation relationalOperator integerArithmeticOperation
    | rationalArithmeticOperation comparisonOperator rationalArithmeticOperation
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
integerArithmeticOperation
    : ABRE_PARENTESES integerArithmeticOperation FECHA_PARENTESES
    | integerArithmeticOperation multiplicativeOperator integerArithmeticOperation
    | integerArithmeticOperation additiveOperator integerArithmeticOperation
    | integerExpression
    ;
rationalArithmeticOperation
    : integerArithmeticOperation
    | ABRE_PARENTESES rationalArithmeticOperation FECHA_PARENTESES
    | rationalArithmeticOperation rationalMultiplicativeOperator rationalArithmeticOperation
    | rationalArithmeticOperation additiveOperator rationalArithmeticOperation
    | rationalExpression
    ;
concatenationOperation
    : ABRE_PARENTESES concatenationOperation FECHA_PARENTESES
    | concatenationOperation CONCATENACAO concatenationOperation
    | characterExpression
    | numericalExpression
    ;

operation
    : integerArithmeticOperation
    | rationalArithmeticOperation
    | logicalOperation
    | relationalOperation
    | concatenationOperation
    ;

variable
    : ID arrayDimention? (SEPARADOR_TIPO_VARIAVEL variable)?
    ;

variableDeclaration
    : ID (SEPARADOR_VARIAVEL ID)* SEPARADOR_VARIAVEL_TIPO type FIM_COMANDO
    ;
variableAssignment
    : variable ATRIBUICAO operation
    ;

// expressao - separar depois em expressao de cada tipo
expression
    : booleanExpression
    | numericalExpression
    | characterExpression
    ;
booleanExpression
    : BOOLEANO_LITERAL
    | variable
    ;
numericalExpression
    : integerExpression
    | rationalExpression
    ;
integerExpression
    : NATURAL_LITERAL
    | INTEIRO_LITERAL
    | variable
    ;
rationalExpression
    : RACIONAL_LITERAL
    | variable
    ;
characterExpression
    : CARACTERE_LITERAL
    | STRING_LITERAL
    | variable
    ;

function
    : readFunction
    | writeFunction
    | ID ABRE_PARENTESES params? FECHA_PARENTESES
    ;
params
    : expression (SEPARADOR_VARIAVEL expression)*
    ;
readFunction
    : LEIA ABRE_PARENTESES FECHA_PARENTESES
    ;
writeFunction
    : ESCREVA ABRE_PARENTESES params? FECHA_PARENTESES
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
    : CASO variable SEJA
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
    : PARA variable
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
typeDefinitionType
    : primitiveType
    | typeDefinitionType arrayDimentionLiteral
    | ID
    ;

type
    : primitiveType
    | type arrayDimention
    | ID
    ;

primitiveType
    : INTEIRO
    | RACIONAL
    | BOOLEANO
    | CARACTERE
    | STRING
    ;

arrayDimention
    : ABRE_CHAVES variable FECHA_CHAVES
    | arrayDimentionLiteral
    ;
arrayDimentionLiteral
    : ABRE_CHAVES NATURAL_LITERAL FECHA_CHAVES
    ;

// operadores
binaryOperator
    : relationalOperator
    | arithmeticOperator
    | binaryLogicalOperator
    ;

relationalOperator
    : equalityOperator
    | comparisonOperator
    ;

equalityOperator
    : IGUALDADE
    | DESIGUALDADE
    | MAIOR_IGUAL
    | MENOR_IGUAL
    ;
comparisonOperator
    : MAIOR
    | MENOR
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
    : rationalMultiplicativeOperator
    | DIVISAO_INT
    | MODULO
    ;
rationalMultiplicativeOperator
    : MULTIPLICACAO
    | DIVISAO_RAC
    ;

unaryLogicalOperator
    : NOT
    ;
binaryLogicalOperator
    : AND
    | OR
    | XOR
    ;
