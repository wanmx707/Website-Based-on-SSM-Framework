package com.wmx.op.po;

import java.util.Date;

public class Usernews {
    private Integer usernewsid;

    private String usernewstitle;

    private Integer userid;

    private Date usernewsaddtime;

    private String uuid;

    private String usernewscontent;

    public Integer getUsernewsid() {
        return usernewsid;
    }

    public void setUsernewsid(Integer usernewsid) {
        this.usernewsid = usernewsid;
    }

    public String getUsernewstitle() {
        return usernewstitle;
    }

    public void setUsernewstitle(String usernewstitle) {
        this.usernewstitle = usernewstitle == null ? null : usernewstitle.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getUsernewsaddtime() {
        return usernewsaddtime;
    }

    public void setUsernewsaddtime(Date usernewsaddtime) {
        this.usernewsaddtime = usernewsaddtime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUsernewscontent() {
        return usernewscontent;
    }

    public void setUsernewscontent(String usernewscontent) {
        this.usernewscontent = usernewscontent == null ? null : usernewscontent.trim();
    }
}