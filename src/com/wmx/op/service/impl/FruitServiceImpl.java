package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.FruitMapper;
import com.wmx.op.mapper.FruittypeMapper;
import com.wmx.op.po.Fruit;
import com.wmx.op.po.FruitCustom;
import com.wmx.op.po.FruitExample;
import com.wmx.op.po.Fruittype;
import com.wmx.op.po.FruittypeExample;
import com.wmx.op.service.FruitService;

public class FruitServiceImpl implements FruitService{
	@Autowired
	private FruittypeMapper fruittypeMapper;
	@Autowired
	private FruitMapper fruitMapper;
	//查看果实列表
	public List<Fruittype> findFruitList() throws Exception {
		return fruittypeMapper.selectFruitList();
	}
	//按id查询果实信息
	public Fruit findFruitByid(Integer id) throws Exception {
		return fruitMapper.selectByPrimaryKey(id);
	}
	//写果实
	public int insertFruit(Fruit fruit) throws Exception {
		return fruitMapper.insertSelective(fruit);
	}
	//管理分页查询
	public List<Fruit> selectFruitBypage(FruitCustom custom) throws Exception {
		return fruitMapper.selectFruitBypage(custom);
	}
	//查询总数
	public int selectCount(FruitExample example) throws Exception {
		return fruitMapper.countByExample(example);
	}
	//更新果实
	public int updateByFruit(Fruit fruit) throws Exception {
		return fruitMapper.updateByPrimaryKeySelective(fruit);
	}
	//删除果实
	public int delFruitByid(Integer id) throws Exception {
		return fruitMapper.deleteByPrimaryKey(id);
	}

}
