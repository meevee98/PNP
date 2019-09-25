# PNP: Manual de Referência

### TOC

- [Elementos Léxicos](#elementos-léxicos)
   - [Identificadores](#identificadores)
   - [Palavras Reservadas](#palavras-reservadas)
   - [Operadores](#operadores)
   - [Espaço](#espaço)
- [Tipos](#tipos)
- [Expressões e Operadores](#expressões-e-operadores)
- [Instruções e Comandos](#instruções-e-comandos)
- [Procedimentos](#procedimentos)
- [Escopo](#escopo)

Este é o manual de referência para a linguagem de programação PNP. Este documento é inspirado no [The GNU C Reference Manual](https://www.gnu.org/software/gnu-c-manual/gnu-c-manual.html#Preface).

## Elementos Léxicos

Esta seção descreve os elementos léxicos do código fonte em PNP. Estes elementos são denominados *tokens*. Existem 4 tipos diferentes de tokens: identificadores, palavras reservadas (*keywords*), operadores e separadores. Cada um deles será descrito a seguir. 

### Identificadores

Identificadores são sequências de caracteres que são utilizadas para nomear variáveis e procedimentos. É permitido utilizar letras, números e o caractere *undeline* em identificadores. 

O primeiro caractere de um identificador não pode ser um número.

Letras minúsculas e maiúsculas são distintas, de forma que foo e Foo são dois identificadores diferentes.

### Palavras Reservadas

Palavras reservadas são identificadores reservados como a parte da linguagem de programação PNP. Não é permitido utilizá-los para qualquer outro propósito.

São palavras reservadas em PNP:

|              |         |          |
| ------------ | ------- | -------- |
| algoritmo    | ate     | booleano |
| caractere    | caso    | de       |
| entao        | entrada | escreva  |
| faca         | fim     | inicio   |
| inteiro      | para    | passo    |
| procedimento | que     | racional |
| repita       | saida   | se       |
| seja         | senao   |          |

### Operadores

Um operador é um token especial que realiza uma operação, como adição ou subtração com um, dois ou três operandos. Detalhes sobre os operadores serão fornecidos na seção [Expressões e Operadores](#expressões-e-operadores).

### Separadores

Um separador separa os tokens:

`( ) [ ] { } ; , . : `

## Tipos

| tipo      | descrição                        |
| --------- | -------------------------------- |
| caractere | caractere -- um único byte       |
| string    | cadeia de caracteres             |
| inteiro   | número inteiro                   |
| racional  | número racional                  |
| booleano  | valor lógico verdadeiro ou falso |

### Inteiro



### Racional



### Caractere



### String



### Booleano



## Expressões e Operadores

### Expressões

| operador | descrição     | tipos              |
| -------- | ------------- | ------------------ |
| +        | soma          | inteiro e racional |
| -        | subtração     | inteiro e racional |
| *        | multiplicação | inteiro e racional |
| /        | divisão       | inteiro e racional |
| div      | divisão       | inteiro            |
| mod      | módulo        | inteiro            |

### Atribuição

### Operadores Aritméticos

### Operadores de Comparação

### Operadores Lógicos

## Instruções e Comandos

### Blocos

### se ... entao

### enquanto ... faca

### repita ... ate que

### para ... de ... ate ... repita

## Procedimentos

### Declarações de Procedimentos

### Chamando Procedimentos

### Argumentos

### O Procedimento Principal

## Escopo

