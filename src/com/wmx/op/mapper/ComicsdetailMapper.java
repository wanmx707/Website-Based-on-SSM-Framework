package com.wmx.op.mapper;

import com.wmx.op.po.Comicsdetail;
import com.wmx.op.po.ComicsdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComicsdetailMapper {
    int countByExample(ComicsdetailExample example);

    int deleteByExample(ComicsdetailExample example);

    int deleteByPrimaryKey(Integer detailid);

    int insert(Comicsdetail record);

    int insertSelective(Comicsdetail record);

    List<Comicsdetail> selectByExample(ComicsdetailExample example);

    Comicsdetail selectByPrimaryKey(Integer detailid);

    int updateByExampleSelective(@Param("record") Comicsdetail record, @Param("example") ComicsdetailExample example);

    int updateByExample(@Param("record") Comicsdetail record, @Param("example") ComicsdetailExample example);

    int updateByPrimaryKeySelective(Comicsdetail record);

    int updateByPrimaryKey(Comicsdetail record);
}