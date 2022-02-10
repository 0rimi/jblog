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
		System.out.println(userVo);
		System.out.println(count+"건이 저장되었습니다.");
		
		return count;

	}

}
