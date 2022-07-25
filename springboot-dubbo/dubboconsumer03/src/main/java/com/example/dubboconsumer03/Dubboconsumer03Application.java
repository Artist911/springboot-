package com.example.dubboconsumer03;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Dubboconsumer03Application {

    public static void main(String[] args) {
        SpringApplication.run(Dubboconsumer03Application.class, args);
    }

}
