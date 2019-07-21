package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsCustom;
import com.wmx.op.po.ComicsExample;
import com.wmx.op.po.Comicsdetail;

public interface ComicsService {
	//查询所有漫画
	public List<Comics> findComics(ComicsExample comics) throws Exception;
	//查询单个漫画
	public Comics findComicsDetail(int id)throws Exception;
	//上传漫画信息
	public int insertcomics(Comics comics)throws Exception;
	//上传漫画详细
	public int insertcomicsDetail(Comicsdetail comicsdetail)throws Exception;
	//查询漫画数目
	public int selectComicsCount(ComicsExample example)throws Exception;
	//管理分页查询漫画
	public List<Comics> selectComicsPgae(ComicsCustom comicsCustom)throws Exception;
	//按id删除漫画
	public int delComicsByid(Integer comicsid)throws Exception;
}
