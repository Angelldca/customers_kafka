package com.angelldca.customers.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class CustomerEventService {

    @KafkaListener(topics = "customers")//, groupId = "consumer-group"
    public void listen(Object message) {
        System.out.println("Received message: " + message);
    }
}
