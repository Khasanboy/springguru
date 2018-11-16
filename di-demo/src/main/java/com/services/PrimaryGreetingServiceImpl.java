package com.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        System.out.println("Greeting from primary greeting service");
        return "primary";
    }
}
