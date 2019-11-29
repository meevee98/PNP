/**
 * Define a grammar called PNP
 */
grammar Pnp;

import Tokens;

// estrutura dos arquivos
file
    : typeDeclaration*                          // criação de tipos abstratos
      variableDeclarationAndAssignmentBlock?    // declaração e inicialização das variáveis globais
      procedureDeclarationBlock?                // procedimentos
      EOF
    ;

procedureDeclarationBlock
    : procedure*
      mainProcedure                             // procedimento principal
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
    : variableDeclaration+
    ;

// bloco - declarações de variáveis sempre no começo do bloco
block
    : variableDeclarationAndAssignmentBlock? (command | statement)*
    ;
variableDeclarationAndAssignmentBlock
    : (variableDeclarationAndAssignment)+
    ;
variableDeclarationAndAssignment
    : variableDeclaration variableAssignment+
    ;

command
    : function
    | variableAssignment
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
    : ABRE_PARENTESES relationalOperation FECHA_PARENTESES                                  #priorityRelationalOperation
    | integerArithmeticOperation operator=relationalOperator integerArithmeticOperation     #integerRelationalOperation
    | rationalArithmeticOperation operator=comparisonOperator rationalArithmeticOperation   #rationalRelationalOperation
    | characterExpression operator=relationalOperator characterExpression                   #characterRelationalOperation
    | booleanExpression                                                                     #expressionRelationalOperation
    ;
logicalOperation
    : ABRE_PARENTESES logicalOperation FECHA_PARENTESES                 #priorityLogicalOperation
    | operator=unaryLogicalOperator logicalOperation                    #unaryLogicalOperation
    | logicalOperation operator=binaryLogicalOperator logicalOperation  #binaryLogicalOperation
    | booleanExpression                                                 #expressionLogicalOperation
    | relationalOperation                                               #relationalLogicalOperation
    ;
integerArithmeticOperation
    : ABRE_PARENTESES integerArithmeticOperation FECHA_PARENTESES                           #priorityIntegerArithmeticOperation
    | integerArithmeticOperation operator=multiplicativeOperator integerArithmeticOperation #integerMultiplicativeOperation
    | integerArithmeticOperation operator=additiveOperator integerArithmeticOperation       #integerAdditiveOperation
    | integerExpression                                                                     #expressionIntegerArithmeticOperation
    ;
rationalArithmeticOperation
    : integerArithmeticOperation                                                                        #integerExpressionRationalArithmeticOperation
    | ABRE_PARENTESES rationalArithmeticOperation FECHA_PARENTESES                                      #priorityRationalArithmeticOperation
    | rationalArithmeticOperation operator=rationalMultiplicativeOperator rationalArithmeticOperation   #rationalMultiplicativeOperation
    | rationalArithmeticOperation operator=additiveOperator rationalArithmeticOperation                 #rationalAdditiveOperation
    | rationalExpression                                                                                #rationalExpressionRationalArithmeticOperation
    ;
concatenationOperation
    : ABRE_PARENTESES concatenationOperation FECHA_PARENTESES       #priorityConcatenationOperation
    | concatenationOperation CONCATENACAO concatenationOperation    #recursiveConcatenationOperation
    | characterExpression                                           #characterExpressionConcatenationOperation
    | numericalExpression                                           #numericalExpressionConcatenationOperation
    ;

operation
    : integerArithmeticOperation
    | rationalArithmeticOperation
    | logicalOperation
    | relationalOperation
    | concatenationOperation
    ;

variable
    : id=ID arrayDimention? (SEPARADOR_TIPO_VARIAVEL variable)?
    ;

variableDeclaration
    : identifier=ID (SEPARADOR_VARIAVEL innerId=ID)* SEPARADOR_VARIAVEL_TIPO t=type FIM_COMANDO
    ;
variableAssignment
    : variable ATRIBUICAO operation FIM_COMANDO
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
    | ID ABRE_PARENTESES params? FECHA_PARENTESES FIM_COMANDO
    ;
params
    : expression (SEPARADOR_VARIAVEL expression)*
    ;
readFunction
    : LEIA ABRE_PARENTESES FECHA_PARENTESES FIM_COMANDO
    ;
writeFunction
    : ESCREVA ABRE_PARENTESES params? FECHA_PARENTESES FIM_COMANDO
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
    : ABRE_CHAVES variable FECHA_CHAVES     #variableArrayDimention
    | arrayDimentionLiteral                 #literalArrayDimention
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
