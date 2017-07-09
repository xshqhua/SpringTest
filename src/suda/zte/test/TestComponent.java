package suda.zte.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import suda.zte.dao.JDBCConnection;
import suda.zte.dao.MysqlDao;
import suda.zte.dao.UserDao;
import suda.zte.services.UserService;

/**
 * package:suda.zte.test
 * file:TestComponent.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月6日 下午6:03:10
 */
public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestComponent().init();
	}
	public void init(){
		String applicationContextPath = "spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(applicationContextPath);
		
		JDBCConnection jdbcConnection = applicationContext.getBean("jdbcConnect",JDBCConnection.class);
		
		MysqlDao mysqlDao = applicationContext.getBean("mysqlDao",MysqlDao.class);
		System.out.println(mysqlDao.getConnection()==jdbcConnection);
		
		
		System.out.println(jdbcConnection.getDriver());
		System.out.println(jdbcConnection.getPwd());
		System.out.println(jdbcConnection.getUsername());
		
		UserService userDao = applicationContext.getBean("userService",UserService.class);
		userDao.login(1, "");
		
		
		
		AbstractApplicationContext apt = (AbstractApplicationContext) applicationContext;
		apt.close();
		
		
	}

}
