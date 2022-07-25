package com.example.bootorm01mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.bootorm01mapper.dao")
//@ComponentScan("com.example.bootorm01mapper.service")
public class BootOrm01MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrm01MapperApplication.class, args);
    }

}
