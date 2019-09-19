# PNP

Especificação: PNP

Versão: 0.1

Status: Alpha

Lançamento: Agosto 2019

A linguagem de programação PNP (PNP não é Pseudocódigo, ou simplesmente PNP is not Pseudocode) é inspirada em
Pseudocódigo. Originalmente, Pseudocódigo é uma linguagem informal de alto nível para descrever princípios e
esboços de algoritmos. Devido a sua legibilidade, Pseudocódigo é amplamente utilizado no meio acadêmico, 
científico e para elaboração para documentação técnica, onde a compreensão do algoritmo é mais importante
que a linguagem que será utilizada para a implementação.

Como seu nome já sugere, Pseudocódigo (código falso) não representa uma linguagem de programação real devido
ao seu alto grau de abstração e informalidade. Linguagens de programação são linguagens formais (RAMOS; NETO;
VEGA, 2009), por isso, algumas adaptações foram realizadas a partir do Pseudocódigo nesta proposta de
especificação da linguagem PNP, de onde surge a sigla da linguagem.

Para manter a simplicidade e garantir legibilidade do código fonte entre estudantes e profissionais com 
diversos níveis de conhecimento em computação, PNP é uma linguagem procedural sem suporte a orientação a 
objetos. A proposta é conceber uma linguagem para fins acadêmicos e não para ser utilizada em produção ou
algum projeto de grande porte.

Por ser uma linguagem com alto nível de abstração, detalhes de representação da máquina não estão disponíveis
através da linguagem. Isto significa que gerenciamento de armazenamento, ponteiro e referências à memória
serão abstraídos para evitar problemas de segurança de alocação e desalocação. A linguagem suporta variáveis
de escopo local e global.

O PNP é uma linguagem de programação fortemente e estaticamente tipada. Isto é, todas as variáveis são
declaradas explicitamente com um tipo específico de dado que deverá permanecer o mesmo até o fim. Esta
especificação distingue os erros de tempo de compilação, que podem e devem ser detectados em tempo de
compilação e aqueles que ocorrem em tempo de execução. No escopo deste projeto, o tempo de compilação
consiste em traduzir programas em uma representação PNP para WebAssembly.

## Exemplos

A maioria dos exemplos presentes no texto são compiláveis, executáveis e são semelhantes em forma a:

```
procedimento saudar
entrada 
  saudacao: string;
inicio 
   frase: string;
   frase <- saudacao + ", mundo!";
   escreva(frase);
fim

procedimento principal
inicio
  ciao: string;
  ciao <- "Olá";
  saudar(ciao);
fim
```

```
procedimento calcular_fib
entrada 
 termo: inteiro;
saida 
 j: inteiro;

inicio
  i, k, t: inteiro; 
  i <- 0;
  se (termo = 0) entao
    j <- 0;
  senao
    j <- 1;
    para k de 1 ate termo repita
      t <- i + j;
      i <- j;
      j <- t;
    fim
  fim
fim

procedimento principal
inicio
  n: inteiro;
  frase: string;
  calcular_fib(5, n);
  frase <- "O quinto termo da sequência de Fibonacci é: " + n;
  escreva(frase);  
fim
```

Vamos supor que o trecho acima seja salvo em um arquivo chamado `fibonacci.pnp`. 
Para compilar o arquivo basta utilizar o comando: ```$  pnp fibonacci.pnp```

Ao final da compilação, se não ocorrer nenhum erro, será gerado um arquivo no formato 
WebAssembly com a extensão `.wasm`.

Outros exemplos de código-fonte escrito em PNP podem ser lidos em [Tutorial]().
