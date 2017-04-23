package com.ws.repository;

import com.ws.model.Emp;

public interface EmployeRepo {

	void createEmp(Emp employee);

	void updateEmp(Emp employee);

	void deleteEmp(Emp employee);

	Emp findEmployee(long id);
}
