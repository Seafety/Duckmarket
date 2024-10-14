package br.com.fiap.View.Remocao;
import br.com.fiap.dao.EmpresaDao;

public class RemocaoEmpresaView {
    public static void main(String[]args){
        try{
            EmpresaDao dao = new EmpresaDao();
            dao.remover(3);
            dao.fecharConexao();
            System.out.println("Empresa Removida");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
