package com.cg.aps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories(basePackages = "com.cg.aps.repo")
public class ApartmentSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentSecurityApplication.class, args);
	}

}
