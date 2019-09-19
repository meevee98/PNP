# Linguagem de Programação Educacional PNP

![Versão: 0.0.1](https://img.shields.io/badge/version-0.0.1-brightgreen.svg) 
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

*PNP is not Pseudocode*

Especificação: PNP

Versão: 0.1

Status: Alpha

Lançamento: Agosto 2019


## Introdução

A linguagem de programação PNP (PNP *não é* Pseudocódigo, ou simplesmente PNP *is not* Pseudocode) é inspirada em Pseudocódigo. Originalmente, Pseudocódigo é uma linguagem informal de alto nível para descrever princípios e esboços de algoritmos. Devido a sua legibilidade, Pseudocódigo é amplamente utilizado no meio acadêmico, científico e para elaboração para documentação técnica, onde a compreensão do algoritmo é mais importante que a linguagem que será utilizada para a implementação.	

Como seu nome já sugere, Pseudocódigo *(código falso)* não representa uma linguagem de programação real devido ao seu alto grau de abstração e informalidade. Linguagens de programação são linguagens formais [(RAMOS; NETO; VEGA, 2009)](https://www.amazon.com/Linguagens-Formais-Teoria-Modelagem-Implementacao/dp/8577804534), por isso, algumas adaptações foram realizadas a partir do Pseudocódigo para a especificação da linguagem PNP, de onde surge a sigla da linguagem.

Para manter a simplicidade e garantir legibilidade do código fonte entre estudantes e profissionais com diversos níveis de conhecimento em computação, PNP é uma linguagem procedural sem suporte a orientação a objetos. A proposta é conceber uma linguagem para fins acadêmicos e não para ser utilizada em produção ou algum projeto de grande porte.

Por ser uma linguagem com alto nível de abstração, detalhes de representação da máquina não estão disponíveis através da linguagem. Isto significa que o gerenciamento de armazenamento será abstraído para evitar problemas de segurança de alocação e desalocação.

O PNP é uma linguagem de programação fortemente e estaticamente tipada. Isto é, todas as variáveis são declaradas explicitamente com um tipo específico de dado que deverá permanecer o mesmo até o fim. Esta especificação distingue os erros de tempo de compilação que podem e devem ser detectados em tempo de compilação e aqueles que ocorrem em tempo de execução. No escopo deste projeto, o tempo de compilação consiste em traduzir programas em uma representação PNP para WebAssembly.


### Exemplos

Exemplo Olá Mundo em PNP:


```
algoritmo saudar
entrada 
  caractere: saudacao
saida
  nulo
inicio
    escreva(saudação, ", mundo!")
fim


vazio principal
                         /* Quando não há entrada nem saída, o comando pode ser
                            omitido */
inicio
  caractere: ciao
  ciao <- "Olá"
  saudar(ciao)
fim

```

Para calcular a sequência de Fibonacci:

```
algoritmo calcular_fib
entrada 
  inteiro: termo
saida 
  inteiro: j
condicao
  termo >= 0
inicio
  inteiro: i, k, t 
  i <- 0
  se termo = 0 entao
    j <- 0
  senao
    j <- 1
    para k de 1 ate termo faca
      t <- i + j
      i <- j
      j <- t
    fim
  fim
fim

algoritmo principal
saida 
  nulo
inicio
  inteiro: n
  calcular_fib(5, n)
  escreva("O quinto termo da sequência de Fibonacci é: ", n)  
fim
```

Vamos supor que o trecho acima seja salvo em um arquivo chamado fibonacci.pnp. Para compilar o arquivo basta utilizar o comando:

` $  pnp fibonacci.pnp ` 

Ao final da compilação, se não ocorrer nenhum erro, será gerado um arquivo no formato WebAssembly com a extensão .wasm.

## Gramáticas

Gramáticas são sistemas baseados em regras através dos quais é possível sintetizar o conjunto das cadeias que compõem determinada linguagem.

### Gramáticas livres de contexto

Assim como nas linguagens informais, as linguagens formais também são especificadas através de gramáticas. Chamadas de gramáticas livres de contexto, as gramáticas das linguagens formais são descritas utilizando notações matemáticas que evitam ambiguidade e exerce rigor em sua definição. Uma gramática livre de contexto especifica a sintaxe de uma linguagem e pode ser utilizada para auxiliar na tradução de programas fonte para programas objeto na compilação.

Uma gramática *G* livre de contexto possui quatro componentes:

- Um conjunto finito *N* de símbolos terminais, denominado vocabulário;
- Um conjunto de ∑ não-terminais, denominado alfabeto. Cada não-terminal representa um conjunto de cadeias de terminais;
- Um conjunto *P* de produções;
- A definição de um dos símbolos do alfabeto como símbolo inicial S da gramática.

Desta forma, é possível representar a gramática *G* como:

*G = (N, ∑, P, S)* 

### Gramática Léxica

A gramática léxica para o PNP é descrita ao longo da seção ESTRUTURA LÉXICA. Essa gramática tem como símbolos terminais o conjunto de caracteres Unicode. Elementos de entrada, com exceção do espaço em branco e comentários, formam os tokens -- símbolos terminais para a gramática sintática. Tokens são formados por identificadores, palavras reservadas, literais, separadores e operadores.

### Gramática Sintática

A gramática sintática obtém os símbolos terminais e os tokens definidos pela gramática léxica e define um conjunto de produções que descrevem como sequências de tokens que podem formar algoritmos sintaticamente corretos.

## Estrutura Léxica

### Quebras de Linha

Um compilador PNP divide a sequência de caracteres Unicode em linhas através das quebras de linhas:

*QuebraDeLinha:
ASCII LF
ASCII CR
ASCII CR seguido pelo caractere ASCII LF*

Uma quebra de linha também pode ser utilizada para definir a delimitação de uma expressão.



### Elementos de Entrada

Elementos de entrada que não são espaços em branco e comentários são Tokens. Tokens são símbolos terminais para a gramática sintática.

*ElementoDeEntrada:
		Espaco
		Comentario
		Token*


### Tokens

*Token:
		Identificador
		PalavraReservada
		Literal
		Separador
		Operador*

###	Espaços
Espaços são definidos pelo caractere ASCII de espaço,  tab e caracteres de quebra de linha.
*Espaco:
		ASCII SP
		ASCII HT
		QuebraDeLinha*
		
### Comentários
Comentários podem ser utilizados como ferramentas de auxílio para a legibilidade do código e para realizar anotações importantes sobre determinado trecho.  PNP segue o estilo de comentários das linguagens baseadas em C,ou seja começando com `/*` e terminando em `*/`. Um exemplo pode ser visto abaixo.
```
/* Meu comentário
   pode ser dividido em diversas linhas
*/
```
*
Comentario:
	`/*` Cauda

Cauda:
	`*` CaudaEstrela
	NaoAsterisco Cauda

CaudaAsterisco:
	/
	`*` CaudaAsterisco
	NaoAsteriscoNaoBarra Cauda
	QuebraDeLinha
	
NaoAsterisco:
	CaractereDeEntrada com exceçao de `*`
	QuebraDeLinha
	
NaoCaudaNaoEstrela:
	CaractereDeEntrada com exceção de `*` ou /
	QuebraDeLinha
*

###	Identificadores

	

###	Palavras Reservadas
	
As sequências de caracteres a seguir são reservadas como palavras reservadas e não podem ser utilizadas como identificadores:


* PalavraReservada:
	algoritmo	entao		pare
	ate		    entrada	    que	
	booleano	escreva	    repita	
	caractere	faca		saida	
	caso		fim		    se	
	condicao	inicio		senao	
	de		    inteiro	
	decimal	    para		
*		
true e false não são palavras reservadas, mas literais booleanos; nulo não é uma palavra reservada, mas um literal nulo.

### Literais
	
* Literal:
	Inteiro
	Decimal
	Booleano
	Charactere
	Nulo
*

### Inteiro

* Inteiro:
	0
	NaoZero [Digitos]

NaoZero:
	1 2 3 4 5 6 7 8 9

Digitos:
	Digito

Digito:
	0
	NaoZero		
*
###	Decimal

Decimal:
	Digitos . [Digitos][Exponentpart][FloatTypeSuffix]
	. Digitos [Exponentpart][FloatTypeSuffix]
	Digitos ExponentPart [FloatTypeSuffix]
	Digitos [ExponentPart] FloatTypeSuffix


### Booleanos

Booleano:
	true
	false	

###	Nulo

Nulo:
	nulo

### Separadores

Separador:
	(   )  {  }  [  ]  ;  ,  .  ...  @  ::  QuebraDeLinha

## Operadores Aritméticos, Relacionais e Lógicos

	Operador:
		<-	>=	!=	OR
		=	<=	!	MOD
		+	-	*	
		>	<	AND

### Tipos, Valores e Variáveis

	Tipo:
		Numerico
		booleano
	Numerico:
		Inteiro
		Decimal


## Autores

Este projeto foi desenvolvido durante a disciplina de Compiladores na Universidade Católica
de São Paulo pelos alunos

- Emerson Lopes <emersonalveslopes@gmail.com >
- Jefferson Lisboa <lisboa.jeff@gmail.com>
- João Fouyer <jfouyer@gmail.com>
- João Oliveira <inorijoao@hotmail.com>
- Mirella Medeiros <mirellamedeiros.09@hotmail.com>
- Victor Rodrigues <victor.meca2015@gmail.com >
