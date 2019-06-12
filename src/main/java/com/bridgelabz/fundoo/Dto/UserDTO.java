package com.bridgelabz.fundoo.Dto;

public class UserDTO {

	private String name;
	private String emailid;
	private String phoneNumber;
	private String password;

	public UserDTO() {

	}

	public UserDTO(String name, String emailid, String phoneNumber, String password) {
		
		super();
		this.name = name;
		this.emailid = emailid;
		this.phoneNumber = phoneNumber;
		this.password = password;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", emailid=" + emailid + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}

}
