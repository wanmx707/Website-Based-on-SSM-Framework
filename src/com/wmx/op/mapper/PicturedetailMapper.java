package com.wmx.op.mapper;

import com.wmx.op.po.Picturedetail;
import com.wmx.op.po.PicturedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicturedetailMapper {
    int countByExample(PicturedetailExample example);

    int deleteByExample(PicturedetailExample example);

    int deleteByPrimaryKey(Integer picdetailid);

    int insert(Picturedetail record);

    int insertSelective(Picturedetail record);

    List<Picturedetail> selectByExample(PicturedetailExample example);

    Picturedetail selectByPrimaryKey(Integer picdetailid);

    int updateByExampleSelective(@Param("record") Picturedetail record, @Param("example") PicturedetailExample example);

    int updateByExample(@Param("record") Picturedetail record, @Param("example") PicturedetailExample example);

    int updateByPrimaryKeySelective(Picturedetail record);

    int updateByPrimaryKey(Picturedetail record);
}