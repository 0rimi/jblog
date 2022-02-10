package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {

	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("userController.loginForm");
	
		return "user/loginForm";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("userController.login");
	
		return "";
	}
	
	@RequestMapping("/joinForm")
	public String joinForm() {
		System.out.println("userController.joinForm");
	
		return "user/joinForm";
	}
	
	@RequestMapping("/join")
	public String join() {
		System.out.println("userController.join");
	
		return "";
	}
	
}
