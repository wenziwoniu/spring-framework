package com;

import com.selfdefine.controller.UserController;
import com.selfdefine.dao.UserDao;
import com.selfdefine.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 只有一个bean有@Component注解[其它注解包含它也可以]，才会继续处理她的ComponentScan等注解
 * @Import引入的类，即使不加任何注解，也会变成bean,如果加了@Configuration注解，则会处理其它的注解，例如ComponentScan
 */
@Configuration
//	@Service
//@ComponentScan("com.comonent")
//@ComponentScan("com.comonent")
//@ComponentScan("com.comonent")
@ComponentScans(value = {@ComponentScan("com")})
//@ComponentScans(value = {@ComponentScan("com.config"), @ComponentScan("com.selfdefine"), @ComponentScan("#{pacakages}")})
//@ComponentScans(value = {@ComponentScan("com.config"), @ComponentScan("com.selfdefine"), @ComponentScan("#{pacakages}")})
//@PropertySource(value = "${namejdbc}.properties")
//@PropertySource(value = "jdbc.properties")
//@PropertySources(value = {@PropertySource(value = "jdbc2.properties"),@PropertySource(value = "jdbc3.properties")})
//@PropertySources(value = {@PropertySource(value = "jdbc4.properties")})
//@Conditional()
//@Import(value = {UserController.class})
public class MainStarter {

	public static void main(String[] args) {
		// 对于构造函数参数来说，即使类上没有加任何注解，也是会被处理成bean的

 		ApplicationContext context=new AnnotationConfigApplicationContext(MainStarter.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.say();
		System.out.println("aed");
	}
}
