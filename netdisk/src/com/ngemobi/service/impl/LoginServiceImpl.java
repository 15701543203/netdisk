package com.ngemobi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.ngemobi.bean.User;
import com.ngemobi.mapper.LoginMapper;
import com.ngemobi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public String getUserInfo(String username, String password) {
//		System.out.println(username);
//		System.out.println(password);
		//使用用户名和密码查询该用户是否在数据库中村咋
		User user = loginMapper.selectUserInfo(username, password);
		//System.out.println(user);
		//把需要返回的状态存到map当中方便使用工具转换为json
		Map<String, String> map = new HashMap<String, String>();
		Gson gson = new Gson();
		// String status = null;
		// String result = null;
		if (user != null) {

			// 如果客户传进来的参数不为null或者不是空字符串
			if (username != null && !username.equals("") && password != null && !password.equals("")) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					// 登录成功
					// result = "登录成功";
					// status = "200";
					map.put("resutl", "登录成功");
					map.put("status", "200");
					return gson.toJson(map);
				} else {
					// 用户名或密码错误
					// result = "用户名或密码错误";
					// status = "400";
					map.put("resutl", "用户名或密码错误");
					map.put("status", "400");
					return gson.toJson(map);
				}

			} else {
				// 返回用户名密码不能为空
				// result = "error";
				// status = "400";
				map.put("resutl", "error");
				map.put("status", "400");
				return gson.toJson(map);
			}

		}
		map.put("resutl", "该用户没有注册");
		map.put("status", "400");
		return gson.toJson(map);
	}
}