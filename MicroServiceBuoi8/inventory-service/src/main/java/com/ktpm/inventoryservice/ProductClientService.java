package com.ktpm.inventoryservice;

import com.ktpm.inventoryservice.entity.Product;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class ProductClientService {

    private final RestTemplate restTemplate;

    public ProductClientService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @CircuitBreaker(name = "productService", fallbackMethod = "fallback")
    @Retry(name = "productService")
    @RateLimiter(name = "productService")
    @TimeLimiter(name = "productService")
    public CompletableFuture<Product > getProduct(Long productId) {
        return CompletableFuture.supplyAsync(() -> restTemplate.getForObject(
                "http://localhost:8081/api/products/" + productId, Product.class));
    }

    public CompletableFuture<Product> fallback(Long productId, Throwable t) {
        System.out.println("⚠️ Fallback gọi product-service: " + t.getMessage());
        Product fallbackProduct = new Product();
        fallbackProduct.setId(productId);
        fallbackProduct.setName("Sản phẩm không khả dụng");
        return CompletableFuture.completedFuture(fallbackProduct);
    }
}

