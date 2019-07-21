package com.wmx.op.mapper;

import com.wmx.op.po.Usernews;
import com.wmx.op.po.UsernewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsernewsMapper {
    int countByExample(UsernewsExample example);

    int deleteByExample(UsernewsExample example);

    int deleteByPrimaryKey(Integer usernewsid);

    int insert(Usernews record);

    int insertSelective(Usernews record);

    List<Usernews> selectByExampleWithBLOBs(UsernewsExample example);

    List<Usernews> selectByExample(UsernewsExample example);

    Usernews selectByPrimaryKey(Integer usernewsid);

    int updateByExampleSelective(@Param("record") Usernews record, @Param("example") UsernewsExample example);

    int updateByExampleWithBLOBs(@Param("record") Usernews record, @Param("example") UsernewsExample example);

    int updateByExample(@Param("record") Usernews record, @Param("example") UsernewsExample example);

    int updateByPrimaryKeySelective(Usernews record);

    int updateByPrimaryKeyWithBLOBs(Usernews record);

    int updateByPrimaryKey(Usernews record);
}