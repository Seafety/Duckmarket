package br.com.fiap.View.Atualizacao;

import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Transacao;


import java.sql.SQLException;

public class AtualizacaoTransacaoView {
    public static void main(String[]args){
        try{
            TransacaoDao dao = new TransacaoDao();
            Transacao transacao = dao.pesquisar(3);
            transacao.setTipotransacao("Venda");
            transacao.setQtdTransacao(20.0);
            transacao.setPrecoUnitario(10.0);
            dao.atualizar(transacao);
            System.out.println("Transação Atualizada");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Produto não encontrado");
        }
    }
}
