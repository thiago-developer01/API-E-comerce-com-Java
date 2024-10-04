package org.edu.unifaa.ecomerce.controller;



import org.edu.unifaa.ecomerce.model.Produtos;
import org.edu.unifaa.ecomerce.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosContoller {
    @Autowired
    private ProdutosService produtosService;
    
    
    @GetMapping
    public List<Produtos> obterTodos(){
        return produtosService.obterTodos();
    }
     
       @GetMapping("/{id}")
    public Produtos obterPorId(@PathVariable Long id){
        return produtosService.obterPorId(id);
        

    }

    @PostMapping 
        public Produtos adicionar( @RequestBody Produtos produtos){
            return produtosService.adicionar(produtos);
        }
}
