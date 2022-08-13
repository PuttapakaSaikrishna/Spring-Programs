package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext con =new ClassPathXmlApplicationContext("com/jdbc/Config.xml");
    	Student s1=	con.getBean("Templete",Student.class);
    	
    	//insert query
    	String query ="insert into student(sid,sname)values(?,?) ";
    	
    	s1.update(query,2,"rakesh");
    	
    
    }
}
