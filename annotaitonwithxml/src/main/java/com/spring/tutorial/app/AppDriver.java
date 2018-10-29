package com.spring.tutorial.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.tutorial.service.CustomerService;

public class AppDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = context.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll());
	}
}
