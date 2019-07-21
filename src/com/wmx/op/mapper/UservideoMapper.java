package com.wmx.op.mapper;

import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UservideoMapper {
    int countByExample(UservideoExample example);
    
    int selectstatus();

    int deleteByExample(UservideoExample example);

    int deleteByPrimaryKey(Integer videoid);

    int insert(Uservideo record);

    int insertSelective(Uservideo record);
    
    int selectPage(Uservideo uservideo);

    List<Uservideo> selectByExampleWithBLOBs(UservideoExample example);

    List<Uservideo> selectByExample(UservideoExample example);
    
    //首页
    List<Uservideo> selectByIndex(UservideoExample example);

    Uservideo selectByPrimaryKey(Integer videoid);
    
    List<Uservideo> selectByPage(UservideoCustom uservideoCustom);
    
    List<Uservideo> selectBystatus(UservideoCustom uservideoCustom);
    
    List<Uservideo> selectvideoList(UservideoCustom uservideoCustom);

    int updateByExampleSelective(@Param("record") Uservideo record, @Param("example") UservideoExample example);

    int updateByExampleWithBLOBs(@Param("record") Uservideo record, @Param("example") UservideoExample example);

    int updateByExample(@Param("record") Uservideo record, @Param("example") UservideoExample example);

    int updateByPrimaryKeySelective(Uservideo record);

    int updateByPrimaryKeyWithBLOBs(Uservideo record);

    int updateByPrimaryKey(Uservideo record);
}