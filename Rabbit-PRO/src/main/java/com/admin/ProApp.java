package com.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProApp {

	public static void main(String[] args) {
		SpringApplication.run(ProApp.class, args);
	}

}
