package com.test.springdatajpa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.test.springdatajpa.model.User;
import com.test.springdatajpa.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	Gson gson;

	@Autowired
	private UserRepository personRepository;

	@Override
	public User createPerson(User person) {
		LOG.info("Input Request for Create User  --> " + gson.toJson(person));
		return personRepository.save(person);
	}

	@Override
	public User getPerson(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public User getPersonByName(String name, String password) {
		// TODO Auto-generated method stub
		return personRepository.findByNameAndPassword(name, password);
	}

}
