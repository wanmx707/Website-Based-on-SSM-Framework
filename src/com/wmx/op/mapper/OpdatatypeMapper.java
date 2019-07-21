package com.wmx.op.mapper;

import com.wmx.op.po.Opdatatype;
import com.wmx.op.po.OpdatatypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpdatatypeMapper {
    int countByExample(OpdatatypeExample example);

    int deleteByExample(OpdatatypeExample example);

    int deleteByPrimaryKey(Integer opdatatypeid);

    int insert(Opdatatype record);

    int insertSelective(Opdatatype record);

    List<Opdatatype> selectByExample(OpdatatypeExample example);

    Opdatatype selectByPrimaryKey(Integer opdatatypeid);
    
    List<Opdatatype> findopdataList();

    int updateByExampleSelective(@Param("record") Opdatatype record, @Param("example") OpdatatypeExample example);

    int updateByExample(@Param("record") Opdatatype record, @Param("example") OpdatatypeExample example);

    int updateByPrimaryKeySelective(Opdatatype record);

    int updateByPrimaryKey(Opdatatype record);
}