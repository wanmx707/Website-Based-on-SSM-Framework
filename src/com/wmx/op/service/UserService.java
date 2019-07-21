package com.wmx.op.service;

import com.wmx.op.po.User;
import com.wmx.op.po.UserExample;
import com.wmx.op.po.Uservideo;

public interface UserService {
	//用户注册
	public int insertUser(User user)throws Exception;
	//用户登录
	public User findUserLogin(User user)throws Exception;
	//根据Id查询用户信息
	public User findUserInfor(Integer userid)throws Exception;
	//修改用户信息
	public int changeUserInfor(User user)throws Exception;
	//修改密码
	public int changePassword(User user)throws Exception;
	//上传视频
	public int uploadvideo(Uservideo uservideo)throws Exception;
	//查询邮箱是否被注册
	public int findmailis(User user)throws Exception;
	//查询用户名是否被使用
	public int findUsername(User user)throws Exception;
	//用邮箱查询用户ID
	public int findIDByEmail(User user)throws Exception;
}
