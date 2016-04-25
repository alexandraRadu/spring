package com.example.spring;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.Person;
import com.example.spring.runner.ConfigRunner;
import com.example.spring.runner.JavaConfigRunner;




public class Application {
	
	public static void main(String[] args) {
		
		/*List<ConfigRunner> runnerList = new ArrayList<>();
		runnerList.add(new JavaConfigRunner());
		
		for(ConfigRunner configRunner : runnerList){
			configRunner.run();
		}/*
		
		/* System.out.println("Running ");
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		  
		  UserController userController = context.getBean(UserController.class);
		  //userController.createUser(new Person());
		  System.out.println(userController.getUsers().size());
		  context.registerShutdownHook();*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ApplicationContextAwareImpl appcontext= context.getBean(ApplicationContextAwareImpl.class);
		appcontext.getService();
		context.registerShutdownHook();
	}

		
	
}
