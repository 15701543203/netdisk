package com.ngemobi.service;

import com.ngemobi.bean.User;

public interface LoginService {
	/**
	 * 获取用户信息
	 * @param username
	 * @param password
	 * @return
	 */
	User getUserInfo(String username,String password);
}
