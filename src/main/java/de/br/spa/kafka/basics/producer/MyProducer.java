package de.br.spa.kafka.basics.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MyProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.name}")
    private String topicName;

    public void send(String message) {
        log.info("sending message='{}' to topic='{}'", message, topicName);
        kafkaTemplate.send(topicName, message);//the message will be placed in a buffer and will be sent to the broker in a separate thread
    }
}