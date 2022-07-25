package com.example.springboot03.controller;

import com.example.springboot03.vo.stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class data {
    @Resource
    private stu s;
    @RequestMapping("/")
    @ResponseBody
    public String play(){
        return s.toString();

    }


}
