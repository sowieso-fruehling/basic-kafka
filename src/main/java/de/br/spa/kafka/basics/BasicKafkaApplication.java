package de.br.spa.kafka.basics;

import de.br.spa.kafka.basics.producer.MyProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BasicKafkaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BasicKafkaApplication.class, args);
    }

    private final MyProducer myProducer;

    @Override
    public void run(String... strings) {
        myProducer.send("My message");
    }
}
