package com.app;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
//@Scope("prototype")
@Lazy  // By default the scope is singleton - it is eager load you can convert 
	   // it to lazy load by using the @Lazy annotation	
public class Token 
{
	private int code;

	public Token() {
		super();
		System.out.println("Constructor Calling");
		code = Math.abs( new Random().nextInt() );
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	
}
