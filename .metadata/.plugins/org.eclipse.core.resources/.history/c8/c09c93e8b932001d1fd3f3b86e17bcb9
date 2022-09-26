package com.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class Employee
{
	@Value("Nagaraja")
	private String name;
	
	@Autowired
	private Project pob;

	public Employee() {
		super();
		System.out.println("EMPLOYEE OBJ");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pob=" + pob + "]";
	}
	
}
