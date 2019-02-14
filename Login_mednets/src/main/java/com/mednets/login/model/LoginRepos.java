package com.mednets.login.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepos extends MongoRepository<User, String>{
	

}
