package com.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		
		ApplicationContext con =new ClassPathXmlApplicationContext("com/sterotype/config.xml");
		Student student	=con.getBean("ob",Student.class);
			System.out.println(student);
			System.out.println(student.getAdress());
			System.out.println(student.getAdress().getClass().getName());
	}
}
