package com.example.springboot04.config;

import com.example.springboot04.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        LoginInterceptor loginInterceptor = new LoginInterceptor();

        String[] a = {"/user/**"};
        String[] b = {"/user/demo2"};
        registry.addInterceptor(loginInterceptor).addPathPatterns(a).excludePathPatterns(b);
    }
}
