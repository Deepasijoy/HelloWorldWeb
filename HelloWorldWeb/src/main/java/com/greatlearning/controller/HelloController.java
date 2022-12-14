package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//streotype of @Component
public class HelloController {
	
	
	//adding the request mapping-->Url
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "Hello ";
	}

}
