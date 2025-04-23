package com.ktpm.productService.service;

import com.ktpm.productService.dto.ProductRequest;
import com.ktpm.productService.entity.ProductDeletedEvent;
import com.ktpm.productService.entity.ProductUpdatedEvent;
import com.ktpm.productService.entity.Product;
import com.ktpm.productService.event.ProductCreatedEvent;
import com.ktpm.productService.kafka.ProductKafkaProducer;
import com.ktpm.productService.repository.ProductRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepo;
    private final ProductKafkaProducer productKafkaProducer;
    private final KafkaTemplate<Object, ProductUpdatedEvent> kafkaTemplate;

    public ProductService(ProductRepository productRepo, ProductKafkaProducer productKafkaProducer, KafkaTemplate<Object, ProductUpdatedEvent> kafkaTemplate) {
        this.productRepo = productRepo;
        this.productKafkaProducer = productKafkaProducer;
        this.kafkaTemplate = kafkaTemplate;
    }

    public Product createProduct(Product product) {
        Product savedProduct = productRepo.save(product);

        // Gửi event Kafka
        ProductCreatedEvent event = ProductCreatedEvent.builder()
                .productId(savedProduct.getId())
                .name(savedProduct.getName())
                .price(savedProduct.getPrice())
                .build();

        productKafkaProducer.sendProductCreatedEvent(event);

        return savedProduct;
    }

    public Product updateProduct(Long id, ProductRequest request) {
        Product product = productRepo.findById(id).orElseThrow();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        Product updated = productRepo.save(product);

        // Gửi Kafka
        ProductUpdatedEvent event = ProductUpdatedEvent.builder()
                .productId(updated.getId())
                .name(updated.getName())
                .price(updated.getPrice())
                .build();
        kafkaTemplate.send("product.updated", event);

        return updated;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @CircuitBreaker(name = "databaseAccess", fallbackMethod = "dbFallback")
    public Product getProductById(Long id) {
        return productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
        ProductDeletedEvent event = ProductDeletedEvent.builder().productId(id).build();
        kafkaTemplate.send("product.deleted", event);
    }

    public Product dbFallback(Long id, Throwable ex) {
        Product fallbackProduct = new Product();
        fallbackProduct.setId(id);
        fallbackProduct.setName("Không thể truy cập DB");
        return fallbackProduct;
    }
}
