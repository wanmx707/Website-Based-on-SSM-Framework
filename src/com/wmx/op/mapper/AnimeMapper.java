package com.wmx.op.mapper;

import com.wmx.op.po.Anime;
import com.wmx.op.po.AnimeCustom;
import com.wmx.op.po.AnimeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AnimeMapper {
    int countByExample(AnimeExample example);

    int deleteByExample(AnimeExample example);

    int deleteByPrimaryKey(Integer animeid);

    int insert(Anime record);

    int insertSelective(Anime record);

    List<Anime> selectByExampleWithBLOBs(AnimeExample example);

    List<Anime> selectByExample(AnimeExample example);

    List<Anime> selectIndexAnime();
    
    List<Anime> selectASCAnime(AnimeExample example);
    //管理分页查询
    List<Anime> selectAnimeByPage(AnimeCustom animeCustom);
    
    Anime selectByPrimaryKey(Integer animeid);

    int updateByExampleSelective(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByExampleWithBLOBs(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByExample(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByPrimaryKeySelective(Anime record);

    int updateByPrimaryKeyWithBLOBs(Anime record);

    int updateByPrimaryKey(Anime record);
}