package org.edu.unifaa.ecomerce.model;

public class ModeloProdutos {
    private Long id;
    private String tipo;
    private double valor;
    public Long getId() {
        return id;
    }
    

    public ModeloProdutos() {
    }


    public void setId(Long id) {
      
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public ModeloProdutos(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
}
