package com.chz.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorld {

    @Value("${server.port}")
    String port;

    @GetMapping("/say")
    public String say(){
        return "Hello World! The post is :"+port;
    }
}
