package com.har.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.har.beans.Employee;

public class ApplicationContextTest {

	public static void main(String[] args) {
		
		BeanFactory  beanFactory   =null;
		Employee      employee        =null;
				
		//create IOC Container and load XML File in it
		 beanFactory   =new ClassPathXmlApplicationContext("com/har/cfgs/applicationContext.xml");
				
		employee=beanFactory.getBean("emp",Employee.class);
		
		System.out.println("emp--->"+employee);
		
		 String empAliases[]= beanFactory.getAliases("emp");
		  
		 for(String empAlis:empAliases){
			 System.out.println(" 'emp' beanName/beanId  aliase name....-------->"+empAlis);
		 }
		 
		  System.out.println("By using aliases..............................");
		 
			employee=beanFactory.getBean("empDetObj1",Employee.class);
			
			System.out.println("empDetObj1--->"+employee);

			employee=beanFactory.getBean("empDetObj2",Employee.class);
			
			System.out.println("empDetObj2--->"+employee);
		 
	}
}
