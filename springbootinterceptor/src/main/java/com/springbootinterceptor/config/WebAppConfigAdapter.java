package com.springbootinterceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springbootinterceptor.interceptor.RequestHandlerInterceptor;

@Component
public class WebAppConfigAdapter implements WebMvcConfigurer{
	
	@Autowired
	private RequestHandlerInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("this method will get invoked by container while deployment");
		System.out.println("value of interceptor is "+interceptor +" HELLO");
		
		//adding custom ineterceptr
		registry.addInterceptor(interceptor);
	}
}
