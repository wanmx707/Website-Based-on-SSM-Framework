package com.wmx.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.UservideoMapper;
import com.wmx.op.po.Uservideo;
import com.wmx.op.po.UservideoCustom;
import com.wmx.op.po.UservideoExample;
import com.wmx.op.service.UploadService;

public class UploadServiceImpl implements UploadService {
	@Autowired
	private UservideoMapper uservideoMapper;

	//上传视频
	public int uploadvideo(Uservideo uservideo) throws Exception {
		return uservideoMapper.insertSelective(uservideo);
	}
	//视频分页查询
	public List<Uservideo> uploadList(UservideoCustom uservideoCustom)
			throws Exception {
		return uservideoMapper.selectByPage(uservideoCustom);
	}
	//计算条数
	public int getTotalpage(Uservideo uservideo) throws Exception {
		return uservideoMapper.selectPage(uservideo);
	}
	//查看视频
	public Uservideo findvideoByid(Integer videoid) throws Exception {
		return uservideoMapper.selectByPrimaryKey(videoid);
	}
	//按ID删除视频
	public int delvideoByid(Integer videoid) throws Exception {
		return uservideoMapper.deleteByPrimaryKey(videoid);
	}

}