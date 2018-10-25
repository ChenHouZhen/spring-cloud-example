package com.chz.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EUREKA-CLIENT",fallback = HelloServiceImpl.class) //通过 @FeignClient（“服务名”），来指定调用哪个服务。
public interface HelloService {

    @RequestMapping(value = "/hello/say",method = RequestMethod.GET)
    String sayHiFromClient();
}
