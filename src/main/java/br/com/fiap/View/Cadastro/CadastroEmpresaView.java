package br.com.fiap.View.Cadastro;

import br.com.fiap.dao.EmpresaDao;
import br.com.fiap.model.Empresa;

import java.sql.SQLException;

public class CadastroEmpresaView {
    public static void main(String[] args){
        try {
            EmpresaDao dao = new EmpresaDao();
            Empresa empresa = new Empresa("Miguel Corp", 18.00,20.00);
            dao.cadastrar(empresa);
            dao.fecharConexao();
            System.out.println("Empresa Cadastrada!");
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
