package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> mKafkaTemplate;


    public void sendMessage(String name){
        mKafkaTemplate.send("t-hello","Hello "+name);
    }
}
