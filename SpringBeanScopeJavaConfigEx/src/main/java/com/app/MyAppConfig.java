package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.app")
public class MyAppConfig 
{
	@Bean
	//@Scope("prototype")
	@Scope("singleton")
	@Lazy
	public Token t1() 
	{
		Token tb = new Token();
		tb.setCode(10);
		return tb;
	}
}
