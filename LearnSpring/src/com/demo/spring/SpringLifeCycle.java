package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.beans.HelloWorld;

public class SpringLifeCycle {

	private static ApplicationContext context;

	public static void main(String args[]){
		
		context = new ClassPathXmlApplicationContext("spring.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("springLifeCycle");

	      System.out.println(obj.getMessage());
	      ((AbstractApplicationContext) context).registerShutdownHook();
	      
	}
}
