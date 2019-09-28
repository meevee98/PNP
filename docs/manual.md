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
    : integerLiteral
    | characterLiteral
    | rationalLiteral
    | stringLiteral
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

### Chamada de Procedimento

### Operadores Unários

### Operadores Multiplicativos

### Operadores Aditivos

### Operadores Relacionais

### Operadores Lógicos

#### Operador e

#### Operador ou

#### Operador xor

### Expressões de Atribuição

### Expressões Constantes

## Declarações

### Especificadores de Tipo

| tipo      | descrição                        |
| --------- | -------------------------------- |
| caractere | caractere -- um único byte       |
| string    | cadeia de caracteres             |
| inteiro   | número inteiro                   |
| racional  | número racional                  |
| booleano  | valor lógico verdadeiro ou falso |

## Statements

### Statements de Seleção

### Statement de Iteração

## Escopo

## Gramática

