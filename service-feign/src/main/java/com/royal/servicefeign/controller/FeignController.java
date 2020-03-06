package com.royal.servicefeign.controller;


import com.royal.servicefeign.feign.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hi")
    public String sayHi(String name){
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}
