package com.wmx.op.po;

import java.util.Date;

public class Message {
    private Integer messageid;

    private Integer messageuserid;

    private Date animeaddtime;

    private String uuid;

    private String messagecontent;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getMessageuserid() {
        return messageuserid;
    }

    public void setMessageuserid(Integer messageuserid) {
        this.messageuserid = messageuserid;
    }

    public Date getAnimeaddtime() {
        return animeaddtime;
    }

    public void setAnimeaddtime(Date animeaddtime) {
        this.animeaddtime = animeaddtime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }
}