package com.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.model.Emp;
import com.ws.repository.EmployeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	EmployeRepo employeeRepo;
		
	@Override
	public void createEmp(Emp employee) {
		// TODO Auto-generated method stub
		employeeRepo.createEmp(employee);
	}

	@Override
	public void updateEmp(Emp employee) {
		// TODO Auto-generated method stub
		employeeRepo.updateEmp(employee);
	}

	@Override
	public void deleteEmp(Emp employee) {
		// TODO Auto-generated method stub
		employeeRepo.deleteEmp(employee);
	}

	@Override
	public Emp findEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findEmployee(id);
	}

}
