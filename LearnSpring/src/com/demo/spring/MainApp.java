package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.beans.HelloWorld;
import com.demo.spring.beans.HelloWorld2;
import com.demo.spring.beans.InheritHelloWorld;

public class MainApp {

	private static ApplicationContext context;

	public static void main(String args[]){
		
		context = new ClassPathXmlApplicationContext("spring.xml");

		 HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      
	      HelloWorld2 objA = (HelloWorld2) context.getBean("helloWorld2");
	      objA.getMessage1();
	      objA.getMessage2();

	      InheritHelloWorld objB = (InheritHelloWorld) context.getBean("inheritHelloWorld");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	      
	      ((AbstractApplicationContext) context).registerShutdownHook();   
	}
}
