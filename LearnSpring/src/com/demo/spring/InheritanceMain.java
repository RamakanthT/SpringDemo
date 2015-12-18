package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.beans.Inheritance1;
import com.demo.spring.beans.Inheritance2;

public class InheritanceMain {

	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	      Inheritance1 objA = (Inheritance1) context.getBean("inheritance1");

	      objA.getMessage1();
	      objA.getMessage2();

	      Inheritance2 objB = (Inheritance2) context.getBean("inheritance2");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	   }
}
