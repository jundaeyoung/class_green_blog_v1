package com.tenco.blog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tenco.blog.dto.ResponseDto;
import com.tenco.blog.model.User;
import com.tenco.blog.service.UserService;

@RestController
public class UserApiController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession session;

	@PostMapping("/api/user")
	public ResponseDto<Integer> saveUser(@RequestBody User user) {
		// 유효검사
		int result = userService.createUser(user);
		return new ResponseDto<Integer>(HttpStatus.OK, result);
	}

	@PostMapping("/api/user/login")
	public ResponseDto<?> loginUser(@RequestBody User user) {
		// 유효검사
		User principal = userService.readUser(user);
		if (principal != null) {
			session.setAttribute("principal", principal);
		}
		return new ResponseDto<Integer>(HttpStatus.OK, 1);
	}

}
