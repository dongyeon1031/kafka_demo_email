package com.example.kafka_demo_email.service;

import com.example.kafka_demo_email.model.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {


    @KafkaListener(topics = "order.events", groupId = "email-service", containerFactory = "kafkaListenerContainerFactory")
    public void consume(OrderEvent event) {
        System.out.println("[Email Service] Received event for order: " + event.getOrderId());
        System.out.println("Sending email for status: " + event.getStatus());
    }
}