package com.example.kafka_Consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumer1Application {
	@KafkaListener(topics="demo1", groupId="a")
	public void consumer(String message){
System.out.println("Consumer 1 received "+message);
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumer1Application.class, args);
	}

}
