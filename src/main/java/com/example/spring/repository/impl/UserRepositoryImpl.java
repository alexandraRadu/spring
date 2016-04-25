package com.example.spring.repository.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;

@Component
public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<Person> list() {
		//throw new UnsupportedOperationException();
		return list();
	}

	@Override
	public Person get(int id) {
		
		//throw new UnsupportedOperationException();
		Person persoana = new Person();
		return persoana;
	
	}

	@Override
	public void save(Person person) {
		//throw new UnsupportedOperationException();
		System.out.print("Persoana salvata");
	}

}
