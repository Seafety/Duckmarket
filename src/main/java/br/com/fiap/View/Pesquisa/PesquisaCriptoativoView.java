package br.com.fiap.View.Pesquisa;
import br.com.fiap.dao.CriptoativoDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Criptoativo;
import java.sql.SQLException;

public class PesquisaCriptoativoView {

    public static void main(String[] args){
        try{
            CriptoativoDao dao = new CriptoativoDao();
            Criptoativo criptoativo = dao.pesquisar(13);
            System.out.println("NOME:" + criptoativo.getNomeCripto());
            System.out.println("Preço Unitário: "+criptoativo.getPrecoUnitario()+"| Váriação: "+ criptoativo.getVariacao()+" | Quantidade: "+ criptoativo.getQtdCriptoativo());
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Codigo não existe na tabela.");
        }
    }
}
