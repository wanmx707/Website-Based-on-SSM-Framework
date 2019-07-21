package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.PictureMapper;
import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;
import com.wmx.op.service.PictureService;

public class PictureServiceImpl implements PictureService {
	@Autowired
	private PictureMapper pictureMapper;

	public int getTotalpage(Picture picture) throws Exception {
		return pictureMapper.selectPage(picture);
	}
	public List<Picture> selectbyId(PictureCustom pictureCustom)
			throws Exception {
		return pictureMapper.selectByPage(pictureCustom);
	}
	//图片列表
	public int selectcount(PictureExample example) throws Exception {
		return pictureMapper.countByExample(example);
	}
	//查询所有图片
	public List<Picture> selectPicList(PictureCustom pictureCustom) throws Exception {
		return pictureMapper.selectByPictureCustom(pictureCustom);
	}
	//查询单个图集
	public Picture findPictureOne(Integer picid) throws Exception {
		return pictureMapper.findPicDetail(picid);
	}
	//更新图集信息
	public int updatePicture(Picture pic) throws Exception {
		return pictureMapper.updateByPrimaryKeySelective(pic);
	}
}
