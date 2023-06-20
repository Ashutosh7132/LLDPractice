package com.mrbajaj.lldsnakeandladder.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/snake-and-ladder")
public class HomeController {
    @GetMapping("/")
    public String root(){
        return "Welcome!! Let's play Snake and Ladder ~ ^";
    }
}
