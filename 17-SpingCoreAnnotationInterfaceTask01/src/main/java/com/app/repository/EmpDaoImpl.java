package com.app.repository;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements IEmpDao {

	@Override
	public void save() {
		System.out.println("save method from EmpDaoImpl");

	}

}
