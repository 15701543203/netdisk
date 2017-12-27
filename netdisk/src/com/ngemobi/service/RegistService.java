package com.ngemobi.service;

import com.ngemobi.bean.User;

/**
 * 注冊接口
 * @Author user
 *
 * @Date 2017年12月24日
 */
public interface RegistService {
	
	/**
	 * 使用用户名去查询该用户是否注册
	 * @param username
	 * @param password
	 * @return
	 */
	String serachUserInfo(String username);
	
	/**
	 * 用户注册
	 * @param user
	 */
	String addUser(User user);
	
	
}
