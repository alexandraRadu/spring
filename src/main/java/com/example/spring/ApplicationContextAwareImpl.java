package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.spring.repository.UserRepository;
import com.example.spring.service.impl.UserServiceImpl;

@Component
public class ApplicationContextAwareImpl implements ApplicationContextAware{
	

	private ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}
	
	public void getService(){
		UserServiceImpl us = context.getBean(UserServiceImpl.class);
		UserRepository ur = context.getBean(UserRepository.class);
			us.setUserRepository(ur);
	
	}
	
}
