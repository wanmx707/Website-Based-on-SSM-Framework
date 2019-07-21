package com.wmx.op.po;

import java.util.Date;

public class Opdata {
    private Integer opdataid;

    private Integer opdatatypeid;

    private String titleopdata;

    private String opdatapic;

    private Date addtime;

    private String uuid;

    private String content;

    public Integer getOpdataid() {
        return opdataid;
    }

    public void setOpdataid(Integer opdataid) {
        this.opdataid = opdataid;
    }

    public Integer getOpdatatypeid() {
        return opdatatypeid;
    }

    public void setOpdatatypeid(Integer opdatatypeid) {
        this.opdatatypeid = opdatatypeid;
    }

    public String getTitleopdata() {
        return titleopdata;
    }

    public void setTitleopdata(String titleopdata) {
        this.titleopdata = titleopdata == null ? null : titleopdata.trim();
    }

    public String getOpdatapic() {
        return opdatapic;
    }

    public void setOpdatapic(String opdatapic) {
        this.opdatapic = opdatapic == null ? null : opdatapic.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}