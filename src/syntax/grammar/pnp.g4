/**
 * Define a grammar called PNP
 */
grammar pnp;

import tokens;

// usado para testes rápidos
arquivo: procedimento* EOF;

// procedimento
procedimento: procedimento_declaracao procedimento_entrada? procedimento_saida? procedimento_bloco
    ;
procedimento_declaracao: PROCEDIMENTO ID
    ;
procedimento_entrada: ENTRADA (NULO | (variavel_declaracao FIM_COMANDO)+)
    ;
procedimento_saida: SAIDA (NULO | variavel_declaracao FIM_COMANDO)
    ;
procedimento_bloco: INICIO bloco FIM
    ;

// bloco - declarações de variáveis sempre no começo do bloco
bloco: bloco_variavel_declaracao* (comando | statement)*
    ;
bloco_variavel_declaracao: variavel_declaracao FIM_COMANDO
    ;

comando: (funcao | variavel_atribuicao) FIM_COMANDO
    ;
statement: se_statement
         | para_statement
         | enquanto_statement
         | ate_que_statement
         | caso_statement
    ;
statement_condicao: ABRE_PARENTESES expressao_booleana FECHA_PARENTESES
    ;

// operacao
operacao_relacional: ABRE_PARENTESES operacao_relacional FECHA_PARENTESES
                   | expressao_numerica operador_relacional expressao_numerica
                   | expressao
    ;
operacao_logica: ABRE_PARENTESES operacao_logica FECHA_PARENTESES
               | operador_logico_unario operacao_logica
               | operacao_logica operador_logico_binario operacao_logica
               | expressao_booleana
    ;
operacao_aritmetica: ABRE_PARENTESES operacao_aritmetica FECHA_PARENTESES
                   | operacao_aritmetica operador_multiplicativo operacao_aritmetica
                   | operacao_aritmetica operador_aditivo operacao_aritmetica
                   | expressao_numerica;

operacao: operacao_aritmetica
        | operacao_logica
        | operacao_relacional
    ;

variavel_declaracao: ID (',' ID)* ':' tipo
    ;
variavel_atribuicao: ID vetor_dimensao? ATRIBUICAO operacao
    ;

// expressao - separar depois em expressao de cada tipo
expressao: expressao_booleana
         | expressao_numerica
    ;
expressao_booleana: ID
                  | BOOLEANO_LITERAL;
expressao_numerica: ID
                  | NATURAL_LITERAL
                  | INTEIRO_LITERAL
                  | RACIONAL_LITERAL;

funcao: ID ABRE_PARENTESES params? FECHA_PARENTESES
    ;
params: expressao (',' expressao)*
    ;

// condicional se
se_statement: se_inicio se_entao se_senao_se;
se_inicio: SE statement_condicao;
se_entao: ENTAO bloco;
se_senao: SENAO bloco FIM;
se_senao_se: senao_se
           | se_senao
           | FIM;
senao_se: SENAO se_statement;

// condicional caso
caso_statement: caso_inicio caso_casos+ caso_senao? FIM;
caso_inicio: CASO ID SEJA;
caso_casos: expressao (SEPARADOR_VARIAVEL expressao)* SEPARADOR_VARIAVEL_TIPO bloco;
caso_senao: SENAO bloco;

// laço para
para_statement: para_inicio para_intervalo para_passo? para_bloco;
para_inicio: PARA ID;
para_intervalo: DE expressao_numerica ATE expressao_numerica;
para_passo: PASSO expressao_numerica;
para_bloco: REPITA bloco FIM;

// laço enquanto
enquanto_statement: enquanto_inicio enquanto_bloco;
enquanto_inicio: ENQUANTO statement_condicao;
enquanto_bloco: FACA bloco FIM;

// laço ate que
ate_que_statement: ate_que_inicio ate_que_bloco;
ate_que_inicio: REPITA bloco;
ate_que_bloco: ATE QUE statement_condicao FIM_COMANDO;

// tipos primitivos
tipo: INTEIRO
    | RACIONAL
    | BOOLEANO
    | CARACTERE
    | STRING
    | tipo vetor_dimensao;

vetor_dimensao: '[' (NATURAL_LITERAL | ID) ']';

// operadores
operador_binario: operador_relacional
                | operador_aritmetico
                | operador_logico_binario;


operador_relacional: IGUALDADE
                   | DESIGUALDADE
                   | MAIOR
                   | MAIOR_IGUAL
                   | MENOR
                   | MENOR_IGUAL;
operador_aritmetico: operador_aditivo
                   | operador_multiplicativo;
operador_aditivo: ADICAO
                | SUBTRACAO;
operador_multiplicativo: MULTIPLICACAO
                       | DIVISAO_RAC
                       | DIVISAO_INT
                       | MODULO;

operador_logico_unario:  NOT;
operador_logico_binario: AND
                       | OR
                       | XOR;
