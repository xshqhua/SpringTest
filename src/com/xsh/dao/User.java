package com.xsh.dao;

/**
 * package:com.xsh.dao fine:User.java author:XSH datetime:2017年7月3日 下午3:51:22
 */
public class User {
	public String id = "";
	public String name = "";
	public int age = 0;

	public User() {
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void print(){
		System.out.print("User.id="+this.id);
		System.out.print("\tUser.name="+this.name);
		System.out.println("\tUser.age="+this.age);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void init(){
		System.out.println("init");
	}
	public void destroy(){
		System.out.println("destroy");
	}
}
