package com.royal.eurekaclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String sayHi(String name){
        return "hello "+name+", I am from port: "+port;
    }
}
