package com.springbootinterceptor.controller;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.springbootinterceptor.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping(value = "/getBook", method = RequestMethod.GET)
	@ResponseBody
	public Book getBook() {
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("JAVA");
		book.setBookPrice("500");
		
		System.out.println("accessing RequestContext Start");
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		System.out.println(requestAttributes.getAttribute("some_name", RequestAttributes.SCOPE_REQUEST));
		System.out.println("accessing RequestContext End");
		
		return book;
	}
	
	@RequestMapping(value = "/getasync", method = RequestMethod.GET)
	public Callable<Book> handleTestRequest(){
		Callable<Book> callable = new Callable<Book>() {

			@Override
			public Book call() throws Exception {
				Thread.sleep(1000);
				Book book = new Book();
				book.setBookId(1);
				book.setBookName("JAVA");
				book.setBookPrice("500");
				return book;
			}
		};
		return callable;
		
	}
}
