package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping("/user")
public class userController {
	
	//필드
	@Autowired
	private UserService userService;
	
	
	//회원가입
	@RequestMapping("/joinForm")
	public String joinForm() {
		System.out.println("userController.joinForm");
	
		return "user/joinForm";
	}
	@RequestMapping("/join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("userController.join");
		
		//데이터값 userVo를 이용해서 회원정보 저장하는 메소드
		userService.insert(userVo);
		
		return "user/joinSuccess";
	}
	
	//로그인
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
	

	
}
