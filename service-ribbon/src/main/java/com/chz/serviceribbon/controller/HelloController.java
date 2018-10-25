package com.chz.serviceribbon.controller;

import com.chz.serviceribbon.service.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    HelloServer helloServer;

    @Value("${spring.application.name}")
    String serviceName;

    @GetMapping("get")
    public String get(){
        return helloServer.getHelloWorld()+".... serviceName from :"+serviceName;
    }
}
