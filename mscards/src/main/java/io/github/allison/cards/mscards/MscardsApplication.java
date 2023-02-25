package io.github.allison.cards.mscards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MscardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscardsApplication.class, args);
	}

	System.out.println("a")

}
