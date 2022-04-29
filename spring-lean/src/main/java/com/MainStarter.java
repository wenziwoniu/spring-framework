package com;

import com.selfdefine.controller.UserController;
import com.selfdefine.dao.UserDao;
import com.selfdefine.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 1、对于AnnotationConfigApplicationContext的参数类来说，即使不加任何注解，也会变成bean
 * 2、如果参数类有@Configuration注解，则会被ConfigruationPost当做配置类进行处理【生成对应的代理对象】
 * 3、如果参数类没有@Configuration注解，但是有@Compoment @ComponentScan @Impor @ImportSource 或者有@Bean的方法
 * 则也会被ConfigruationPost当做配置类进行处理【不会生成对应的代理对象】
 *
 * 配置类对象：@Configuration注解，或有@Compoment @ComponentScan @Impor @ImportSource 或者有@Bean的方法的bean都会被当做配置类
 * 进而可以解析其ComponentScan注解
 *
 * @Import引入的类，即使不加任何注解，也会变成bean,如果加了@Configuration等注解，则会被当做配置类，则会处理引入的类其它的注解，例如ComponentScan
 *
 * 虽然@ComponentScans注解的class文件是ComponentScan数组，但注解判断时，并不会当做ComponentScan注解，也就是如果只有@ComponentScans注解，是不会当做配置类
 * 进行处理，也就不会扫描其其指定的包
 *
 */
@Configuration
@ComponentScan(value = "com.selfdefine")
@PropertySource(value = "jdbc.properties")
//@ComponentScans(value = {@ComponentScan(value = "com.selfdefine")})
public class MainStarter {

	public static void main(String[] args) {
		// 对于构造函数参数来说，即使类上没有加任何注解，也是会被处理成bean的
 		ApplicationContext context = new AnnotationConfigApplicationContext(MainStarter.class);
//		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
//		bean.say();
		System.out.println("++++++++++++++++++++");
	}
}
