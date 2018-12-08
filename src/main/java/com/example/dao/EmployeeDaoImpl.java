package com.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.dao.model.Employee;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class EmployeeDaoImpl implements EmployeeDao {

	public static Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public Employee getEmployee() {

		logger.info("This is DAO layer");
		
		return new Employee(1, "ravi", "delh");

	}

}
