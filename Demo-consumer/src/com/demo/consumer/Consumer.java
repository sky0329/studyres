package com.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.User;
import com.demo.service.UserService;

public class Consumer {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");
		//获取代理对象
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		long l1 = System.currentTimeMillis();
		User user = userService.getUser();
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
		
		long l3 = System.currentTimeMillis();
		UserService userService2 = (UserService)applicationContext.getBean("userService");
		User user2 = userService2.getUser();
		long l4 = System.currentTimeMillis();
		System.out.println(l4-l3);
	}
}
