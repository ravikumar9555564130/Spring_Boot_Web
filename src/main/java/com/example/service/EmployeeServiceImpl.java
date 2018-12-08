package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.dao.model.Employee;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmployeeServiceImpl implements EmployeeService {

	public static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDao employeeDao;

	public Employee getEmployee() {

		logger.info("This is Service layer");

		return employeeDao.getEmployee();
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
