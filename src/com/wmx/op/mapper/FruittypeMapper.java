package com.wmx.op.mapper;

import com.wmx.op.po.Fruittype;
import com.wmx.op.po.FruittypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FruittypeMapper {
    int countByExample(FruittypeExample example);

    int deleteByExample(FruittypeExample example);

    int deleteByPrimaryKey(Integer fruittypeid);

    int insert(Fruittype record);

    int insertSelective(Fruittype record);

    List<Fruittype> selectByExample(FruittypeExample example);
    
    List<Fruittype> selectFruitList();

    Fruittype selectByPrimaryKey(Integer fruittypeid);

    int updateByExampleSelective(@Param("record") Fruittype record, @Param("example") FruittypeExample example);

    int updateByExample(@Param("record") Fruittype record, @Param("example") FruittypeExample example);

    int updateByPrimaryKeySelective(Fruittype record);

    int updateByPrimaryKey(Fruittype record);
}