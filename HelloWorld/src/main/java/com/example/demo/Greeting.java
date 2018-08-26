package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

 
@Controller
public class Greeting {

	@RequestMapping(path ="/greeting/{id}/{name}", method = RequestMethod.GET)
	public @ResponseBody String greeting(@PathVariable int id, @PathVariable String name) {
		return "Hello " + id + name;
	}
}

