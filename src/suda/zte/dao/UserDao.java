package suda.zte.dao;
/**
 * package:suda.zte.dao
 * file:UserDao.java
 * author:XSH
 * email:xshqhua@gmail.com
 * datetime:2017年7月6日 下午5:57:24
 */
public interface UserDao {
	public User find(int id);
	public User add(String name,String pwd,String phone);
	public User update(User u);
	public User delete(int id);
}
