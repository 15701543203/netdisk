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
	//��һ��map��Ÿ÷��ص����ݣ�Ȼ��ʹ�ù��߽�mapת��Ϊjson
	Map<String, String>map = new HashMap<String,String>();
	Gson gson = new Gson();
	@Autowired
	private RegistMapper registMapper;

	@Override
	public String serachUserInfo(String username) {
		//ʹ��user��ô��Ϊ��ѯ�����õ�user����
		User reuser = registMapper.seltctUserByName(username);
			if(reuser!=null && reuser.getUsername().equals(username)){
				map.put("result", "���û����Ѿ�����");
				map.put("status", "400");
				return gson.toJson(map);
			}else{
				map.put("result", "���û�������");
				map.put("status", "200");
				return gson.toJson(map);
			}
	}

	@Override
	public String addUser(User user) {
		//ע���ʱ��ȷ���������������Ƿ�һ�£����һ�����
		if(user.getPassword().equals(user.getRepassword())){
			registMapper.insertUser(user);
			map.put("result", "��ӳɹ�");
			map.put("status", "200");
			return gson.toJson(map);
		}else{
			map.put("result", "���벻ƥ��");
			map.put("status", "400");
			return gson.toJson(map);
		}
	}
}
