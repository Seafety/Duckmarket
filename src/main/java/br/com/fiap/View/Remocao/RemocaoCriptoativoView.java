package br.com.fiap.View.Remocao;

import br.com.fiap.dao.CriptoativoDao;


public class RemocaoCriptoativoView {
    public static void main(String[]args){
        try{
            CriptoativoDao dao = new CriptoativoDao();
            dao.remover(12);
            dao.fecharConexao();
            System.out.println("Produto Removido");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
