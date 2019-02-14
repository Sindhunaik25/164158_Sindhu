package com.mednets.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mednets.login.model.User;
import com.mednets.login.service.LoginService;

@RestController
public class loginController {

	@Autowired
	LoginService service;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public void addUser(@RequestBody User user)
	{  
		service.addUsers(user);
	}

	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public void getUser()
	{
		service.getUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/validate")
	public void validateUser(@RequestBody User user)
	{
		service.validate(user);
	}
			
}
