package pl.hexagon.lightmom.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    String id;
    String name;
    OrderStatus status;

    Date plannedStart;
    Date plannedEnd;
    Date actualStart;
    Date actualEnd;

    List<Product> productList = new ArrayList<>();
    Double plannedQuantity;
    Double producedQuantity;
    String unit;
    String productId;


    public Order(String id, String name, Date plannedStart, Double plannedQuantity, String unit, String productId) {
        this.id = id;
        this.name = name;
        this.plannedStart = plannedStart;
        this.plannedQuantity = plannedQuantity;
        this.unit = unit;
        this.productId = productId;

        this.status = OrderStatus.PENDING;
    }

    public void start(){
        this.status = OrderStatus.IN_PROGRESS;
    }

    public void complete(){
        this.status = OrderStatus.COMPLETED;
    }

    public void cancel(){
        this.status = OrderStatus.CANCELED;
    }
}
