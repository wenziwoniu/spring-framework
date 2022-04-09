package com;

import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.service")
public class MainStarter {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MainStarter.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.say();
		System.out.println("aed");
	}
}
