package com.monica.didemo;

import com.monica.didemo.contollers.ConstructorInjectedController;
import com.monica.didemo.contollers.MyController;
import com.monica.didemo.contollers.PropertyInjectedController;
import com.monica.didemo.contollers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        ctx.getBean(ConstructorInjectedController.class).greet();
        ctx.getBean(PropertyInjectedController.class).greet();
        ctx.getBean(SetterInjectedController.class).greet();
    }
}
