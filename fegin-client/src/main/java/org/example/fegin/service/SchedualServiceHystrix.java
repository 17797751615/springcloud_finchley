package org.example.fegin.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystrix implements SchedualService {
    @Override
    public String sayHello(String name) {
        return "Sorry " +name;
    }
}
