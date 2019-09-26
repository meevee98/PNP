/**
 * Define a grammar called PNP
 */
grammar pnp;

import tokens;

// usado para testes rápidos
arquivo: procedimento+ EOF;

// procedimento
procedimento: procedimento_declaracao procedimento_entrada? procedimento_saida? procedimento_bloco
    ;
procedimento_declaracao: PROCEDIMENTO ID
    ;
procedimento_entrada: ENTRADA procedimento_variavel_declaracao
    ;
procedimento_saida: SAIDA procedimento_variavel_declaracao
    ;
procedimento_bloco: INICIO bloco FIM
    ;
procedimento_variavel_declaracao : NULO | (variavel_declaracao FIM_COMANDO)+
    ;

// bloco - declarações de variáveis sempre no começo do bloco
bloco : bloco_variavel_declaracao* (comando | statement)*
    ;
bloco_variavel_declaracao : variavel_declaracao FIM_COMANDO
    ;

comando : ((funcao | variavel_atribuicao) FIM_COMANDO)
    ;
statement: se_statement | para_statement | enquanto_statement
    ;
statement_condicao: ABRE_PARENTESES expressao_booleana FECHA_PARENTESES
    ;

// operacao
operacao_relacional: operacao_prioridade (operador_relacional operacao_prioridade)+
    ;
operacao_logica: operacao_prioridade (operador_logico_bin operacao_prioridade)+
    ;
operacao_aritmetica: operacao_prioridade (operador_aritmetico operacao_prioridade)+
    ;
operacao : operacao_prioridade (operador_binario operacao_prioridade)*
    ;
operacao_prioridade: expressao | ABRE_PARENTESES operacao FECHA_PARENTESES
    ;

variavel_declaracao : ID (',' ID)* ':' tipo
    ;
variavel_atribuicao : ID ATRIBUICAO operacao
    ;

// expressao - separar depois em expressao de cada tipo
expressao : ID | valor_literal | funcao
    ;
expressao_booleana: ID |
                    BOOLEANO_LITERAL |
                    funcao |
                    operacao_relacional |
                    operacao_logica;

funcao : ID ABRE_PARENTESES params? FECHA_PARENTESES
    ;
params : expressao (',' expressao)*
    ;

// condicional se
se_statement: se_inicio se_entao se_senao_se;

se_inicio: SE statement_condicao;
se_entao: ENTAO bloco;
se_senao: SENAO bloco FIM;
se_senao_se: senao_se | se_senao | FIM;
senao_se: SENAO se_statement;

// loop para
para_statement: para_inicio para_intervalo para_passo? para_bloco;

para_inicio: PARA ID;
para_intervalo: DE (ID | numero_literal) ATE (ID | numero_literal);
para_passo: PASSO (ID | numero_literal);
para_bloco: REPITA bloco FIM;

// loop enquanto
enquanto_statement: enquanto_inicio enquanto_bloco;
enquanto_inicio: ENQUANTO statement_condicao;
enquanto_bloco: FACA bloco FIM;

// tipos primitivos
tipo : INTEIRO | RACIONAL | BOOLEANO | CARACTERE | STRING;

// operadores
operador_binario:   operador_relacional |
                    operador_aritmetico |
                    operador_logico_bin;

operador_unario:    NOT;

operador_relacional:    IGUALDADE |
                        DESIGUALDADE |
                        MAIOR |
                        MAIOR_IGUAL |
                        MENOR |
                        MENOR_IGUAL;
operador_aritmetico:    ADICAO |
                        SUBTRACAO |
                        MULTIPLICACAO |
                        DIVISAO_INT |
                        DIVISAO_RAC |
                        MODULO;
operador_logico_bin:    AND |
                        OR |
                        XOR;

// variaveis literais
valor_literal : INTEIRO_LITERAL | RACIONAL_LITERAL | BOOLEANO_LITERAL | CARACTERE_LITERAL | STRING_LITERAL;

numero_literal: INTEIRO_LITERAL | RACIONAL_LITERAL;

WS : [ \t\r\n]+ -> skip ; // precisa ter em todos os arquivos senão o antlr não entende que o espaço é pra ser ignorado ¬_¬
