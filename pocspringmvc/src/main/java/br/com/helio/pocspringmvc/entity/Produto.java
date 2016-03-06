package br.com.helio.pocspringmvc.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Helio
 */
@Document(collection = "Produto")
public class Produto {
    @Id
    private @Getter @Setter ObjectId id;
    private @Getter @Setter String nome;
    private @Getter @Setter Float preco;
    
    public Produto(){
        this.id = ObjectId.get();
    }
    
    public String getCodigo(){
        return this.id.toString();
    }
}
