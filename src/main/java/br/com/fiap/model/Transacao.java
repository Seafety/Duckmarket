package br.com.fiap.model;

import java.util.Date;

public class Transacao {
    private Long idTransacao;
    private Integer idConta;
    private Integer idCriptoativo;
    private String tipotransacao;
    private Double qtdTransacao;
    private Double precoUnitario;
    private java.sql.Date dtTransacao;

    public Transacao (){

    }

    public Transacao(Long idTransacao, Integer idConta, Integer idCriptoativo, String tipotransacao, Double qtdTransacao, Double precoUnitario, java.sql.Date dtTransacao) {
        this.idTransacao = idTransacao;
        this.idConta = idConta;
        this.idCriptoativo = idCriptoativo;
        this.tipotransacao = tipotransacao;
        this.qtdTransacao = qtdTransacao;
        this.precoUnitario = precoUnitario;
        this.dtTransacao = dtTransacao;
    }

    public Transacao(String tipotransacao, double qtdTransacao, double precoUnitario) {
        this.tipotransacao = tipotransacao;
        this.qtdTransacao = qtdTransacao;
        this.precoUnitario = precoUnitario;
    }

    public Transacao(Long idTransacao, String tipotransacao, double precoUnitario, double qtdTransacao,java.sql.Date dtTransacao) {
        this.idTransacao = idTransacao;
        this.tipotransacao = tipotransacao;
        this.qtdTransacao = qtdTransacao;
        this.precoUnitario = precoUnitario;
        this.dtTransacao = dtTransacao;
    }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Integer getIdCriptoativo() {
        return idCriptoativo;
    }

    public void setIdCriptoativo(Integer idCriptoativo) {
        this.idCriptoativo = idCriptoativo;
    }

    public String getTipotransacao() {
        return tipotransacao;
    }

    public void setTipotransacao(String tipotransacao) {
        this.tipotransacao = tipotransacao;
    }

    public Double getQtdTransacao() {
        return qtdTransacao;
    }

    public void setQtdTransacao(Double qtdTransacao) {
        this.qtdTransacao = qtdTransacao;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getDtTransacao() {
        return dtTransacao;
    }

    public void setDtTransacao(java.sql.Date dtTransacao) {
        this.dtTransacao = dtTransacao;
    }
}
