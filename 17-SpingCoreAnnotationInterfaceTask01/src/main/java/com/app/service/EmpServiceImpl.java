package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.repository.IEmpDao;

@Component
public class EmpServiceImpl implements IEmpService 
{
	@Autowired
	private IEmpDao dao;

	@Override
	public void checkLogic() 
	{
		dao.save();
		System.out.println("checkLogic method from EmpServiceImpl");
	}

}
