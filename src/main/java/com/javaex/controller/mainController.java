package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	@RequestMapping("/")
	public String hello() {
		System.out.println("mainController.main");
		
		return "/WEB-INF/views/blog/blog-main.jsp";
	}

}
