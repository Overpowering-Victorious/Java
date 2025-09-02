package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}

	@Override
	public Employee updateEmployee(int empId, Employee employee) {
		Optional<Employee> emp=repo.findById(empId);
		if(emp.isPresent())
		{
			Employee Emp=emp.get();
			Emp=employee;
			return repo.save(Emp);
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return repo.findById(empId).orElseThrow(() -> new RuntimeException("Employee record not present"));
	}
	
	

}
