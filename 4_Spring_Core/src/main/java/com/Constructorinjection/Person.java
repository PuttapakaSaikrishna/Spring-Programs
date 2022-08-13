package com.Constructorinjection;

public class Person {
	
	private String name;
	private int id;
	private certi certi;
	
	public Person(String name, int id, com.Constructorinjection.certi certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + "]";
	}
}
