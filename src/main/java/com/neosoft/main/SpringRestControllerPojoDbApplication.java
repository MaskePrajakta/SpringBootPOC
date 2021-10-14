package com.neosoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
@ComponentScan
public class SpringRestControllerPojoDbApplication {

	public static void main(String[] args) {
		System.out.println("Hit URL .....");
		SpringApplication.run(SpringRestControllerPojoDbApplication.class, args);
		System.out.println("Start the run....");
	}

}
