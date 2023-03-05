package com.test;

import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao{
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }

    public void update() {
        System.out.println("book dao update ...");
    }
}
