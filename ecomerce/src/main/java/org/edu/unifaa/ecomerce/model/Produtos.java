package org.edu.unifaa.ecomerce.model;

import java.util.Date;

public class Produtos {
    private Long id;
    private String nome;
    private String marca;
    private Date dataFabricacao;
    private String observacao;
    public Long getId() {
        return id;
    }
    
    public Produtos() {
    }

    public void setId(long ultimoId) {
        this.id = ultimoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getObservacao() {
        return observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Produtos(String nome,  String marca ,Date dataFabricacao, String observacao) {
        this.nome = nome;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
        this.observacao = observacao;
    }

    public void add(Produtos produtos) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
    
}
