package com.zjy.controllers;

import com.zjy.api.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("helloworld")
@RestController
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;

    @GetMapping("test")
    public Object test(String name) {
        return helloWorldService.getInfo(name);
    }
}
