package com.wmx.op.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.ComicsMapper;
import com.wmx.op.mapper.ComicsdetailMapper;
import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsCustom;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.po.Comicsdetail;
import com.wmx.op.service.ComicsService;

public  class ComicsServiceImpl implements ComicsService {
	@Autowired
	private ComicsMapper comicsMapper;
	@Autowired
	private ComicsdetailMapper comicsdetailMapper;

	public List<Comics> findComics(ComicsExample comics) throws Exception {
		return comicsMapper.selectByExample(comics);
	}
	
	public Comics findComicsDetail(int comicsid)throws Exception{
		return comicsMapper.findComicsDetail(comicsid);
	}

	//上传漫画信息
	public int insertcomics(Comics comics) throws Exception {
		return comicsMapper.insertSelective(comics);
	}

	//上传漫画详细
	public int insertcomicsDetail(Comicsdetail comicsdetail) throws Exception {
		return comicsdetailMapper.insertSelective(comicsdetail);
	}

	//管理查询漫画数目
	public int selectComicsCount(ComicsExample example) throws Exception {
		return comicsMapper.countByExample(example);
	}

	//漫画分页查询
	public List<Comics> selectComicsPgae(ComicsCustom comicsCustom)
			throws Exception {
		return comicsMapper.selectComicsManageByPage(comicsCustom);
	}

	//按id删除漫画
	public int delComicsByid(Integer comicsid) throws Exception {
		return comicsMapper.deleteByPrimaryKey(comicsid);
	}
}
