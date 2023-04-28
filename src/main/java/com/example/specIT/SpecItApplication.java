package com.example.specIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpecItApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecItApplication.class, args);
	}

}
