package com.wmx.op.po;

public class Picturedetail {
    private Integer picdetailid;

    private Integer picid;

    private String picway;

    public Integer getPicdetailid() {
        return picdetailid;
    }

    public void setPicdetailid(Integer picdetailid) {
        this.picdetailid = picdetailid;
    }

    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    public String getPicway() {
        return picway;
    }

    public void setPicway(String picway) {
        this.picway = picway == null ? null : picway.trim();
    }
}