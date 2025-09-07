package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dto.EmpOutputDto;
import com.example.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	// Basic Jpa
//	Employee getEmployeeByEmail(String email);
	
	// JPQL Query
	@Query("select e from Employee e where e.name=:empName")
	Employee getEmployeeByName(@Param("empName") String name);
	
	@Query(value="select employee.name, employee.contact_no, login.email from employee join login on employee.emp_log_fk=login.email where login.email=:email", nativeQuery=true)
	EmpOutputDto getEmployeeByEmail(@Param("email") String email);
}
