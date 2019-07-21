package com.wmx.op.mapper;

import com.wmx.op.po.Comics;
import com.wmx.op.po.ComicsCustom;
import com.wmx.op.po.ComicsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ComicsMapper {
    int countByExample(ComicsExample example);

    int deleteByExample(ComicsExample example);

    int deleteByPrimaryKey(Integer comicsid);

    int insert(Comics record);

    int insertSelective(Comics record);

    List<Comics> selectByExample(ComicsExample example);
    //首页
    List<Comics> selectByIndex(ComicsExample example);
    //查询所有漫画不用了
    List<Comics> selectAllComics();
    //查询单个漫画
    Comics findComicsDetail(Integer comicsid);
    //插入信息返回id
    //int insertComics(Comics comics);
    //管理分页查询
    List<Comics> selectComicsManageByPage(ComicsCustom comicsCustom);
    
    Comics selectByPrimaryKey(Integer comicsid);

    int updateByExampleSelective(@Param("record") Comics record, @Param("example") ComicsExample example);

    int updateByExample(@Param("record") Comics record, @Param("example") ComicsExample example);

    int updateByPrimaryKeySelective(Comics record);

    int updateByPrimaryKey(Comics record);
}