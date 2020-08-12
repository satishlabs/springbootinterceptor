package com.springbootinterceptor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CustomFilter implements Filter{
	// this method will be called by container when we send any request
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Hey I am filter , I will get invoked before that Interceproters. doFilter() method is invoked");
		chain.doFilter(request, response);
	}
	
	// this method will be called by container while deployment
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//do some stuff
	}
	
	@Override
	public void destroy() {
		//do some stuff
	}
}
