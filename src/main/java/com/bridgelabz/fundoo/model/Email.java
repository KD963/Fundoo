package com.bridgelabz.fundoo.model;

public class Email {

	
	private String emailid;
	private String to;
	private String sub;
	private String body;
	
	public Email() {}

	public Email(String emailid, String to, String sub, String body) {
		super();
		this.emailid = emailid;
		this.to = to;
		this.sub = sub;
		this.body = body;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
