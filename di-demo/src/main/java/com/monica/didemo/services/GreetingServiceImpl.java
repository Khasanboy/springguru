package com.monica.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        System.out.println("Greeting to you !!!!");
        return "greeting";
    }
}
