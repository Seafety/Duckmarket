package br.com.fiap.View.Cadastro;

import br.com.fiap.dao.CriptoativoDao;
import br.com.fiap.model.Criptoativo;

import java.sql.SQLException;

public class CadastroCriptoativoView {
    public static void main(String[] args){
        try {
            CriptoativoDao dao = new CriptoativoDao();
            Criptoativo criptoativo = new Criptoativo("DogeCoin", "DOGE", 0.60, 7.00, 8.00);
            dao.cadastrar(criptoativo);
            dao.fecharConexao();
            System.out.println("Criptoativo Cadastrado!");
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
