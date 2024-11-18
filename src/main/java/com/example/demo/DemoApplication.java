package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Print message before running the Spring Boot application
        System.out.println("Starting the Spring Boot application...");

        // Run the application
        SpringApplication.run(DemoApplication.class, args);

        // Print message after application started
        System.out.println("Spring Boot application started successfully!");
    }
}
