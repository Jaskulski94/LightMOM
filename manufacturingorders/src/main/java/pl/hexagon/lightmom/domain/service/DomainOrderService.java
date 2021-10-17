package pl.hexagon.lightmom.domain.service;

import pl.hexagon.lightmom.domain.Order;
import pl.hexagon.lightmom.domain.repository.OrderRepository;

public class DomainOrderService implements OrderService {
    private final OrderRepository orderRepository;

    public DomainOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String createOrder(String orderId, Integer plannedQuantity, String productId) {
        Order order = new Order(orderId, plannedQuantity, productId);
        orderRepository.save(order);

        return order.getId();
    }

    @Override
    public void completeOrder(String orderId) {
        Order order = getOrder(orderId);
    }

    private Order getOrder(String orderId) {
        return orderRepository
                .findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order with given id doesn't exist"));
    }
}
