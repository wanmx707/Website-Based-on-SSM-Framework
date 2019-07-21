package com.wmx.op.mapper;

import com.wmx.op.po.Opdata;
import com.wmx.op.po.OpdataCustom;
import com.wmx.op.po.OpdataExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OpdataMapper {
    int countByExample(OpdataExample example);

    int deleteByExample(OpdataExample example);

    int deleteByPrimaryKey(Integer opdataid);

    int insert(Opdata record);

    int insertSelective(Opdata record);

    List<Opdata> selectByExampleWithBLOBs(OpdataExample example);

    List<Opdata> selectByExample(OpdataExample example);

    List<Opdata> selectOpdataByPage(OpdataCustom custom);
    
    Opdata selectByPrimaryKey(Integer opdataid);

    int updateByExampleSelective(@Param("record") Opdata record, @Param("example") OpdataExample example);

    int updateByExampleWithBLOBs(@Param("record") Opdata record, @Param("example") OpdataExample example);

    int updateByExample(@Param("record") Opdata record, @Param("example") OpdataExample example);

    int updateByPrimaryKeySelective(Opdata record);

    int updateByPrimaryKeyWithBLOBs(Opdata record);

    int updateByPrimaryKey(Opdata record);
}