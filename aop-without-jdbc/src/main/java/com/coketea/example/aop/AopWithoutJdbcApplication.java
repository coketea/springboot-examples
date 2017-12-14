package com.coketea.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopWithoutJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopWithoutJdbcApplication.class, args);
    }
}
