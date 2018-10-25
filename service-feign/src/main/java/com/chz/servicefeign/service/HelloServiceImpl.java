package com.chz.servicefeign.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHiFromClient() {
        return "sorry~ error!";
    }
}
