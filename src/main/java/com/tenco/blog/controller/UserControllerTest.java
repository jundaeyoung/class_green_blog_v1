package com.tenco.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControllerTest {

	// 로그인 페이지
	@GetMapping("/loginPage")
	public String loginPage() {
		
		return "/user/login_form";
	}
	// 로그인 처리
	// 회원가입 페이지
	@GetMapping("/joinPage")
	public String joinPage() {
		
		return "/user/join_form";
	}
	// 회원가입 처리
	// 로그아웃
	
}
