package pl.hexagon.lightmom.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

//@FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
//@AllArgsConstructor
//@Getter(AccessLevel.PACKAGE)
//@Setter(AccessLevel.PACKAGE)
public class Order {
    String id;
    String name;
    String status;

    Date plannedStart;
    Date plannedEnd;
    Date actualStart;
    Date actualEnd;

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

        this.status = "Pending";
    }

    public void complete(){
        this.status = "Completed";
    }

    public void cancel(){
        this.status = "Canceled";
    }
}
