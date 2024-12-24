package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/24 15:53
 **/
@Service
public class TestService {
    // 也可用jdk自带的@Resource，@Autowired是Spring自带的
    @Autowired
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
