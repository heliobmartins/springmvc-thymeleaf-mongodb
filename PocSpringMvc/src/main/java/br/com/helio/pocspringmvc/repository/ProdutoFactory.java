package br.com.helio.pocspringmvc.repository;

import br.com.helio.pocspringmvc.entity.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Helio
 */
public interface ProdutoFactory extends MongoRepository<Produto, String> {
}
