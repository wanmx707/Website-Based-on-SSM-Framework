package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;

public class Uservideo implements Serializable{
    private Integer videoid;

    private String videotitle;

    private String videopic;

    private Integer userid;

    private String way;

    private Date videoaddtime;

    private Integer ststus;

    private String uuid;

    private String videocontent;

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public String getVideotitle() {
        return videotitle;
    }

    public void setVideotitle(String videotitle) {
        this.videotitle = videotitle == null ? null : videotitle.trim();
    }

    public String getVideopic() {
        return videopic;
    }

    public void setVideopic(String videopic) {
        this.videopic = videopic == null ? null : videopic.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way == null ? null : way.trim();
    }

    public Date getVideoaddtime() {
        return videoaddtime;
    }

    public void setVideoaddtime(Date videoaddtime) {
        this.videoaddtime = videoaddtime;
    }

    public Integer getStstus() {
        return ststus;
    }

    public void setStstus(Integer ststus) {
        this.ststus = ststus;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getVideocontent() {
        return videocontent;
    }

    public void setVideocontent(String videocontent) {
        this.videocontent = videocontent == null ? null : videocontent.trim();
    }
}