package com.test.springdatajpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.springdatajpa.model.User;
import com.test.springdatajpa.service.UserService;

@RestController
@RequestMapping("/userlogin")
public class UserController {

	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userservice;

	@Autowired
	Gson gson;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createuser(@RequestBody User user) {
		String response = "";
		try {
			User result = userservice.createPerson(user);
			response = gson.toJson(result);
		} catch (Exception e) {
			LOG.error("Exception Occured During User Creation  --> " + e);
		}
		return response;
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public String finduser(@RequestBody User user) {
		String response = "";
		try {
			User result = userservice.getPersonByName(user.getName(), user.getPassword());
			response = gson.toJson(result);
		} catch (Exception e) {
			LOG.error("Exception Occured During User Find Based on User Name and Password  --> " + e);
		}
		return response;
	}

}
