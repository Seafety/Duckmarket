package br.com.fiap.View.Remocao;

import br.com.fiap.dao.TransacaoDao;

public class RemocaoTransacaoView {
    public static void main(String[]args){
        try{
            TransacaoDao dao = new TransacaoDao();
            dao.remover(3);
            dao.fecharConexao();
            System.out.println("Transação Removida");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
