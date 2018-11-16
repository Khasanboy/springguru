package com.monica.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config.xml")
public class JokesAppApplication {

    public static void main(String[] args){
        SpringApplication.run(JokesAppApplication.class, args);
    }

}
