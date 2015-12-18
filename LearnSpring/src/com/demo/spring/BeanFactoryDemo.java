package com.demo.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.demo.spring.beans.HelloWorld;

public class BeanFactoryDemo {
	
	private static ApplicationContext context;

	public static void main(String args[]){
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));

	      HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");

	      System.out.println(obj.getMessage());	      
	}
}
