package com.zjy.services;

import com.zjy.api.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;

public class HellowWordServiceImpl implements HelloWorldService {

    @Autowired
    private MqProducer mqProducer;

    @Override
    public String getInfo(String name) {
        System.out.println("server 1");
        //mqProducer.sendTextMessage("这是一条新消息");
        return String.format("你好：%s！", name);
    }
}
