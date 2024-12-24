package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/23 15:43
 **/
@RestController
public class TestController {

    // 读取配置项
    @Value("${test.hello:TEST}")
    private String testItemHello;

    @Autowired
    private TestService testService;

    // @RequestMapping("/hello")
    // @PostMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "hello" + testItemHello;
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World! Post, " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
