package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
	
	@RequestMapping("/test")
	public String test2() {
		System.out.println("test");
		
		return "/WEB-INF/views/test.jsp";
	}

}
