package com.caos.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.caos.webservice.bean.BeanExample;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean-parameter/{name}")
	public BeanExample getBeanExample(@PathVariable String name) {
		return new BeanExample(String.format("Hello world, %s", name));
	}
}
