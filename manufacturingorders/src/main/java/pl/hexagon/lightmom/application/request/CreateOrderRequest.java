package pl.hexagon.lightmom.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

public class CreateOrderRequest {
    @NotNull
    private String orderId;
    @NotNull
    private Integer quantity;
    @NotNull
    private String productId;

    public CreateOrderRequest(@JsonProperty("orderId") @NotNull final String orderId,
                              @JsonProperty("quantity") @NotNull final Integer quantity,
                              @JsonProperty("productId") @NotNull final String productId) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getOrderId() {
        return orderId;
    }
}