package com.Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ap = new ClassPathXmlApplicationContext("com/Constructorinjection/Config.xml");
		
		Person p =ap.getBean(Person.class);
		//Person p =(Person)ap.getBean("Person");
		System.out.println(p);


}



}
