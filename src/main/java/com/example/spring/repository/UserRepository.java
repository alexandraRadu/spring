package com.example.spring.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.domain.Person;


public interface UserRepository {
	List<Person> list();
	Person get(int id);
	void save(Person person);
}
