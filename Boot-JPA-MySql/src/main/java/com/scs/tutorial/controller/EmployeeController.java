package com.scs.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hello-scs-Employee";
	}

}
