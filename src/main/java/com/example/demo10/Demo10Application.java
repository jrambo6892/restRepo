package com.example.demo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class Demo10Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo10Application.class, args);
	}

}
