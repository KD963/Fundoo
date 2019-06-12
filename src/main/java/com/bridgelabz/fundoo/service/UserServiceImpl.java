package com.bridgelabz.fundoo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bridgelabz.fundoo.Dto.ForgotDTO;
import com.bridgelabz.fundoo.Dto.LoginDTO;
import com.bridgelabz.fundoo.Dto.UserDTO;
import com.bridgelabz.fundoo.model.Email;
import com.bridgelabz.fundoo.model.User;
import com.bridgelabz.fundoo.repository.UserRepository;
import com.bridgelabz.fundoo.utility.MailService;
import com.bridgelabz.fundoo.utility.TokenUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	Email email = new Email();

	@Autowired
	private MailService mailservice;

	@Autowired
	private ModelMapper mapper;

	@Override
	public User registerUser(UserDTO userDTO) {

		boolean isEmail = userRepository.findByEmailid(userDTO.getEmailid()).isPresent();
		System.err.println(isEmail);
		User user = mapper.map(userDTO, User.class);
		if (!isEmail) {

			userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));

			User us = userRepository.save(user);
			System.out.println("us " + us);
			String token = TokenUtil.generateToken(user.getUserid());
			System.out.println("token " + token);
			System.err.println(user);
			user.setToken(token);
			email.setTo(user.getEmailid());
			email.setSub("Verification mail");
			email.setBody("http://localhost:8080/verification/" + user.getToken());
			mailservice.send(email);
			// String verify = email.getBody();

			System.out.println("valid");

		} else {
			System.out.println("invalid");

		}

		return userRepository.save(user);

	}

	public String mailValidation(String token) {
		String id = TokenUtil.verifyToken(token);
		Optional<User> optUser = userRepository.findById(id);
		if (optUser.isPresent()) {
			// user.setisverify(true);
			optUser.get().setToken(token);
			optUser.get().setVerify(true);

			userRepository.save(optUser.get());

			// user.userReposty save user object
			System.out.println("verify");;
		} else {

			System.out.println("not verify");;
		}
		return " ";
		
	}

	@Override
	public LoginDTO loginUser(LoginDTO loginDTO) {

		String email = loginDTO.getEmailid();
		loginDTO.setEmailid(email);

		Optional<User> optionalUser = userRepository.findByEmailid(email);
		User user = optionalUser.get();

		userRepository.save(user);
		return loginDTO;
	}

	@Override
	public ForgotDTO forgot(ForgotDTO forgotDTO) {

		return null;
	}

}
