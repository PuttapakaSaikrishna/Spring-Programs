package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	 
	// For the init and destroy
	 AbstractApplicationContext con =new ClassPathXmlApplicationContext("com/lifecycle/config.xml");

	Samosa s1=(Samosa) con.getBean("sam");
	System.out.println(s1);
	
	//registration shutdown hook
	con.registerShutdownHook();
	
	System.out.println("_______________________________");
	
	
	Pepsi p1=(Pepsi)con.getBean("Pepsi");
	System.out.println(p1);
}
 
}
