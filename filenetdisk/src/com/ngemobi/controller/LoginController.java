package com.ngemobi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ngemobi.bean.User;
import com.ngemobi.service.LoginService;

/**
 * 用户登陆
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController{
	@Autowired
	private LoginService loginService;
	
	
	
	/**
	 * 登录
	 * @param username 用户名 
	 * @param password 密码
	 * @param response response
	 * @return 返回的json数据   
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public String login(String username,String password,HttpServletResponse response){
		Map<String,Object> map = new HashMap<String,Object>();
		//登录结果反馈
		String result = "";
		// status ==0 失败  1 成功
		String status = "";
		// 用户名密码不能为空
		if(null != username && !username.equals("")&&null != password && !password.equals("")){
			try {
				User user= loginService.getUserInfo(username, password);
				if(null != user){
					// 正确的信息
					result = "ok";
					status = "1";
				}else{
					result="没有该用户信息";
					status = "0";
				}
			} catch (Exception e) {
				result = "未知错误！";
				status = "0";
				e.printStackTrace();
			}
		}else{
			result = "用户名密码不能为空";
			status="0";
		}
		
		
		map.put("result",result);
		map.put("status",status);
		Gson gson = new Gson();
		System.out.println(gson.toJson(map));
		//jsonResponse(gson.toJson(map),response);
		return gson.toJson(map);
		
	}
	
	
}
