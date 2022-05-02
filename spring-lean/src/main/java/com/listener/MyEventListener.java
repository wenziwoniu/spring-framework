package com.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
public class MyEventListener {

	@EventListener
	public void eventListener(ContextRefreshedEvent contextRefreshedEvent) {

		System.out.println("zhu jie zi ding yi jianting qi");
	}
}
