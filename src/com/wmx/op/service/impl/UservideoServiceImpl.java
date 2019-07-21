package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.UservideoMapper;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.UservideoService;

public class UservideoServiceImpl implements UservideoService {
	@Autowired
	private UservideoMapper uservideoMapper;
	//查询用户上传的视频
	public Uservideo findvideoByID(int videoid) throws Exception {
		return uservideoMapper.selectByPrimaryKey(videoid);
	}
	//查询总数
	public int findcount(UservideoExample example) throws Exception {
		return uservideoMapper.countByExample(example);
	}
	//分页查询视频
	public List<Uservideo> findvideBypage(UservideoCustom uservideoCustom)
			throws Exception {
		return uservideoMapper.selectvideoList(uservideoCustom);
	}
	//修改视频信息
	public int findvideochange(Uservideo video) throws Exception {
		return uservideoMapper.updateByPrimaryKeySelective(video);
	}
	

}
