package com.wmx.op.po;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Information implements Serializable{
    private Integer inforid;

    @NotBlank(message ="{inform.title.isNUll}")
    private String infortitle;

    private Date inforaddtime;

    @NotBlank(message ="{inform.content.isNUll}")
    private String inforcontent;

    public Integer getInforid() {
        return inforid;
    }

    public void setInforid(Integer inforid) {
        this.inforid = inforid;
    }

    public String getInfortitle() {
        return infortitle;
    }

    public void setInfortitle(String infortitle) {
        this.infortitle = infortitle == null ? null : infortitle.trim();
    }

    public Date getInforaddtime() {
        return inforaddtime;
    }

    public void setInforaddtime(Date inforaddtime) {
        this.inforaddtime = inforaddtime;
    }

    public String getInforcontent() {
        return inforcontent;
    }

    public void setInforcontent(String inforcontent) {
        this.inforcontent = inforcontent == null ? null : inforcontent.trim();
    }
}