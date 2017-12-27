package com.ngemobi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngemobi.bean.User;
import com.ngemobi.mapper.LoginMapper;
import com.ngemobi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	@Override
	public User getUserInfo(String username, String password) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("username", username);
		map.put("password", password);
		return loginMapper.selectUser(map);
	}

}
