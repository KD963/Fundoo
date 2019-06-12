package com.bridgelabz.fundoo.service;

import com.bridgelabz.fundoo.Dto.ForgotDTO;
import com.bridgelabz.fundoo.Dto.LoginDTO;
import com.bridgelabz.fundoo.Dto.UserDTO;
import com.bridgelabz.fundoo.model.User;

public interface UserService {

	public User registerUser(UserDTO userDTO);
	public LoginDTO loginUser(LoginDTO loginDTO);
	public ForgotDTO forgot(ForgotDTO forgotDTO); 
	
}
