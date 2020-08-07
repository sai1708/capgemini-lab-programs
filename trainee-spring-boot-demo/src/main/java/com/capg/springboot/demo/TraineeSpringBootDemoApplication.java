package com.capg.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg.springboot.demo.service")
public class TraineeSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeSpringBootDemoApplication.class, args);
	}

}
