package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Repository
public class UserService {
	
	//필드
	@Autowired
	private UserDao userDao;
	
	//회원가입용 : join
	public void insert(UserVo userVo) {
		System.out.println("userService.insert");
		
		//userVo를 받으면 회원가입시켜줌
		userDao.insert(userVo);
		
	}
	
	//로그인용(회원정보 주기)
	public UserVo login(UserVo userVo) {
		System.out.println("userService.login");
		
		//userVo받으면 특정정보로 회원 정보 가져다줌
		UserVo authUser = userDao.login(userVo);
		
		return authUser; 
	}
	
}
