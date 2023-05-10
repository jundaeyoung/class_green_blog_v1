package com.tenco.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerTest {
	
	@GetMapping("/temp")
	public String tempPage() {
//		prefix: /WEB-INF/view
//		suffix: .jsp
		return "/temp";
	}
}
