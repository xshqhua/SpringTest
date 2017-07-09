package suda.zte.dao;

import java.io.Serializable;

/**
 * package:suda.zte.dao file:User.java author:XSH email:xshqhua@gmail.com
 * datetime:2017年7月6日 下午5:45:52
 */
public class User implements Serializable{
	private int id;
	private String name;
	private String pwd;
	private String phone;

	public User() {
	}

	public User(int id, String name, String pwd, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public int hashCode(){
		return this.id;
		
	}
	
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}else if(obj==null){
			return false;
		}else if(obj instanceof User){
			User u = (User)obj;
			return this.id==u.id;
		}
		return true;
	}

}
