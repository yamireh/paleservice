package com.paleservice.paleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PaleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaleServiceApplication.class, args);
	}
}