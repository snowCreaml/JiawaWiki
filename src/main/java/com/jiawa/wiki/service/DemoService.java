package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DemoService
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/24 15:53
 **/
@Service
public class DemoService {
    // 也可用jdk自带的@Resource，@Autowired是Spring自带的
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
