package com.wmx.op.po;

import java.util.List;

public class Opdatatype {
    private Integer opdatatypeid;

    private String opdatatype;

    private List<Opdata> opdatalist;
    
    public List<Opdata> getOpdatalist() {
		return opdatalist;
	}

	public void setOpdatalist(List<Opdata> opdatalist) {
		this.opdatalist = opdatalist;
	}

	public Integer getOpdatatypeid() {
        return opdatatypeid;
    }

    public void setOpdatatypeid(Integer opdatatypeid) {
        this.opdatatypeid = opdatatypeid;
    }

    public String getOpdatatype() {
        return opdatatype;
    }

    public void setOpdatatype(String opdatatype) {
        this.opdatatype = opdatatype == null ? null : opdatatype.trim();
    }
}