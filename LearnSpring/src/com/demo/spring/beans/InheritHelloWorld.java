package com.demo.spring.beans;

public class InheritHelloWorld {
	private String message3,message1,message2;

	public String getMessage3() {
		System.out.println("InheritHelloWorld Message3 : " + message3);
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	public String getMessage1() {
		System.out.println("InheritHelloWorld Message1 : " + message1);
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		System.out.println("InheritHelloWorld Message2 : " + message2);
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
}
