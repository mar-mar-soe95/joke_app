package com.di.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ChuckConfiguration {
	
	@Bean
	public String getChuck() {
		return "Hello";
	}
}