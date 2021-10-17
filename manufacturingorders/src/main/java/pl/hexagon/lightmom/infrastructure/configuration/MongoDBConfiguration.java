package pl.hexagon.lightmom.infrastructure.configuration;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.hexagon.lightmom.infrastructure.repository.mongo.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}