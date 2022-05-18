package com.halfacode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JsfspringappApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(JsfspringappApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JsfspringappApplication.class, args);
	}

}
