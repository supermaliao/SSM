package com.test;

import org.example.App;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo1 {

    public static void main(String[] args){
       /* ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
        User user = (User) context.getBean("user1");
        user.add();*/

        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean1.xml");
        /*Book book1 = (Book) context2.getBean(" book2");
        Book book2  = (Book) context2.getBean("book2");

        System.out.println(book1);
        System.out.println(book2);*/

        UserDao userDao = (UserDao) context2.getBean("userDao");
        System.out.println(userDao);
        userDao.save();

    }


}
