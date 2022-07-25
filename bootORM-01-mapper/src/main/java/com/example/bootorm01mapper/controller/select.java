package com.example.bootorm01mapper.controller;

import com.example.bootorm01mapper.model.Student;
import com.example.bootorm01mapper.service.queryservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class select {
    @Resource
    private queryservice queryservice;
    @RequestMapping("/query")
    @ResponseBody
    public String byID(Integer id){
        Student student = queryservice.querybyid(id);
        return student.toString();
    }
}
