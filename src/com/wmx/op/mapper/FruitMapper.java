package com.wmx.op.mapper;

import com.wmx.op.po.Fruit;
import com.wmx.op.po.FruitCustom;
import com.wmx.op.po.FruitExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FruitMapper {
    int countByExample(FruitExample example);

    int deleteByExample(FruitExample example);

    int deleteByPrimaryKey(Integer fruitid);

    int insert(Fruit record);

    int insertSelective(Fruit record);

    List<Fruit> selectByExampleWithBLOBs(FruitExample example);

    List<Fruit> selectByExample(FruitExample example);
    //管理分页查询
    List<Fruit> selectFruitBypage(FruitCustom custom);
 
    Fruit selectByPrimaryKey(Integer fruitid);

    int updateByExampleSelective(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByExampleWithBLOBs(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByExample(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByPrimaryKeySelective(Fruit record);

    int updateByPrimaryKeyWithBLOBs(Fruit record);

    int updateByPrimaryKey(Fruit record);
}