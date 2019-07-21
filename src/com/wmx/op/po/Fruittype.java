package com.wmx.op.po;

import java.util.List;

public class Fruittype {
    private Integer fruittypeid;

    private String fruittype;

    private List<Fruit> fruitList;
    public List<Fruit> getFruitList() {
		return fruitList;
	}

	public void setFruitList(List<Fruit> fruitList) {
		this.fruitList = fruitList;
	}

	public Integer getFruittypeid() {
        return fruittypeid;
    }

    public void setFruittypeid(Integer fruittypeid) {
        this.fruittypeid = fruittypeid;
    }

    public String getFruittype() {
        return fruittype;
    }

    public void setFruittype(String fruittype) {
        this.fruittype = fruittype == null ? null : fruittype.trim();
    }
}