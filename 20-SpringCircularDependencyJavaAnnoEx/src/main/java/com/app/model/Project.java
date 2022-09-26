package com.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Project 
{
	@Value("Ragu Sir")
	private String pcode;
	
	@Autowired
	private Employee eob;

	public Project() {
		super();
		System.out.println("PROJECT OBJ");
	}
	
}
