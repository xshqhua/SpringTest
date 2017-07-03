package com.xsh.dao;

/**
 * package:com.xsh.dao fine:ExampleBean.java author:XSH datetime:2017年7月3日
 * 上午11:31:38
 */
public class ExampleBean {
	public String name = null;

	public ExampleBean() {
		System.out.println("实例化ExampleBean");
	}
	public ExampleBean(String name) {
		this.name = name;
		System.out.println("实例化ExampleBean 构造函数是ExampleBean(String name)");
	}

	public void init() {
		System.out.println("System execute init method");
	}

	public void destroy() {
		System.out.println("System execute destroy method");
	}

	public void execute() {
		System.out.println("execute method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
