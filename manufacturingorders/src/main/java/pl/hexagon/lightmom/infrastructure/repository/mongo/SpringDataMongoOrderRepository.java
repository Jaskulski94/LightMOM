package pl.hexagon.lightmom.infrastructure.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.hexagon.lightmom.domain.Order;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, String> {
}