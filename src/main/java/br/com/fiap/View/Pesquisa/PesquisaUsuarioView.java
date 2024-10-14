package br.com.fiap.View.Pesquisa;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;

public class PesquisaUsuarioView {
    public static void main(String[] args){
        try{
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = dao.pesquisar(2);
            System.out.println("ID do Usuario:" + usuario.getIdUsuario());
            System.out.println("Nome: "+usuario.getNome()+"| Email: "+ usuario.getEmail());
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Codigo não existe na tabela.");
        }
    }
}
