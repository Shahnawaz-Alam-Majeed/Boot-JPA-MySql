package com.scs.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.scs.tutorial.services.UserServiceImpl;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping(value = "addUser", method = RequestMethod.POST, produces = { "application/json","application/xml" })
	public String addUser(String name) {
		
		return userServiceImpl.addUser(name);
		//return us.addUser(name);

	}

}

