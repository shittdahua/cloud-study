package com.cloud.registercenter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/say")
	public String say(){
		return "Hello World";
	}
}
