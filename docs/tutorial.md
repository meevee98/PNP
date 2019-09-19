# PNP: Tutorial Introdutório 

O formato deste tutorial segue o modelo utilizado no Capítulo 1 do livro 
[The C Programming Language](https://www.amazon.com.br/Programming-Language-Brian-W-Kernighan/dp/0131103628),
escrito por [Kernighan](https://www.cs.princeton.edu/~bwk/) e [Dennis Ritchie](https://en.wikipedia.org/wiki/Dennis_Ritchie)
Isso significa que primeiramente serão apresentados os elementos essenciais da linguagem em exemplos que aplicam as
funcionalidades suportadas, sem aprofundar em muitos detalhes, regras e exceções. A intenção não 
é oferecer um tutorial que contemple todas as funcionalidades da linguagem, mas sim indicar de 
uma introdução ágil de como qualquer pessoa possa começar a escrever algoritmos com PNP, por 
isso o presente tutorial irá se focar no básico. Serão contemplados declaração de variáveis 
e seus escopos, expressões aritméticas e lógicas, procedimentos e operações de entrada e saída.

## 1. Olá, mundo

A melhor forma de entrar em contato com uma nova linguagem de programação é *escrevendo* algoritmos.
O exemplo clássico é imprimir "Olá, mundo." em todas as linguagens. Em PNP, o código-fonte *mais 
simplificado* para imprimir "Olá, mundo." é:

```
procedimento principal
inicio
  saudacao: string;
  saudacao <- "Olá, mundo.";
  escreva(saudacao);
fim
```

Por ser uma linguagem inspirada em pseudocódigo, recomenda-se sempre atribuir uma cadeia de 
caracteres em uma variável antes de utilizá-la na função **escreva**. Para compilar o código-fonte,
você deverá salvar o arquivo na extensão `.pnp`, como por exemplo `saudacao.pnp` e então compilá-lo 
através do comando ```$  pnp saudacao.pnp```.

É esperado que o processo de compilação ocorra normalmente e que um arquivo com a extensão `.wasm`
seja gerado com sucesso.  Caso algum problema ocorra ou haja algum erro de sintaxe no código-fonte, 
então é esperado que apareceça o erro e algum detalhe sobre ele.

Para algumas explicações sobre o funcionamento do programa. Um programa PNP, independente de seu 
tamanho, é composto por **procedimentos** e **variáveis**. Um procedimento contém *expressões* que definem
as computações que serão realizadas, enquanto as variáveis são utilizadas para armazenar valores
durante a computação. No exemplo mencionado anteriormente, o procedimento tem o nome **principal**. 
Normalmente, há a liberdade de escolher qualquer nome para os procedimentos, mas o **principal** é 
especial, pois é o procedimento **principal** que demonstra por onde o programa deverá começar a ser
executado. Isto significa que na maioria das linguagens de programação, o procedimento principal 
(ou normalmente, *main*) deve ser definido em algum momento.

Um forma eficiente de utilizar dados para comunicação entre procedimentos é passando uma lista de
valores, denominados de **argumentos**, para o procedimento que está chamando. No exemplo anterior, o
procedimento **principal** está definido para não esperar argumentos, que é indicado pela ausência de 
entradas.

As expressões de um procedimento são delimitados por `início` e `fim`, definindo assim um **bloco**. O 
procedimento **principal** contém apenas *três* expressões, que são eles,

1. `saudacao: string;`
2. `saudacao <- "Olá, mundo.";`
3. `escreva(saudacao);`

Um procedimento é chamado pelo seu nome, seguido pelos parênteses e a lista de argumentos. Desta forma,
o procedimento `escreva` é chamado e `saudacao` é o argumento. `escreva` é um procedimento nativo que
imprime no dispositivo de saída, neste caso, a cadeia de caracteres atribuída à variável `saudacao`.

Uma cadeia de caracteres entre aspas duplas são denominadas de *string*.
