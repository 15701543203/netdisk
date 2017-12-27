package com.ngemobi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ngemobi.service.LoginService;
import com.ngemobi.utils.JsonToMap;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="login",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String usreLogin(@RequestBody String jsonData){
		System.out.println("传进来的数据是--->\n"+jsonData);
		//传进来的json通过工具类转换成map
		Map<String, String>map = JsonToMap.parseData(jsonData);
		//通过map的key获取它的值
		String username=map.get("username");
		String password=map.get("password");
		//System.out.println(username+"<--->"+password);
		//调用查询方法
		String result = loginService.getUserInfo(username, password);
			
		return result;
	}
	
	
}
