package com.ktpm.inventoryservice.event;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDeletedEvent {
    private Long productId;
}
