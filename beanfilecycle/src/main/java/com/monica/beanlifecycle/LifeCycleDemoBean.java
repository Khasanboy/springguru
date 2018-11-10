package com.monica.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("I am in life cycle demo bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("I am in setBeanFactory ");

    }

    @Override
    public void setBeanName(String s) {

        System.out.println("I am in setBeanName ");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("I am  in life cycle demo bean destroy method");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(" I am in after properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In Application context");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("I am in postconstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(" I am in preDestroy");
    }

    public void beforeInit(){
        System.out.println("before init has been called by Bean post Preocessor");
    }

    public void afterInit(){
        System.out.println("After init has been called by Bean Post Preocessor");
    }
}
