package com.royal.servicefeign.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne(String name);
}
