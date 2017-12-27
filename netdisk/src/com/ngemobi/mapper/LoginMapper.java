package com.ngemobi.mapper;

import com.ngemobi.bean.User;

/**
 * 用户登录
 * @Author user
 *
 * @Date 2017年12月24日
 */
public interface LoginMapper {
	/**
	 * 使用用户名和密码查询user对象是否在数据库中存在
	 * @param username
	 * @param password
	 * @return user
	 */
	User selectUserInfo(String username,String password);
}
