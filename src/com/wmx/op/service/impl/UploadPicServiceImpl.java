package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.PictureMapper;
import com.wmx.op.mapper.PicturedetailMapper;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;
import com.wmx.op.po.Picturedetail;
import com.wmx.op.po.Uservideo;
import com.wmx.op.service.UploadPicService;

public class UploadPicServiceImpl implements UploadPicService {
	@Autowired
	private PictureMapper pictureMapper;
	@Autowired
	private PicturedetailMapper picturedetailMapper;
	
	public int insertPic(Picture picture) throws Exception {
		return pictureMapper.insertSelective(picture);
	}

	public int insertPicDetail(Picturedetail picturedetail) throws Exception {
		return picturedetailMapper.insertSelective(picturedetail);
	}
	//分页查询
	public List<Picture> selectbyId(PictureCustom pictureCustom)
			throws Exception {
		return pictureMapper.selectByPage(pictureCustom);
	}
	//查询总数
	public int getTotalpage(Picture picture) throws Exception {
		return pictureMapper.selectPage(picture);
	}

	public Uservideo findPictureByid(Integer videoid) throws Exception {
		return null;
	}

	public int delPictureByid(Integer videoid) throws Exception {
		return 0;
	}


}
