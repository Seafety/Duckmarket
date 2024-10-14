package br.com.fiap.View.Cadastro;


import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;

public class CadastroUsuarioView {

    public static void main(String[] args){
        try {
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = new Usuario("Miguel", "Miguel@fiap.com.br", "123qweasd");
            dao.cadastrar(usuario);
            dao.fecharConexao();
            System.out.println("Usuario Cadastrado!");
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

}
