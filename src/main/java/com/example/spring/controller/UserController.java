package com.example.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.spring.domain.Person;
import com.example.spring.service.UserService;


@Component
public class UserController {
	
	@Autowired
	public UserService userService;
	
	
	public void createUser(Person user){
		// call UserService here
		
		userService.save(user);
	}
	
	public void findUser(int id){
		userService.get(id);
	}
	
	public void listUser(List<Person> persoane){
		userService.list();
	}
}
