package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Person> list() {
		//call method from UserRepository and remove throw
		return userRepository.list();
	}

	@Override
	public Person get(int id) {
		//call method from UserRepository and remove throw
		return userRepository.get(id);
	}

	@Override
	public void save(Person person) {
		//call method from UserRepository and remove throw
		userRepository.save(person);
	}
}
