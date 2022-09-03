package com.kafka;

import com.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaCoreProducerApplication implements CommandLineRunner {


	@Autowired
	private KafkaProducer mKafkaProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaCoreProducerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		mKafkaProducer.sendMessage("Sisyphos");
	}
}
