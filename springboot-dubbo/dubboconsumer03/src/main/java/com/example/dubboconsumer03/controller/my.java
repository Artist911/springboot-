package com.example.dubboconsumer03.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.example.model.User;
import org.example.service.Userquery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class my {
    @DubboReference(interfaceClass = Userquery.class,version = "1.0")
    private Userquery userquery;
    @RequestMapping("/aaa")
    @ResponseBody
    public  String hello(int id){

        User user = userquery.queryById(id);
        return user.toString();
    }
}
