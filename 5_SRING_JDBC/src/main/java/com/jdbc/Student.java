package com.jdbc;

public class Student {
	private String sid;
	private String name;

	// super class
	public Student() {
	}

	//getter setter
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// constructor
	public Student(String sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	//string to string
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

}
