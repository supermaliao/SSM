package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    /*context.getBean();*/


    }

