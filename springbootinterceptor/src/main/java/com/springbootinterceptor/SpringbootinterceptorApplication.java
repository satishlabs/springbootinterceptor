package com.springbootinterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springbootinterceptor.*")
public class SpringbootinterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootinterceptorApplication.class, args);
	}

}
