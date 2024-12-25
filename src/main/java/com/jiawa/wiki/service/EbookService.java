package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EBookService
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/24 15:53
 **/
@Service
public class EbookService {
    // 也可用jdk自带的@Resource，@Autowired是Spring自带的
    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
