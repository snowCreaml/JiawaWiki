package com.jiawa.wiki.req;

/**
 * @ClassName EbookReq
 * @Description TODO
 * @Author ColdRain
 * @Date 2024/12/27 15:39
 **/
public class EbookReq {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EbookReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
