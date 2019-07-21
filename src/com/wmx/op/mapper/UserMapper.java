package com.wmx.op.mapper;

import com.wmx.op.po.User;
import com.wmx.op.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(Integer userid);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(Integer userid);

	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserExample example);

	int updateByExample(@Param("record") User record,
			@Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	// 登录findUserlogin
	User findUserlogin(User user);

	// 查询邮箱是否存在
	int selectbyemial(User user);

	// 查询邮箱是否存在
	int selectByUsername(User user);
	
	//根据邮箱查询用户id
	int findIdByEmail(User user);
}