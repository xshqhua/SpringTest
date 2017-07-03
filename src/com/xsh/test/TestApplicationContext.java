package com.xsh.test;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * package:com.xsh.test
 * fine:TestApplicationContext.java
 * author:XSH
 * datetime:2017年7月2日 下午5:45:06
 */
public class TestApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestApplicationContext().init();
	}
	public void init(){
//		String conf="./com.xsh/test/applicationContext.xml";
		String conf="applicationContext.xml";
		//路径是从src开始算起的，与普通的文件的路径有一定的区别
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
		System.out.println(applicationContext);
		
		Calendar calendar = applicationContext.getBean("calendarObj1",Calendar.class);
		System.out.println(calendar.getTimeInMillis());
		
		Calendar calendar2 = (Calendar) applicationContext.getBean("calendarObj2");
		System.out.println(calendar2.getTimeInMillis());
		
		Calendar calendar3 = applicationContext.getBean("calendarObj3",Calendar.class);
		System.out.println(calendar3.getTimeInMillis());
		
		Date date = applicationContext.getBean("dateObj",Date.class);
		System.out.println(date);
		
		Date date2 = applicationContext.getBean("dateObj2",Date.class);
		System.out.println(date2.getTime());
		
	}

}
