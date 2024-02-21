package com.example.contactanos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.contactanos")
public class ContactanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactanosApplication.class, args);
	}

}
