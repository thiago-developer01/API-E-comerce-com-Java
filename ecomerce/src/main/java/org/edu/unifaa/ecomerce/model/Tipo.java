package org.edu.unifaa.ecomerce.model;

import java.util.ArrayList;
import java.util.List;

import org.edu.unifaa.ecomerce.model.Enum.EtipoProdutos;



public class Tipo {
    

    
    public Tipo() {
    }
    private Long id;
    private String nome;
    private List<ModeloProdutos>modelos;
    private boolean ativo;
    private String observacao;
    private EtipoProdutos tipo;
    
    public Tipo(String nome, boolean ativo, String observacao, EtipoProdutos tipo) {
        this.nome = nome;
        this.ativo = ativo;
        this.observacao = observacao;
        this.tipo = tipo;
        this.modelos = new ArrayList<ModeloProdutos>();
        
        
    }
    public Long getId() {
       
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ModeloProdutos> getModelos() {
       
        return modelos;
    }
    public void setModelos(List<ModeloProdutos> modelos) {
        this.modelos = modelos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public EtipoProdutos getTipo() {
        return tipo;
    }
    public void setTipo(EtipoProdutos tipo) {
        this.tipo = tipo;
    }
    
    

   

    


    
}
