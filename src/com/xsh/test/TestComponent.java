package com.xsh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsh.dao.Users;

/**
 * package:com.xsh.test
 * file:TestCom.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月5日 下午5:49:58
 */
public class TestComponent {
	
	public static void main(String [] args){
		new TestComponent().init();
	}
	
	public void init(){
		String applicationContextPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(applicationContextPath);
		
		Users u = applicationContext.getBean("usersXX",Users.class);
		Users u2 = applicationContext.getBean("usersXX",Users.class);
		System.out.println(u==u2);
		
		AbstractApplicationContext apt = (AbstractApplicationContext ) applicationContext;
		apt.close();
		
	}
	
}
