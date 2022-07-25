package com.example.dubboprovide02;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Dubboprovide02Application {

    public static void main(String[] args) {
        SpringApplication.run(Dubboprovide02Application.class, args);
    }

}
