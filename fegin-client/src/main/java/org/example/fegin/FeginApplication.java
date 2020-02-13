package org.example.fegin;

import org.example.fegin.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class FeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class,args);
    }
    @Autowired
    SchedualService schedualService;
    @GetMapping("/hi")
    public String  sayHello (String name) {
       return schedualService.sayHello(name);
    }
}
