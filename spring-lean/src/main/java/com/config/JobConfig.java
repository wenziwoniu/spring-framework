package com.config;

import com.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfig {

	@Bean
	public UserDao userDao() {
		return new UserDao();
	}
}
