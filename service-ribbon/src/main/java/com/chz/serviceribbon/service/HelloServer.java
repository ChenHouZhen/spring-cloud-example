package com.chz.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServer {

    @Autowired
    RestTemplate restTemplate;

    //对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    @HystrixCommand(fallbackMethod = "getHelloWorldError")
    public String getHelloWorld(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello/say",String.class);
    }

    public String getHelloWorldError(){
        return "hello. sorry,error!";
    }
}
