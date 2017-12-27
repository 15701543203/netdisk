package com.ngemobi.mapper;

import java.util.Map;

import com.ngemobi.bean.User;

public interface LoginMapper {
	
	/**
	 * 查询用户
	 * @param map
	 * @return
	 */
	User selectUser(Map<String,Object> map);
}
