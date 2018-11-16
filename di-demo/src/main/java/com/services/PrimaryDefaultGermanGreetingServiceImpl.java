package com.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"de", "default"})
public class PrimaryDefaultGermanGreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        System.out.println("Greeting from default German service");
        return "default";
    }
}
