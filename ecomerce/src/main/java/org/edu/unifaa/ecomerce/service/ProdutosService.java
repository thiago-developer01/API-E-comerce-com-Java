package org.edu.unifaa.ecomerce.service;

import org.edu.unifaa.ecomerce.model.Produtos;
import org.edu.unifaa.ecomerce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public Produtos adicionar(Produtos produtos){
        return produtosRepository.adicionar(produtos);
    }

    public List<Produtos> obterTodos(){
        return produtosRepository.obterTodos();
    }

        public Produtos obterPorId(Long id){
        return produtosRepository.obterPorId(id);

    }
}



