package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconfig.xml");

		Person person1 = con.getBean("person1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("______________________________________________");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println("______________________________________________");
		System.out.println(person1.getProperties());
		System.out.println("***********************************************************");
		Person person2 = con.getBean("person2", Person.class);
		System.out.println(person2);
		System.out.println(person2.getFriends().getClass().getName());
		System.out.println("______________________________________________");
		System.out.println(person2.getFeestructure());
		System.out.println(person2.getFeestructure().getClass().getName());
		System.out.println("______________________________________________");
		System.out.println(person2.getProperties());
	}
}
