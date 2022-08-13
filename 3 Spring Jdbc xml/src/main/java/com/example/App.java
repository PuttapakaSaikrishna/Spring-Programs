package com.example;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/example/Spring.xml");
		
		Student s = ac.getBean(Student.class);
		
		System.out.println("enter student id");
		s.setSid(sc.nextInt());
		System.out.println("enter student name");
		s.setName(sc.next());
		
		StudentDao dao = ac.getBean(StudentDao.class);
		if (dao.insert(s) > 0) {
			System.out.println("insertion is successfull");
		} else {
			System.out.println("insertion failed");
		}

//        List<Student> ss=dao.getallstudent();
//        for(Student student:ss) {
//     	   System.out.println(student.getSid()+"   "+student.getName());
//        }

	}
}
