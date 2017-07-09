package suda.zte.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * package:suda.zte.dao
 * file:MysqlDao.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月7日 上午11:59:24
 */
@Repository("mysqlDao")
public class MysqlDao implements UserDao{
	JDBCConnection connection;
	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		connection.connection();
		System.out.println("this is MysqlDao find");
		return null;
	}

	@Override
	public User add(String name, String pwd, String phone) {
		// TODO Auto-generated method stub
		System.out.println("MysalDao add");
		return null;
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		System.out.println("MysalDao update");
		return null;
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("MysalDao delete");
		return null;
	}

	public JDBCConnection getConnection() {
		return connection;
	}
	@Autowired
	public void setConnection(JDBCConnection connection) {
		this.connection = connection;
	}
	
}
