package com.ngemobi.mapper;

import com.ngemobi.bean.User;

public interface RegistMapper {
	
	/**
	 * 添加用户
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * 查询用户
	 * @param username
	 * @return
	 */
	User selectUser(String username);
}
