package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/23 15:43
 **/
@RestController
//共用的请求路径
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }
}
