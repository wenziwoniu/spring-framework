package com.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAutowired {

	/**
	 * 可以注入
	 */
	@Autowired
	private ApplicationContext applicationContext;

}
