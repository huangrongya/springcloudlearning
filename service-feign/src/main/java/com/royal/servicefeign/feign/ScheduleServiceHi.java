package com.royal.servicefeign.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = ScheduleServiceHiImpl.class)
public interface ScheduleServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
