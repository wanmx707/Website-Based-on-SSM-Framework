package com.wmx.op.mapper;

import com.wmx.op.po.News;
import com.wmx.op.po.NewsCustom;
import com.wmx.op.po.NewsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);
    //首页
    List<News> selectByIndex(NewsExample example);

    News selectByPrimaryKey(Integer newsid);
    //分页查询
    List<News> selectByPage(NewsCustom newsCustom);
    //用户分页查询
    List<News> findUserNewsbyPage(NewsCustom newsCustom);
    //审核分页
    List<News> findNewsstatusbyPage(NewsCustom newsCustom);
    //举报分页
    List<News> findNewsstatusbyPageByJubao(NewsCustom newsCustom);
    //未审核总数
    int countBystatus();

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}