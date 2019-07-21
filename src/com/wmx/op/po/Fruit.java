package com.wmx.op.po;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Fruit {
    private Integer fruitid;

    private Integer fruittypeid;
    
    @NotBlank(message ="{fruit.title.isNUll}")
    private String title;

    private Date addtime;

    private String uuid;

    @NotBlank(message ="{fruit.content.isNUll}")
    private String content;

    public Integer getFruitid() {
        return fruitid;
    }

    public void setFruitid(Integer fruitid) {
        this.fruitid = fruitid;
    }

    public Integer getFruittypeid() {
        return fruittypeid;
    }

    public void setFruittypeid(Integer fruittypeid) {
        this.fruittypeid = fruittypeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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