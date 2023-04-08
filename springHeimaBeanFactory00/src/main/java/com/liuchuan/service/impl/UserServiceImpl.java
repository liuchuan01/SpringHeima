package com.liuchuan.service.impl;

import com.liuchuan.dao.UserDao;
import com.liuchuan.service.UserService;

public class UserServiceImpl implements UserService {
    //bean工厂调用该方法，从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
        System.out.println("bean工厂调用该方法，从容器中获得userDao设置到此处"+userDao);
    };
}
