package com.cloud.provide.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvideService {
	
	@RequestMapping("/provide")
	public String say(@RequestParam String name) {
		return "hello "+name+"，this is provide messge";
	}
}
