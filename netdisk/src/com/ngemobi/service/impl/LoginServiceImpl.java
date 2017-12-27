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
		//ʹ���û����������ѯ���û��Ƿ������ݿ��д�զ
		User user = loginMapper.selectUserInfo(username, password);
		//System.out.println(user);
		//����Ҫ���ص�״̬�浽map���з���ʹ�ù���ת��Ϊjson
		Map<String, String> map = new HashMap<String, String>();
		Gson gson = new Gson();
		// String status = null;
		// String result = null;
		if (user != null) {

			// ����ͻ��������Ĳ�����Ϊnull���߲��ǿ��ַ���
			if (username != null && !username.equals("") && password != null && !password.equals("")) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					// ��¼�ɹ�
					// result = "��¼�ɹ�";
					// status = "200";
					map.put("resutl", "��¼�ɹ�");
					map.put("status", "200");
					return gson.toJson(map);
				} else {
					// �û������������
					// result = "�û������������";
					// status = "400";
					map.put("resutl", "�û������������");
					map.put("status", "400");
					return gson.toJson(map);
				}

			} else {
				// �����û������벻��Ϊ��
				// result = "error";
				// status = "400";
				map.put("resutl", "error");
				map.put("status", "400");
				return gson.toJson(map);
			}

		}
		map.put("resutl", "���û�û��ע��");
		map.put("status", "400");
		return gson.toJson(map);
	}
}