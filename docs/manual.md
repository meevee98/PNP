# PNP: Manual de Referência

### TOC

- [Elementos Léxicos](#elementos-léxicos)
   - [Tokens](#tokens)
   - [Identificadores](#identificadores)
   - [Palavras Reservadas](#palavras-reservadas)
   - [Operadores](#operadores)
   - [Espaço](#espaço)
- [Tipos](#tipos)
- [Expressões e Operadores](#expressões-e-operadores)
- [Instruções e Comandos](#instruções-e-comandos)
- [Procedimentos](#procedimentos)
- [Escopo](#escopo)

## Convenções léxicas

### Tokens

```
PROCEDIMENTO: 'procedimento';
ENTRADA: 'entrada';
SAIDA: 'saida';
INICIO: 'inicio';
FIM: 'fim';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
PARA: 'para';
DE: 'de';
ATE: 'ate';
PASSO: 'passo';
REPITA: 'repita';
ENQUANTO: 'enquanto';
FACA: 'faca';
QUE: 'que';
CASO: 'caso';
SEJA: 'seja';
INTEIRO: 'inteiro';
RACIONAL: 'racional';
BOOLEANO: 'booleano';
CARACTERE: 'caractere';
STRING: 'string';
IGUALDADE: '=';
DESIGUALDADE: '<>';
MAIOR: '>';
MAIOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
ADICAO: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVISAO_RAC: '/';
DIVISAO_INT: 'div';
MODULO: 'mod';
AND: 'e';
OR: 'ou';
XOR: 'xor';
NOT: 'nao';

ATRIBUICAO: '<-';
FIM_COMANDO: ';';
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';
ABRE_COLCHETES: '[';
FECHA_COLCHETES: ']';
SEPARADOR_VARIAVEL: ',';
SEPARADOR_VARIAVEL_TIPO: ':';

NATURAL_LITERAL: ZERO* NAO_ZERO DIGITO*;

INTEIRO_LITERAL: ZERO+                 
               | SINAL? ZERO* NAO_ZERO DIGITO*;

RACIONAL_LITERAL: ZERO+'.'ZERO+
                | SINAL? ZERO* NAO_ZERO DIGITO*'.' DIGITO+
                | SINAL? ZERO+'.'NAO_ZERO* DIGITO NAO_ZERO*;
BOOLEANO_LITERAL: 'true'
                | 'false';
CARACTERE_LITERAL: '\'' CARACTER '\'';
STRING_LITERAL: '"' CARACTER*? '"';

SINAL: '-' | '+';
ZERO: '0';
NAO_ZERO: [1-9];
DIGITO: ZERO | NAO_ZERO;
ALFA: [_a-zA-Z];
CARACTER: ~['\\\n\r]   // qualquer caractere, menos \n, \r, ' e \
        | ESCAPE;
ESCAPE: '\\''b'     // backspace
      | '\\''t'     // tabulation
      | '\\''n'     // new line
      | '\\''f'     // form feed
      | '\\''r'     // carriage return
      | '\\''"'     // escaped "
      | '\\''\''    // escaped '
      | '\\''\\';   // escaped \

ID : ALFA (ALFA | DIGITO)* ;
```

### Identificadores

Identificadores são sequências de caracteres que são utilizadas para nomear variáveis e procedimentos. É permitido utilizar letras, números e o caractere *undeline* em identificadores. 

O primeiro caractere de um identificador não pode ser um número.

Letras minúsculas e maiúsculas são distintas, de forma que foo e Foo são dois identificadores diferentes.

### Palavras Reservadas

Palavras reservadas são identificadores reservados como a parte da linguagem de programação PNP. Não é permitido utilizá-los para qualquer outro propósito.

São palavras reservadas em PNP:

|           |              |          |
| ----------| ------------ | -------- |
| ate       | faca         | que      |
| booleano  | fim          | racional |
| caractere | inicio       | repita   |
| caso      | inteiro      | saida    |
| de        | mod          | se       |
| div       | nao          | seja     |
| e         | ou           | senao    |
| enquanto  | para         | string   |
| entao     | passo        | xor      |
| entrada   | procedimento |          |

### Constantes

```
constant
    : NATURAL_LITERAL
    | INTEIRO_LITERAL
    | RACIONAL_LITERAL
    | BOOLEANO_LITERAL
    | CARACTERE_LITERAL
    | STRING_LITERAL
    ;
```

#### Constantes de Inteiro

Aceita omissão de sinal de números, números positivos e negativos, mas não aceita +0 nem -0

#### Constantes de Caractere

Sequências de escape:

|                      |       |
| -------------------- | ----- |
| espaço em branco     | \b    |
| tabulação horizontal | \t    |
| nova linha           | \n    |
| formfeed             | \f    |
| carriage return      | \r    |
| aspas                | \\\"  |
| apóstrofo            | \\\'  |
| barra invertida      | \\\\  | 

#### Constantes de Racional

Aceita omissão de sinal de números, números positivos e negativos, mas não aceita +0.0 nem -0.0

### Strings Literais

## Notação Sintática

## Significado dos Identificadores

## Objetos e Valores

## Conversões

## Expressões

```
expression
    : ID
    | constant
    | 
```

### Vetor

```
arrayDimention
    : ABRE_COLCHETES (NATURAL_LITERAL | ID) FECHA_COLCHETES
    ;
```

### Chamada de Procedimento

```
function
    : ID ABRE_PARENTESES params? FECHA_PARENTESES
    ;
```
```
params
    : expression (SEPARADOR_VARIAVEL expression)*
    ;
```

### Operadores Multiplicativos

```
multiplicativeOperator
    : MULTIPLICACAO
    | DIVISAO_RAC
    | DIVISAO_INT
    | MODULO
    ;
```

### Operadores Aditivos

```
additiveOperator
    : ADICAO
    | SUBTRACAO
    ;
```

### Operadores Relacionais

```
relationalOperation
    : ABRE_PARENTESES relationalOperation FECHA_PARENTESES
    | arithmeticOperation relationalOperator arithmeticOperation
    | characterExpression relationalOperator characterExpression
    | booleanExpression
    ;
```

```
relationalOperator
    : IGUALDADE
    | DESIGUALDADE
    | MAIOR
    | MAIOR_IGUAL
    | MENOR
    | MENOR_IGUAL
    ;
```

### Operadores Lógicos


```
logicalOperation
    : ABRE_PARENTESES logicalOperation FECHA_PARENTESES
    | unaryLogicalOperator logicalOperation
    | logicalOperation binaryLogicalOperator logicalOperation
    | booleanExpression
    | relationalOperation
    ;
unaryLogicalOperator
    : NOT
    ;
binaryLogicalOperator
    : AND
    | OR
    | XOR
    ;
```

### Expressões de Atribuição

```
variableAssignment
    : ID arrayDimention? ATRIBUICAO operation
    ;
```

### Expressões Constantes
```
expression
    : booleanExpression
    | numericalExpression
    | characterExpression
    ;
```
```
booleanExpression
    : ID
    | BOOLEANO_LITERAL
    ;
```
```
numericalExpression
    : ID
    | NATURAL_LITERAL
    | INTEIRO_LITERAL
    | RACIONAL_LITERAL
    ;
```
```
characterExpression
    : ID
    | CARACTERE_LITERAL
    | STRING_LITERAL
    ;
```

## Declarações

```
variableDeclaration
    : ID (SEPARADOR_VARIAVEL ID)* SEPARADOR_VARIAVEL_TIPO type FIM_COMANDO
    ;
```

### Especificadores de Tipo

| tipo      | descrição                        |
| --------- | -------------------------------- |
| caractere | caractere -- um único byte       |
| string    | cadeia de caracteres             |
| inteiro   | número inteiro                   |
| racional  | número racional                  |
| booleano  | valor lógico verdadeiro ou falso |

```
type
    : INTEIRO
    | RACIONAL
    | BOOLEANO
    | CARACTERE
    | STRING
    | type arrayDimention
    ;
```

## Statements

```
statement
    : ifStatement
    | forStatement
    | whileStatement
    | doWhileStatement
    | switchStatement
    ;
```

### Statements de Seleção

#### Se Então Statement

```
ifStatement
    : SE statementCondition
      ENTAO block ifElseIf
    ;
ifElseIf
    : elseIf
    | ifElse
    | FIM
    ;
elseIf
    : SENAO ifStatement
    ;
ifElse
    : SENAO block FIM
    ;
```

#### Caso Faça Statement

```
switchStatement
    : CASO ID SEJA
      switchCases+
      SENAO block? FIM
    ;
switchCases
    : expression (SEPARADOR_VARIAVEL expression)* SEPARADOR_VARIAVEL_TIPO block
    ;
```

### Statement de Iteração

#### Para Statement

```
forStatement
    : PARA ID
      DE numericalExpression
      ATE numericalExpression
      (PASSO numericalExpression)?
      REPITA block FIM
    ;
```

#### Enquanto Statement

```
whileStatement
    : ENQUANTO statementCondition FACA block FIM
    ;
```

#### Repita Até Que Statement

```
doWhileStatement
    : REPITA block ATE QUE statementCondition FIM_COMANDO
    ;
```

## Escopo

## Gramática

