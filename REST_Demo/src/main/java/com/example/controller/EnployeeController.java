package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.EmpInputDto;
import com.example.dto.EmpOutputDto;
import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class EnployeeController {
	
	@Autowired
	EmployeeService empSer;
	
	@PostMapping("/employee/add")
	Employee addEmployee(@RequestBody Employee employee)
	{
		return empSer.addEmployee(employee);
	}
	
	@PostMapping("/employee/add/dto")
	EmpOutputDto addEmployee(@Valid @RequestBody EmpInputDto inputDto)
	{
		return empSer.addEmployee(inputDto);
	}
	
	@DeleteMapping("/employee/delete/{empId}")
	void deleteEmployee(@PathVariable int empId)
	{
		empSer.deleteEmployee(empId);
	}
	
	@PutMapping("/employee/update")
	Employee updateEmployee(@RequestBody Employee employee)
	{
		return empSer.updateEmployee(employee);
	}
	
	@GetMapping("/employee/getAll")
	List<Employee> getAllEmployee()
	{
		return empSer.getAllEmployee();
	}
	
	@GetMapping("/employee/getById/{empId}")
	Employee getEmployeeById(@PathVariable int empId)
	{
		return empSer.getEmployeeById(empId);
	}
	
	@GetMapping("/employee/byName/{name}")
	Employee getEmployeeByName(@PathVariable String name)
	{
		return empSer.getEmployeeByName(name);
	}
	
	@GetMapping("/employee/byEmail/{email}")
	EmpOutputDto getEmployeeByEmail(@PathVariable String email)
	{
		return empSer.getEmployeeByEmail(email);
	}
	
	@PatchMapping("/employee/update/contactNo/{empId}/{contactNo}")
	Employee updateContactNo(@PathVariable int empId, @PathVariable String contactNo)
	{
		return empSer.updateContactNo(empId,contactNo);
	}
	
	@PostMapping("/employee/update/address/{empId}")
	Employee updateAddress(@PathVariable int empId, @RequestBody Address address)
	{
		return empSer.updateAddress(empId,address);
	}
	
	@PostMapping("/employee/update/skill/{empId}/{skillId}")
	Employee updateSkills(@PathVariable int empId, @PathVariable int skillId)
	{
		return empSer.updateSkills(empId,skillId);
	}
	
}
