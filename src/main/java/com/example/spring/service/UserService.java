package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.domain.Person;


public interface UserService {
	List<Person> list();
	Person get(int id);
	void save(Person person);
}
