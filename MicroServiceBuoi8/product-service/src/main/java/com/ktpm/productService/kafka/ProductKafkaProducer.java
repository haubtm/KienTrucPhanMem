package com.ktpm.productService.kafka;

import com.ktpm.productService.event.ProductCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductKafkaProducer {

    private final KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;

    private static final String TOPIC = "product.created";

    public void sendProductCreatedEvent(ProductCreatedEvent event) {
        kafkaTemplate.send(TOPIC, event);
    }
}
