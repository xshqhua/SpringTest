package com.xsh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsh.dao.MessageBean;

/**
 * package:com.xsh.test
 * file:TestMassageBeanApplicationContext.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月4日 下午2:17:03
 */
public class TestMassageBeanApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestMassageBeanApplicationContext().init();
	}
	public void init(){
		String applicationContext="applicationContext.xml";
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(applicationContext);
		
		MessageBean mb = ac.getBean("messageBean",MessageBean.class);
		mb.execute();
		
		System.out.println("--------------------MessagesBean2--------------------");
		MessageBean mb2 = ac.getBean("messageBean2",MessageBean.class);
		mb2.execute();
		
		System.out.println("--------------------MessagesBean3--------------------");
		MessageBean mb3=ac.getBean("messageBean3",MessageBean.class);
		mb3.execute();
//		System.out.println(mb3.getUserName());
		
		
		AbstractApplicationContext apt = (AbstractApplicationContext) ac;
		apt.close();
		
	}

}
