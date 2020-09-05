package com.har.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.har.beans.Student;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext           context =null;
	    Student                                student  =null; 
		
	    //create IOC Container
		context =new ClassPathXmlApplicationContext("com/har/cfgs/applicationContext.xml");
		
	    //get Stud object 
		student =context.getBean("studCons",Student.class);
		
		System.out.println("by Using constructor......"+student);
		
		student =context.getBean("studSet",Student.class);
		
		System.out.println("by Using setter method......"+student);
	}
}
