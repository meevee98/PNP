# Mapeamento de PNP para WebAssembly

Neste projeto, será realizada uma tradução do código-fonte escrito em PNL para WebAssembly.
Segundo a própria [documentação](http://webassembly.github.io/spec/core/syntax/conventions.html), 
WebAssembly é uma linguagem de programação que possui diferentes 
representações concretas (o formato binário e o formato textual). Ambos são mapeados em uma estrutura 
comum que é descrita na forma de uma sintaxe abstrata.

Para tornar legível este mapeamento, foi a tabela abaixo relaciona cada comando em PNL com a sua
descrição semântica e a representação relativa em WebAssembly, no formato textual.


| Desc. Semântica                 	| Repr. em PNL         	                | Repr. em WebAssembly .wat 	|
|---------------------------------	|-------------------------------------- |-------------------------------|
| declaração tipo inteiro         	| `exemplo1: inteiro;`                  | `($exemplo1 i32)`           	|
| declaração ponto flutuante      	| `exemplo2: racional;`                 | `($exemplo2 f32)`          	|
| declaração booleano             	| `exemplo3: booleano;`                 | `booleana(exemplo3)`        	|
| declaração caractere            	| `exemplo4: caractere;`                |                           	|
| declaração cadeia de catacteres 	| `exemplo5: string;`                   |                           	| 
| atribuição                        | `exemplo1 <- 1;` <br/> `exemplo2 <- 3.141592;` <br/> `exemplo3 <- false;` <br/> `exemplo4 <- 'j';` <br/> `exemplo5 <- "Comp";` | `(set_local $exemplo1 (i32.const 1))`
| soma c/ atribuição                | `exemplo1 <- 5 + 8;`                  |
| subtração c/ atr.                 | `exemplo2 <- exemplo2 - 2.02;`        |
| multiplicação c/ atr.             | `exemplo2 <- exemplo1 * exemplo2;`    |
| divisão inteira c/ atr.           | `exemplo1 <- 42 div 3;`               |
| divisão racional c/ atr.          | `exemplo2 <- 8 / 7;`                  |
| módulo                            | `exemplo1 <- 42 mod 4;`               |
| concatenação                      | `exemplo5 <-exemplo5 + "iladores";`   |
| maior que                         |
| menor que                         |
| maior ou igual que                |
| menor ou igual que                |
| igualdade                         |
| diferente                         |
| e lógico (AND)                    |
| ou lógico (OR)                    |
| ou exclusivo (XOR)                |
| negação lógica                    |
| quebra de linha                   |
| quebra de linha                   |
| bloco de coment.                  |
| inicio assinatura                 |
| parâmetro entrada                 |
| parâmetro saída                   |
| bloco procedimento                |


