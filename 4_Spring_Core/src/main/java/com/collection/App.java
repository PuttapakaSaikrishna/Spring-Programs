package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con =new ClassPathXmlApplicationContext("com/collection/Config.xml");
        Emp emp1=(Emp) con.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getAdress());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourses());
        
    }
}
