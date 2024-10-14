package br.com.fiap.View.Pesquisa;

import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Transacao;

import java.sql.SQLException;

public class PesquisaTransacaoView {
    public static void main(String[] args){
        try{
            TransacaoDao dao = new TransacaoDao();
            Transacao transacao = dao.pesquisar(2);
            System.out.println("ID da Conta: " + transacao.getIdConta());
            System.out.println("Tipo de Transação: "+transacao.getTipotransacao()+" | Data: "+ transacao.getDtTransacao());
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Codigo não existe na tabela.");
        }
    }
}
