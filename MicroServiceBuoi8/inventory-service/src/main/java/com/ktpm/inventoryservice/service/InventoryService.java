package com.ktpm.inventoryservice.service;

import com.ktpm.inventoryservice.dto.InventoryUpdateRequest;
import com.ktpm.inventoryservice.entity.Inventory;
import com.ktpm.inventoryservice.repository.InventoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory getInventoryByProductId(Long productId) {
        return inventoryRepository.findByProductId(productId)
                .orElseThrow(() -> new RuntimeException("Inventory not found for productId: " + productId));
    }

    @Transactional
    public Inventory updateInventory(InventoryUpdateRequest request) {
        Inventory inventory = inventoryRepository.findByProductId(request.getProductId())
                .orElseThrow(() -> new RuntimeException("Inventory not found"));

        if ("DECREASE".equalsIgnoreCase(request.getOperation())) {
            if (inventory.getQuantity() < request.getQuantity()) {
                throw new RuntimeException("Not enough stock");
            }
            inventory.setQuantity(inventory.getQuantity() - request.getQuantity());
        } else if ("INCREASE".equalsIgnoreCase(request.getOperation())) {
            inventory.setQuantity(inventory.getQuantity() + request.getQuantity());
        } else {
            throw new IllegalArgumentException("Invalid operation: " + request.getOperation());
        }

        return inventoryRepository.save(inventory);
    }
}
