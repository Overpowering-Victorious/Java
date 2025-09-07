package com.example.service;

import java.util.List;

import com.example.dto.EmpInputDto;
import com.example.dto.EmpOutputDto;
import com.example.entity.Address;
import com.example.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	void deleteEmployee(int empId);

	Employee updateEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(int empId);

	EmpOutputDto addEmployee(EmpInputDto inputDto);

	EmpOutputDto getEmployeeByEmail(String email);

	Employee getEmployeeByName(String name);

	Employee updateContactNo(int empId, String contactNo);

	Employee updateAddress(int empId, Address address);

	Employee updateSkills(int empId, int skillId);

}
