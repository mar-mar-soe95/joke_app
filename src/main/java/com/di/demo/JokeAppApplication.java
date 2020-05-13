package com.di.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.di.demo.config.ChuckConfiguration;

@SpringBootApplication
public class JokeAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokeAppApplication.class, args);
		
		ChuckConfiguration chuckConfiguration = (ChuckConfiguration) ctx.getBean("chuckConfiguration");
		System.out.println(chuckConfiguration.getChuck());
		
	}

}
