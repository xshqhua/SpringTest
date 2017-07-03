package com.xsh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsh.dao.User;
import com.xsh.service.UserService;

/**
 * package:com.xsh.test
 * fine:TestAutowire.java
 * author:XSH
 * datetime:2017年7月3日 下午3:50:55
 */
public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestAutowire().init();
		
	}
	public void init(){
		String applicationContextPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(applicationContextPath);
		User u = applicationContext.getBean("user",User.class);
		u.print();
		
		User u2 = applicationContext.getBean("user2",User.class);
		u2.print();
		
		System.out.println("-------------------UserServices-------------------");
		UserService userService = applicationContext.getBean("userService",UserService.class);
		userService.user.print();
		
		UserService userService2=applicationContext.getBean("userServices2",UserService.class);
		userService2.user.print();
		
		UserService userService3=applicationContext.getBean("userServices2",UserService.class);
		userService3.user.print();
		
		AbstractApplicationContext apt = (AbstractApplicationContext)applicationContext;
		apt.close();
		
	}

}
