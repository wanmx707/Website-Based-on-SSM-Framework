package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;

public interface UploadService {
	//上传视频
	public int uploadvideo(Uservideo uservideo)throws Exception;
	//上传视频列表
	public List<Uservideo> uploadList(UservideoCustom uservideoCustom)throws Exception;
	//计算条数
	public int getTotalpage(Uservideo uservideo)throws Exception;
	//按ID查看视频
	public Uservideo findvideoByid(Integer videoid)throws Exception;
	//按ID删除视频
	public int delvideoByid(Integer videoid)throws Exception;
	
}
