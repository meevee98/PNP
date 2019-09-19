# Gramática

Este documento descreve brevemente as gramáticas livre de contexto utilizadas para definir 
a estrutura léxica e sintática. Gramáticas são sistemas baseados em regras através dos quais é possível 
sintetizar o conjunto das cadeias que compõem determinada linguagem, inclusive o PNP.

## 1. Gramáticas Livres de Contexto

Assim como nas linguagens informais, as linguagens formais também são especificadas através de gramáticas.
Chamadas de **gramáticas livres de contexto**, as gramáticas das linguagens formais são descritas utilizando
notações matemáticas que evitam ambiguidade e exerce rigor em sua definição. Uma gramática livre de contexto
especifica a sintaxe de uma linguagem e pode ser utilizada para auxiliar na tradução de programas fonte para
programas objeto na compilação.

Uma gramática *G* livre de contexto possui quatro componentes:

1. Um conjunto finito *N* de símbolos terminais, denominado vocabulário;
2. Um conjunto de *∑* não-terminais, denominado alfabeto. Cada não-terminal representa um conjunto de cadeias de terminais;
3. Um conjunto *P* de produções;
4. A definição de um dos símbolos do alfabeto como símbolo inicial *S* da gramática.

Desta forma, é possível representar a gramática G como:

                     G = (N, ∑, P, S) 

## 2. Gramática Léxica

A gramática léxica para o PNP é descrita ao longo deste texto. Essa gramática tem como símbolos terminais o
conjunto de caracteres [Unicode](https://www.ime.usp.br/~pf/algoritmos/apend/unicode.html). Elementos de
entrada, com exceção do espaço em branco e comentários, formam os *tokens* -- símbolos terminais para a 
gramática sintática. Tokens são formados por identificadores, palavras reservadas, literais, separadores e
operadores. Mais detalhes sobre os Tokens podem ser obtidos [aqui]().


## 3. Gramática Sintática

A gramática sintática obtém os símbolos terminais e os tokens definidos pela gramática léxica e define um 
conjunto de produções que descrevem como sequências de tokens que podem formar algoritmos sintaticamente 
corretos.

## 4. Construção da Gramática

ANTLR





