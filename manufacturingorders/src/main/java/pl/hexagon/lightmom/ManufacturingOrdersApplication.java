package pl.hexagon.lightmom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import pl.hexagon.lightmom.application.request.CreateOrderRequest;
import pl.hexagon.lightmom.application.rest.OrderController;

@SpringBootApplication
//@PropertySource(value = { "classpath:ddd-layers.properties" })
public class ManufacturingOrdersApplication implements CommandLineRunner {

    public static void main(final String[] args) {
        SpringApplication application = new SpringApplication(ManufacturingOrdersApplication.class);
        // uncomment to run just the console application
        // application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

//    @Autowired
//    public CliOrderController orderController;
//
//    @Autowired
//    public ConfigurableApplicationContext context;
    @Autowired
    public OrderController orderController;

    @Override
    public void run(String... args) throws Exception {
        orderController.createOrder(new CreateOrderRequest("o1", 1, "p1"));
//        orderController.createCompleteOrder();
//        orderController.createIncompleteOrder();

        // uncomment to stop the context when execution is done
        // context.close();
    }
}