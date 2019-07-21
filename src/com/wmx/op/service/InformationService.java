package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Information;
import com.wmx.op.po.InformationCustom;
import com.wmx.op.po.InformationExample;

public interface InformationService {
	//查询单个资讯
	public Information findInforByid(Integer inforid)throws Exception;
	//查询总数
	public int findcount(InformationExample example)throws Exception;
	//分页查询
	public List<Information> findInforByPage(InformationCustom informationCustom)throws Exception;
	//写情报
	public int insertInform(Information infor)throws Exception;
	//修改情报
	public int updateInformByid(Information infor)throws Exception;
	//删除情报
	public int delInformByid(Integer id)throws Exception;
}
