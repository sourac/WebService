package com.ws.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.model.Emp;
import com.ws.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class WebServiceController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public void showMsg() {
		System.out.println("Message");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Emp createEmployee(@RequestParam(value = "empid", required = true) String empId,
			@RequestParam(value = "empname", required = true) String empName, @RequestParam(value = "empcontact", required = true) String empContact) {
		System.out.print("creating new record");
		Emp emp = new Emp();
		emp.setEmpId(empId);
		emp.setContact(empContact);
		emp.setName(empName);
		System.out.println(emp);
		employeeService.createEmp(emp);
		return emp;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody Emp updateEmployee(@RequestParam(value = "id",required = true) long id,
			@RequestParam(value = "empid",required = true) String empId, @RequestParam(value = "empname", required =true) String empName,
			@RequestParam(value = "empcontact", required = true) String empContact) {
		System.out.println("updating emp record");
		Emp emp = new Emp();
		emp.setEmpId(empId);
		emp.setContact(empContact);
		emp.setName(empName);
		emp.setId(id);
		System.out.println(emp);
		employeeService.updateEmp(emp);
		return emp;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Emp deleteEmployee(@PathVariable(value = "id") long id) {
		System.out.println("Deleting emp record");
		Emp emp = new Emp();
		emp.setId(id);
		System.out.println(emp);
		employeeService.deleteEmp(emp);
		return emp;
	}
	
	@RequestMapping(value = "/find/{id}")
	public @ResponseBody Emp findEmployee(@PathVariable(value = "id")long id){
		System.out.println("finding employee");
		Emp emp;
		emp = employeeService.findEmployee(id);
		return emp;
	}
}
