package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Fruit;
import com.wmx.op.po.FruitCustom;
import com.wmx.op.po.FruitExample;
import com.wmx.op.po.Fruittype;
import com.wmx.op.po.FruittypeExample;

public interface FruitService {
	//查询果实列表
	public List<Fruittype> findFruitList()throws Exception;
	//按id查询果实信息
	public Fruit findFruitByid(Integer id)throws Exception;
	//写果实介绍
	public int insertFruit(Fruit fruit)throws Exception;
	//管理分页查询
	public List<Fruit> selectFruitBypage(FruitCustom custom)throws Exception;
	//查询总数
	public int selectCount(FruitExample example)throws Exception;
	//更新恶魔果实
	public int updateByFruit(Fruit fruit)throws Exception;
	//删除果实
	public int delFruitByid(Integer id)throws Exception;
}
