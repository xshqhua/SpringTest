package com.xsh.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * package:com.xsh.dao fine:MessageBean.java author:XSH datetime:2017年7月4日
 * 上午10:11:42
 */
public class MessageBean {
	public String moduleName;
	public String userName;
	public String password;

	public List<String> list;
	public Set<String> set;
	public Map<String, String> map;
	public Properties properties;

	public void execute() {
		System.out.print("moduleName=" + this.moduleName);
		System.out.print("\tuserName=" + this.userName);
		System.out.println("\tpassword=" + this.password);
		
		System.out.println("----list 信息如下----");
		for(String string:this.list)
			System.out.println(string);
		
		System.out.println("----set 信息如下----");
		for(String str:this.set)
			System.out.println(str);
		
		System.out.println("----map 信息如下----");
		Set<String> tepSet = this.map.keySet();
		for(String str:tepSet)
			System.out.println("key="+str+"\tvalue="+this.map.get(str));
		
		System.out.println("----properties 信息如下----");
		Set<Object> tepSet2 = this.properties.keySet();
		for(Object obj:tepSet2)
			System.out.println("Key="+obj+"\tvalue="+this.properties.get(obj.toString()));
		
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
