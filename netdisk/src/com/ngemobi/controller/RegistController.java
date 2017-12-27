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
	 * 校验的方法 通过用户名和查询该用户是否已经注册
	 * @param data
	 * @return
	 */
	public String checktUser(String data){
		//System.out.println(data);
		//调用工具类将josn数据转换为map
		Map<String, String> map = JsonToMap.parseData(data);
		String username = map.get("username");
		//用户名作为查询条件，查询该用户是否存在
		String s = registService.serachUserInfo(username);
		return s;
	}
	
	
	@RequestMapping(value="regist",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String registUser(@RequestBody String data){
		//json数据转换为map
		Map<String, String>map = JsonToMap.parseData(data);
		String username = map.get("username");
		String password = map.get("password");
		String repassword = map.get("repassword");
		String mail = map.get("mail");
		String phone = map.get("phone");
		//通过key得到值把对应的数属性添封装到user中
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRepassword(repassword);
		user.setMail(mail);
		user.setPhone(phone);
		//System.out.println(phone);
		//调用校验的方法
		String s = checktUser(data);
		if(s.contains("该用户名可用")){
			//添加注册用户
			String addStatu = registService.addUser(user);
			System.out.println(addStatu);
			return addStatu;
		}else{
			return s;
		}
	}
}
