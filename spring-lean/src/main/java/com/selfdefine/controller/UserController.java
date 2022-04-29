package com.selfdefine.controller;

import com.selfdefine.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@Value("${name}")
	private String jdbcurl = "chengsheng";
}
