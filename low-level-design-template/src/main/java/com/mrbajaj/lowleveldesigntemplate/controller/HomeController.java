package com.mrbajaj.lowleveldesigntemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    @GetMapping("/hello-world")
    public String root(){
        return "Welcome to the world of Low Level Design";
    }
}
