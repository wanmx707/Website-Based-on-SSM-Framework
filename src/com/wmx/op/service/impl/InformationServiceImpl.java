package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.InformationMapper;
import com.wmx.op.po.Information;
import com.wmx.op.po.InformationCustom;
import com.wmx.op.po.InformationExample;
import com.wmx.op.service.InformationService;

public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationMapper informationMapper;
	//查询单个资讯
	public Information findInforByid(Integer inforid) throws Exception {
		return informationMapper.selectByPrimaryKey(inforid);
	}
	//查询页数
	public int findcount(InformationExample example) throws Exception {
		return informationMapper.countByExample(example);
	}
	//分页查询
	public List<Information> findInforByPage(InformationCustom informationCustom)
			throws Exception {
		return informationMapper.selectByPage(informationCustom);
	}
	//写情报
	public int insertInform(Information infor) throws Exception {
		return informationMapper.insertSelective(infor);
	}
	//按id修改情报
	public int updateInformByid(Information infor) throws Exception {
		return informationMapper.updateByPrimaryKeySelective(infor);
	}
	//按id删除情报
	public int delInformByid(Integer id) throws Exception {
		return informationMapper.deleteByPrimaryKey(id);
	}

}
