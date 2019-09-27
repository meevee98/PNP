// Generated from D:/Workspace/PNP/src/lexer/src/grammar\pnp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pnpParser}.
 */
public interface pnpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pnpParser#arquivo}.
	 * @param ctx the parse tree
	 */
	void enterArquivo(pnpParser.ArquivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#arquivo}.
	 * @param ctx the parse tree
	 */
	void exitArquivo(pnpParser.ArquivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento(pnpParser.ProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento(pnpParser.ProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento_declaracao(pnpParser.Procedimento_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento_declaracao(pnpParser.Procedimento_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento_entrada}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento_entrada(pnpParser.Procedimento_entradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento_entrada}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento_entrada(pnpParser.Procedimento_entradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento_saida}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento_saida(pnpParser.Procedimento_saidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento_saida}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento_saida(pnpParser.Procedimento_saidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento_bloco}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento_bloco(pnpParser.Procedimento_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento_bloco}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento_bloco(pnpParser.Procedimento_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#procedimento_variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterProcedimento_variavel_declaracao(pnpParser.Procedimento_variavel_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#procedimento_variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitProcedimento_variavel_declaracao(pnpParser.Procedimento_variavel_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(pnpParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(pnpParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#bloco_variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterBloco_variavel_declaracao(pnpParser.Bloco_variavel_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#bloco_variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitBloco_variavel_declaracao(pnpParser.Bloco_variavel_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(pnpParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(pnpParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pnpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pnpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_relacional(pnpParser.Operacao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operacao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_relacional(pnpParser.Operacao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_logica(pnpParser.Operacao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operacao_logica}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_logica(pnpParser.Operacao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(pnpParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(pnpParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_declaracao(pnpParser.Variavel_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#variavel_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_declaracao(pnpParser.Variavel_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_atribuicao(pnpParser.Variavel_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_atribuicao(pnpParser.Variavel_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(pnpParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(pnpParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_booleana(pnpParser.Expressao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_booleana(pnpParser.Expressao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(pnpParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(pnpParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(pnpParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(pnpParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#se_statement}.
	 * @param ctx the parse tree
	 */
	void enterSe_statement(pnpParser.Se_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#se_statement}.
	 * @param ctx the parse tree
	 */
	void exitSe_statement(pnpParser.Se_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#se_inicio}.
	 * @param ctx the parse tree
	 */
	void enterSe_inicio(pnpParser.Se_inicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#se_inicio}.
	 * @param ctx the parse tree
	 */
	void exitSe_inicio(pnpParser.Se_inicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#se_entao}.
	 * @param ctx the parse tree
	 */
	void enterSe_entao(pnpParser.Se_entaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#se_entao}.
	 * @param ctx the parse tree
	 */
	void exitSe_entao(pnpParser.Se_entaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#se_senao}.
	 * @param ctx the parse tree
	 */
	void enterSe_senao(pnpParser.Se_senaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#se_senao}.
	 * @param ctx the parse tree
	 */
	void exitSe_senao(pnpParser.Se_senaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#se_senao_se}.
	 * @param ctx the parse tree
	 */
	void enterSe_senao_se(pnpParser.Se_senao_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#se_senao_se}.
	 * @param ctx the parse tree
	 */
	void exitSe_senao_se(pnpParser.Se_senao_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#senao_se}.
	 * @param ctx the parse tree
	 */
	void enterSenao_se(pnpParser.Senao_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#senao_se}.
	 * @param ctx the parse tree
	 */
	void exitSenao_se(pnpParser.Senao_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#para_statement}.
	 * @param ctx the parse tree
	 */
	void enterPara_statement(pnpParser.Para_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#para_statement}.
	 * @param ctx the parse tree
	 */
	void exitPara_statement(pnpParser.Para_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#para_inicio}.
	 * @param ctx the parse tree
	 */
	void enterPara_inicio(pnpParser.Para_inicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#para_inicio}.
	 * @param ctx the parse tree
	 */
	void exitPara_inicio(pnpParser.Para_inicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#para_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterPara_intervalo(pnpParser.Para_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#para_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitPara_intervalo(pnpParser.Para_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#para_passo}.
	 * @param ctx the parse tree
	 */
	void enterPara_passo(pnpParser.Para_passoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#para_passo}.
	 * @param ctx the parse tree
	 */
	void exitPara_passo(pnpParser.Para_passoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#para_bloco}.
	 * @param ctx the parse tree
	 */
	void enterPara_bloco(pnpParser.Para_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#para_bloco}.
	 * @param ctx the parse tree
	 */
	void exitPara_bloco(pnpParser.Para_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#enquanto_statement}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto_statement(pnpParser.Enquanto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#enquanto_statement}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto_statement(pnpParser.Enquanto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#enquanto_inicio}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto_inicio(pnpParser.Enquanto_inicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#enquanto_inicio}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto_inicio(pnpParser.Enquanto_inicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#enquanto_bloco}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto_bloco(pnpParser.Enquanto_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#enquanto_bloco}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto_bloco(pnpParser.Enquanto_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(pnpParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(pnpParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(pnpParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(pnpParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(pnpParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(pnpParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(pnpParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(pnpParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(pnpParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(pnpParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#valor_literal}.
	 * @param ctx the parse tree
	 */
	void enterValor_literal(pnpParser.Valor_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#valor_literal}.
	 * @param ctx the parse tree
	 */
	void exitValor_literal(pnpParser.Valor_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pnpParser#numero_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumero_literal(pnpParser.Numero_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pnpParser#numero_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumero_literal(pnpParser.Numero_literalContext ctx);
}