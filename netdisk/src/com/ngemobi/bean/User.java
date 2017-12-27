package com.ngemobi.bean;

/**
 * 用户类
 * @Author user
 *
 * @Date 2017年12月24日
 */
public class User {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 重复密码，用于注册时校验
	 */
	private String repassword;
	/**
	 * 邮箱
	 */
	private String mail;
	/**
	 * 手机号
	 */
	private String phone;

	public User() {
		super();
	}

	public User(int id, String username, String password, String repassword, String mail, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.mail = mail;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", repassword=" + repassword
				+ ", mail=" + mail + ", phone=" + phone + "]";
	}

	

}
