package com.ngemobi.mapper;

import com.ngemobi.bean.User;

public interface RegistMapper {
	/**
	 * ��ѯ�û����Ƿ��Ѿ�ע��
	 * @param username
	 * @return
	 */
	User seltctUserByName(String username);
	
	/**
	 * ����û�
	 * @param user
	 */
	void insertUser(User user);
	
}
