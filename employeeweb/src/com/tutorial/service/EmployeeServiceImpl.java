package com.tutorial.service;

import java.util.List;

import com.tutorial.dao.EmployeeDAO;
import com.tutorial.dao.EmployeeDAOImpl;
import com.tutorial.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee getEmployee(String empId) {
				return null;
	}

	@Override
	public Employee getEmployee(String empId,  boolean hasbonous) {
		EmployeeDAO empDao= new EmployeeDAOImpl();
		Employee emp= empDao.getEmployee(empId);
		int sal=emp.getSalary();
		if(sal<1500){
			sal+=100;
			
		}
		emp.setSalary(sal);
		
				return emp;
	}

	@Override
	public List<Employee> getEmployeeUsingDeptId(String deptId) {
				return null;
	}

}
