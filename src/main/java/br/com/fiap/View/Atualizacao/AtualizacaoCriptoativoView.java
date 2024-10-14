package br.com.fiap.View.Atualizacao;

import br.com.fiap.dao.CriptoativoDao;
import br.com.fiap.exception.ENEexception;
import br.com.fiap.model.Criptoativo;

import java.sql.SQLException;

public class AtualizacaoCriptoativoView {

    public static void main(String[]args){
        try{
            CriptoativoDao dao = new CriptoativoDao();
            Criptoativo criptoativo = dao.pesquisar(3);
            criptoativo.setNomeCripto("Solana");
            criptoativo.setSimbolo("SOL");
            criptoativo.setVariacao(0.80);
            criptoativo.setQtdCriptoativo(70.0);
            criptoativo.setPrecoUnitario(5.0);
            dao.atualizar(criptoativo);
            System.out.println("Moeda Atualizada");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } catch (ENEexception e) {
            System.err.println("Produto não encontrado");
        }
    }
}
