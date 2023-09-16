package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.User;
@RestController

public class HelloRestController {
	//UC
	@RequestMapping(value ="/hello" ,method=RequestMethod.GET)
	
	public String message()
	{
		return "Hello world";
	}

@RequestMapping(value ="/query" ,method=RequestMethod.GET)
	
	public String queryParameter(@RequestParam String name)
	{
		return "Hello from" + name;
	}

@RequestMapping(value ="/path/{name}" ,method=RequestMethod.GET)

public String pathVariable(@PathVariable String name)
{
	return "Hello from" + name;
}

	@RequestMapping(value ="/postExamplet/{name}" ,method=RequestMethod.POST)

	public String requestBody(@RequestBody User user)
	{
			return "Hello" + user.getFirstName() + " " + user.getLastName();
	}
	
	@RequestMapping(value ="/put/{name}" ,method=RequestMethod.PUT)
	
	public String sayHello(@PathVariable String firstName , @RequestParam(value= "lastName") String lastName)
	{
		return   "firstName" + " "+ lastName;
	}
}
