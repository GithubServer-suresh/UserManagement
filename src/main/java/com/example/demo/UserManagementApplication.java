package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {

	public static Logger logger =  LoggerFactory.getLogger(UserManagementApplication.class);
	
	@PostConstruct
	public void init() {
		System.out.println("Application started.....");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
