package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment implements Serializable{
    private Integer commentid;

    private Integer commenttopicid;

    private Integer commentuserid;

    private Date commentaddtime;

    private String uuid;

    private String commentcontent;
    
    private List<Reply> replyList;

    public List<Reply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}

	public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getCommenttopicid() {
        return commenttopicid;
    }

    public void setCommenttopicid(Integer commenttopicid) {
        this.commenttopicid = commenttopicid;
    }

    public Integer getCommentuserid() {
        return commentuserid;
    }

    public void setCommentuserid(Integer commentuserid) {
        this.commentuserid = commentuserid;
    }

    public Date getCommentaddtime() {
        return commentaddtime;
    }

    public void setCommentaddtime(Date commentaddtime) {
        this.commentaddtime = commentaddtime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }
}