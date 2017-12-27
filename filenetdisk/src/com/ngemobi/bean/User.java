package com.ngemobi.bean;

/**
 * <h1>user  bean </h1>
 * @author jz
 * @Date 2017-12-07
 */
public class User {
	/**
	 * name
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 电话
	 */
	private String number;
	/**
	 * 邮件
	 */
	private String mail;

	public User() {
	}

	public User(String username, String password, String number, String mail) {
		this.username = username;
		this.password = password;
		this.number = number;
		this.mail = mail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", number=" + number + ", mail=" + mail + "]";
	}

}
