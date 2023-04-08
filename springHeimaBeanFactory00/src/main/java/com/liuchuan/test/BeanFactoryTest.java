package com.liuchuan.test;

import com.liuchuan.dao.UserDao;
import com.liuchuan.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建读取器（读取xml）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");
        //根据id获取bean实例
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
        System.out.println(userDao);
    }
}
