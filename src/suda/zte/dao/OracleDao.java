package suda.zte.dao;

import org.springframework.stereotype.Repository;

/**
 * package:suda.zte.dao
 * file:OracleDao.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月7日 上午11:58:26
 */
@Repository("oracleUserDao")
public class OracleDao implements UserDao{

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		System.out.println("OracleDao is find");
		return null;
	}

	@Override
	public User add(String name, String pwd, String phone) {
		// TODO Auto-generated method stub
		System.out.println("OracleDao is add");
		return null;
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		System.out.println("OracleDao is update");
		return null;
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("OracleDao is delete");
		return null;
	}

}
