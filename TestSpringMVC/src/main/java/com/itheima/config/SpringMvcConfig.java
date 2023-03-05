package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//底层基于的是Spring（需要Spring配置），但当前是SpringMVC，所以取名SpringMvcConfig
@Configuration
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {

}
