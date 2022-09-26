package com.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Component("pob")// By reference or obj name
@Primary // defualt this should be used
public class AdvanceProcessImpl implements IProcess
{

	@Override
	public void getProcessCode() {
		System.out.println("P2");
		
	}

}
