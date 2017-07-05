package com.xsh.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * package:com.xsh.dao fine:User.java author:XSH datetime:2017年7月3日 下午3:51:22
 */
@Component("usersXX")
@Scope("prototype")
public class Users {

	public Users() {
		System.out.println("User2初始化");
	}
	
	@PostConstruct
	public void init1() {
		System.out.println("init");
	}

	//销毁支队单利有效
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
