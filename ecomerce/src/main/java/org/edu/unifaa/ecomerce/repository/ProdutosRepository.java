package org.edu.unifaa.ecomerce.repository;
import org.edu.unifaa.ecomerce.model.Produtos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;



@Repository
public class ProdutosRepository{
    private List<Produtos> produtos = new ArrayList<Produtos>();
private long ultimoId = 0;
  
public Produtos adicionar(Produtos produtos){
    
    ultimoId++;
    produtos.setId(ultimoId);
    produtos.add(produtos);

    return produtos;

}

  public List<Produtos> obterTodos(){
    return produtos;
  }

  public Produtos obterPorId(long id){

    for (Produtos produtos : produtos) {

      if(produtos.getId() == id){
        return produtos;
      }
    }

    return new Produtos();
  }


} 

