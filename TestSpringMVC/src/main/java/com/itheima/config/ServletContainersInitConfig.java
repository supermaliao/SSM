package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*//4、定义一个Servlet容器启动的配置类，在里面加载spring的配置
@Configuration
@ComponentScan(value = "com.itheima.config", includeFilters = @ComponentScan.Filter())
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    //加载springMvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置Tomcat接收的请求那些归SpringMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//现在写的/表示拦截所有请求，任意请求都将转入到SpringMvc进行处理
        }

    //设置spring容器配置，即创建Servlet容器时需要加载非SpringMVC对应的bean
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}*/

//4、上面的升级版
@Configuration
@ComponentScan("com.itheima")
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
