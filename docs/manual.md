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

Este é o manual de referência para a linguagem de programação PNP. Este documento é inspirado no [The GNU C Reference Manual](https://www.gnu.org/software/gnu-c-manual/gnu-c-manual.html#Preface) e no Apêndice A do livro [The C Programming Language](https://www.amazon.com.br/Programming-Language-Brian-W-Kernighan/dp/0131103628), escrito por [Kernighan](https://www.cs.princeton.edu/~bwk/) e [Dennis Ritchie](https://en.wikipedia.org/wiki/Dennis_Ritchie).


## Convenções léxicas

Esta seção descreve os elementos léxicos do código fonte em PNP. Estes elementos são denominados *tokens*.

### Tokens

Existem seis tipos diferentes de tokens: identificadores, palavras reservadas (*keywords*), constantes, literais de cadeia de caracteres, operadores e separadaores. Espaços em branco, tabs e quebras de linhas são geralmente ignorados, exceto quando separam tokens, palavras reservadas e constantes.

Abaixo são listados os tokens do PNP e posteriormente neste documento, em cada seção, serão apresentados os tokens correspondentes.

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
DESIGUALDADE: '!=';
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

O primeiro caractere de um identificador não pode ser um número. Letras minúsculas e maiúsculas são distintas, de forma que `foo` e `Foo` são dois identificadores diferentes.

Em PNP, cada identificador precisa ser único, ou seja, só é possível utilizar uma determinada sequência de caracteres para um único identificador dentro daquele escopo.

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

Existem vários tipos de constantes, sendo cada uma de algum dos tipos suportados pelo PNP.

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

Uma constante de inteiro consiste em uma sequência de dígitos em representação decimal
Aceita omissão de sinal de números, números positivos e negativos, mas não aceita +0 nem -0

#### Constantes de Caractere

Uma constante de caractere é um único elemento encapsulado em aspas simples como 'j'. Em alguns casos, pode haver dois elementos, quando são utilizadas sequências de escape, que podem ser auferidas na tabela abaixo:

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

Uma constante de racional consiste na parte inteira, decimal ou fracionária. Ambas a parte inteira e a parte fracionária consistem em uma sequência de dígitos em representação decimal. Tanto a parte fracionária quanto a parte inteira precisam ser sempre explicitada, como por exemplo 1.0 ou 0.1.
Exemplos como 1 ou .1 não são aceitos para constantes racionais. É permitido a omissão de sinal de números, números positivos e negativos, mas é permitido +0.0 nem -0.0.

### Strings Literais
Uma string literal ou string constante é uma sequência de carateres encapsulados por aspas duplas como "compiladores".

## Notação Sintática

Ao longo deste documento é utilizada uma convenção para representar a descrição das regras da gramática que segue o modelo abaixo:

```
nome-da-regra
    : atributo1
    | atributo2
    | atributo3

```

## Conversões
Alguns operadores podem, dependendo dos operandos, provocar conversão do tipo do valor de determinado operando. Isto é reconhecido por conversões ou *casting*

Pode ocorrer, por exemplo a conversão do valor de um operando que seja do tipo inteiro para racional e vice-versa. Quando o valor de um racional é convertido para inteiro, a parte fracionária é simplesmente descartada, sem realizada arredondamento.

Muitos operadores aritméticos podem causar conversões automaticamente e tratar os resultados das operações de forma semelhante. Em PNP, será utilizada a prioridade de converter valor dos operandos para racional caso algum deles seja racional.

No final da expressão aritmética, caso a variável que receberá o valor seja de um tipo diferente do resultado, será realizada uma conversão. Desta forma, se o resultado for do tipo racional mas a variável do tipo inteiro, a parte fracionária será cortada.

Ainda existe um caso especial à parte de expressões aritméticas, que é a concatenação de strings. Caso em uma operação de concatenação de strings um dos valores seja do tipo inteiro ou racional, será realizada a conversão do valor para string antes da concatenação. Ressalta-se que não é suportado a conversão inversa, ou seja, de string para racional ou inteiro.


## Expressões

Expressões aritméticas utilizam a notação infixa onde prevalece a prioridade de operadores multiplicativos sobre operadores aditivos. Caso haja mais de um operador com o mesmo nível de prioridade, a ordem será definida pela sequência seguindo da esquerda para a direita.


```
expression
    : ID
    | constant
    | 
```

### Vetor

Em PNP, podem ser criados vetores de inteiros, racionais, strings e caracteres. A definição da dimensão (*tamanho*) do vetor ou o acesso à posição do vetor por ser realizada com um literal inteiro positivo ou com o uma variável do tipo inteiro cujo valor é positivo.

Tendo em vista que PNP é uma linguagem inspirada em pseudocódigo, não é permitido o acesso à posição 0 de um vetor.

```
arrayDimention
    : ABRE_COLCHETES (NATURAL_LITERAL | ID) FECHA_COLCHETES
    ;
```

### Chamada de Procedimento

A chamada de um procedimento é realizada através do identificador do procedimento seguido por parênteses, que pode ou não conter uma lista de argumentos separados por vírgula, que constituem os argumentos do procedimento. Abaixo são apresentadas as regras gramáticais das chamadas de procedimentos e dos seus argumentos.



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

São operadores multiplicativos: `*`, `div`, `/` e `mod`. Os operandos `*` e `/` podem ser inteiros ou racionais. Por outro lado, os operandos de `div` e `mod` precisam ser inteiros. É possível auferir abaixo a regra gramatical dos operadores multiplicativos.

```
multiplicativeOperator
    : MULTIPLICACAO
    | DIVISAO_RAC
    | DIVISAO_INT
    | MODULO
    ;
```

### Operadores Aditivos

Os operadores aditivos `+` e `-` suportam todos os operandos do aritiméticos. Caso um dos operandos seja racional e o outro inteiro, é realizada a conversão conforme apresentada anteriormente. Abaixo é possível auferir a regra gramatical de operadores aditivos. 

```
additiveOperator
    : ADICAO
    | SUBTRACAO
    ;
```

### Operadores Relacionais

Em expressões relacionais, é prevalecida a prioridade da esquerda para a direita, visto que todos os operandos têm a mesma prioridade. O resultado de uma expressão relacional é um literal booleano.

São operadores relacionais `<`, `>`,  `<=`,  `>=`,  `=` e `!=`.


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

Expressões lógicas seguem as regras booleanas, portanto os operadores `e`, `ou` e `oux` fornece o comportamento do AND, OR e XOR lógico.

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

Em PNP, existe apenas uma expressão de atribuição cujo operador é `<-`, onde o identificador que deve receber o valor fica à esquerda e a operação à direita do operador.

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

Declarações especificam a interpretação dada para cada identificador.

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

*Statements*, *comandos* ou *instruções* são executados em sequência. Em PNP, os dois *statements* mais importantes são os de seleção e os de iteração, que serão abordados abaixo.

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

*Comandos* de seleção definem um ou mais fluxos de controle baseado em condições. Em PNP há a seleção `se... entao` e a `caso ... seja`. 

As condições da seleção `se... entao` podem ser expressões lógicas, expressões relacionais ou valores do tipo aritmético, onde 0 inteiro ou 0.0 racional são interpretados como uma condição `falsa` e qualquer outro número é interpretado como uma condição `verdadeira`.

Por outro lado, o *comando* `caso ... seja` é indicado para indicar fluxos de acordo com diversas condições.  É permitido utilizar expressões lógicas, embora seja muito mais comum a utilização de expressões relacionais.

O bloco de qualquer comando de seleção só é executado se a condição for verdadeira.

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

Existem três formas de iteração em PNP: `para i de 0 até 42 repita`, `enquanto <condição> faca` e a `repita até que <condicao>`.

No laço de repetição `para`, o bloco é repetido até que o valor de i supere o valor do controle. O passo para incrementação pode ser otimido quando tem valor 1.

No laço `enquanto`, o bloco é repetido enquanto a condição for verdeira em uma pré-condição, que é testada antes da execução do bloco. Já no laço `repita`, o bloco é repetido enquanto a condição for falsa em uma pós-condição, que é verificada após a execução do bloco.

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

Um escopo léxico de um identificador é a parte de um código-fonte onde as características do identificador são compreendidas. Em PNP, existem duas tipos de escopo: global e local.

 Um identificador de escopo global é disponível para ser acessível por toda parte do código-fonte. Por outro lado, um identificador de escopo global é disponível para ser acessível apenas dentro daquele bloco, como laço de repetição ou procedimento.
 
 Isto significa que é permitido utilizar para nomes para identificadores em escopos locais diferentes, mesmo que tenham propósitos diferentes e tipos diferentes.  

