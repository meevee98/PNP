# PNP: Tutorial Introdutório 

#### TOC

- [Olá, Mundo](#olá-mundo)
- [Expressões Aritméticas](#expressões-aritméticas)
- [Tipos](#tipos)
- [Laços de Repetições](#laços-de-repetições)
- [Entradas e Saídas](#entradas-e-saídas)
- [Procedimentos](#procedimentos)
- [Argumentos](#argumentos)
- [Escopo de Variáveis](#escopo-de-variáveis)

O formato deste tutorial segue o modelo utilizado no Capítulo 1 do livro [The C Programming Language](https://www.amazon.com.br/Programming-Language-Brian-W-Kernighan/dp/0131103628), escrito por [Kernighan](https://www.cs.princeton.edu/~bwk/) e [Dennis Ritchie](https://en.wikipedia.org/wiki/Dennis_Ritchie). Isso significa que primeiramente serão apresentados os elementos essenciais da linguagem em exemplos que aplicam as funcionalidades suportadas, sem aprofundar em muitos detalhes, regras e exceções. A intenção não  é oferecer um tutorial que contemple todas as funcionalidades da linguagem, mas sim indicar de  uma introdução ágil de como qualquer pessoa possa começar a escrever algoritmos com PNP, por  isso o presente tutorial irá se focar no prático. Serão contemplados declaração de variáveis e seus escopos, expressões aritméticas e lógicas, procedimentos e operações de entrada e saída.

## Olá, mundo

A melhor forma de entrar em contato com uma nova linguagem de programação é *escrevendo* algoritmos. O exemplo clássico é imprimir "Olá, mundo." em todas as linguagens. Em PNP, o código-fonte *mais simples* para "imprimir" "Olá, mundo." no dispositivo de saída é:

```pnp
procedimento principal
inicio
  saudacao: string;
  saudacao <- "Olá, mundo.";
  escreva(saudacao);
fim
```

Por ser uma linguagem inspirada em pseudocódigo, recomenda-se sempre atribuir uma cadeia de  caracteres em uma variável antes de utilizá-la na função **escreva**. Para compilar o código-fonte, você deverá salvar o arquivo na extensão `.pnp`, como por exemplo `saudacao.pnp` e então compilá-lo  através do comando ```$  pnp saudacao.pnp```.

É esperado que o processo de compilação ocorra normalmente e que um arquivo com a extensão `.wasm` seja gerado com sucesso.  Caso algum problema ocorra ou haja algum erro de sintaxe no código-fonte, então é esperado que apareça o erro e os possíveis detalhes sobre ele para que você consiga identificá-lo e corrigi-lo.

Por mais simples que possa parecer, este exemplo já consegue fornecer algumas explicações sobre o funcionamento de um algoritmo escrito em PNP. Um algoritmo escrito em PNP, independente de seu tamanho ou complexidade, é composto basicamente por **procedimentos**, **instruções** e **variáveis**. Um procedimento contém *expressões* que definem as instruções que serão executadas, enquanto as variáveis são utilizadas para armazenar valores durante a computação. No exemplo mencionado anteriormente, o procedimento tem o nome **principal**. 

Normalmente, há a liberdade de escolher qualquer nome para os procedimentos, mas o **principal** é  especial, pois é o procedimento **principal** que demonstra por onde o programa deverá começar a ser executado. Isto significa que na maioria das linguagens de programação, o procedimento principal (ou normalmente, *main*) deve ser definido em algum momento.

Um forma eficiente de utilizar dados para comunicação entre procedimentos é passando uma lista de valores, denominados de **argumentos**, para o procedimento que está chamando. No exemplo anterior, o procedimento **principal** está definido para não esperar argumentos, que é indicado pela ausência de entradas. Será visto em exemplos posteriores como indicar quais são as entradas e as saídas de um procedimento.

As expressões de um procedimento são delimitados por `início` e `fim`, definindo assim um **bloco**. O  procedimento **principal** contém apenas *três instruções*, que são eles:

`saudacao: string;`

`saudacao <- "Olá, mundo.";`

`escreva(saudacao);`

Em PNP, todas as variáveis devem ser declaradas antes de serem utilizadas, sendo recomendável que o faça no começo do procedimento, antes de qualquer expressão ou instrução. Uma declaração anuncia as propriedades das variáveis. Por isso que a primeira instrução trata-se de uma declaração de uma variável, onde `saudacao` é o **identificador** da variável e string é o seu **tipo**. Uma cadeia de caracteres entre aspas duplas são denominadas *string*.

Deve-se sempre utilizar da sintaxe apresentada para declarar uma variável em PNP, ou seja, é necessário indicar primeiro o identificador e depois o tipo, no formato `identificador: tipo;`. Identificadores precisam ser únicos, ou seja, é possível atribuir um único nome para cada variável. Por outro lado, é possível realizar a declaração de uma lista de variáveis que sejam do mesmo tipo, como por exemplo `identificador1, identificador2: tipo;`

A segunda instrução realiza uma atribuição da cadeia "Olá, mundo." para a variável declarada anteriormente. A instrução de atribuição é representado por `<-`, onde a variável deve sempre ficar à esquerda e o valor a ser atribuído nela deve ficar à direita.

E a terceira instrução realiza uma chamada ao procedimento *escreva* passando a variável *saudacao* como argumento. Um procedimento é chamado pelo seu nome, seguido pelos parênteses e a lista de argumentos. Desta forma, o procedimento `escreva` é chamado e `saudacao` é o argumento. `escreva` é um procedimento nativo do PNP que imprime no dispositivo de saída, neste caso, a cadeia de caracteres atribuída à variável `saudacao`.

Nota-se a presença do símbolo `;` ao final de todas as instruções. Ele é obrigatório e indica a delimitação de cada uma delas.

## Expressões Aritméticas

O próximo exemplo utiliza a fórmula de conversão de temperatura entre graus Celsius e Fahrenheit, que pode ser representada como   

°C = (°F-32) * 5/9


O procedimento calcula a conversão e imprime no dispositivo de saída a temperatura em Fahrenheit e o seu equivalente em Celsius. O exemplo de saída é representado na tabela abaixo:

| Celsius | Fahrenheit |
| ------- | ---------- |
| -18     | 1          |
| -6      | 20         |
| -4      | 40         |
| 15      | 60         |
| 26      | 80         |
| 37      | 100        |
| 48      | 120        |
| 60      | 140        |

No exemplo que será utilizado a seguir, haverá apenas um procedimento, chamado **principal**. Posteriormente, será exibido como adaptar este simples exemplo utilizando procedimentos que podem ser chamados para calcular a conversão de temperatura. 

```pnp
procedimento principal
inicio
	fahrenheit, celsius: inteiro;
	saida: string;
    fahrenheit <- 0;
    celsius <- 5 * (fahrenheit - 32) / 9;
    saida   <- celsius + " " + fahrenheit;
    escreva(saida);
fim
```

No começo deste procedimento, foram declaradas as variáveis *fahrenheit* e *celsius*, ambas do tipo inteiro. Posteriormente, foi realizada a declaração da variável saída, do tipo string.

A primeira instrução é a representação da fórmula de conversão de temperatura em Fahrenheit para Celsius. Em PNP, existem as seguintes expressões aritméticas disponíveis:

| operador | descrição     | tipos              |
| -------- | ------------- | ------------------ |
| +        | soma          | inteiro e racional |
| -        | subtração     | inteiro e racional |
| *        | multiplicação | inteiro e racional |
| /        | divisão       | inteiro e racional |
| div      | divisão       | inteiro            |
| mod      | módulo        | inteiro            |

Note que existem dois tipos de operadores de divisão: `/` e `div`. Enquanto o operador / suporta variáveis do tipo inteiro ou racional, o operador `div` suporta somente variáveis do tipo inteiro. A diferença entre os dois operadores ainda se estende no resultado, visto que / fornece como o resultado com casas decimais, `div` fornece apenas a parte inteira. É importante lembrar que o resultado do operador `div` não é um arredondamento do resultado, mas sim a parte inteira. Isso significa que: `7 div 4 ` fornece 1 como resultado, por mais que valor pudesse ser arredondado para 2.

A segunda instrução atribui à variável saída o valor da variável `celsius`. Nesta atribuição, há uma conversão de tipo de inteiro para string. A instrução a seguir também apresenta o operador `+`, mas neste caso ela representa uma **concatenação** de caracteres ao invés de soma aritmética. Por exemplo, valor da variável `saida` após esta instrução será "-17  0", se o valor de `celsius` for -17 e o valor de `fahrenheit` for 0.

Seguindo o padrão de legibilidade das demais linguagens de programação, é recomendável que seja realizada a indentação dentro dos blocos, por mais que ela não altere o comportamento do seu algoritmo. Desta forma, é possível enxergar facilmente quais instruções estão dentro dos blocos e quais estão fora. Assim como Martin Fowler afirmou:

> Any fool can write code that a computer can understand. Good programmers write code that humans can understand.

Também é recomendável que escreva apenas uma instrução por linha e que seja utilizado espaços entre os operadores para tornar legível as expressões. Também é recomendável que escreva os delimitadores de blocos após uma quebra de linha.

## Tipos

Existem alguns problemas com o procedimento do exemplo anterior devido ao tipo de dado escolhido. A temperatura em Celsius não é tão precisa, pois por exemplo 0°F é na verdade algo em torno de -17.8°C e não -17°C. Para ter saídas mais precisas, é necessário realizar algumas modificações, como por exemplo trocar o tipo das variáveis de inteiro para racional.

```pnp
procedimento principal
inicio
	fahrenheit, celsius: racional;
	menor, maior, intervalo: racional;
	saida: string;
	menor <- 0;
    maior <- 140;
    intervalo <- 20;
    
    fahrenheit <- menor;
    enquanto fahrenheit <= maior faça
    inicio
    	celsius <- 5.0/9.0 * (fahrenheit - 32.0);
    	saida <- celsius + " " + fahrenheit;
    	escreva(saida);
        fahrenheit <-  fahrenheit + intervalo;
    fim
fim
```

A tabela abaixo indica os tipos suportados pelo PNP.

| tipo      | descrição                        |
| --------- | -------------------------------- |
| caractere | caractere -- um único byte       |
| string    | cadeia de caracteres             |
| inteiro   | número inteiro                   |
| racional  | número racional                  |
| booleano  | valor lógico verdadeiro ou falso |

## Laços de Repetições

Utilizando ainda o exemplo de conversão de temperatura entre °F e °C, podemos utilizar uma estrutura de repetição que realiza o cálculo de temperatura para uma série de valores, conforme mostra o exemplo abaixo.

```pnp
procedimento principal
inicio
	fahrenheit, celsius: racional;
	menor, maior, intervalo: racional;
	saida: string;
	menor <- 0;
    maior <- 140;
    intervalo <- 20;
    
    fahrenheit <- menor;
    enquanto fahrenheit <= maior faça
    inicio
    	celsius <- 5.0/9.0 * (fahrenheit - 32.0);
    	saida <- celsius + " " + fahrenheit;
    	escreva(saida);
        fahrenheit <-  fahrenheit + intervalo;
    fim
fim
```

No começo deste procedimento, foram declaradas as variáveis *fahrenheit* e *celsius*, ambas do tipo racional. Posteriormente, também foram declaradas as variáveis menor, maior e intervalo, também do tipo racional. Por fim, foi realizada a declaração da variável saída, do tipo string.


Após as declarações, são atribuídas às variáveis os seus valores iniciais. A variável *menor* recebe valor 0 no comando `menor <- 0;`. A variável *maior* recebe valor 140 no comando `maior <- 140;`.  É atribuído 20 à variável `intervalo`  e o valor de menor na variável *fahrenheit* nas instruções `intervalo <- 20;` e `fahrenheit <- menor`; respectivamente.

Como todas as linhas são calculadas através da mesma fórmula, então foi utilizado o laço de repetição que calcula um valor por linha, que é o propósito do comando `enquanto .... faça`.

A condição que segue o comando `enquanto` é testada. Se ela for verdadeira (o valor da variável `fahrenheit` é **menor ou igual** ao valor da variável `maior`) todos os comandos do bloco são executados. A condição é testada novamente e se a condição for verdadeira, o bloco é executado novamente. Quando o teste for falso (o valor da variável `fahrenheit` *supera* o valor da variável `maior`) o laço de repetição termina e a execução continua na próxima instrução. Se o procedimento não tiver mais instruções, ele termina.

Note que o bloco `enquanto` a condição é pré-testada e pode conter uma ou mais instruções que são delimitadas pelo `inicio`  e `fim`. No exemplo, são 5 instruções:

```
celsius <- 5.0/9.0 * (fahrenheit - 32.0);
saida <- celsius + " " + fahrenheit;
escreva(saida);
fahrenheit <-  fahrenheit + intervalo;
```

Existem mais dois laços de repetição em PNP e que podem ser utilizados para propósitos diferentes. O primeiro é o comando `repita ... até que <condicao>`. Neste caso, todos os comandos do laço são executados enquanto a condição for **falsa**. A partir do momento que a condição for verdadeira, o fluxo sairá do laço de repetição. Este tipo de laço de repetição tem a condição pós-testada, o que garante que as instruções do bloco serão testadas ao menos uma vez.

O segundo laço de repetição é o `para ... de ... até ... repita `. Que repete as instruções do bloco até que o valor da variável atinja o valor do *limite*, incrementando o valor dela com o passo 1.

```
procedimento principal
inicio
	fahrenheit, celsius: inteiro;
	menor, maior, intervalo: inteiro;
	saida: string;
	menor <- 0;
    maior <- 140;
    intervalo <- 20;
    
    fahrenheit <- menor;
    para fahrenheit de 0 até 140 repita
    inicio
    	celsius <- 5.0/9.0 * (fahrenheit - 32.0);
    	saida <- celsius + " " + fahrenheit;
    	escreva(saida);
    fim
fim
```


## Entradas e Saídas

## Procedimentos

## Argumentos

## Escopo de Variáveis
