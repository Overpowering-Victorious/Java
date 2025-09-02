package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	void deleteEmployee(int empId);

	Employee updateEmployee(int empId, Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int empId);

}
