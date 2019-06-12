package com.bridgelabz.fundoo.utility;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Component;

import com.bridgelabz.fundoo.model.Email;

@Component
public class MailService {

	
	private JavaMailSender javaMailSender;

	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void send(Email email) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email.getTo());
		mail.setSubject(email.getSub());
		mail.setText(email.getBody());

		javaMailSender.send(mail);
		System.out.println("Mail send successfully...");

	}

}
