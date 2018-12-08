package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("employee/{id}")
	public Employee employee(@PathVariable(value = "id") int id) {

		System.out.println("This Rest controller :: " + id);
		
		return employeeService.getEmployee();

	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}
