package br.com.fiap.View.Cadastro;

import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.model.Transacao;

import java.sql.SQLException;

public class CadastroTransacaoView {
    public static void main(String[] args){
        try {
            TransacaoDao dao = new TransacaoDao();
            Transacao transacao = new Transacao("Compra", 5.00,5.00);
            dao.cadastrar(transacao);
            dao.fecharConexao();
            System.out.println("Transação Cadastrada!");
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
