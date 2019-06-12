package com.bridgelabz.fundoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.Dto.LoginDTO;
import com.bridgelabz.fundoo.Dto.UserDTO;
import com.bridgelabz.fundoo.model.User;
import com.bridgelabz.fundoo.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping("/register")
	public User registerUser(@RequestBody UserDTO userDTO) {
		return userServiceImpl.registerUser(userDTO);
	}

	@PostMapping("/login")
	public LoginDTO login(@RequestBody LoginDTO loginDTO) {
		return userServiceImpl.loginUser(loginDTO);
	}

	@GetMapping("verify/{token}")
	public String verify(@RequestHeader String token) {

		return userServiceImpl.mailValidation(token);

	}
}
