package com.shu.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private Integer id;//用户id
	private String username;//用户姓名
	private String telephone;//用户电话
	private String password;//用户密码
	private Date birthday;//用户生日

	public User() {
		super();
	}

	public User(Integer id, String username, String telephone, String password, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.telephone = telephone;
		this.password = password;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
