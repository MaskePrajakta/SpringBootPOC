package com.neosoft.main;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SpringRestControllerPojoDbApplication {

	public static void main(String[] args) {
		System.out.println("Hit URL .....");
		SpringApplication.run(SpringRestControllerPojoDbApplication.class, args);
		System.out.println("Start the run....");
	}

}
