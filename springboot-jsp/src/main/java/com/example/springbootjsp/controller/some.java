package com.example.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class some {
    @RequestMapping("/")
    public String a(Model model){

        model.addAttribute("data","myjsp");
        return "index";
    }
}
