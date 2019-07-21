package com.wmx.op.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.PicturedetailMapper;
import com.wmx.op.service.PictureDetailService;

public class PictureDetailServiceImpl implements PictureDetailService {
	@Autowired
	private PicturedetailMapper PicturedetailMapper;
 	//删除单张图片
	public int delPicDetail(Integer picid) throws Exception {
		return PicturedetailMapper.deleteByPrimaryKey(picid);
	}

}
