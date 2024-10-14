package br.com.fiap.View.Atualizacao;

import br.com.fiap.dao.EmpresaDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Empresa;

import java.sql.SQLException;

public class AtualizacaomEmpresaView {
    public static void main(String[]args){
        try{
            EmpresaDao dao = new EmpresaDao();
            Empresa empresa = dao.pesquisar(3);
            empresa.setNomeConta("Miguel Corp");
            empresa.setSaldo(10.0);
            empresa.setLimite(20.0);
            dao.atualizar(empresa);
            System.out.println("Moeda Atualizada");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Produto não encontrado");
        }
    }
}
