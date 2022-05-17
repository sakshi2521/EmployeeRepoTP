package com.employee.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.bean.Employee;
import com.employee.services.EmployeeServices;
@Service
public class EmployeeServiceImpl implements EmployeeServices {

	List<Employee> list;
	
	public EmployeeServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Employee(01,"Sakshi Vikhe","jr.Soft. Eng"));
		list.add(new Employee(02,"Shivanand Ghule","jr.Soft. Eng"));
		
	}
	
	
	@Override
	public List<Employee> getEmployee() {
		
		return list;
	}


	@Override
	public Employee getEmp(long empid) {
		
		Employee emp = null;
		
		for(Employee employee:list)
		{
			if(employee.getId() == empid)
			{
				emp= employee;
				break;
			}
		}
		return emp;
	}


	@Override
	public Employee getEmp(long empid, String empname) {
Employee emp = null;
		
		for(Employee employee:list)
		{
			if(employee.getId() == empid || employee.getName().equals(empname))
			{
				emp= employee;
				break;
			}
		}
		return emp;	
	}


	@Override
	public Employee addEmp(Employee e) {
		// TODO Auto-generated method stub
		list.add(e);
		return e;
	}


	

}

