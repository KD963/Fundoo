package com.bridgelabz.fundoo.Dto;

public class LoginDTO {

	private String emailid;
	private String password;

	public LoginDTO() {

	}

	public LoginDTO(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [emailid=" + emailid + ", password=" + password + "]";
	}

}
