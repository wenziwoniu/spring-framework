package com.config;

import com.selfdefine.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillJob {

	@Bean
	public UserDao userDao() {
		return new UserDao();
	}
}
