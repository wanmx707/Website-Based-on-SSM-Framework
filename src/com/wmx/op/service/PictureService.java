package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;

public interface PictureService {
	
	public int getTotalpage(Picture picture)throws Exception;
	
	public List<Picture> selectbyId(PictureCustom pictureCustom)throws Exception;
	//图片列表
	public int selectcount(PictureExample example)throws Exception;
	//查询所有图片
	public List<Picture> selectPicList(PictureCustom pictureCustom)throws Exception;
	//查询单个图集
	public Picture findPictureOne(Integer id)throws Exception;
	//更新图集信息
	public int updatePicture(Picture pic)throws Exception;
	
}
