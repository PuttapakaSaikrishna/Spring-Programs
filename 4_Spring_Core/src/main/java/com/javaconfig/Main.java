package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/javaconfig/Config.xml");
		A temp =(A)context.getBean("Aref");
		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		
	}
}
