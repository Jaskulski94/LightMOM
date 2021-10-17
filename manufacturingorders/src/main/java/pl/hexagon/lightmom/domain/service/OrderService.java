package pl.hexagon.lightmom.domain.service;

public interface OrderService {
    String createOrder(String orderId, Double plannedQuantity, String productId);

    void completeOrder(String orderId);
}
