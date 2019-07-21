package com.wmx.op.service;

import java.util.List;

import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;

public interface UservideoService {
	//按id查询视频
	public Uservideo findvideoByID(int videoid)throws Exception;
	//查询视频总数
	public int findcount(UservideoExample example)throws Exception;
	//分页查询视频
	public List<Uservideo> findvideBypage(UservideoCustom uservideoCustom)throws Exception;
	
	public int findvideochange(Uservideo video)throws Exception;
}
