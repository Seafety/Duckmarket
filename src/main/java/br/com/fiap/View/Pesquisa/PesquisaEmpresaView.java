package br.com.fiap.View.Pesquisa;
import br.com.fiap.dao.EmpresaDao;
import br.com.fiap.exception.ENEexception;

import br.com.fiap.model.Empresa;

import java.sql.SQLException;

public class PesquisaEmpresaView {
    public static void main(String[] args){
        try{
            EmpresaDao dao = new EmpresaDao();
            Empresa empresa = dao.pesquisar(2);
            System.out.println("NOME:" + empresa.getNomeConta());
            System.out.println("Saldo: "+empresa.getSaldo()+"| Limite: "+ empresa.getLimite());
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Codigo não existe na tabela.");
        }
    }
}
