package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class Item implements SerialNumbered{
    private String productId;
    private String serialNumber;
    private ItemStatus itemStatus;

    public Item(String productId, ItemStatus itemStatus){
        this.productId = productId;
        this.serialNumber = this.generateSerialNumber(productId);
        this.itemStatus = itemStatus;
    }

    public String generateSerialNumber(String id){
        return "I_" + SerialNumbered.super.generateSerialNumber(id);
    }
}

