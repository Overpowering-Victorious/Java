package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.EmpInputDto;
import com.example.dto.EmpOutputDto;
import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.entity.Login;
import com.example.entity.Role;
import com.example.entity.Skill;
import com.example.repository.EmployeeRepository;
import com.example.repository.LoginRepository;
import com.example.repository.SkillRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	LoginRepository logRepo;
	
	@Autowired
	SkillRepository skRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	@Override
	public EmpOutputDto addEmployee(EmpInputDto inputDto) {
		
		Employee emp=new Employee();
		emp.setName(inputDto.getName());
		emp.setContactNo(inputDto.getContactNo());
		
		Login login=new Login();
		login.setEmail(inputDto.getEmail());
		login.setPassword(inputDto.getPassword());
		login.setRole(Role.EMPLOYEE);
		
		emp.setLogin(login);
		
		repo.save(emp);
		
		EmpOutputDto outputDto=new EmpOutputDto();
		outputDto.setName(inputDto.getName());
		outputDto.setEmail(inputDto.getEmail());
		outputDto.setContactNo(inputDto.getContactNo());
		
		return outputDto;
	}

	@Override
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> emp=repo.findById(employee.getEmpId());
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

	@Override
	public EmpOutputDto getEmployeeByEmail(String email) {
		return repo.getEmployeeByEmail(email);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return repo.getEmployeeByName(name);
	}

	@Override
	public Employee updateContactNo(int empId, String contactNo) {
		Optional<Employee> op=repo.findById(empId);
		if(op.isPresent())
		{
			Employee emp=op.get();
			emp.setContactNo(contactNo);
			return repo.save(emp);
		}
		return null;
	}

	@Override
	public Employee updateAddress(int empId, Address address) {
		Optional<Employee> op=repo.findById(empId);
		if(op.isPresent())
		{
			Employee emp=op.get();
			emp.getAddresses().add(address);
			return repo.save(emp);
		}
		return null;
	}

	@Override
	public Employee updateSkills(int empId, int skillId) {
		Optional<Employee> op=repo.findById(empId);
		Optional<Skill> op1=skRepo.findById(skillId);
		if(op.isPresent() && op1.isPresent())
		{
			Employee emp=op.get();
			Skill skill=op1.get();
			
			List<Skill> skills=emp.getSkills();
			
			skills.add(skill);
			
			return repo.save(emp);
		}
		return null;
	}
	

}
