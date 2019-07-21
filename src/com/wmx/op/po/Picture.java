package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Picture implements Serializable{
    private Integer picid;

    private Integer userid;

    private String picname;

    private String picfengmian;

    private Date picaddtime;

    private Integer status;

    private String uuid;

    private String piccontent;

    private List<Picturedetail> picturedetail;
    
    public List<Picturedetail> getPicturedetail() {
		return picturedetail;
	}

	public void setPicturedetail(List<Picturedetail> picturedetail) {
		this.picturedetail = picturedetail;
	}

	public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname == null ? null : picname.trim();
    }

    public String getPicfengmian() {
        return picfengmian;
    }

    public void setPicfengmian(String picfengmian) {
        this.picfengmian = picfengmian == null ? null : picfengmian.trim();
    }

    public Date getPicaddtime() {
        return picaddtime;
    }

    public void setPicaddtime(Date picaddtime) {
        this.picaddtime = picaddtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getPiccontent() {
        return piccontent;
    }

    public void setPiccontent(String piccontent) {
        this.piccontent = piccontent == null ? null : piccontent.trim();
    }
}