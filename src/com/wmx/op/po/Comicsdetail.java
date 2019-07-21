package com.wmx.op.po;

import java.io.Serializable;

public class Comicsdetail implements Serializable{
    private Integer detailid;

    private Integer comicsid;

    private String detailpaper;

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public Integer getComicsid() {
        return comicsid;
    }

    public void setComicsid(Integer comicsid) {
        this.comicsid = comicsid;
    }

    public String getDetailpaper() {
        return detailpaper;
    }

    public void setDetailpaper(String detailpaper) {
        this.detailpaper = detailpaper == null ? null : detailpaper.trim();
    }
}