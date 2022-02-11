package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	//회원가입
	public int insert(UserVo userVo) {
		System.out.println("UserDao.insert()");
		
		int count = sqlSession.insert("user.insert", userVo); 
		System.out.println(count+"건이 저장되었습니다.");
		System.out.println(userVo);
		
		return count;
	}
	
	//로그인:id,password 입력시 회원정보 출력
	public UserVo login(UserVo userVo) {
		System.out.println("UserDao.login()");
		
		UserVo authUser =  sqlSession.selectOne("user.selectUser", userVo);
		
		return authUser; 
	}

}
