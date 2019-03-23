package com.zjy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationProvider.xml", "classpath:applicationContext-*.xml"});

//        com.alibaba.dubbo.container.Main.main(args);

        System.out.println("Hello World!");
        while (true) {
        }
    }
    }
