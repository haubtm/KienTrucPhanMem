package com.ktpm.inventoryservice.kafka;

import com.ktpm.inventoryservice.entity.Inventory;
import com.ktpm.inventoryservice.event.ProductCreatedEvent;
import com.ktpm.inventoryservice.event.ProductDeletedEvent;
import com.ktpm.inventoryservice.event.ProductUpdatedEvent;
import com.ktpm.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryKafkaConsumer {

    private final InventoryRepository inventoryRepository;

    @KafkaListener(topics = "product.created", groupId = "inventory-group")
    public void consume(ProductCreatedEvent event) {
        System.out.println("📥 Nhận event tạo sản phẩm: " + event);

        // Tạo bản ghi tồn kho mới nếu chưa có
        boolean exists = inventoryRepository.findByProductId(event.getProductId()).isPresent();
        if (!exists) {
            Inventory inventory = Inventory.builder()
                    .productId(event.getProductId())
                    .quantity(0) // Mặc định là 0
                    .build();
            inventoryRepository.save(inventory);
            System.out.println("✅ Đã tạo tồn kho cho productId=" + event.getProductId());
        }
    }

    @KafkaListener(topics = "product.updated", groupId = "inventory-group")
    public void onProductUpdated(ProductUpdatedEvent event) {
        // Optional: log hoặc ghi chú về update
        System.out.println("🛠️ Cập nhật productId=" + event.getProductId());
    }

    @KafkaListener(topics = "product.deleted", groupId = "inventory-group")
    public void onProductDeleted(ProductDeletedEvent event) {
        inventoryRepository.findByProductId(event.getProductId()).ifPresent(inventory -> {
            inventoryRepository.delete(inventory);
            System.out.println("🗑️ Đã xoá tồn kho productId=" + event.getProductId());
        });
    }
}
