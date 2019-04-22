package com.rushquimechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EntityScan( basePackages = {"com.rushquimechanix.model"} )
public class RushquimechanixApplication {

	public static void main(String[] args) {
		SpringApplication.run(RushquimechanixApplication.class, args);
	}

}

