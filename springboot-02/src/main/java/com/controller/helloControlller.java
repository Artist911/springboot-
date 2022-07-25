package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * @author 86199
 */

@Controller
public class helloControlller {

    @Value("${school.name}")
    private String name;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return  "第一次使用springboot";
    }

    @RequestMapping("/")
    @ResponseBody
    public String isnull(){
        return  name;
    }
}
