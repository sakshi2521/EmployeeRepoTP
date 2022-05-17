package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.Employee;
import com.employee.services.EmployeeServices;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeServices employeeService;
 
	@GetMapping("/home")
	public String home() {
		return "This is home";
	}
	
	//get Employee details
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		return this.employeeService.getEmployee();
				
	}
	
	@GetMapping("/employee/{empid}")
	public Employee getEmp(@PathVariable String empid) {
		
		return this.employeeService.getEmp(Long.parseLong(empid));
	}
	
	@GetMapping("/employee/requestparam")
	public Employee getEmp(@RequestParam(value="id") String empid , @RequestParam (name="name") String empname) {
		
		return this.employeeService.getEmp(Long.parseLong(empid),empname);
	}
	
	@PostMapping("/employee")
	public Employee addEmp(@RequestBody Employee emp)
	{
		Employee e = (Employee) this.employeeService.addEmp(emp);
		return e;
		
	}
}

