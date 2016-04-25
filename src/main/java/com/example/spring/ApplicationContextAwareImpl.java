package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware{
	
	@Autowired
	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}

}
