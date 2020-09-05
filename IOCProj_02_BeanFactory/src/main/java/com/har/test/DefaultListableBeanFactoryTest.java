package com.har.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.har.beans.Employee;

public class DefaultListableBeanFactoryTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory       =null;
		XmlBeanDefinitionReader reader           =null;
		Employee                              employee      =null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//load XML bean definitions
		reader.loadBeanDefinitions("com/har/cfgs/applicationContext.xml");
		
		employee=factory.getBean("emp",Employee.class);
		System.out.println(employee);
	}
	
}
