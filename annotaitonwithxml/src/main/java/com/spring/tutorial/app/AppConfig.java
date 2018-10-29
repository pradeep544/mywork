package com.spring.tutorial.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.spring.tutorial.repository.CustomerReopsitoryHibernateImpl;
import com.spring.tutorial.repository.CustomerRepository;
import com.spring.tutorial.service.CustomerService;
import com.spring.tutorial.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.spring.tutorial"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new CustomerReopsitoryHibernateImpl();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
