package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		System.out.println("UserServiceImpl.getUser() invoked...");
		User user = new User();
		user.setId(10);
		user.setUsername("admin");
		user.setPassword("123456");
		System.out.println("Return:" + user);
		return user;
	}

}
