package com.example.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootJsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJsApplication.class, args);
    }
   @Bean
   /**
    * target中没有找到配置文件
    * 新建一个端口
    */
    public TomcatServletWebServerFactory servletContainer(){
        return new TomcatServletWebServerFactory(8022) ;
    }

}
