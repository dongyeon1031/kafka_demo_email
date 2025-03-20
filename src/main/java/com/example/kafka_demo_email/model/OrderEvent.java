package com.example.kafka_demo_email.model;

import lombok.Data;

@Data
public class OrderEvent {
    private int orderId;
    private String status;
    private int qty;
}