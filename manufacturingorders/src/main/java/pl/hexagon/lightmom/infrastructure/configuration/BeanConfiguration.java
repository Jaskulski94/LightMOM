package pl.hexagon.lightmom.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.hexagon.lightmom.domain.repository.OrderRepository;
import pl.hexagon.lightmom.domain.service.DomainOrderService;
import pl.hexagon.lightmom.domain.service.OrderService;

@Configuration
public class BeanConfiguration {

    @Bean
    OrderService orderService(OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}