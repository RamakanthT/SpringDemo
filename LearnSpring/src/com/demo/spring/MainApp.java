package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static ApplicationContext context;

	public static void main(String args[]){
		
		context = new ClassPathXmlApplicationContext("spring.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      System.out.println(obj.getMessage());
	      ((AbstractApplicationContext) context).registerShutdownHook();   
	}
}
