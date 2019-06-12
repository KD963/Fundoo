package com.bridgelabz.fundoo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String userid;
//	@NotNull
//	@NotEmpty(message = "name should not be empty")
	private String name;

//	@NotNull
//	@NotEmpty(message = "email id should not be empty")
	private String emailid;
//	@NotNull
//	@NotEmpty(message = "phone number should not be empty")
	private String phone;
//	@NotNull
//	@NotEmpty(message = "password should not be empty")
	private String password;

	private String token;

	private boolean isVerify;

	public User() {
		super();
	}

	public User(String userid, String name, String emailid, String phone, String password, String token,
			boolean isVerify) {
		super();
		this.userid = userid;
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.password = password;
		this.token = token;
		this.isVerify = isVerify;
	}

	public boolean isVerify() {
		return isVerify;
	}

	public void setVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", emailid=" + emailid + ", phone=" + phone + ", password="
				+ password + ", token=" + token + ", isVerify=" + isVerify + "]";
	}


}
