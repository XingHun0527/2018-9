package com.briup.jsp.bean;

public class User {
	private int id;
	private String name;
	private String passwd;
	private String gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, String name, String passwd, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.gender = gender;
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", passwd=" + passwd + ", gender=" + gender + "]";
	}
	
	
}
