package com.example.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @GetMapping("/hello")
    public  String hello(){
        return "hello";
    }
}
