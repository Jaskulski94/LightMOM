package pl.hexagon.lightmom.domain.service;

import pl.hexagon.lightmom.domain.OrderStatus;

public interface OrderService {
    String createOrder(String orderId, Integer plannedQuantity, String productId);

    OrderStatus completeOrder(String orderId);
}
