package br.com.helio.pocspringmvc.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author Helio
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.helio.pocspringmvc.repository")
public class MongoDBDataSourceConfig extends AbstractMongoConfiguration {
    
    @Override
    protected String getDatabaseName() {
        return "mongoDB";
    }
    
    @Override
    public Mongo mongo() throws Exception {
        ServerAddress serverAddress = new ServerAddress("localhost", 27017);
        
        Mongo mongo = new MongoClient(serverAddress);
        mongo.setWriteConcern(WriteConcern.SAFE);
        
        return mongo;
    }
    
    @Override
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}
