package pl.hexagon.lightmom.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.hexagon.lightmom.domain.Order;
import pl.hexagon.lightmom.domain.OrderStatus;
import pl.hexagon.lightmom.domain.repository.OrderRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DomainOrderServiceUnitTest {

    private OrderRepository orderRepository;
    private DomainOrderService domainOrderService;

    private final String orderId = "o1";
    private final Integer plannedQuantity = 1;
    private final String productId = "p1";

    @BeforeEach
    void setUp() {
        orderRepository = mock(OrderRepository.class);
        domainOrderService = new DomainOrderService(orderRepository);
    }

    @Test
    void shouldReturnOrderIdWhenCreated(){
        String id = domainOrderService.createOrder(orderId, plannedQuantity, productId);
        assertEquals(orderId, id);
    }

//    @Test
//    void shouldReturnOrderStatusCompleteWhenCompleted(){
//        String id = domainOrderService.createOrder(orderId, plannedQuantity, productId);
//        OrderStatus orderStatus = domainOrderService.completeOrder(id);
//        assertEquals(OrderStatus.COMPLETED, orderStatus);
//    }
}