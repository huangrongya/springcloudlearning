package com.royal.serviceribbon.controller;

import com.royal.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hello(){
        return helloService.hiService("ribbon");
    }

}
