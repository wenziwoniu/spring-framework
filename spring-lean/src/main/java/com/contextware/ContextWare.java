package com.contextware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 实现了ApplicationContextAware接口，在bean实例化后，调用InitializingBean方法之前，会对下列接口进行判断并调用对应方法
 * ApplicationContextAware
 * EnvironmentAware
 * 。。。等等
 */
@Component
public class ContextWare implements ApplicationContextAware, EnvironmentAware {

	/**
	 *    通过如下方式更方便，但使用实现接口的方式，可以让非spring bean的代码也能读取到ApplicationContext对象
	 *    @Autowired
	 *    private ApplicationContext applicationContext;
	 */
	private static ApplicationContext applicationContextAware;

	private static Environment environmentWare;

	/**
	 * bean实例化后被spring内部代码自动调用
	 * @param applicationContext the ApplicationContext object to be used by this object
	 * @throws BeansException
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		applicationContextAware = applicationContext;
	}


	@Override
	public void setEnvironment(Environment environment) {
		environmentWare = environment;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContextAware;
	}

	public static Environment getEnvironment() {
		return environmentWare;
	}


}
