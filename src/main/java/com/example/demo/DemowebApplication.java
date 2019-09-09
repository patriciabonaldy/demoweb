package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemowebApplication {
	private static Logger Log = LoggerFactory.getLogger(DemowebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
	}

}
