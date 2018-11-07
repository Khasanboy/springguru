package com.monica.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl2 implements GreetingService {
    @Override
    public String greet() {
        System.out.println("Greeting from second impl");
        return "greet 2";
    }
}
