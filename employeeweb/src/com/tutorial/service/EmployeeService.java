package com.tutorial.service;

import java.util.List;

import com.tutorial.domain.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(String empId);
	public Employee getEmployee(String empId, boolean hasbonous);
    public List<Employee> getEmployeeUsingDeptId(String deptId);
}
