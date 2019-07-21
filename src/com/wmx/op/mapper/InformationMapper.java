package com.wmx.op.mapper;

import com.wmx.op.po.Information;
import com.wmx.op.po.InformationCustom;
import com.wmx.op.po.InformationExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface InformationMapper {
    int countByExample(InformationExample example);

    int deleteByExample(InformationExample example);

    int deleteByPrimaryKey(Integer inforid);

    int insert(Information record);

    int insertSelective(Information record);

    List<Information> selectByExampleWithBLOBs(InformationExample example);

    List<Information> selectByExample(InformationExample example);
    
    //首页
    List<Information> selectByIndex(InformationExample example);
    //分页查询
    List<Information> selectByPage(InformationCustom informationCustom);

    Information selectByPrimaryKey(Integer inforid);

    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByExampleWithBLOBs(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKeyWithBLOBs(Information record);

    int updateByPrimaryKey(Information record);
}