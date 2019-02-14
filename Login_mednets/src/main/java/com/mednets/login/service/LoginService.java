package com.mednets.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mednets.login.model.LoginRepos;
import com.mednets.login.model.User;

@Service
public class LoginService {

	@Autowired
	LoginRepos login;

	public LoginRepos getLogin() {
		return login;
	}

	public void setLogin(LoginRepos login) {
		this.login = login;
	}

	public void addUsers(User user) {
		
		login.save(user);
		
	}

	public String validate(User user) {
		
		List<User> users= login.findAll();
		
		for(User login_user: users )
		{
			if(login_user.getUsername().equals(user.getUsername()))
			{
				return "User Logged in";
			}
		}
return "Invalid user";
		

}

	public void getUsers() {
		
		login.findAll();
	}
}
