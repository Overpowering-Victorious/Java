package com.example;

import java.util.List;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.repository.AddressRepositoryImpl;
import com.example.repository.EmployeeRepositoryImpl;

public class MyApp {

	public static void main(String[] args) {
		
		EmployeeRepositoryImpl empRepo= new EmployeeRepositoryImpl();
		AddressRepositoryImpl addRepo=new AddressRepositoryImpl();
		
		// Create/Insert obj into db
		Employee emp1 = new Employee();
		emp1.setEmpName("Raj");
		emp1.setPassword("def.123");
		emp1.setEmail("raj@example.com");
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Alice");
		emp2.setPassword("efg.123");
		emp2.setEmail("alice@example.com");
		
//		empRepo.addEmployee(emp1);
//		empRepo.addEmployee(emp2);
		
		// Get All employees
		
		List<Employee> empList= empRepo.getAllEmployees();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
//		empRepo.deleteEmployeeByName("Raj");
		
//		empList= empRepo.getAllEmployees();
//		for(Employee emp : empList) {
//			System.out.println(emp);
//		}
		
		Address a1=new Address();
		a1.setCity("Hyderabad");
		a1.setdNo("14");
		a1.setState("Telangana");
		a1.setStreetName("jksjadankkdnfdsj");
		
		Address a2=new Address();
		a2.setCity("Bangalore");
		a2.setdNo("19");
		a2.setState("Karnataka");
		a2.setStreetName("absasdnjkbkjassadkjda");
		
//		addRepo.addAddress(a1);
//		addRepo.addAddress(a2);
		
		List<Address>addList=addRepo.getAllAddresses();
		for(Address ad:addList)
		{
			System.out.println(ad);
		}
		
		addRepo.deleteAddress(1);
		
		addList=addRepo.getAllAddresses();
		for(Address ad:addList)
		{
			System.out.println(ad);
		}
		
		System.out.println(addRepo.getAddressById(2));
		System.out.println(addRepo.getCityById(3));
	}
}
