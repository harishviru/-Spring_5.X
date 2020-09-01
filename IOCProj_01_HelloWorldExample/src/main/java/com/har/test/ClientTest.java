package com.har.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.har.beans.HelloWorld;

@SuppressWarnings("deprecation")
public class ClientTest {

	public static void main(String[] args) {
		
		//XMLBeanFactory
		helloWorldByUsingBeanFactoryWithClassPathResource();
		System.out.println();
		helloWorldByUsingBeanFactoryWithFileSystemResource();
		System.out.println();
		
		//ApplicationContext
		helloWorldByApplicationContextByUsingClassPathXml();
		System.out.println();
		helloWorldByUsingBeanFactoryWithFileSystemResource();
		System.out.println();

	}
	/** 
	 * #XmlBeanFactory resource by ClassPathResource
	 */
	public static void helloWorldByUsingBeanFactoryWithClassPathResource(){
		System.out.println("start***********ClientTest.helloWorldByUsingBeanFactoryWithClassPathResource()*******************");
		BeanFactory                                factory  =null;
		Resource                                  resource    =null;	
		HelloWorld                              helloWorld =null;
		
		resource=new ClassPathResource("com/har/cfgs/applicationContext.xml");
		//load Xml File into container
		factory =new XmlBeanFactory(resource);
		
		helloWorld=(HelloWorld) factory.getBean("hellobn");	
		System.out.println(helloWorld);
		
		System.out.println("End***********ClientTest.helloWorldByUsingBeanFactoryWithClassPathResource()*******************");
	}
	
	/** 
	 * #XmlBeanFactory resource by FileSystemResource
	 */
	public static void helloWorldByUsingBeanFactoryWithFileSystemResource(){
		System.out.println("start***********ClientTest.helloWorldByUsingBeanFactoryWithFileSystemResource()*******************");
		BeanFactory                                factory  =null;
		Resource                                  resource    =null;	
		HelloWorld                              helloWorld =null;
		
		resource=new FileSystemResource("D://Spring5X//IOCProj_01_HelloWorldExample//src//main//java//com//har//cfgs//applicationContext.xml");
		//load Xml File into container
		factory =new XmlBeanFactory(resource);
		
		helloWorld=(HelloWorld) factory.getBean("hellobn");	
		System.out.println(helloWorld);
		
		System.out.println("End***********ClientTest.helloWorldByUsingBeanFactoryWithFileSystemResource()*******************");
	}
	
	/** 
	 * #ApplicationContext ---->  by  udingclasspathXmlContext
	 */
	public static void helloWorldByApplicationContextByUsingClassPathXml(){
		System.out.println("start***********ClientTest.helloWorldByApplicationContextByUsingClassPathXml()*******************");
         ApplicationContext            context         =null;
		 HelloWorld                              helloWorld =null;

       context  =new ClassPathXmlApplicationContext("com/har/cfgs/applicationContext.xml");
       
		helloWorld=(HelloWorld) context.getBean("hellobn");	
		System.out.println(helloWorld);
		
		System.out.println("End***********ClientTest.helloWorldByApplicationContextByUsingClassPathXml()*******************");
	}
	
	/** 
	 * #ApplicationContext ---->  by using  FileSystemXmlApplicationContext
	 */
	public static void helloWorldByApplicationContextByUsingFileSystem(){
		System.out.println("start***********ClientTest.helloWorldByApplicationContextByUsingFileSystem()*******************");
		ApplicationContext            context         =null;
		HelloWorld                              helloWorld =null;
		
		context  =new  FileSystemXmlApplicationContext("D://Spring5X//IOCProj_01_HelloWorldExample//src//main//java//com//har//cfgs//applicationContext.xml");
		
		helloWorld=(HelloWorld) context.getBean("hellobn");	
		System.out.println(helloWorld);
		
		System.out.println("End***********ClientTest.helloWorldByApplicationContextByUsingFileSystem()*******************");
	}
}
