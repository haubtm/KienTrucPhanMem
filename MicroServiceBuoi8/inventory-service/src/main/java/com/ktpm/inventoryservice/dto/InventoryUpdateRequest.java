package com.ktpm.inventoryservice.dto;

import lombok.Data;

@Data
public class InventoryUpdateRequest {
    private Long productId;
    private int quantity;
    private String operation; // INCREASE or DECREASE
}
