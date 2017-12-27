package com.ngemobi.service;

/**
 * 登录接口
 * 
 * @Author user
 *
 * @Date 2017年12月24日
 */
public interface LoginService {
	/**
	 * 使用用户名和密码登录
	 * @param username
	 * @param password
	 * @return json中的数据
	 */
	String getUserInfo(String username, String password);

}
