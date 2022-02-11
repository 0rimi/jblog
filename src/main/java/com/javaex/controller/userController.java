package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String login(@ModelAttribute UserVo userVo,
						HttpSession session,
						Model model) {
		System.out.println("userController.login");
		
		//받은 userVo(id,password) 넣으면 인증받은 유저라고 정보주는 메소드
		UserVo authUser = userService.login(userVo);
		
		//로그인 성공, 실패
		if(authUser != null) {
			System.out.println("로그인성공");
			
			//세션에 저장
			session.setAttribute("authUser", authUser);
			
			//리다이렉트
			return "redirect:/";
		}else {
			System.out.println("로그인실패");
			
			String result = "fail";
			model.addAttribute("result", result);
			
			return "redirect:/user/loginForm";
		}
	}
	

	
}
