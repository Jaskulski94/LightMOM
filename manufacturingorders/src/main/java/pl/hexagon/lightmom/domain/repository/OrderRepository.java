package pl.hexagon.lightmom.domain.repository;

import pl.hexagon.lightmom.domain.Order;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(String orderId);

    void save(Order order);
}
