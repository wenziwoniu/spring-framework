package com.selfdefine.service.impl;

import com.selfdefine.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceSecond implements UserService {
	@Override
	public String getResult() {
		return "UserServiceSecond";
	}
}
