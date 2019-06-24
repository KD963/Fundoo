package com.bridgelabz.fundoo.service;

import com.bridgelabz.fundoo.Dto.LoginDTO;
import com.bridgelabz.fundoo.Dto.UserDTO;
import com.bridgelabz.fundoo.response.Response;

public interface UserService {

	String registerUser(UserDTO userDTO, StringBuffer requestUrl);

	String loginUser(LoginDTO loginDTO);

	String forgotPassword(String emailId, StringBuffer requestUrl);

	String resetPassword(String password, String token);

	String validateUser(String token);
}
