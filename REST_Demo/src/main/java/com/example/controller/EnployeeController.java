package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EnployeeController {
	
	@Autowired
	EmployeeService empSer;
	
	@PostMapping("/employee/add")
	Employee addEmployee(Employee employee)
	{
		return empSer.addEmployee(employee);
	}
	
	@DeleteMapping("/employee/delete/{empId}")
	void deleteEmployee(@PathVariable int empId)
	{
		empSer.deleteEmployee(empId);
	}
	
	@PutMapping("/employee/update")
	Employee updateEmployee(int empId, Employee employee)
	{
		return empSer.updateEmployee(empId, employee);
	}
	
	@GetMapping("/employee/getAll")
	List<Employee> getAllEmployee()
	{
		return empSer.getAllEmployee();
	}
	
	@GetMapping("/employee/getById")
	Employee getEmployeeById(int empId)
	{
		return empSer.getEmployeeById(empId);
	}
	
	
	
}
