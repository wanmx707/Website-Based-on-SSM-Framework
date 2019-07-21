package com.wmx.op.mapper;

import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer picid);

    int insert(Picture record);
    //计算总数
    int selectPage(Picture picture);
    //查询分页
    List<Picture> selectByPage(PictureCustom pictureCustom);

    //图片审核
    int selectstatusPage(PictureCustom pictureCustom);
    //图片审核分页查询
    List<Picture> selectstatusByPage(PictureCustom pictureCustom);
    
    int insertSelective(Picture record);

    List<Picture> selectByExampleWithBLOBs(PictureExample example);

    List<Picture> selectByExample(PictureExample example);
    //首页
    List<Picture> selectByIndex(PictureExample example);
    //查询所有图片
    List<Picture> selectByPictureCustom(PictureCustom pictureCustom);
    
    Picture findPicDetail(Integer picid);
    
    Picture selectByPrimaryKey(Integer picid);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExampleWithBLOBs(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKeyWithBLOBs(Picture record);

    int updateByPrimaryKey(Picture record);
}