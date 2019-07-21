package com.wmx.op.po;

import java.util.Date;

public class Reply {
    private Integer replyid;

    private Integer replyuserid;

    private Integer replytocommentid;

    private Date replyaddtime;

    private String replycontent;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getReplyuserid() {
        return replyuserid;
    }

    public void setReplyuserid(Integer replyuserid) {
        this.replyuserid = replyuserid;
    }

    public Integer getReplytocommentid() {
        return replytocommentid;
    }

    public void setReplytocommentid(Integer replytocommentid) {
        this.replytocommentid = replytocommentid;
    }

    public Date getReplyaddtime() {
        return replyaddtime;
    }

    public void setReplyaddtime(Date replyaddtime) {
        this.replyaddtime = replyaddtime;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }
}