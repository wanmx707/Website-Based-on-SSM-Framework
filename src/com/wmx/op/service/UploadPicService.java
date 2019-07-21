package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Picture;
import com.wmx.op.po.PictureCustom;
import com.wmx.op.po.PictureExample;
import com.wmx.op.po.Picturedetail;
import com.wmx.op.po.Uservideo;

public interface UploadPicService {
	// 图片信息上传
	public int insertPic(Picture picture) throws Exception;

	// 图片详细上传
	public int insertPicDetail(Picturedetail picturedetail) throws Exception;

	// 查询图片列表
	public List<Picture> selectbyId(PictureCustom pictureCustom) throws Exception;

	// 计算条数
	public int getTotalpage(Picture picture) throws Exception;

	// 按ID查看视频
	public Uservideo findPictureByid(Integer videoid) throws Exception;

	// 按ID删除视频
	public int delPictureByid(Integer videoid) throws Exception;
}
