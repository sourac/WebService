package com.ws.service;

import com.ws.model.Emp;

public interface EmployeeService {
	void createEmp(Emp employee);

	void updateEmp(Emp employee);

	void deleteEmp(Emp employee);

	Emp findEmployee(long id);
}
