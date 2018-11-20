package com.monica.externalproperties;

import com.monica.externalproperties.examplebean.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class ExternalPropertiesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(ExternalPropertiesApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println("User "+ fakeDataSource.getUser());
        System.out.println("Password "+fakeDataSource.getPassword());
        System.out.println("Url "+ fakeDataSource.getUrl());


    }
}
