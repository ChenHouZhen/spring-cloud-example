package com.chz.servicefeign.controller;

import com.chz.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    HelloService helloService;

    @Value("${spring.application.name}")
    String serviceName;

    @GetMapping("get")
    public String get(){
        return helloService.sayHiFromClient()+".... serviceName from:"+serviceName;
    }
}
