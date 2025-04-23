package com.ktpm.inventoryservice.event;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCreatedEvent {
    private Long productId;
    private String name;
    private double price;
}
