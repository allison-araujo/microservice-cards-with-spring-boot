package io.github.allison.cards.mscards;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableRabbit
@Slf4j
public class MscardsApplication {

	public static void main(String[] args) {
		log.info("Informação: {}", "test info");
		log.error("Error: {}", "test error");
		log.warn("Aviso: {}", "test warn");

		SpringApplication.run(MscardsApplication.class, args);
	}
}
