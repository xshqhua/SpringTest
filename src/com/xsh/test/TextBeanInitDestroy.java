package com.xsh.test;

import javax.activity.ActivityRequiredException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsh.dao.ExampleBean;

/**
 * package:com.xsh.test
 * fine:TextBeanInitDestroy.java
 * author:XSH
 * datetime:2017年7月3日 上午11:37:34
 */
public class TextBeanInitDestroy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextBeanInitDestroy().init();
	}
	public void init(){
		String applicationPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(applicationPath);
		ExampleBean exampleBean = applicationContext.getBean("exampleBean",ExampleBean.class);
		ExampleBean exampleBean2 = applicationContext.getBean("exampleBean",ExampleBean.class);
		System.out.println(exampleBean==exampleBean2);
		
		ExampleBean exampleBean3 = applicationContext.getBean("exampleBean2",ExampleBean.class);
		ExampleBean exampleBean4 = applicationContext.getBean("exampleBean2",ExampleBean.class);
		System.out.println(exampleBean3==exampleBean4);
		System.out.println("==========================================");
		
		ExampleBean exampleBean5 = applicationContext.getBean("exampleBean3",ExampleBean.class);
		ExampleBean exampleBean6 = applicationContext.getBean("exampleBean4",ExampleBean.class);
		
		
		ExampleBean exampleBean7 = applicationContext.getBean("exampleBean5",ExampleBean.class);
		
		ExampleBean exampleBean8 = applicationContext.getBean("exampleBean6",ExampleBean.class);
		System.out.println(exampleBean8.getName());
		
		AbstractApplicationContext atx = (AbstractApplicationContext) applicationContext;
		atx.close();
		
	}

}
