package br.com.fiap.View.Atualizacao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;

public class AtualizacaoUsuarioView {
    public static void main(String[]args){
        try{
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = dao.pesquisar(4);
            usuario.setNome("Maria Clara");
            usuario.setEmail("MariaClara@gmail.com");
            usuario.setSenha("123qweasd");
            dao.atualizar(usuario);
            System.out.println("Usuario Atualizado");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Produto não encontrado");
        }
    }
}
