package com.app.invoke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.service.IProcess;

@Component
public class Format 
{
	@Autowired
	@Qualifier("pob")
	private IProcess pob;
	
	public void printFormat() {
		pob.getProcessCode();
		System.out.println("From Format");
	}
}
