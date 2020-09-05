package com.har.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.har.beans.Employee;

public class XmlBeanFactoryTest {

	public static void main(String[] args) {
		
		Resource           resource       =null;
		BeanFactory  beanFactory   =null;
		Employee      employee        =null;
		Date                   date             =null;
		
		resource =new ClassPathResource("com/har/cfgs/applicationContext.xml");
		
		//create IOC Container and load XML File in it
		 beanFactory   =new XmlBeanFactory(resource);
		
		//get Emp object from IOC Container
		Object  obj =beanFactory.getBean("emp");
		
		//cast to emp
		employee =(Employee)obj;
		
		System.out.println("employee--(1)------>"+employee);
		
		employee=beanFactory.getBean("emp",Employee.class);
		
		System.out.println("employee---(2)----->"+employee);

		employee=beanFactory.getBean(Employee.class);

		System.out.println("employee----(3)---->"+employee);

       boolean beanNameContainsFlag=beanFactory.containsBean("emp");
      
		System.out.println(" 'emp' beanName/beanId contains in beanFacory ....?----(4)---->"+beanNameContainsFlag);

		 boolean isSingletonFlag= beanFactory.isSingleton("emp");
		  
		 System.out.println(" 'emp' beanName/beanId is  isSingleton....?----(5)---->"+isSingletonFlag);
		  
		  boolean isProtoTypeFlag= beanFactory.isPrototype("emp");
		
		 System.out.println(" 'emp' beanName/beanId is  isProtoType....?----(6)---->"+isProtoTypeFlag);

		 String empAliases[]= beanFactory.getAliases("emp");
		  
		 for(String empAlis:empAliases){
			 System.out.println(" 'emp' beanName/beanId  aliase name....----(7)---->"+empAlis);
		 }
		 
		 //If you don't know beanId then we can get by using java.util.Date#0 [pkg.className#n] where n=1,2,3....etc
		 
		 date=beanFactory.getBean("java.util.Date#0",Date.class);

		 System.out.println(" If you don't beanId then we can use by pkg.className#n [where n=1,2,3...etc]----(8)---->"+date);
		 
		 //get DefaultListableBeanFactory to get default one's 
		 DefaultListableBeanFactory  		defaultListableBeanFactory   =new XmlBeanFactory(resource);
		 
		 System.out.println("---BeanDefinitionNames----");
		 String[] beanDefNames=defaultListableBeanFactory.getBeanDefinitionNames();
		 for(String beanDef:beanDefNames){
			 System.out.println(beanDef);
		 }
		 
		 System.out.println("BeanDefinitionCount----->"+defaultListableBeanFactory.getBeanDefinitionCount());
	}
}
