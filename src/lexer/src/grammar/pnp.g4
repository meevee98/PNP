/**
 * Define a grammar called PNP

 */
grammar pnp;

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
procedimento_variavel_declaracao : (variavel_declaracao ';')+
    ;

// bloco - declarações de variáveis sempre no começo do bloco
bloco : bloco_variavel_declaracao* (comando | statement)*
	;
bloco_variavel_declaracao : variavel_declaracao ';'
    ;

comando : ((funcao | variavel_atribuicao) ';')
	;
statement: se_statement | para_statement | enquanto_statement
    ;

// operacao
operacao_relacional: operacao operador_relacional operacao
    ;
operacao_logica: operacao operador_logico operacao
    ;
operacao : expressao (operador expressao)*
    ;

variavel_declaracao : ID (',' ID)* ':' tipo
	;
variavel_atribuicao : ID ATRIBUICAO operacao
	;

// expressao - separar depois em expressao de cada tipo
expressao : ID | valor_literal | funcao
	;
expressao_booleana: ID | BOOLEANO_LITERAL | funcao | operacao_relacional | operacao_logica
    ;

funcao : ID '(' params? ')'
	;
params : expressao (',' expressao)*
	;

// condicional se
se_statement: se_inicio se_entao se_senao_se;

se_inicio: SE '(' expressao_booleana ')';
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
enquanto_inicio: ENQUANTO '(' expressao_booleana ')';
enquanto_bloco: FACA bloco FIM;

// palavras reservadas
PROCEDIMENTO: 'procedimento';
ENTRADA: 'entrada';
SAIDA: 'saida';
INICIO: 'inicio';
FIM: 'fim';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
PARA: 'para';
DE: 'de';
ATE: 'ate';
PASSO: 'passo';
REPITA: 'repita';
ENQUANTO: 'enquanto';
FACA: 'faca';

// tipos primitivos
tipo : INTEIRO | RACIONAL | BOOLEANO | CARACTERE | STRING;

INTEIRO: 'inteiro';
RACIONAL: 'racional';
BOOLEANO: 'booleano';
CARACTERE: 'caractere';
STRING: 'string';
NULO: 'nulo';

// operadores
operador:   operador_relacional |
            operador_aritmetico |
            operador_logico;

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
operador_logico:    AND |
                    OR |
                    XOR |
                    NOT;

IGUALDADE: '=';
DESIGUALDADE: '<>';
MAIOR: '>';
MAIOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
ADICAO: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVISAO_RAC: '/';
DIVISAO_INT: 'div';
MODULO: 'mod';
AND: 'e';
OR: 'ou';
XOR: 'xor';
NOT: 'nao';

ATRIBUICAO: '<-';

// variaveis literais
valor_literal : INTEIRO_LITERAL | RACIONAL_LITERAL | BOOLEANO_LITERAL | CARACTERE_LITERAL | STRING_LITERAL;

numero_literal: INTEIRO_LITERAL | RACIONAL_LITERAL;
INTEIRO_LITERAL: [0-9];
RACIONAL_LITERAL: INTEIRO_LITERAL'.'[0-9]+;
BOOLEANO_LITERAL: 'true' | 'false';
CARACTERE_LITERAL: '\''.'\'';
STRING_LITERAL : '"'.*?'"';

ID : [a-zA-Z][_a-zA-Z0-9]* ;	// match lower-case identifiers
WS : [ \t\r\n]+ -> skip ;		// skip spaces, tabs, newlines