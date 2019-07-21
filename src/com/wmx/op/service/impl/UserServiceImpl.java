package com.wmx.op.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wmx.op.mapper.UserMapper;
import com.wmx.op.mapper.UservideoMapper;
import com.wmx.op.po.User;
import com.wmx.op.po.UserExample;
import com.wmx.op.po.Uservideo;
import com.wmx.op.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UservideoMapper uservideoMapper;

	public int insertUser(User user) throws Exception {
		return userMapper.insertSelective(user);
	}

	public User findUserLogin(User user)throws Exception{
		return  userMapper.findUserlogin(user);
	}
	//根据ID查询用户信息
	public User findUserInfor(Integer userid)throws Exception{
		return userMapper.selectByPrimaryKey(userid);
	}
	
	//修改用户信息
	public int changeUserInfor(User user) throws Exception {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	//修改密码
	public int changePassword(User user) throws Exception {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	//上传视频
	public int uploadvideo(Uservideo uservideo) throws Exception {
		return uservideoMapper.insertSelective(uservideo);
	}

	//查询邮箱是否被注册
	public int findmailis(User user) throws Exception {
		return userMapper.selectbyemial(user);
	}

	//查询用户名是否被使用
	public int findUsername(User user) throws Exception {
		return userMapper.selectByUsername(user);
	}

	//用邮箱查询用户ID
	public int findIDByEmail(User user) throws Exception {
		return userMapper.findIdByEmail(user);
	}

}
