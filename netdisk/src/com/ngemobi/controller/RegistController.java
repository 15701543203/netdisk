package com.ngemobi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ngemobi.bean.User;
import com.ngemobi.service.RegistService;
import com.ngemobi.utils.JsonToMap;

@Controller
@RequestMapping("/regist")
public class RegistController {
	
	@Autowired
	private RegistService registService;
	
	/**
	 * У��ķ��� ͨ���û����Ͳ�ѯ���û��Ƿ��Ѿ�ע��
	 * @param data
	 * @return
	 */
	public String checktUser(String data){
		//System.out.println(data);
		//���ù����ཫjosn����ת��Ϊmap
		Map<String, String> map = JsonToMap.parseData(data);
		String username = map.get("username");
		//�û�����Ϊ��ѯ��������ѯ���û��Ƿ����
		String s = registService.serachUserInfo(username);
		return s;
	}
	
	
	@RequestMapping(value="regist",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String registUser(@RequestBody String data){
		//json����ת��Ϊmap
		Map<String, String>map = JsonToMap.parseData(data);
		String username = map.get("username");
		String password = map.get("password");
		String repassword = map.get("repassword");
		String mail = map.get("mail");
		String phone = map.get("phone");
		//ͨ��key�õ�ֵ�Ѷ�Ӧ�����������װ��user��
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRepassword(repassword);
		user.setMail(mail);
		user.setPhone(phone);
		//System.out.println(phone);
		//����У��ķ���
		String s = checktUser(data);
		if(s.contains("���û�������")){
			//���ע���û�
			String addStatu = registService.addUser(user);
			System.out.println(addStatu);
			return addStatu;
		}else{
			return s;
		}
	}
}
