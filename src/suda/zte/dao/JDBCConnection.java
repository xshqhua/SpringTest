package suda.zte.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * package:suda.zte.dao file:JDBCConnection.java author:XSH
 * email:xshqhua@gmail.com datetime:2017年7月7日 下午12:04:27
 */
@Component("jdbcConnect")
public class JDBCConnection {
	@Value("#{jdbcPropos.user}")
	private String username;
	@Value("#{jdbcPropos.password}")
	private String pwd;
	String driver;
	public void connection() {
		System.out.println("connection ... Database");
	}

	public void close() {
		System.out.println("close database");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDriver() {
		return driver;
	}

	@Value("#{jdbcPropos.driver}")
	public void setDriver(String driver) {
//		this.driver = driver;
		try {
			System.out.println("try nei");
			this.driver = driver;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
