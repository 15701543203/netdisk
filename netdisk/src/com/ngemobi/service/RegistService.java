package com.ngemobi.service;

import com.ngemobi.bean.User;

/**
 * ע�Խӿ�
 * @Author user
 *
 * @Date 2017��12��24��
 */
public interface RegistService {
	
	/**
	 * ʹ���û���ȥ��ѯ���û��Ƿ�ע��
	 * @param username
	 * @param password
	 * @return
	 */
	String serachUserInfo(String username);
	
	/**
	 * �û�ע��
	 * @param user
	 */
	String addUser(User user);
	
	
}
