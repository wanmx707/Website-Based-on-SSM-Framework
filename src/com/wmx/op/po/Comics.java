package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comics implements Serializable{
    private Integer comicsid;

    private String comicsname;

    private Date addtime;

    private List<Comicsdetail> comicsdetail;
    
    private String uuid;

    public List<Comicsdetail> getComicsdetail() {
		return comicsdetail;
	}

	public void setComicsdetail(List<Comicsdetail> comicsdetail) {
		this.comicsdetail = comicsdetail;
	}

	public Integer getComicsid() {
        return comicsid;
    }

    public void setComicsid(Integer comicsid) {
        this.comicsid = comicsid;
    }

    public String getComicsname() {
        return comicsname;
    }

    public void setComicsname(String comicsname) {
        this.comicsname = comicsname == null ? null : comicsname.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
}