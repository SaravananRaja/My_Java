package com.test.springdatajpa.service;

import com.test.springdatajpa.model.User;

public interface UserService {

	User createPerson(User person);

	User getPerson(Long id);
	
	User  getPersonByName(String name,String password);
}
