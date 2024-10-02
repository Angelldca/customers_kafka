package com.angelldca.customers.Service;

import com.angelldca.customers.events.CustomerCreatedEvent;
import com.angelldca.customers.events.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;




@Component
@Slf4j
public class CustomerEventService {


    @KafkaListener(
            topics = "${topic.customer.name:customers}",
            containerFactory = "kafkaListenerContainerFactory",
            groupId = "grupo1")
    public void consumer(Event<?> event) {
        if (event.getClass().isAssignableFrom(CustomerCreatedEvent.class)) {
            CustomerCreatedEvent customerCreatedEvent = (CustomerCreatedEvent) event;
            log.info("Received Customer created event .... with Id={}, data={}",
                    customerCreatedEvent.getId(),
                    customerCreatedEvent.getData().toString());
        }
    }
  /*
  @KafkaListener(topics = "customers", groupId = "grupo1")
public void listenRawMessage(CustomerCreatedEvent event) {

    System.out.println("Evento recibido: " + event);
}
  */

}
