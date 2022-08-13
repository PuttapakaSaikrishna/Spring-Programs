package com.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/autowireannotation/Config.xml");
		Emp emp1 = con.getBean("emp1", Emp.class);
		
		System.out.println(emp1);
		
	}
}
