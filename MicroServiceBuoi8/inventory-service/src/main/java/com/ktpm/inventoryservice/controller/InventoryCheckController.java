package com.ktpm.inventoryservice.controller;

import com.ktpm.inventoryservice.ProductClientService;
import com.ktpm.inventoryservice.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/inventory-check")
public class InventoryCheckController {

    private final ProductClientService productClientService;

    public InventoryCheckController(ProductClientService productClientService) {
        this.productClientService = productClientService;
    }

    @GetMapping("/{productId}")
    public CompletableFuture<ResponseEntity<Product>> check(@PathVariable Long productId) {
        return productClientService.getProduct(productId)
                .thenApply(ResponseEntity::ok);
    }
}
