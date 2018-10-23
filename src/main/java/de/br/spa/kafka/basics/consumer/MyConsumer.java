package de.br.spa.kafka.basics.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyConsumer {
    @KafkaListener(topics = "${app.topic.name}")
    public void receive1(@Payload String data) {
        log.info("Received message='{}'", data);
    }
}
