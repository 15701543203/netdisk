package com.ngemobi.service;

import com.ngemobi.bean.User;

public interface RegistService {
	
	/**
	 * 添加注册用户
	 */
	void addUser(User user);
	
	/**
	 * 按用户名判断是否注册
	 * @param username
	 * @return user 
	 */
	User findUser(String username);
	
	
	/**
	 *注册
	 * @param user
	 * @return string 返回注册结果ok，其他值失败
	 */
	String regist(User user );
}
