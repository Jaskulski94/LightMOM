package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class Order {
    private String id;
    private String name;
    private OrderStatus status;

    private Date plannedStart;
    private Date plannedEnd;
    private Date actualStart;
    private Date actualEnd;

    private Double plannedQuantity;
    private Double producedQuantity;
    private String unit;
    private String productId;

    private ItemBatch itemBatch;

    public Order(String id, String name, Date plannedStart, Double plannedQuantity, String unit, String productId) {
        this.id = id;
        this.name = name;
        this.plannedStart = plannedStart;
        this.plannedQuantity = plannedQuantity;
        this.unit = unit;
        this.productId = productId;

        this.status = OrderStatus.PENDING;
        this.itemBatch = new ItemBatch(productId, plannedQuantity);
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
