package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Opdata;
import com.wmx.op.po.OpdataCustom;
import com.wmx.op.po.OpdataExample;
import com.wmx.op.po.Opdatatype;

public interface OpdataService {
	//查询所有资料
	public List<Opdatatype> finddatatype()throws Exception;
	//按id查询资料
	public Opdata findopdataById(Integer opdataid)throws Exception;
	//上传资料
	public int insertopdata(Opdata opdata)throws Exception;
	//管理分页查询
	public List<Opdata> selectOpdataByPage(OpdataCustom custom)throws Exception;
	//查询总数
	public int selectCount(OpdataExample example)throws Exception;
	//更新资料
	public int updateOpdataByid(Opdata opdata)throws Exception;
	//按id删除资料
	public int delOpdataByid(Integer id)throws Exception;
}
