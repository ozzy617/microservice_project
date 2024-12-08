package com.micr.notificationservicee.mq;

import com.micr.notificationservicee.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class OrderNumberListener {

    @KafkaListener(topics = "notification-topic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
        //send out email notification logic
        //log.info("Received Notification: {}", orderPlacedEvent.getOrderNumber();
        System.out.println("Received Notification: " + orderPlacedEvent.getOrderNumber());
    }
}
