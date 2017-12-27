package com.ngemobi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ngemobi.bean.User;
import com.ngemobi.mapper.RegistMapper;
import com.ngemobi.service.RegistService;

@Service
public class RegistServiceImpl implements RegistService {
	@Autowired
	private RegistMapper registMapper;
	
	@Override
	public void addUser(User user) {
		registMapper.insertUser(user);

	}

	@Override
	public User findUser(String username) {
		return registMapper.selectUser(username);
	}

	@Override
	@Transactional
	public String regist(User user) {
		String result ="";
		String name = user.getUsername();
		String password = user.getPassword();
		if (!checkNull(name)){
			result ="用户名不能为空";
			return result;
		}
		if (!checkNull(password)){
			result ="密码不能为空";
			return result;
		}
		User finUser = findUser(name);
		if (null != finUser ){
			result ="用户名已存在";
			return result;
		}
		addUser(user);
		result ="ok";
		return result ;
	}
	/*null判断*/
	boolean checkNull (String str  ){
		if (str != null && !str.equals("")){
			return true;
		}else{
			return false;
		}
	}
}
