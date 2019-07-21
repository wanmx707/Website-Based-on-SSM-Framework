package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Anime implements Serializable{
    private Integer animeid;

    @NotBlank(message ="{anime.animepid.isNUll}")
    private String animepid;

    @NotBlank(message ="{anime.animetitle.isNUll}")
    private String animetitle;

    @NotBlank(message ="{anime.way.isNUll}")
    private String way;

    private Date animeaddtime;

    @NotBlank(message ="{anime.animecontent.isNUll}")
    private String animecontent;

    public Integer getAnimeid() {
        return animeid;
    }

    public void setAnimeid(Integer animeid) {
        this.animeid = animeid;
    }

    public String getAnimepid() {
        return animepid;
    }

    public void setAnimepid(String animepid) {
        this.animepid = animepid == null ? null : animepid.trim();
    }

    public String getAnimetitle() {
        return animetitle;
    }

    public void setAnimetitle(String animetitle) {
        this.animetitle = animetitle == null ? null : animetitle.trim();
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public Date getAnimeaddtime() {
        return animeaddtime;
    }

    public void setAnimeaddtime(Date animeaddtime) {
        this.animeaddtime = animeaddtime;
    }

    public String getAnimecontent() {
        return animecontent;
    }

    public void setAnimecontent(String animecontent) {
        this.animecontent = animecontent == null ? null : animecontent.trim();
    }
}