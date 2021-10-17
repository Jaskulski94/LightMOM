package pl.hexagon.lightmom.application.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.hexagon.lightmom.application.request.CreateOrderRequest;
import pl.hexagon.lightmom.application.response.CreateOrderResponse;
import pl.hexagon.lightmom.domain.service.OrderService;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CreateOrderResponse createOrder(@RequestBody final CreateOrderRequest createOrderRequest) {
        final String id = orderService.createOrder(
                createOrderRequest.getOrderId(),
                createOrderRequest.getQuantity(),
                createOrderRequest.getProductId());

        return new CreateOrderResponse(id);
    }


    @PostMapping("/{id}/complete")
    void completeOrder(@PathVariable final String id) {
        orderService.completeOrder(id);
    }
}
