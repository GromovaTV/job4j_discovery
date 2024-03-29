package ru.job4j.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClientApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }
}