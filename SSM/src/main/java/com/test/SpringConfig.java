package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.test"})
@EnableAspectJAutoProxy //使用注解AOP
public class SpringConfig {

}
