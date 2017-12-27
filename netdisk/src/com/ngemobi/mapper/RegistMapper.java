package com.ngemobi.mapper;

import com.ngemobi.bean.User;

public interface RegistMapper {
	/**
	 * 查询用户名是否已经注册
	 * @param username
	 * @return
	 */
	User seltctUserByName(String username);
	
	/**
	 * 添加用户
	 * @param user
	 */
	void insertUser(User user);
	
}
