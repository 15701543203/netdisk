package com.ngemobi.service;

/**
 * ��¼�ӿ�
 * 
 * @Author user
 *
 * @Date 2017��12��24��
 */
public interface LoginService {
	/**
	 * ʹ���û����������¼
	 * @param username
	 * @param password
	 * @return json�е�����
	 */
	String getUserInfo(String username, String password);

}
