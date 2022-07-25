package com.example.restfulspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 86199
 */
@RestController
public class MyRESTful {
    @GetMapping("/student/{stuid}")
    /**
     * @PathVariable 路径变量
     */
    public String query(@PathVariable("stuid") Integer id){

        return "查询id为"+id;
    }

}
