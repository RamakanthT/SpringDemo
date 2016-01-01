package com.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController{

	@RequestMapping(value = "/hello.htm", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		System.out.println("In hello controller");		 		
		model.addAttribute("message", "Hello Spring MVC Framework!");
		//model.put("message2", "its msg2");
		return "hello";
	}

}