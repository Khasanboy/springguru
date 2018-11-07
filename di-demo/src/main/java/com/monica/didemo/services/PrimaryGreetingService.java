package com.monica.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greet() {
        System.out.println("Greeting from primary greeting service");
        return "primary";
    }
}
