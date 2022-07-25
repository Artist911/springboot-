package com.example.springbootthemeleaf.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 86199
 */
@Controller
public class hello {


    @RequestMapping("/hello")
    public String demo(HttpServletRequest request){

        request.setAttribute("data","欢迎使用");
        return "hello001";
    }

}
