package com.chz.eurekaservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorld {

    @GetMapping("/say")
    public String say(){
        return "Hello World!";
    }
}
