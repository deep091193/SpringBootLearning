package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	String name="Sudipta";
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hi"+name;
	}

}
