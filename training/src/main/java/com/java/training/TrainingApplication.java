package com.java.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		System.out.println("Hai");
		System.out.println("featureB");
		System.out.println("featureA");
		SpringApplication.run(TrainingApplication.class, args);
	}

}
