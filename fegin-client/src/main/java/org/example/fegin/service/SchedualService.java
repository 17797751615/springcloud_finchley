package org.example.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "say-hello",fallback = SchedualServiceHystrix.class)
public interface SchedualService {
    @GetMapping("/hi")
    String sayHello(@RequestParam String name);
}
