package com.rest.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class Hello {
	//GET
	//URI - /hello-world
	// method - "Hello World"
	@GetMapping(path = "/hello-world1")
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public HelloWordBean helloWorldBean(@PathVariable String name) {
		return new HelloWordBean(String.format("Hello, %s", name));
	}
}
