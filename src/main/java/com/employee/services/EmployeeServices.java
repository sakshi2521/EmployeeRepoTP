package com.employee.services;

import java.util.List;

import com.employee.bean.Employee;

public interface EmployeeServices {
	
	public List<Employee> getEmployee();
	
	public Employee getEmp(long empid);
	
	public Employee getEmp(long empid,String empname);
	
	public Employee addEmp(Employee e);

}

