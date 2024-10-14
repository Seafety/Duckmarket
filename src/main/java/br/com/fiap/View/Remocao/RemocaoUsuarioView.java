package br.com.fiap.View.Remocao;


import br.com.fiap.dao.UsuarioDao;

public class RemocaoUsuarioView {
    public static void main(String[]args){
        try{
            UsuarioDao dao = new UsuarioDao();
            dao.remover(8);
            dao.fecharConexao();
            System.out.println("Usuario Removido");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
