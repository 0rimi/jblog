package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class blogController {
	
	//필드
	
	
	@RequestMapping("/{id}")
	public String blog(@PathVariable("id") String userId,
						Model model) {
		System.out.println("blogController.blog");
		
		return "blog/blog-main";
	}

}
