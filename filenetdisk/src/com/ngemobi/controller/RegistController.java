package com.ngemobi.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.ngemobi.bean.User;
import com.ngemobi.service.RegistService;


/**
 * 注册
 */
@Controller
@RequestMapping("/user")
public class RegistController  {
	
	@Autowired
	private RegistService regisetService;
	
	/**
	 * 注册
	 * @param User 用户信息
	 * @param response response
	 * @return json
	 */
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public String addUser(User user,HttpServletResponse response){
		Map<String, Object>map = new HashMap<String, Object>();
		String result = "";
		String status = "";
		try {
			result = regisetService.regist(user);
			result="注册成功！";
			status="1";
		} catch (Exception e) {
			result ="注册失败！";
			status = "0";
			e.printStackTrace();
		}
		map.put("result",result);
		map.put("status",status);
		Gson gson = new Gson();
		System.out.println(gson.toJson(map));
//	jsonResponse(result,response);
		return gson.toJson(map);
	}
}
