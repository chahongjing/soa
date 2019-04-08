package com.zjy.services;

import com.zjy.api.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HellowWordServiceImpl implements HelloWorldService {

    @Value("${dubbo.application}")
    private String type;

    @Autowired
    private MqProducer mqProducer;

    @Override
    public String getInfo(String name) {
        String message = String.format("你好：%s！这里是service！这是一条新消息！来源：%s", name, type);
        System.out.println(message);
        mqProducer.sendTextMessage(message);
        return message;
    }
}
