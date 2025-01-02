package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<EbookResp> list(EbookReq req) {
        // 固定写法
        EbookExample ebookExample = new EbookExample();
        //  相当于where条件
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        //

        criteria.andNameLike("%" + req.getName() + "%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> ebookRespList = new ArrayList<>();
        for(Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            // Spring提供的复制
            BeanUtils.copyProperties(ebook, ebookResp);
            ebookRespList.add(ebookResp);
        }

        return ebookRespList;
    }
}
