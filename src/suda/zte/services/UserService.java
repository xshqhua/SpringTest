package suda.zte.services;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import suda.zte.dao.UserDao;

/**
 * package:suda.zte.services file:UserService.java author:XSH
 * email:xshqhua@gmail.com datetime:2017年7月6日 下午6:01:55
 */
@Service
@Scope("prototype")
public class UserService implements Serializable {
	UserDao user;

	public boolean login(int id, String pwd) {
		System.out.println("UserService login");
		user.find(1);
		return true;
	}

	public UserDao getUser() {
		return user;
	}
	@Resource(name="mysqlDao")
	public void setUser(UserDao user) {
		this.user = user;
	}

}
