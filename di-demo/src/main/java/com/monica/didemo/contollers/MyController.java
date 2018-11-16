package com.monica.didemo.contollers;

import com.monica.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {

        System.out.println("Hello!!!!");
        return "hello";

    }

    public void greet() {
        this.greetingService.greet();
    }

}
