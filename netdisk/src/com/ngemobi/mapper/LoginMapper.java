package com.ngemobi.mapper;

import com.ngemobi.bean.User;

/**
 * �û���¼
 * @Author user
 *
 * @Date 2017��12��24��
 */
public interface LoginMapper {
	/**
	 * ʹ���û����������ѯuser�����Ƿ������ݿ��д���
	 * @param username
	 * @param password
	 * @return user
	 */
	User selectUserInfo(String username,String password);
}
