package com.xsh.service;

import com.xsh.dao.User;

/**
 * package:com.xsh.dao fine:UserService.java author:XSH datetime:2017年7月3日
 * 下午3:53:38
 */
public class UserService {
	public User user;

	public UserService() {
	}

	public UserService(User user){
		this.user=user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
