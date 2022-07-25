package com.example.springboot04.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/user")
public class mycontrol {
    @RequestMapping("/demo1")
    @ResponseBody
    public String dome1(){
        return "demo1方法";
    }
    @RequestMapping("/demo2")
    @ResponseBody
    public String dome2(){
        return "demo2方法";
    }
}
