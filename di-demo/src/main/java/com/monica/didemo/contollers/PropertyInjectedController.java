package com.monica.didemo.contollers;

import com.monica.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl2")
    private GreetingService greetingService;

    public void greet(){
        this.greetingService.greet();
    }

}
