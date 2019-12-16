/**
 * Define list of tokens
 */

lexer grammar Tokens;

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
QUE: 'que';
CASO: 'caso';
SEJA: 'seja';
TIPO: 'tipo';
PRINCIPAL: 'principal';
ESCREVA: 'escreva';
LEIA: 'leia';

// tipos primitivos
INTEIRO: 'inteiro';
RACIONAL: 'racional';
BOOLEANO: 'booleano';
CARACTERE: 'caractere';
STRING: 'string';
NULO: 'nao ha';

// operadores
IGUALDADE: '=';
DESIGUALDADE: '!=';
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
CONCATENACAO: '++';
AND: 'e';
OR: 'ou';
XOR: 'oux';
NOT: 'nao';

// variaveis literais
NATURAL_LITERAL: ZERO* NAO_ZERO DIGITO*; // para impedir que a dimensão do vetor seja <= 0

INTEIRO_LITERAL: ZERO+                 // zero separado para garantir que não aceita -0
               | SINAL? ZERO* NAO_ZERO DIGITO*;

RACIONAL_LITERAL: ZERO+'.'ZERO+                    // zero separado para garantir que não aceita -0.0
                | SINAL? ZERO* NAO_ZERO DIGITO*'.' DIGITO+   // aceita -000000R.0000000
                | SINAL? ZERO+'.'NAO_ZERO* DIGITO NAO_ZERO*;  // aceita -0000000.000000R
BOOLEANO_LITERAL: 'true'
                | 'false';
CARACTERE_LITERAL: '\'' CARACTER '\'';
STRING_LITERAL: '"' CARACTER*? '"';

ATRIBUICAO: '<-';
FIM_COMANDO: ';';
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';
ABRE_CHAVES: '[';
FECHA_CHAVES: ']';
SEPARADOR_VARIAVEL: ',';
SEPARADOR_VARIAVEL_TIPO: ':';
SEPARADOR_TIPO_VARIAVEL: '.';

fragment SINAL: '-' | '+';
fragment ZERO: '0';
fragment NAO_ZERO: [1-9];
fragment DIGITO: ZERO | NAO_ZERO;
fragment ALFA: [_a-zA-Z];
fragment CARACTER: ~['\\\n\r]   // qualquer caractere, menos \n, \r, ' e \
       | ESCAPE;
fragment ESCAPE: '\\''b'     // backspace
               | '\\''t'     // tabulation
               | '\\''n'     // new line
               | '\\''f'     // form feed
               | '\\''r'     // carriage return
               | '\\''"'     // escaped "
               | '\\''\''    // escaped '
               | '\\''\\';   // escaped \


ID : ALFA (ALFA | DIGITO)* ;	// identificador de variavel - começa com letra
WS : [ \t\r\n]+ -> skip ;		// skip spaces, tabs, newlines
