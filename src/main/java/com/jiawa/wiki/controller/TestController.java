package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/23 15:43
 **/
@RestController
public class TestController {

    // @RequestMapping("/hello")
    // @PostMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World! Post, " + name;
    }
}
