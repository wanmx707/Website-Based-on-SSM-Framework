package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.OpdataMapper;
import com.wmx.op.mapper.OpdatatypeMapper;
import com.wmx.op.po.Opdata;
import com.wmx.op.po.OpdataCustom;
import com.wmx.op.po.OpdataExample;
import com.wmx.op.po.Opdatatype;
import com.wmx.op.service.OpdataService;

public class OpdataServiceImpl implements OpdataService {
	@Autowired
	private OpdatatypeMapper opdatatypeMapper;
	@Autowired
	private OpdataMapper opdataMapper;
	//查询所有资料
	public List<Opdatatype> finddatatype() throws Exception {
		return opdatatypeMapper.findopdataList();
	}

	//按id查询资料
	public Opdata findopdataById(Integer opdataid) throws Exception {
		return opdataMapper.selectByPrimaryKey(opdataid);
	}

	//上传资料
	public int insertopdata(Opdata opdata) throws Exception {
		return opdataMapper.insertSelective(opdata);
	}

	//分页查询
	public List<Opdata> selectOpdataByPage(OpdataCustom custom)
			throws Exception {
		return opdataMapper.selectOpdataByPage(custom);
	}

	//查询总数
	public int selectCount(OpdataExample example) throws Exception {
		return opdataMapper.countByExample(example);
	}

	//更新资料
	public int updateOpdataByid(Opdata opdata) throws Exception {
		return opdataMapper.updateByPrimaryKeySelective(opdata);
	}

	//按id删除资料
	public int delOpdataByid(Integer id) throws Exception {
		return opdataMapper.deleteByPrimaryKey(id);
	}

}
