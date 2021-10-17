package pl.hexagon.lightmom.domain.repository;

import pl.hexagon.lightmom.domain.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Optional<Order> findById(String orderId);

    void save(Order order);
}
