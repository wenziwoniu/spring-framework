package com.selfdefine.service;

import com.selfdefine.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;

	@Value("${name}")
	private String jdbcurl;

	public void say() {
		System.out.println("你好呀是是是");
	}
}
