package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
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

    public Order(String id, Double plannedQuantity, String productId) {
        this.id = id;
        this.plannedQuantity = plannedQuantity;
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
