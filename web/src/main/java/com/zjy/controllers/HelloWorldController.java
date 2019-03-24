package com.zjy.controllers;

import com.zjy.api.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("helloworld")
@RestController
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;

    @Autowired
    private HttpServletRequest reqeust;

    @GetMapping("test")
    public Object test(String name) {
        String name1 = reqeust.getParameter("name");
        String info = helloWorldService.getInfo(name);
        return info;
    }
}
