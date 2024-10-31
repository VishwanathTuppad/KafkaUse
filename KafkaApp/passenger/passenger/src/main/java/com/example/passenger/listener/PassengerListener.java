package com.example.passenger.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PassengerListener {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
