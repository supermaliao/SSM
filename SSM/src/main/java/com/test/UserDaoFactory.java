package com.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Factory;

public class UserDaoFactory implements FactoryBean {

    //必须重写的方法，方法中进行对象的创建并返回
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //必须重写的方法，返回被创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //默认为单列（返回ture）则不必重写；先要多例则重写，返回为false
    @Override
    public  boolean isSingleton(){
        return false;
    }
}
