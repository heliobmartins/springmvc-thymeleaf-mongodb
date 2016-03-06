package br.com.helio.pocspringmvc.service;

import br.com.helio.pocspringmvc.entity.Produto;
import br.com.helio.pocspringmvc.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Helio
 */
@Service
public class ProdutService {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
    
    public void salvar(Produto produto){
        produtoRepository.save(produto);
    }

    public Produto findByCodigo(String codigo) {
        return produtoRepository.findOne(codigo);
    }
}
