package com.ngemobi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.ngemobi.bean.User;
import com.ngemobi.mapper.RegistMapper;
import com.ngemobi.service.RegistService;

@Service
public class RegistServiceImpl implements RegistService {
	//用一个map存放该返回的数据，然后使用工具将map转化为json
	Map<String, String>map = new HashMap<String,String>();
	Gson gson = new Gson();
	@Autowired
	private RegistMapper registMapper;

	@Override
	public String serachUserInfo(String username) {
		//使用user那么作为查询条件得到user对象
		User reuser = registMapper.seltctUserByName(username);
			if(reuser!=null && reuser.getUsername().equals(username)){
				map.put("result", "该用户名已经存在");
				map.put("status", "400");
				return gson.toJson(map);
			}else{
				map.put("result", "该用户名可用");
				map.put("status", "200");
				return gson.toJson(map);
			}
	}

	@Override
	public String addUser(User user) {
		//注册的时候确认两次密码输入是否一致，如果一致添加
		if(user.getPassword().equals(user.getRepassword())){
			registMapper.insertUser(user);
			map.put("result", "添加成功");
			map.put("status", "200");
			return gson.toJson(map);
		}else{
			map.put("result", "密码不匹配");
			map.put("status", "400");
			return gson.toJson(map);
		}
	}
}
