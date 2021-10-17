package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class ItemBatch implements SerialNumbered{
    private String productId;
    private String serialNumber;
    private List<Item> itemList = new ArrayList<>();

    public ItemBatch(String productId, Integer quantity){
        this.productId = productId;
        this.serialNumber = this.generateSerialNumber(productId);
        for (int i = 0; i < quantity; i++)
            addItem(productId);
    }

    public String generateSerialNumber(String id){
        return "IB_" + SerialNumbered.super.generateSerialNumber(id);
    }

    public void addItem(String productId){
        Item item = new Item(productId, ItemStatus.PLANNED);
        itemList.add(item);
    }
}
